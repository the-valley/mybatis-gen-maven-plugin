package com.wy.strategy;

/**
 * @author wy
 */
public class CopyStrategy implements NameStrategy {

    @Override
    public String transform(String dbName) {
        return dbName;
    }
}
