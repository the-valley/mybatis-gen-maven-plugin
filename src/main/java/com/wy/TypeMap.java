package com.wy;



import com.wy.util.JsonUtil;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author wy
 */
public class TypeMap {

    /**
     * java类型与数据库类型的映射
     */
    private static Map<String, String> jdbcTypeToJavaMap;

    /*
     * 读取映射文件，初始化jdbcTypeToJavaMap
     */
    static {
        InputStream in = getTypeMapJson();
        byte[] buffer = new byte[512];
        BufferedInputStream bufferedIn = new BufferedInputStream(in);
        int len;
        StringBuilder sb = new StringBuilder();
        try {
            while (((len = bufferedIn.read(buffer)) != -1)) {
                sb.append(new String(buffer, 0, len));
            }
            jdbcTypeToJavaMap = JsonUtil.ofMap(sb.toString(), String.class, String.class);
        } catch (IOException e) {
            throw new RuntimeException("读取数据异常!");
        } finally {
            try {
                bufferedIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 读取映射文件
     */
    private static InputStream getTypeMapJson() {
        InputStream in = TypeMap.class.getClassLoader().getResourceAsStream("type.json");
        if (in == null) {
            throw new RuntimeException("读取type.json失败！");
        }
        return in;
    }

    public static Map<String, String> getJdbcTypeToJavaMap() {
        return jdbcTypeToJavaMap;
    }
}
