package com.ibrhalil._1;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/context-param")
public class App3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext contxt = getServletContext();
        String site = contxt.getInitParameter("website");

        PrintWriter yazPrintWriter = resp.getWriter();
        yazPrintWriter.write(site+"\n");


        Enumeration<String> liste = contxt.getInitParameterNames();
        while (liste.hasMoreElements()) {
            String deger = (String) liste.nextElement();
            yazPrintWriter.write(deger+" : "+contxt.getInitParameter(deger)+", \n");
            System.out.println(deger + " : " + contxt.getInitParameter(deger));

        }

        yazPrintWriter.close();
    }
}
