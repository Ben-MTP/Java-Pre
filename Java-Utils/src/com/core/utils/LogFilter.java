package com.core.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @author ManhKM on 6/21/2022
 * @project Java-Utils
 */
public class LogFilter implements FilenameFilter {
    private int type = 0;
    private String pattern = "";
    private Pattern p = null;

    public LogFilter(String pattern) {
        this.pattern = pattern.replace("*", "");    // Loai bo cac dau * trong log
        boolean isStartWith = pattern.startsWith("*");
        boolean isEndWith = pattern.endsWith("*");
        if (isStartWith && isEndWith) {
            this.type = 1;
        } else if (isStartWith) {
            this.type = 2;
        } else if (isEndWith) {
            this.type = 3;
        } else {
            this.p = Pattern.compile(pattern);
        }

    }

    @Override
    public boolean accept(File dir, String name) {
        switch(this.type) {
            case 1:
                return name.indexOf(this.pattern) > -1;
            case 2:
                return name.endsWith(this.pattern);
            case 3:
                return name.startsWith(this.pattern);
            default:
                return this.p.matcher(name).find();
        }
    }
}
