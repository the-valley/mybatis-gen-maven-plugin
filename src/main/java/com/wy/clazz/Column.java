package com.wy.clazz;

import java.util.Objects;

/**
 * @author wy
 */
public class Column {

    /**
     * 是否是主键
     */
    private Boolean key;

    /**
     * 数据库列名
     */
    private String columnName;
    /**
     * 列名
     */
    private String name;
    /**
     * 注释
     */
    private String comment;

    /**
     * db类型
     */
    private String jdbcType;
    /**
     * mybatis type
     */
    private String jdbcActualType;

    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 是否可以为空
     */
    private String isNullable;
    /**
     * java类型
     */
    private String javaType;

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        if (Objects.equals(jdbcType, "int")) {
            this.jdbcActualType = "INTEGER";
        }
        if (Objects.equals(jdbcType, "tinyint")) {
            this.jdbcActualType = "TINYINT";
        }
        if (Objects.equals(jdbcType, "smallint")) {
            this.jdbcActualType = "INTEGER";
        }
        if (Objects.equals(jdbcType, "float")) {
            this.jdbcActualType = "FLOAT";
        }
        if (Objects.equals(jdbcType, "double")) {
            this.jdbcActualType = "DOUBLE";
        }
        if (Objects.equals(jdbcType, "char")) {
            this.jdbcActualType = "CHAR";
        }
        if (Objects.equals(jdbcType, "varchar")) {
            this.jdbcActualType = "VARCHAR";
        }
        if (Objects.equals(jdbcType, "text")) {
            this.jdbcActualType = "VARCHAR";
        }
        if (Objects.equals(jdbcType, "datetime")) {
            this.jdbcActualType = "TIMESTAMP";
        }
        if (Objects.equals(jdbcType, "timestamp")) {
            this.jdbcActualType = "TIMESTAMP";
        }
        this.jdbcType = jdbcType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getJdbcActualType() {
        return jdbcActualType;
    }

    public void setJdbcActualType(String jdbcActualType) {
        this.jdbcActualType = jdbcActualType;
    }
}
