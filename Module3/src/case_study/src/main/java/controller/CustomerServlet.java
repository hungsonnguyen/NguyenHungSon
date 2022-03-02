package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer_service.CustomerService;
import service.customer_service.CustomerServiceImpl;
import service.customer_service.CustomerTypeService;
import service.customer_service.CustomerTypeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    private CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;
            case "delete":
                showDelete(request, response);
                break;

            default:
                showList(request, response);
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("search");


        List<Customer> customerList = customerService.selectCustomer(searchName);
        request.setAttribute("customerList", customerList);


        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.selectAllCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {

        List<CustomerType> customerTypeList = customerTypeService.findAll();
        request.setAttribute("customerTypeList", customerTypeList);

        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.selectCustomerById(id);
        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");

        } else {
            request.setAttribute("customer", customer);
            dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchByName(request, response);
                break;
            default:
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id-customer"));
        String customer_name = request.getParameter("name-customer");
        String customer_code = request.getParameter("code-customer");
        String customer_birthday = request.getParameter("birthday");
        boolean customer_gender = Boolean.parseBoolean(request.getParameter("gender"));
        String customer_id_card = (request.getParameter("id-card-customer"));
        String customer_phone = request.getParameter("phone-customer");
        String customer_email = request.getParameter("email-customer");
        int customer_type_id = Integer.parseInt(request.getParameter("idCustomerType"));
        String customer_address = request.getParameter("address-customer");


        Customer customer = new Customer( id,customer_code, customer_name, customer_birthday,
                customer_gender, customer_id_card, customer_phone, customer_email, customer_type_id, customer_address);

        RequestDispatcher dispatcher;
        if (customer == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            customerService.edit(customer);
            request.setAttribute("customerList", customer);
            request.setAttribute("message", "Customer information was updated");
            try {
                response.sendRedirect("/customer");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String customer_name = request.getParameter("name-customer");
        String customer_code = request.getParameter("code-customer");
        String customer_birthday = request.getParameter("birthday");
        boolean customer_gender = Boolean.parseBoolean(request.getParameter("gender"));
        String customer_id_card = (request.getParameter("id-card-customer"));
        String customer_phone = request.getParameter("phone-customer");
        String customer_email = request.getParameter("email-customer");
        String customer_type_name = request.getParameter("customer_type_name");
        int customer_type_id = Integer.parseInt(request.getParameter("idCustomerType"));
        String customer_address = request.getParameter("birthday");


        Customer customer = new Customer(customer_code, customer_name, customer_birthday,
                customer_gender, customer_id_card, customer_phone, customer_email, customer_type_id, customer_type_name, customer_address);
        customerService.insert(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
