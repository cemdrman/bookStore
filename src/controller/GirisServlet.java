package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by cem on 17.02.2017.
 */
public class GirisServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        String sifre = request.getParameter("password");
        System.out.println(email + " " + sifre);
        if (email.equals("cemdrman@gmail.com")){
            System.out.println("Giriş Geçerli");
            try {
                response.sendRedirect("/index.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{

        }
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) {

    }
}
