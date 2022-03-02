package APJ_EXAM_C1021G1_NguyenHungSon.Service.Imp;

import APJ_EXAM_C1021G1_NguyenHungSon.Model.Student;
import APJ_EXAM_C1021G1_NguyenHungSon.Model.Teacher;
import APJ_EXAM_C1021G1_NguyenHungSon.Service.ITeacher;
import APJ_EXAM_C1021G1_NguyenHungSon.ultils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TeacherServiceImp extends Student implements ITeacher {
    private static final String REGEX_AGE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    private static final String REGEX_ID = "^SV-[0-9]{4}$";
    private static final String REGEX_GENGER = "^([n|N][a|A][m|M])|([n|N][u|U])|([k|K][h|H][a|A][c|C])$";
    private static Scanner scanner = new Scanner(System.in);

    private final String TEACHER_FILE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\APJ_EXAM_C1021G1_NguyenHungSon\\Service\\Imp\\TeacherServiceImp.java";

    public static List<Teacher> teacherList = new ArrayList<>();



    @Override
    public void addnew() {

        //String id,
        //                   String name,
        //                   String dateOfBirth,
        //                   String gender,
        //                   String specialize
        System.out.print("Mời bạn nhập mã giảng viên:");
        String id = RegexData.checkId(scanner.nextLine(), REGEX_ID);

        System.out.print("Mời bạn nhập tên giảng viên::");
        String name = scanner.nextLine();

        System.out.print("Mời bạn ngày sinh giảng viên::");
        String dayOfBirth = RegexData.checkAge(scanner.nextLine(), REGEX_AGE);

        System.out.print("Mời bạn giới tính giảng viên::");
        String gender = RegexData.checkStr(scanner.nextLine(), REGEX_GENGER, "Mời nhập lại giới tính giảng viên:( Nam, Nữ hoặc khác):!");
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
        System.out.print("Mời bạn chọn chuyên môn của giảng viên::");
        int select = 0;
        String specialize = "";
        boolean check = false;
        do {
            check = true;
            System.out.println("-- Chuyên môn của giảng viên--" +
                    "\n 1. Toán" +
                    "\n 2. Lý" +
                    "\n 3. Hóa" +
                    "\n 4. Anh" +
                    "\n 5. Trở lại");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    specialize = "Toán";
                    check = false;
                    break;
                case 2:
                    specialize = "Lý";
                    check = false;
                    break;
                case 3:
                    specialize = "Hóa";
                    check = false;
                    break;
                case 4:
                    specialize = "Anh";
                    check = false;
                    break;
                default:
                    System.out.println("Mời chọn lại chuyên môn!");
            }
        } while (check);
        Teacher teacher = new Teacher(id, name, dayOfBirth, gender, specialize);

        teacherList.add(teacher);
        write(TEACHER_FILE);
    }

    @Override
    public void delete() {
        System.out.println("Mời bạn lựa chọn mã ID nhân viên cần xóa");
        String idDelete = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (idDelete == teacherList.get(i).getId()) {
                teacherList.remove(i);
            }
        }
        write(TEACHER_FILE);

    }

    @Override
    public void display() {
        teacherList = read(TEACHER_FILE);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void search() {
        System.out.println("Mời nhập tên học sinh sinh viên ");
        teacherList = read(TEACHER_FILE);
        String findName = scanner.nextLine();
        for (Teacher teacher: teacherList){
            if (teacher.getName().contains(findName)){
                System.out.println(teacher);
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

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher: teacherList) {
                bufferedWriter.write(
                        teacher.getId() + "," +
                                teacher.getName() + "," +
                               teacher.getDateOfBirth() + "," +
                                teacher.getGender() + "," +
                                teacher.getSpecialize());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Teacher> read(String link) {
        List<Teacher> studentList = new ArrayList<>();
        Teacher teacher = null;
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
                teacher = new Teacher(temp[0],temp[1],temp[2],temp[3],temp[4]);
                studentList.add(teacher);
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
