package com.ecommerce.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        List<String> cart = (List<String>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }

        String product = req.getParameter("product");
        if(product != null){
            cart.add(product);
        }

        session.setAttribute("cart", cart);
        req.setAttribute("cart", cart);

        req.getRequestDispatcher("cart.jsp").forward(req,res);
    }
}
