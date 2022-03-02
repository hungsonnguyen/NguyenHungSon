package repository;

import model.Category;
import model.ColorProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository{
    private static String SELECT_ALL_CATEGORY = "SELECT * FROM category";

    @Override
    public List<Category> findAll() {
        Connection connection = DBConnection.getConnection();
        List<Category> categoryList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idCategory = resultSet.getInt("category_id");
                    String categoryName = resultSet.getString("category_name");
                    categoryList.add(new Category(idCategory, categoryName));
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

        return categoryList;
    }
}
