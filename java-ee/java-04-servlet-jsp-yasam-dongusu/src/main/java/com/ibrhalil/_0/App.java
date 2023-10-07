package com.ibrhalil._0;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/yasam-dongusu")
public class App extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init metot cagrildi");
        //servlet ilk cagrildiginda calisir
    }

    @Override
    public void destroy() {
        System.out.println("destroy edildi....");
        //sunucu kapanırken calisir
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getRequestURI());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
