package com.msoft.core.utils;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
public class SQLUtils {
    private static final Pattern PATTERN_VALUE = Pattern.compile("\\'(.*?)\\'");

    public SQLUtils() {
    }

    private static boolean isLetterOrDigit(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '-' || c == '_';
    }

    public static List<String> extractSQLNormal(String sql) {
        if (sql == null) {
            return null;
        } else {
            String s = sql;

            for(Matcher m = PATTERN_VALUE.matcher(sql); m.find(); s = s.replace(m.group(), "")) {
            }

            s = s.replace("?:=", "");
            List<String> listParam = new ArrayList();
            char[] cr = s.toCharArray();
            int counter = 1;
            int len = cr.length;

            for(int i = 0; i < len; ++i) {
                if (cr[i] == '?') {
                    listParam.add(String.valueOf(counter));
                    ++counter;
                } else if (cr[i] == ':') {
                    ++i;

                    StringBuilder sb;
                    for(sb = new StringBuilder(); i < len && isLetterOrDigit(cr[i]); ++i) {
                        sb.append(cr[i]);
                    }

                    listParam.add(sb.toString());
                    ++counter;
                }
            }

            return listParam;
        }
    }

    public static List<String> extractSQL(String sql) {
        if (sql == null) {
            return null;
        } else {
            String s = sql.toUpperCase();

            for(Matcher m = PATTERN_VALUE.matcher(s); m.find(); s = s.replace(m.group(), "")) {
            }

            s = s.replace("?:=", "");
            List<String> listParam = new ArrayList();
            char[] cr = s.toCharArray();
            int counter = 1;
            int len = cr.length;

            for(int i = 0; i < len; ++i) {
                if (cr[i] == '?') {
                    listParam.add(String.valueOf(counter));
                    ++counter;
                } else if (cr[i] == ':') {
                    ++i;

                    StringBuilder sb;
                    for(sb = new StringBuilder(); i < len && isLetterOrDigit(cr[i]); ++i) {
                        sb.append(cr[i]);
                    }

                    listParam.add(sb.toString());
                    ++counter;
                }
            }

            return listParam;
        }
    }

    public static void main(String[] args) {
        String call = "select 'SMSMT_' || CASE WHEN sc.pkg_id is null and sc.act_id != 7 THEN sc.service_id ELSE sc.id END || '_' || mt.key from mt_value mt, service_cmd sc where sc.id = mt.cmd_id and mt.cmd_id = :cmd_id UNION select 'SMSMT_' || CASE WHEN sc.pkg_id is null and sc.act_id != 7 THEN sc.service_id ELSE sc.id END || '_' || mt.key from mt_value mt, service_cmd sc where sc.id = mt.cmd_id and mt.service_id = :service_id and sc.pkg_id is null and sc.act_id = decode(:cmd_act, '3', '1',:cmd_act)";
        List<String> list = extractSQL(call);
        PrintStream var10001 = System.out;
        list.forEach(var10001::println);
    }
}
