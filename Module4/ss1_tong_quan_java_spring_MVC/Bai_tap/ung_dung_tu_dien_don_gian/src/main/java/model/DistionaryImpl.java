package model;

import java.util.HashMap;
import java.util.Map;

public class DistionaryImpl implements Distionary {
    public DistionaryImpl() {
    }

    @Override
    public Map<String, String> mapDistionart() {
        Map<String, String> distionary = new HashMap<>();
        distionary.put("Cat", "Mèo");
        distionary.put("Bike", "Xe đạp");
        distionary.put("Dog", "Cún");
        distionary.put("Math", "Toán");
        distionary.put("English", "Anh văn");
        return distionary;
    }
}
