package reponsitory.impl;

import model.Student;
import reponsitory.IStudentRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Liên kết database.
public class StudentRepository implements IStudentRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<>();
        try {
//            Statement statement = this.baseRepository.getConnection().createStatement();
//            statement.executeQuery("select * from student");
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from student");
            ResultSet resultSet = preparedStatement.executeQuery(); // thực thi câu lệnh
            Student student;

            while (resultSet.next()) { //next -> đi qua từng bản ghi (row)
                student = new Student();
                student.setCodeStudent(resultSet.getInt("code_student"));
                student.setEmail(resultSet.getString("email"));
                student.setNameStudent(resultSet.getString("name_student"));
                student.setPoint(resultSet.getDouble("point"));
                student.setBirthday(resultSet.getString("birthday"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void saveStudent(Student student) {
        Connection connection = this.baseRepository.getConnection();
        try {
//            PreparedStatement preparedStatement = this.baseRepository.getConnection().
//                    prepareStatement("insert into student(code_student, name_student, birthday, email, point) value (?,?,?,?,?)");
//            preparedStatement.setString(4,student.getEmail());
//            preparedStatement.setDouble(5,student.getPoint());
//            preparedStatement.setInt(1, student.getCodeStudent());
//            preparedStatement.setString(2,student.getNameStudent());
//            preparedStatement.setString(3,student.getBirthday());
//            int row = preparedStatement.executeUpdate(); //áp dụng cho các lệnh insert, update, delete
            //row là số lượng bản ghi mà câu lệnh SQL tác động lên.
            connection = this.baseRepository.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.
                    prepareStatement("insert into student(code_student, name_student, birthday, email, point) value (?,?,?,?,?)");
            preparedStatement.setString(4,student.getEmail());
            preparedStatement.setDouble(5,student.getPoint());
            preparedStatement.setInt(1, student.getCodeStudent());
            preparedStatement.setString(2,student.getNameStudent());
            preparedStatement.setString(3,student.getBirthday());


            preparedStatement.executeUpdate(); //áp dụng cho các lệnh insert, update, delete
            PreparedStatement preparedStatement1 = connection.
                    prepareStatement("insert into classroom(code_class,name_class) value (10,'C1021g1_2022')");
            preparedStatement1.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Student findByCodeStudent(int codeStudent) {
        //query: select * from student where code_student = 5;
        try {
            //            Statement statement = this.baseRepository.getConnection().createStatement();
//            statement.executeQuery("select * from student where code_student = "+codeStudent);

            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from student where code_student = ?");
            preparedStatement.setInt(1, codeStudent);
 preparedStatement.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateStudent(Student student) {
    }

    @Override
    public List<Student> searchByName(String nameStudent) {
        List<Student> list = new ArrayList<>();
        try {
            CallableStatement callableStatement = this.baseRepository.getConnection().
                    prepareCall("call find_all_student_by_name(?)");
            callableStatement.setString(1, "%"+nameStudent+"%"); // "Ha" -> like %Ha%
            ResultSet resultSet = callableStatement.executeQuery();
            Student student;
            while (resultSet.next()) { //next -> đi qua từng bản ghi (row)
                student = new Student();
                student.setCodeStudent(resultSet.getInt("code_student"));
                student.setEmail(resultSet.getString("email"));
                student.setNameStudent(resultSet.getString("name_student"));
                student.setPoint(resultSet.getDouble("point"));
                student.setBirthday(resultSet.getString("birthday"));
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
