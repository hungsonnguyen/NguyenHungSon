package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    ModelAndView modelAndView;
    @RequestMapping("/")
    public String home(){
        return "/home";
    }
    @PostMapping("/save")
    public ModelAndView save(@RequestParam(name = "condiment", defaultValue = "noChoice") String[] condiment) {
        if (!condiment[0].equals("noChoice")){
            modelAndView= new ModelAndView("/home","list", condiment);
        }
        else {
            modelAndView= new ModelAndView("/home", "list", "No choice toping!");
        }
        return modelAndView;
    }
}
