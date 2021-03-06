package com.wy.clazz;

import java.util.List;
import java.util.Set;

/**
 * @author wy
 */
public class Clazz extends BaseClazz {

    private List<Column> columns;

    private Set<String> needImport;

    private Boolean lombok = false;

    private String className;

    private String tableName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public Set<String> getNeedImport() {
        return needImport;
    }

    public void setNeedImport(Set<String> needImport) {
        this.needImport = needImport;
    }

    public Boolean getLombok() {
        return lombok;
    }

    public void setLombok(Boolean lombok) {
        this.lombok = lombok;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
