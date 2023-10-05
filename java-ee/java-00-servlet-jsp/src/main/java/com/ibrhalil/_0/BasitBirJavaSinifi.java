package com.ibrhalil._0;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


//>>>>>>>>>>	0	<<<<<<<<<<
/*
 * Servletler Bir Sunucuda çalışmak zorundadır.
 * Projemizi oluşturduktan sonra bir sunucu ile birlikte çalıştırırız.
 */

//>>>>>>>>>>	3	<<<<<<<<<<
/*
 * ' @WebServlet ' Annottunu kullanarak bu sınıfın hangi URL adresini kullanılınca çalışacağını belirtiriz.
 * 2. bir yöntem de : web.xml tanımlama yaparakta kullanabiliriz.
 */
@WebServlet("/Servlet01")
public class BasitBirJavaSinifi extends HttpServlet
{
    //>>>>>>>>>>	1	<<<<<<<<<<
    /*
     * Servlet HTTP protokolünü kullanabilen bir java sınıfıdır.
     * Bir Java sınıfının SERVLET olabilmesi için ' HttpServlet ' sınıfını miras alması gerekmektedir.
     * Artık sınıfımız http protokollerini anlayabilecektir. Bunun için ilgili metotları Override etmesi gerekmektedir.
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //>>>>>>>>>>	2	<<<<<<<<<<
        /*
         * Bu metot kullanıcıdan gelen GET istekleri alabildiğimiz ve karşı cevap gönderebileceğimiz bir metotdur.
         */
        PrintWriter yaz = resp.getWriter();
        yaz.append("Merhaba Dünya...").append(" (Servlet)");
        //>>>>>>>>>>	4	<<<<<<<<<<
        /*
         * PrintWriter sınıfından bir nesne oluşturuyoruz.
         * response daki getWrite metodundan çağrılmıştır.
         */

    }
}