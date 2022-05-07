package com.core;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author ManhKM on 4/25/2022
 * @project httpservlet-jakartar-servlet
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Setting up the content type of web page:
         */
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<h1>HelloWorld HttpServlet</h1>");

    }
}
