package com.jindo.core;

import com.jindo.core.pattern.DemoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 5/9/2022
 * @project java-partern
 */
public class AppMain {
    public static void main(String[] args) {
        DemoPattern demoPattern = new DemoPattern();
        List<String> to = new ArrayList<>();
        to.add("manhkm@neo.vn");
        to.add("minhmanh.evn@gmail.com");
        demoPattern.sendListEmail(to, "New body email");
    }
}
