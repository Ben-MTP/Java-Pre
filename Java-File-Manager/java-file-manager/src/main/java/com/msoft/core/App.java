package com.msoft.core;

import com.msoft.core.utils.FileUtil;

/**
 * @author ManhKM on 9/13/2022
 * @project java-file-manager
 */
public class App {

    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        String path = "data/input/03";
        fileUtil.discovery(path, false);
    }
}
