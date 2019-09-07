package com.java8.springbootpro.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet3.0
 *
 * @author itmrchen
 * @date 2019/9/8 0:34
 */
@WebServlet(urlPatterns = "/my/servlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().print("hello spring boot!");

    }
}
