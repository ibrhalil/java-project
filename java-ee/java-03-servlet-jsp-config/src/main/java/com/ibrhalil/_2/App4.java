package com.ibrhalil._2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "dosyaOkuma",urlPatterns = {"/dosya-okuma"})
public class App4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        InputStream properStream1 = getServletContext().getResourceAsStream("/WEB-INF/theUser2.properties");

        InputStream properStream2 = this.getClass().getResourceAsStream("/theUser.properties");

        Properties properties1 = new Properties();
        properties1.load(properStream1);
        properStream1.close();

        Properties properties2 = new Properties();
        properties2.load(properStream2);
        properStream2.close();

        PrintWriter yaz = resp.getWriter();
        yaz.append("WEB-INF :\n");
        yaz.append(properties1.getProperty("name")).append(properties1.getProperty("surname")).append("\n");

        yaz.append("resources :\n");
        yaz.append(properties2.getProperty("name")).append(properties2.getProperty("surname")).append("\n");

        yaz.close();
    }
}
