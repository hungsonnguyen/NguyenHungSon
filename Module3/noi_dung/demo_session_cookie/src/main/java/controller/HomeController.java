package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HomeController", urlPatterns = "/login")
public class HomeController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String save1 = request.getParameter("save");
        boolean save = false;
       if(save1 != null) {
           if(save1.equals("on")) {
               save = true;
           }
       }
       //check login
        // Tự viết: gọi database kiểm tra.
        if(save) {
            Cookie cookieUsername = new Cookie("username", username);
            Cookie cookiePassword = new Cookie("password", password);
            cookieUsername.setMaxAge(24*60*60*100); // set thời gian sống ( tính bằng s)
            response.addCookie(cookiePassword);
            response.addCookie(cookieUsername);
        }
        if(true) {
            request.getSession().setAttribute("usernameSession", username);
            response.sendRedirect("/student");
        } else {
            response.sendRedirect("");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
