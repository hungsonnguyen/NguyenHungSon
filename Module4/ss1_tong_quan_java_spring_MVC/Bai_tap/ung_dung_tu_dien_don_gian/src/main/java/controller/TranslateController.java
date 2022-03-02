package controller;

import service.Distionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        String result = distionary.translate(english);
        model.addAttribute("vietnamses",result);
        return "/home";
    }

}
