package APJ_EXAM_C1021G1_NguyenHungSon.Service.Imp;

import APJ_EXAM_C1021G1_NguyenHungSon.Model.Student;
import APJ_EXAM_C1021G1_NguyenHungSon.Service.IStudent;
import APJ_EXAM_C1021G1_NguyenHungSon.ultils.RegexData;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentServiceImp extends Student implements IStudent {
    private static final String REGEX_AGE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    private static final String REGEX_ID = "^SV-[0-9]{4}$";
    private static final String REGEX_GENGER = "^([n|N][a|A][m|M])|([n|N][u|U])|([k|K][h|H][a|A][c|C])$";
    private static Scanner scanner = new Scanner(System.in);

    private final String STUDENT_FILE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\APJ_EXAM_C1021G1_NguyenHungSon\\Data\\StudentProfile.csv";

    public static List<Student> studentList = new ArrayList<>();

    @Override
    public void addnew() {
        //                  String id,
        //                   String name,
        //                   String dateOfBirth,
        //                   String gender,
        //                   String grade,
        //                   double score
        System.out.print("Mời bạn nhập mã học sinh:");
        String id = RegexData.checkId(scanner.nextLine(),REGEX_ID);

        System.out.print("Mời bạn nhập tên học sinh:");
        String name = scanner.nextLine();

        System.out.print("Mời bạn ngày sinh học sinh:");
        String dayOfBirth = RegexData.checkAge(scanner.nextLine(), REGEX_AGE);

        System.out.print("Mời bạn giới tính Học sinh:");
        String gender = RegexData.checkStr(scanner.nextLine(), REGEX_GENGER, "Mời nhập lại giới tính Học sinh( Nam, Nữ hoặc khác):!");
        switch (gender.toLowerCase(Locale.ROOT)) {
            case "nam":
                gender = "Nam";
                break;
            case "nu":
                gender = "Nữ";
                break;
            case "khac":
                gender = "Giới tính khác!";
                break;
        }
        System.out.print("Mời bạn lớp của Học sinh:");
        String grade = scanner.nextLine();
        System.out.print("Mời bạn điểm của Học sinh:");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dayOfBirth, gender, grade, score);

        studentList.add(student);

        write(STUDENT_FILE);
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        studentList = read(STUDENT_FILE);
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void search() {
        System.out.println("Mời nhập tên học sinh sinh viên ");
        studentList = read(STUDENT_FILE);
        String findName = scanner.nextLine();
        for (Student student: studentList){
            if (student.getName().contains(findName)){
                System.out.println(student);
            }
        }

    }

    public static void write(String link) {
        File file = new File(link);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //                  String id,
        //                   String name,
        //                   String dateOfBirth,
        //                   String gender,
        //                   String grade,
        //                   double score

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(
                        student.getId() + "," +
                                student.getName() + "," +
                                student.getDateOfBirth() + "," +
                                student.getGender() + "," +
                                student.getGrade() + "," +
                                student.getScore() + ",");
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> read(String link) {
        List<Student> studentList = new ArrayList<>();
        Student student = null;
        String[] temp = null;
        String line = null;
        File file = new File(link);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                //Student student = new Student(id, name, dayOfBirth, gender, grade, score);
                student = new Student(temp[0], temp[1], temp[2], temp[3], temp[4], Double.parseDouble(temp[5]));
                studentList.add(student);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
