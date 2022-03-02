package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller //đánh dấu 1 class là controller
public class HelloController {

    /*Handle method
    - method xử lý request của người dùng*/
    @RequestMapping("/hello")
    public String showHelloPage(Model model,
                                ModelMap modelMap,
                                HttpServletRequest request, //kiểu cũ
                                @RequestParam int age){ //kiểu mới
        /*data*/
        String name = request.getParameter("name");
        model.addAttribute("studentName", name);
        modelMap.addAttribute("studentAge", age);

        return "hello"; //trả về tên view
    }

    @GetMapping("/hello") //Url pattern
    public ModelAndView showHelloPage(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("studentName", "Tinh");
        modelAndView.addObject("studentAge", 18);

        return modelAndView;
    }

    /*phương thức bình thường*/
    private String abc(){
        return "hello";
    }
}
