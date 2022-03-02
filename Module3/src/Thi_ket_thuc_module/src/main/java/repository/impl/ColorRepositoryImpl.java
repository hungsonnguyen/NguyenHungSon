package repository.impl;

import model.ColorProduct;
import repository.ColorRepository;
import repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColorRepositoryImpl implements ColorRepository {
    private static String SELECT_ALL_COLOR_PRODUCT = "SELECT * FROM color";
    @Override
    public List<ColorProduct> findAll() {
        Connection connection = DBConnection.getConnection();
        List<ColorProduct> colorProductList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_COLOR_PRODUCT);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idColorProduct = resultSet.getInt("color_id");
                    String colorProductName = resultSet.getString("color_name");
                    colorProductList.add(new ColorProduct(idColorProduct, colorProductName));
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
        return colorProductList;
    }
}
