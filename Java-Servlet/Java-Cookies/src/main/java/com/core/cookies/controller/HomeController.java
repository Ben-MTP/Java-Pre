package com.core.cookies.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ManhKM on 10/24/2022
 * @project Java-Cookies
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/cookie", method = RequestMethod.GET)
    @ResponseBody
    public void setCookie(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

        PrintWriter writer = response.getWriter();
        String name = "Cookie name";
        String value = "Cookie value";
        Cookie cookie = new Cookie(name, value);
        response.addCookie(cookie);

        //java.lang.IllegalArgumentException: Cookie name [Cookie name] is a reserved token
    }
}
