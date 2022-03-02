package ss16_ioFile.Thuc_hanh.Total_number_in_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String filePath) {

        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum  = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Total=  " + sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter link to file: ");
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }
}
