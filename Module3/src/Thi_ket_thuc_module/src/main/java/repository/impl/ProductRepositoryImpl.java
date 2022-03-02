package repository.impl;

import model.Product;
import repository.DBConnection;
import repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private static String SELECT_ALL_PRODUCT = "SELECT * FROM product join category on product.category_id = category.category_id join color on product.color_id = color.color_id ORDER BY product.product_id";
    private static String SELECT_CUSTOMER_BY_NAME = "SELECT * FROM product \n" +
            "join category \n" +
            "on product.category_id = category.category_id\n" +
            "join color\n" +
            "on product.color_id = color.color_id\n" +
            "where product_name like ?; ";
    private static String SELECT_PRODUCT_BY_ID = "SELECT * FROM product \n" +
            "join category \n" +
            "on product.category_id = category.category_id\n" +
            "join color\n" +
            "on product.color_id = color.color_id\n" +
            "where product.product_id =?; ";
    private static String INSERT_PRODUCT = "INSERT INTO `exam`.`product` (`product_name`, `product_price`, `product_quanity`, `product_description`, `category_id`, `color_id`) VALUES (?,?, ?, ?, ?, ?);";
    private static String DELETE_PRODUCT = "delete from product where product_id = ?";
    private static String EDIT_PRODUCT = "UPDATE `exam`.`product` SET `product_name` = ?, `product_price` = ?, `product_quanity` = ?, `product_description` = ?, `category_id` = ?, `color_id` = ? WHERE (`product_id` = ?);";

    @Override
    public Product selectProductById(int id) {
        Product product = null;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int product_id = resultSet.getInt("product_id");
                String product_name = resultSet.getString("product_name");
                double product_price = resultSet.getDouble("product_price");
                int product_quanity = resultSet.getInt("product_quanity");
                String product_description = resultSet.getString("product_description");


                int color_id = resultSet.getInt("color_id");
                String color_name = resultSet.getString("color_name");
                int category_id = resultSet.getInt("category_id");
                String category_name = resultSet.getString("category_name");
                product = new Product(product_id, product_name, product_price, product_quanity,product_description, color_id, color_name, category_id, category_name);


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public void insert(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                //"INSERT INTO `exam`.`product` (`product_name`, `product_price`, `product_quanity`, `product_description`, `category_id`, `color_id`) VALUES (?,?, ?, ?, ?, ?);";
                preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
                preparedStatement.setString(1, product.getProductName());
                preparedStatement.setDouble(2, product.getProduct_price());
                preparedStatement.setInt(3, product.getProductQuanity());
                preparedStatement.setString(4, product.getProductName());

                preparedStatement.setInt(5, product.getCategoryId());
                preparedStatement.setInt(6, product.getColorId());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }

    @Override
    public List<Product> selectCustomer(String name) {
        Connection connection = DBConnection.getConnection();
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
                preparedStatement.setString(1, "%" + name + "%");
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int product_id = resultSet.getInt("product_id");
                    String product_name = resultSet.getString("product_name");
                    double product_price = resultSet.getDouble("product_price");
                    int product_quanity = resultSet.getInt("product_quanity");
                    String product_description = resultSet.getString("product_description");


                    int color_id = resultSet.getInt("color_id");
                    String color_name = resultSet.getString("color_name");
                    int category_id = resultSet.getInt("category_id");
                    String category_name = resultSet.getString("category_name");
                    productList.add(new Product(product_id, product_name, product_price, product_quanity,product_description, color_id, color_name, category_id, category_name));


                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
        return productList;
    }

    @Override
    public List<Product> selectAllProduct() {
        Connection connection = DBConnection.getConnection();
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {

            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int product_id = resultSet.getInt("product_id");
                    String product_name = resultSet.getString("product_name");
                    double product_price = resultSet.getDouble("product_price");
                    int product_quanity = resultSet.getInt("product_quanity");
                    String product_description = resultSet.getString("product_description");


                    int color_id = resultSet.getInt("color_id");
                    String color_name = resultSet.getString("color_name");
                    int category_id = resultSet.getInt("category_id");
                    String category_name = resultSet.getString("category_name");
                    productList.add(new Product(product_id, product_name, product_price, product_quanity,product_description, category_id, category_name, color_id, color_name));


                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return productList;
    }

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_PRODUCT);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

    @Override
    public void edit(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(EDIT_PRODUCT);
//EDIT_PRODUCT = "UPDATE `exam`.`product` SET `product_name` = ?, `product_price` = ?, `product_quanity` = ?,
// `product_description` = ?, `category_id` = ?, `color_id` = ? WHERE (`product_id` = ?);";
                preparedStatement.setString(1, product.getProductName());
                preparedStatement.setDouble(2, product.getProduct_price());
                preparedStatement.setInt(3, product.getProductQuanity());
                preparedStatement.setString(4, product.getProductDescription());

                preparedStatement.setInt(5, product.getCategoryId());
                preparedStatement.setInt(6, product.getColorId());
                preparedStatement.setInt(7, product.getProductId());

                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
