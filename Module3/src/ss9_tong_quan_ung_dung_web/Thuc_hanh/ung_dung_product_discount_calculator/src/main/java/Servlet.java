import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/displayDiscount")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        double discountAmount = price*discount_percent*0.01;
        double discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount:" + product + "</h1>");
        writer.println("<h1>Discount Amount:" + discountAmount + "</h1>");
        writer.println("<h1>Discount Price:" + discountPrice + "</h1>");
        writer.println("</html>");

    }
}
