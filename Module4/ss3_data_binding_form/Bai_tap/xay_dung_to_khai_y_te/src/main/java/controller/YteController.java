package controller;

import model.FormYt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.FormYtService;
import service.FormYtServiceImpl;

import java.util.List;

@Controller
public class YteController {
    FormYtService formYtService = new FormYtServiceImpl();
    @RequestMapping({"/home",""})
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/home","form",new FormYt());
        return modelAndView;
    }
    @PostMapping("/send")
    public String save(@ModelAttribute("form")FormYt formYt, Model model){
        formYtService.addNewForm(formYt);
        List<FormYt> formYtList = formYtService.showList();
        model.addAttribute("formList",formYtList);
        model.addAttribute("message","Send success");
        return "/list";
    }
}
