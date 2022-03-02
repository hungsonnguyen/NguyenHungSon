package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://vnn-imgs-a1.vgcloud.vn/icdn.dantri.com.vn/2021/05/26/ngo-ngang-voi-ve-dep-cua-hot-girl-anh-the-chua-tron-18-docx-1622043349706.jpeg");
        Customer customer1 = new Customer("Nguyễn Văn Nam", "1983-08-21", "Hà Nội", "https://vnn-imgs-a1.vgcloud.vn/icdn.dantri.com.vn/2021/05/26/ngo-ngang-voi-ve-dep-cua-hot-girl-anh-the-chua-tron-18-docx-1622043349706.jpeg");
        Customer customer2 = new Customer("Nguyễn Thái Hòa", "1983-08-22", "Hà Nội", "https://vnn-imgs-a1.vgcloud.vn/icdn.dantri.com.vn/2021/05/26/ngo-ngang-voi-ve-dep-cua-hot-girl-anh-the-chua-tron-18-docx-1622043349706.jpeg");
        Customer customer3 = new Customer("Trần Đăng Khoa", "1983-08-23", "Hà Nội", "https://vnn-imgs-a1.vgcloud.vn/icdn.dantri.com.vn/2021/05/26/ngo-ngang-voi-ve-dep-cua-hot-girl-anh-the-chua-tron-18-docx-1622043349706.jpeg");
        Customer customer4 = new Customer("Nguyễn Đình thi", "1983-08-24", "Hà Nội", "https://vnn-imgs-a1.vgcloud.vn/icdn.dantri.com.vn/2021/05/26/ngo-ngang-voi-ve-dep-cua-hot-girl-anh-the-chua-tron-18-docx-1622043349706.jpeg");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        request.setAttribute("customer", customerList);
        request.getRequestDispatcher("test.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
