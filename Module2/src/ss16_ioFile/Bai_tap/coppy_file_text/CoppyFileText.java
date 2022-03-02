package ss16_ioFile.Bai_tap.coppy_file_text;

import ss16_ioFile.Thuc_hanh.Total_number_in_file_text.ReadFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoppyFileText {
    public static void readAndWriteFile(String sourceFile, String targetFile) {
        try {
            List list = new ArrayList();
            File fileSource = new File(sourceFile);
            File fileTarget = new File(targetFile);
            if (!fileSource.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileTarget);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            FileReader fileReader1 = new FileReader(fileTarget);
            BufferedReader brTarget = new BufferedReader(fileReader1);

            String line = "";
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }
            while ((line = brTarget.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source, target;
        System.out.println("Enter link to Source file: ");
        source = scanner.nextLine();
        System.out.println("Enter link to Target file: ");
        target = scanner.nextLine();
        readAndWriteFile(source, target);
    }
}
