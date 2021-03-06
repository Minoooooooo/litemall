package org.linlinjava.litemall.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallCourse;
import org.linlinjava.litemall.db.domain.LitemallCourseExample;
import org.linlinjava.litemall.db.vo.LitemallPersonalCourseVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseDetailVO;
import org.linlinjava.litemall.db.vo.LitemallTeamCourseVO;

public interface LitemallCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    long countByExample(LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int insert(LitemallCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int insertSelective(LitemallCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    LitemallCourse selectOneByExample(LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    LitemallCourse selectOneByExampleSelective(@Param("example") LitemallCourseExample example, @Param("selective") LitemallCourse.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    List<LitemallCourse> selectByExampleSelective(@Param("example") LitemallCourseExample example, @Param("selective") LitemallCourse.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    List<LitemallCourse> selectByExample(LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    LitemallCourse selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCourse.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    LitemallCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    LitemallCourse selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallCourse record, @Param("example") LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallCourse record, @Param("example") LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallCourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_course
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);

    List<LitemallTeamCourseVO> selectTodayCourseByBeginTime(Map<String, Object> map);

    LitemallTeamCourseDetailVO selectCourseDetailByPrimaryKey(Map<String, Object> map);

    List<LitemallPersonalCourseVO> selectPersonalCourse();

}