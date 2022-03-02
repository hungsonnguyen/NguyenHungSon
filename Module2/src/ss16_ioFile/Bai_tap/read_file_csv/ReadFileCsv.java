package ss16_ioFile.Bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileCsv {
    public static List<Country> readCsv(String path) {
        List<Country> countryList = new ArrayList<Country>();
        Country country = new Country();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            while ((line = br.readLine()) != null){
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1],temp[2] );
                countryList.add(country);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countryList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter link to CSV file:");
        String path = scanner.nextLine();
        List newList = new ArrayList();
        newList = readCsv(path);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
