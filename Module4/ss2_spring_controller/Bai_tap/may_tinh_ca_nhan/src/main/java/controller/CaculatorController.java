package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ServiceCalculate;
import service.ServiceImpl;

@Controller
public class CaculatorController {
    ServiceCalculate serviceCalculate = new ServiceImpl();
    @RequestMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("/did")
    public String addition(@RequestParam(defaultValue = "0") double first,@RequestParam(defaultValue = "0") double second, String calculate, Model model) {
        String result = serviceCalculate.calculate(first,second,calculate);
        calculate = serviceCalculate.calculator(second,calculate);
        model.addAttribute("value",result);
        model.addAttribute("result",calculate);
        return "/home";
    }
}
