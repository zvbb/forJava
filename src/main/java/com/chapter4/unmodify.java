package com.chapter4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ******************************
 * author：      张志聪
 * createTime:   2021/1/20 0:22
 * description:
 * version:      V1.0
 * ******************************
 */
public class unmodify {
    public static void main(String[] args) {
        Map<String, Object> map = new ConcurrentHashMap<>();

        Map<String, Object> map1 = Collections.unmodifiableMap(map);

        HashMap<String, Object> stringObjectHashMap = new HashMap<>(map);
    }
}
