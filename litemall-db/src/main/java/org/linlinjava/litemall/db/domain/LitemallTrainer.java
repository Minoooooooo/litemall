package org.linlinjava.litemall.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallTrainer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.trainer_name
     *
     * @mbg.generated
     */
    private String trainerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.trainer_desc
     *
     * @mbg.generated
     */
    private String trainerDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.working_status
     *
     * @mbg.generated
     */
    private Integer workingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.course_price
     *
     * @mbg.generated
     */
    private BigDecimal coursePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.sort_order
     *
     * @mbg.generated
     */
    private Byte sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_trainer.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.id
     *
     * @return the value of litemall_trainer.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.id
     *
     * @param id the value for litemall_trainer.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.trainer_name
     *
     * @return the value of litemall_trainer.trainer_name
     *
     * @mbg.generated
     */
    public String getTrainerName() {
        return trainerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.trainer_name
     *
     * @param trainerName the value for litemall_trainer.trainer_name
     *
     * @mbg.generated
     */
    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.trainer_desc
     *
     * @return the value of litemall_trainer.trainer_desc
     *
     * @mbg.generated
     */
    public String getTrainerDesc() {
        return trainerDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.trainer_desc
     *
     * @param trainerDesc the value for litemall_trainer.trainer_desc
     *
     * @mbg.generated
     */
    public void setTrainerDesc(String trainerDesc) {
        this.trainerDesc = trainerDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.working_status
     *
     * @return the value of litemall_trainer.working_status
     *
     * @mbg.generated
     */
    public Integer getWorkingStatus() {
        return workingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.working_status
     *
     * @param workingStatus the value for litemall_trainer.working_status
     *
     * @mbg.generated
     */
    public void setWorkingStatus(Integer workingStatus) {
        this.workingStatus = workingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.course_price
     *
     * @return the value of litemall_trainer.course_price
     *
     * @mbg.generated
     */
    public BigDecimal getCoursePrice() {
        return coursePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.course_price
     *
     * @param coursePrice the value for litemall_trainer.course_price
     *
     * @mbg.generated
     */
    public void setCoursePrice(BigDecimal coursePrice) {
        this.coursePrice = coursePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.sort_order
     *
     * @return the value of litemall_trainer.sort_order
     *
     * @mbg.generated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.sort_order
     *
     * @param sortOrder the value for litemall_trainer.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.add_time
     *
     * @return the value of litemall_trainer.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.add_time
     *
     * @param addTime the value for litemall_trainer.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.update_time
     *
     * @return the value of litemall_trainer.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.update_time
     *
     * @param updateTime the value for litemall_trainer.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_trainer.deleted
     *
     * @return the value of litemall_trainer.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_trainer.deleted
     *
     * @param deleted the value for litemall_trainer.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IS_DELETED=").append(IS_DELETED);
        sb.append(", NOT_DELETED=").append(NOT_DELETED);
        sb.append(", id=").append(id);
        sb.append(", trainerName=").append(trainerName);
        sb.append(", trainerDesc=").append(trainerDesc);
        sb.append(", workingStatus=").append(workingStatus);
        sb.append(", coursePrice=").append(coursePrice);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallTrainer other = (LitemallTrainer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrainerName() == null ? other.getTrainerName() == null : this.getTrainerName().equals(other.getTrainerName()))
            && (this.getTrainerDesc() == null ? other.getTrainerDesc() == null : this.getTrainerDesc().equals(other.getTrainerDesc()))
            && (this.getWorkingStatus() == null ? other.getWorkingStatus() == null : this.getWorkingStatus().equals(other.getWorkingStatus()))
            && (this.getCoursePrice() == null ? other.getCoursePrice() == null : this.getCoursePrice().equals(other.getCoursePrice()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrainerName() == null) ? 0 : getTrainerName().hashCode());
        result = prime * result + ((getTrainerDesc() == null) ? 0 : getTrainerDesc().hashCode());
        result = prime * result + ((getWorkingStatus() == null) ? 0 : getWorkingStatus().hashCode());
        result = prime * result + ((getCoursePrice() == null) ? 0 : getCoursePrice().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_trainer
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        trainerName("trainer_name", "trainerName", "VARCHAR", false),
        trainerDesc("trainer_desc", "trainerDesc", "VARCHAR", false),
        workingStatus("working_status", "workingStatus", "INTEGER", false),
        coursePrice("course_price", "coursePrice", "DECIMAL", false),
        sortOrder("sort_order", "sortOrder", "TINYINT", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_trainer
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}