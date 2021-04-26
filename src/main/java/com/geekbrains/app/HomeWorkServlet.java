package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeWorkServlet", urlPatterns = "/home_work")
public class HomeWorkServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HomeWorkServlet.class);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: HomeWork");
        resp.setContentType("text/html");
        resp.getWriter().printf("<html><body>");
        Product[] products = new Product[10];
        products[0] = new Product (1, "Orange", 5.5f);
        products[1] = new Product (2, "Apple", 6.5f);
        products[2] = new Product (3, "Grapes", 4.5f);
        products[3] = new Product (4, "Peach", 3.5f);
        products[4] = new Product (5, "Kivi", 2.5f);
        products[5] = new Product (6, "Pineapple", 7.5f);
        products[6] = new Product (7, "Plums", 5.5f);
        products[7] = new Product (8, "Nuts", 4.5f);
        products[8] = new Product (9, "Bananas", 2.5f);
        products[9] = new Product (10, "Pear", 2.5f);
        for (int i = 0; i < products.length; i++) {
            resp.getWriter().printf("<h1>" + products[i].toString () + "</h1>");
        }
        resp.getWriter().printf("</html></body>");
    }
}
