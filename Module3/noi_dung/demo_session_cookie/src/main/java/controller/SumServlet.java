package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet", urlPatterns = "/sum_servlet")
public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double numberOne = Double.parseDouble(request.getParameter("numberOne"));
        double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
        double result = numberOne + numberTwo;

//        Dùng để gửi dữ liệu sang trang jsp theo dạng là key value
        request.setAttribute("haitt", result);
//        Trang mà bạn muốn hiển thị
        request.getRequestDispatcher("result_servlet.jsp").forward(request,response);
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("<html>");
//        printWriter.write("<body>");
//        printWriter.write("<h2 style='color:red'>"+result+"</h2>");
//        printWriter.write("</body>");
//        printWriter.write("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        double numberOne = Double.parseDouble(request.getParameter("numberOne"));
//        double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
//        double result = numberOne + numberTwo;
//
//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("<html>");
//        printWriter.write("<body>");
//        printWriter.write("<h2 style='color:red'>"+result+"</h2>");
//        printWriter.write("</body>");
//        printWriter.write("</html>");
    }
}