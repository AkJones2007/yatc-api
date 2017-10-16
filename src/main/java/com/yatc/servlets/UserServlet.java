package com.yatc.servlets;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/users")
public class UserServlet extends HttpServlet {

    // GET /users
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        writer.println("Hello World!");
    }

}
