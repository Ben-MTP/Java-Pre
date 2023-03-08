package com.msoft.core.utils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
public class StringUtils {

    public StringUtils() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

    public static boolean isEmpty(String[] s) {
        return s == null || s.length == 0;
    }

    public static byte[] toBytes(String s) {
        try {
            return s.getBytes("UTF-8");
        } catch (UnsupportedEncodingException var2) {
            throw new RuntimeException(var2);
        }
    }

    public static String fromBytes(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException var2) {
            throw new RuntimeException(var2);
        }
    }

    public static boolean isNumeric(final CharSequence cs) {
        if (isEmpty(cs)) {
            return false;
        } else {
            int sz = cs.length();

            for (int i = 0; i < sz; ++i) {
                if (!Character.isDigit(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static Object toPrimitives(Class<?> clazz, String s) {
        if (clazz == String.class) {
            return s;
        } else if (clazz == Integer.class) {
            return Integer.valueOf(s);
        } else if (clazz == Long.class) {
            return Long.valueOf(s);
        } else if (clazz == Float.class) {
            return Float.valueOf(s);
        } else if (clazz == Short.class) {
            return Short.valueOf(s);
        } else if (clazz == Double.class) {
            return Double.valueOf(s);
        } else {
            throw new IllegalArgumentException("Unsupport primitive type " + clazz.getName());
        }
    }

    public static String formatNumber(String value, String delimiter) {
        StringBuilder price = new StringBuilder(value);
        price.reverse();
        StringBuilder priceNew = new StringBuilder();
        int len = price.length();

        for (int j = 1; j <= len; ++j) {
            priceNew.append(price.charAt(j - 1));
            if (j % 3 == 0 && j < len) {
                priceNew.append(delimiter);
            }
        }

        priceNew.reverse();
        return priceNew.toString();
    }

    public static String checkPath(String value) {
        String v = value.trim();
        if (!v.contains("/")) {
            return "/" + v;
        } else {
            if (!v.startsWith("/")) {
                v = "/" + v;
            }

            if (v.endsWith("/")) {
                v = v.substring(0, v.lastIndexOf("/"));
            }

            return v;
        }
    }

    public static String capitalize(String s) {
        return s.length() == 0 ? s : s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static List<String> getFieldNamesForClass(Class<?> clazz) throws Exception {
        List<String> fieldNames = new ArrayList();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; ++i) {
            if (!Modifier.isFinal(fields[i].getModifiers())) {
                fieldNames.add(fields[i].getName());
            }
        }

        return fieldNames;
    }
}
