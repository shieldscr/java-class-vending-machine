package com.awesomevendingco.vendingmachine.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        Person person = new Person();
        person.setName(name);
        person.setAge(99);
        person.setFavoriteColor("Red");

        request.getSession().setAttribute("person", person);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/hello.jsp");
        dispatcher.forward(request, response);

    }

}
