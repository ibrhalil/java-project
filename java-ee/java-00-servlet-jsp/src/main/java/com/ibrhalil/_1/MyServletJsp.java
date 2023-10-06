package com.ibrhalil._1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-servlet")
public class MyServletJsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter yaz = resp.getWriter();
        yaz.append("<html>")
                .append("<body>")
                .append("<h2>Servlet'den Selamlar ...</h2>")
                .append("</body>")
                .append("</html>");
    }
}
