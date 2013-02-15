package com.awesomevendingco.vendingmachine.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awesomevendingco.vendingmachine.machine.VendingMachine;

public class BootMachineServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        VendingMachine machine = (VendingMachine) context.getBean("machine");

        request.getSession().setAttribute("machine", machine);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/machine.jsp");
        dispatcher.forward(request, response);

    }

}
