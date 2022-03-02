package controller;

import model.Distionary;
import model.DistionaryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TranslateController {

    @Autowired
    private Distionary distionary;

    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @GetMapping("/translate")

    public String translate(@RequestParam String english, Model model) {
        Map<String, String> mapDistionnary = distionary.mapDistionart();
        String result = null;
        for (String key : mapDistionnary.keySet()) {
            result = "";
            if ((key.toLowerCase()).equals((english.toLowerCase()))) {
                result = mapDistionnary.get(key);
                break;
            } else {
                result = "Not found";
            }
        }
        model.addAttribute("vietnamses",result);
        return "/home";
    }

}
