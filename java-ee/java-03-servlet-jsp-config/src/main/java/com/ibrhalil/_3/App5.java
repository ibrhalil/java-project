package com.ibrhalil._3;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "metinOkuma",urlPatterns = {"/metin-okuma"})
public class App5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream is = getServletContext().getResourceAsStream("/WEB-INF/metin.txt");
        ServletOutputStream sos = resp.getOutputStream();

        int val;
        while ((val = is.read()) != -1) {
            sos.write(val);
            System.out.print((char) val);
        }
        sos.close();

        System.out.println();
        System.out.println(getServletContext().getRealPath("/WEB-INF/metin.txt"));
        System.out.println(getServletContext().getContextPath());
        System.out.println(getServletContext().getServletContextName());
    }
}
