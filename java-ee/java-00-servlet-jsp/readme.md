servler adresi
http://localhost:8080/servlet-jsp/Servlet01
@WebServlet("/Servlet01") java adresi belirliyor


jsp adresi
http://localhost:8080/servlet-jsp/
http://localhost:8080/servlet-jsp/index.jsp


@WebServlet("/my-servlet")
http://localhost:8080/servlet-jsp/my-servlet

java-00-servlet-jsp modulunu maven ile clean install yaptıktan sonra
target dizninden .war uzuntılı dosyayı alıp tomcat dizininin altında webapps at

windows için run 
tomcat10/bin dizininde terminal aç
catalina.bat start diyerek tomcat ayaklandır
