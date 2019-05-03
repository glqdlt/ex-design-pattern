package com.glqdlt.example.exdesignpattern.myspring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jhun
 * 2019-05-03
 */
public class MyContext {

    private static final Map<String, Object> contextHolder = new HashMap<>();

    public static void addBean(String name, Object o) {
        if (name == null || name.equals("")) {
            name = o.getClass().getName();
        }
        contextHolder.put(name, o);
    }

    public static Object getBean(String name) {
        return contextHolder.get(name);
    }

}
