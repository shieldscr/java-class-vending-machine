package com.awesomevendingco.vendingmachine.ui;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.awesomevendingco.vendingmachine.machine.VendingMachine;

public class ProductServlet extends HelpfulServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        VendingMachine machine = (VendingMachine) getApplicationScope(getServletContext(), "machine");
        String product = request.getParameter("product");
        machine.selectProduct(product);
        machine.getProductChute();
        forwardToPage(request, response, "/machine.jsp");
    }

}