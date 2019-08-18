package com.wy.sql;

/**
 * @author wy
 */
public interface SqlTemplate {
    /**
     * 获取当前数据库的所有表名
     */
    String ALL_TABLE_NAME = "select table_name as tableName from tables where table_type='BASE TABLE' and table_schema='${db}'";
    /**
     * 获取表所有列信息
     */
    String ALL_COLUMNS_INFO = "select column_key, column_name, column_comment, data_type, column_default, is_nullable from information_schema.columns where table_schema='${db}' and table_name='${table}'";
}
