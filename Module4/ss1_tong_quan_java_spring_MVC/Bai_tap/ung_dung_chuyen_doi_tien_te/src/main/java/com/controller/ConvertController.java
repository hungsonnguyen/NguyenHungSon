package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String home(){
        return "home-view";
    }
        @GetMapping("/convert")
    public String convert(@RequestParam String usd, String rate, Model model){
        Double result = Double.valueOf(usd)*Double.valueOf(rate);
        model.addAttribute("result",result);
        return "home-view";
    }
}
