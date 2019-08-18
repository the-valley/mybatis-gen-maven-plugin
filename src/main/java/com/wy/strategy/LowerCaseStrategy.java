package com.wy.strategy;

/**
 * @author wy
 * 全小写匹配策略
 */
public class LowerCaseStrategy implements NameStrategy {

    @Override
    public String transform(String dbName) {
        return dbName.replaceAll("_", "").toLowerCase();
    }
}
