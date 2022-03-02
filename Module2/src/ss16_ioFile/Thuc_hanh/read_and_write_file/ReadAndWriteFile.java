package ss16_ioFile.Thuc_hanh.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {

    public ReadAndWriteFile() {
    }


    public List<Integer>  readFile(String pathFile) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";

            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void writeFile(String resultFile, int max){
        File file = new File(resultFile);
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("Max value is = " + max);
            bw.newLine();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter link to path: ");
        String path = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> newList = new ArrayList<>();
        newList = readAndWriteFile.readFile(path);
        System.out.println(newList);
        int max = 0;
        max = readAndWriteFile.findMax(newList);
        System.out.println("Enter link to result: ");
        String result = scanner.nextLine();
        readAndWriteFile.writeFile(result, max);

    }
}
