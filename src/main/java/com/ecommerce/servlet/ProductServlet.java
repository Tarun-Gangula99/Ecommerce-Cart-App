package com.ecommerce.servlet;

import com.ecommerce.model.Product;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.*;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Laptop",50000));
        products.add(new Product(2,"Mobile",20000));
        products.add(new Product(3,"Shoes",3000));

        req.setAttribute("products", products);
        req.getRequestDispatcher("products.jsp").forward(req,res);
    }
}
