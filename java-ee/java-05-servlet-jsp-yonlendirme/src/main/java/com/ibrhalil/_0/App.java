package com.ibrhalil._0;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/yonlendir","/"})
public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Sayfa Yönlendirildi");
        resp.sendRedirect("new-user");
        //belirtilen sayfaya yönlendirme gerçekleþtirildi.
    }
}
