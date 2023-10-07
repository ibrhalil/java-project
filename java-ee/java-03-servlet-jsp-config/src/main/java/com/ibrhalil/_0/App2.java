package com.ibrhalil._0;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(
        urlPatterns = "/config-annotation",
        initParams = {
                @WebInitParam(name = "initKey", value = "valueDeger"),
                @WebInitParam(name = "baskaKey", value = "annotation")
        }
)
public class App2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.append(getServletConfig().getInitParameter("initKey")).append(",");

        //veya

        Enumeration<String> initParameters = getInitParameterNames();
        while (initParameters.hasMoreElements()) {
            writer.append(getServletConfig().getInitParameter(initParameters.nextElement())).append(",");
        }
    }
}
