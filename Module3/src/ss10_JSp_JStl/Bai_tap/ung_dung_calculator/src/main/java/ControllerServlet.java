import Model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControllerServlet", urlPatterns = "/calculate")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    float first_operand = Float.parseFloat(request.getParameter("first_operand"));
    float second_operand = Float.parseFloat(request.getParameter("second_operand"));
    char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Result: ");
        try{
            float result = Calculator.calculate(first_operand,second_operand,operator);
            writer.println(first_operand + " " + operator + " " + second_operand + " = " + result);
        }catch (Exception exception){
            writer.println("Error: " + exception.getMessage());
        }writer.println("</html>");
    }

}
