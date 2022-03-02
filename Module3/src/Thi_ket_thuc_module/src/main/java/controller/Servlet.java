package controller;

import model.Category;
import model.ColorProduct;
import model.Product;
import service.CategoryService;
import service.ColorService;
import service.Impl.CategoryServiceImpl;
import service.Impl.ColorServiceImpl;
import service.Impl.ProductServiceImpl;
import service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = {"/product",""})
public class Servlet extends HttpServlet {
    ProductService productService = new ProductServiceImpl();
    ColorService colorService = new ColorServiceImpl();
    CategoryService categoryService = new CategoryServiceImpl();
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

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.selectAllProduct();
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showDelete(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {
        List<ColorProduct> colorProductList = colorService.findAll();
        request.setAttribute("colorProductList", colorProductList);

        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("categoryList", categoryList);

        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.selectProductById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");

        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/edit.jsp");
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
        List<ColorProduct> colorProductList = colorService.findAll();
        List<Category> categoryList = categoryService.findAll();
        request.setAttribute("colorProductList", colorProductList);
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
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
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProductByName(request, response);
                break;
            default:
                break;
        }

    }

    private void searchProductByName(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("search");


        List<Product> productList = productService.selectProduct(searchName);
        request.setAttribute("productList", productList);


        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.delete(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int productId = Integer.parseInt(request.getParameter("id-product"));
        String productName = request.getParameter("name-product");
        double product_price = Double.parseDouble(request.getParameter("price-product"));
        int productQuanity = Integer.parseInt(request.getParameter("quantity"));
        String productDescription = request.getParameter("name-description");

        int categoryId = Integer.parseInt((request.getParameter("categoryType")));
        int colorId = Integer.parseInt(request.getParameter("colorType"));

        Product product = new Product(productId, productName, product_price, productQuanity,productDescription, categoryId, colorId);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            productService.edit(product);
            request.setAttribute("productList", product);
            request.setAttribute("message", "Product information was updated");
            try {
                response.sendRedirect("/product");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String productName = request.getParameter("name-product");
        double product_price = Double.parseDouble(request.getParameter("product-price"));
        int productQuanity = Integer.parseInt(request.getParameter("quanity-product"));
        String productDescription = request.getParameter("name-description");

        int categoryId = Integer.parseInt(request.getParameter("category"));
        int colorId = Integer.parseInt(request.getParameter("colorProduct"));

        Product product = new Product( productName, product_price, productQuanity,productDescription, categoryId, colorId);

        productService.insert(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }

