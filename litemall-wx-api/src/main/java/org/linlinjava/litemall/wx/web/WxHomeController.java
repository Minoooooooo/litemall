package org.linlinjava.litemall.wx.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.system.SystemConfig;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.dao.LitemallSystemMapper;
import org.linlinjava.litemall.db.domain.LitemallCategory;
import org.linlinjava.litemall.db.domain.LitemallGoods;
import org.linlinjava.litemall.db.service.*;
import org.linlinjava.litemall.wx.annotation.LoginUser;
import org.linlinjava.litemall.wx.service.HomeCacheManager;
import org.linlinjava.litemall.wx.service.WxGrouponRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * 首页服务
 */
@RestController
@RequestMapping("/wx/home")
@Validated
public class WxHomeController {
    private final Log logger = LogFactory.getLog(WxHomeController.class);

    @Autowired
    private LitemallAdService adService;

    @Autowired
    private LitemallSystemConfigService systemConfigService;

    private final static ArrayBlockingQueue<Runnable> WORK_QUEUE = new ArrayBlockingQueue<>(9);

    private final static RejectedExecutionHandler HANDLER = new ThreadPoolExecutor.CallerRunsPolicy();

    private static ThreadPoolExecutor executorService = new ThreadPoolExecutor(9, 9, 1000, TimeUnit.MILLISECONDS, WORK_QUEUE, HANDLER);

    @GetMapping("/cache")
    public Object cache(@NotNull String key) {
        if (!key.equals("litemall_cache")) {
            return ResponseUtil.fail();
        }

        // 清除缓存
        HomeCacheManager.clearAll();
        return ResponseUtil.ok("缓存已清除");
    }

    /**
     * 首页数据
     *
     * @param userId 当用户已经登录时，非空。为登录状态为null
     * @return 首页数据
     */
    @GetMapping("/index")
    public Object index(@LoginUser Integer userId) {
        //优先从缓存中读取
        if (HomeCacheManager.hasData(HomeCacheManager.INDEX)) {
            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.INDEX));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 查询广告信息
        Callable<List> bannerListCallable = () -> adService.queryIndex();
        // 门店信息
        Callable<Map<String, String>> storeCallable = () -> systemConfigService.listMail();
        // 注意事项
        Callable<List> announcementsListCallable = () -> systemConfigService.listKeyName("litemall_announcements");
        // 场馆简介
        Callable<List> venuesIntroductionListCallable = () -> systemConfigService.listKeyName("litemall_venues_introduction");
        // 招聘信息
        Callable<List> jobAdListCallable = () -> systemConfigService.listKeyName("litemall_job_ad");

        FutureTask<List> bannerTask = new FutureTask<>(bannerListCallable);
        FutureTask<Map<String, String>> storeTask = new FutureTask<>(storeCallable);
        FutureTask<List> announcementsTask = new FutureTask<>(announcementsListCallable);
        FutureTask<List> venuesIntroductionTask = new FutureTask<>(venuesIntroductionListCallable);
        FutureTask<List> jobAdTask = new FutureTask<>(jobAdListCallable);

        executorService.submit(bannerTask);
        executorService.submit(storeTask);
        executorService.submit(announcementsTask);
        executorService.submit(venuesIntroductionTask);
        executorService.submit(jobAdTask);

        Map<String, Object> entity = new HashMap<>();
        try {
            entity.put("banner", bannerTask.get());
            entity.put("store", storeTask.get());
            entity.put("announcements", announcementsTask.get());
            entity.put("venuesIntroduction", venuesIntroductionTask.get());
            entity.put("jobAd", jobAdTask.get());

            //缓存数据
            HomeCacheManager.loadData(HomeCacheManager.INDEX, entity);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        return ResponseUtil.ok(entity);
    }

    /**
     * 商城介绍信息
     *
     * @return 商城介绍信息
     */
    @GetMapping("/about")
    public Object about() {
        Map<String, String> about = systemConfigService.listMail();
        return ResponseUtil.ok(about);
    }
}