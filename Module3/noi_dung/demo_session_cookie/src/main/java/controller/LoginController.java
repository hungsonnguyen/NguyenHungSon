package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", urlPatterns = "")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies(); //Lấy toàn bộ cookie
        for (Cookie cookie: cookies) {
            if(cookie.getName().equals("username")) {
                request.setAttribute("username",cookie.getValue());
            }
            if(cookie.getName().equals("password")) {
                request.setAttribute("password",cookie.getValue());
            }
        }
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
}
