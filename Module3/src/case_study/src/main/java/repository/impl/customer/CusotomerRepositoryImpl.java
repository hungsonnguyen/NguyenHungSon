package repository.impl.customer;

import model.customer.Customer;
import repository.impl.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CusotomerRepositoryImpl implements ICustomerRepository {
    private static String SELECT_ALL_CUSTOMER = "SELECT * FROM customer \n" +
            "join customer_type on customer.customer_type_id = customer_type.customer_type_id ORDER BY customer_id;";
    private static String SELECT_CUSTOMER_BY_NAME = "SELECT * FROM customer " +
            "join customer_type on customer.customer_type_id = customer_type.customer_type_id where customer.customer_name LIKE ?";
    private static String SELECT_CUSTOMER_BY_ID = "SELECT * FROM customer \n" +
            "join customer_type on customer.customer_type_id = customer_type.customer_type_id where customer.customer_id = ?;";
    private static String INSERT_CUSTOMER = "INSERT INTO `case_study_furama_servlet`.`customer` (`customer_code`, `customer_name`, `customer_birthday`," +
            " `customer_gender`, `customer_id_card`, `customer_phone`, `customer_email`, `customer_type_id`, `customer_address`) VALUES ( ?, ?, ?,?,?,?,?,?,?);";
    private static String DELETE_CUSTOMER = "delete from customer where customer_id = ?";
    private static String EDIT_CUSTOMER = "UPDATE `case_study_furama_servlet`.`customer` SET `customer_code` = ?, `customer_name` =?, " +
            "`customer_birthday` = ?, `customer_gender` = ?, " +
            "`customer_id_card` = ?, `customer_phone` = ?, `customer_email` = ?, `customer_type_id` = ?, `customer_address` = ? WHERE (`customer_id` = ?);";


    @Override
    public Customer selectCustomerById(int id) {
        Customer customer = null;
        try (Connection connection = DBConnection.getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (resultSet.next()) {
                int customer_id = resultSet.getInt("customer_id");
                String customer_code = resultSet.getString("customer_code");
                String customer_name = resultSet.getString("customer_name");
                String customer_birthday = resultSet.getString("customer_birthday");
                Boolean customer_gender = resultSet.getBoolean("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_email = resultSet.getString("customer_email");
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_type_name = resultSet.getString("customer_type_name");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_address = resultSet.getString("customer_address");
                customer = new Customer(customer_id, customer_code, customer_name, customer_birthday, customer_gender,
                        customer_id_card, customer_phone, customer_email, customer_type_id, customer_type_name, customer_address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void insert(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
                preparedStatement.setString(1, customer.getCustomer_code());
                preparedStatement.setString(2, customer.getCustomer_name());
                preparedStatement.setString(3, customer.getCustomer_birthday());
                preparedStatement.setBoolean(4, customer.getCustomer_gender());
                preparedStatement.setString(5, customer.getCustomer_id_card());
                preparedStatement.setString(6, customer.getCustomer_phone());
                preparedStatement.setString(7, customer.getCustomer_email());
                preparedStatement.setInt(8, customer.getCustomer_type_id());
                preparedStatement.setString(9, customer.getCustomer_address());
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
    public List<Customer> selectCustomer(String name) {
        Connection connection = DBConnection.getConnection();
        List<Customer> customerList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
                preparedStatement.setString(1, "%"+name+"%");
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int customer_id = resultSet.getInt("customer_id");
                    String customer_code = resultSet.getString("customer_code");
                    String customer_name = resultSet.getString("customer_name");
                    String customer_birthday = resultSet.getString("customer_birthday");
                    Boolean customer_gender = resultSet.getBoolean("customer_gender");
                    String customer_id_card = resultSet.getString("customer_id_card");
                    String customer_phone = resultSet.getString("customer_phone");
                    String customer_email = resultSet.getString("customer_email");
                    String customer_address = resultSet.getString("customer_address");
                    int customer_type_id = resultSet.getInt("customer_type_id");
                    String customer_type_name = resultSet.getString("customer_type_name");
                    customerList.add(new Customer(customer_id,customer_code, customer_name, customer_birthday,
                            customer_gender, customer_id_card, customer_phone, customer_email, customer_type_id, customer_type_name, customer_address));
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
        return customerList;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        Connection connection = DBConnection.getConnection();
        List<Customer> customerList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int customer_id = resultSet.getInt("customer_id");
                    String customer_code = resultSet.getString("customer_code");
                    String customer_name = resultSet.getString("customer_name");
                    String customer_birthday = resultSet.getString("customer_birthday");
                    Boolean customer_gender = resultSet.getBoolean("customer_gender");
                    String customer_id_card = resultSet.getString("customer_id_card");
                    String customer_phone = resultSet.getString("customer_phone");
                    String customer_email = resultSet.getString("customer_email");
                    String customer_address = resultSet.getString("customer_address");
                    int customer_type_id = resultSet.getInt("customer_type_id");
                    String customer_type_name = resultSet.getString("customer_type_name");
                    customerList.add(new Customer(customer_id, customer_code, customer_name, customer_birthday,
                            customer_gender, customer_id_card, customer_phone, customer_email, customer_type_id, customer_type_name, customer_address));
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
        return customerList;
    }

    @Override
    public void delete(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
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
    public void edit(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(EDIT_CUSTOMER);
//private static String EDIT_CUSTOMER = "UPDATE `case_study_furama_servlet`.`customer` SET `customer_code` = ?, `customer_name` =?, " +
//            "`customer_birthday` = ?, `customer_gender` = ?, " +
//            "`customer_id_card` = ?, `customer_phone` = ?, `customer_email` = ?, `customer_type_id` = ?, `customer_address` = ? WHERE (`customer_id` = ?);";
                preparedStatement.setString(1, customer.getCustomer_code());
                preparedStatement.setString(2, customer.getCustomer_name());
                preparedStatement.setString(3, customer.getCustomer_birthday());
                preparedStatement.setBoolean(4, customer.getCustomer_gender());
                preparedStatement.setString(5, customer.getCustomer_id_card());
                preparedStatement.setString(6, customer.getCustomer_phone());
                preparedStatement.setString(7, customer.getCustomer_email());
                preparedStatement.setInt(8, customer.getCustomer_type_id());
                preparedStatement.setString(9, customer.getCustomer_address());
                preparedStatement.setInt(10, customer.getCustomer_id());

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
