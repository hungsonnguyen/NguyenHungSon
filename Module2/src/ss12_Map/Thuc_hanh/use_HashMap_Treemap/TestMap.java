package ss12_Map.Thuc_hanh.use_HashMap_Treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        int count = 1;
        for(String student : hashMap.keySet()){
            System.out.println("Họ và tên sinh viên "+ count + ": " + student + " độ tuổi =  " + hashMap.get(student));
        count++;
        }
        System.out.println("------");
        int count1 = 1;
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        for(String student : treeMap.keySet()){
            System.out.println("Họ và tên sinh viên "+ count1 + ": " + student + " độ tuổi =  " + treeMap.get(student));
            count1++;
        }

    }
}
