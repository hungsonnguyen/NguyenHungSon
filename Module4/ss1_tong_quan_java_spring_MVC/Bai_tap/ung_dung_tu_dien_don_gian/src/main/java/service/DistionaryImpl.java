package service;

import java.util.HashMap;
import java.util.Map;

public class DistionaryImpl implements Distionary {
    public DistionaryImpl() {
    }
   public static Map<String, String> distionary = new HashMap<>();
    static {
        distionary.put("Cat", "Mèo");
        distionary.put("Bike", "Xe đạp");
        distionary.put("Dog", "Cún");
        distionary.put("Math", "Toán");
        distionary.put("English", "Anh văn");

    }


    @Override
    public Map<String, String> mapDistionart() {
        return distionary;
    }

    @Override
    public String translate(String search) {
        String result = "";
        for (String key : distionary.keySet()) {
            result = "";
            if ((key.toLowerCase()).equals((search.toLowerCase()))) {
                result = distionary.get(key);
                break;
            } else {
                result = "Not found";
            }
        }
        return result;
    }

}
