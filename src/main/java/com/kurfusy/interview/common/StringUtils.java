package com.kurfusy.interview.common;

import java.util.UUID;

/**
 * @author Administrator
 */
public class StringUtils {
    /**
     * 获取32位长度的UniqueKey
     *
     * @return Key
     */
    public static String geChar32UniqueKey() {
        return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
    }
}
