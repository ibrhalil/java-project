package com.ibrhalil._0;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/new-user")
public class NewUserPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher goster = request.getRequestDispatcher("jspSayfa01.jsp");
        goster.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ad = request.getParameter("kisiAd");
        ad = ad.trim();

        request.setAttribute("gelenAdDegeri", ad);

        if (ad.isEmpty()) {
            request.getRequestDispatcher("jspSayfa03.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("jspSayfa02.jsp").forward(request, response);
        }
    }
}
