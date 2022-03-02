package controller;


import model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MailService;
import service.MailServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SaveMailController {
    MailService mailService = new MailServiceImpl();

    @RequestMapping({"/home", ""})
    public String home(Model model) {
        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        List<String> pageSize = new ArrayList<>();
        pageSize.add("5");
        pageSize.add("10");
        pageSize.add("15");
        pageSize.add("25");
        pageSize.add("100");
        model.addAttribute("languageList", languageList);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("mail", new Mail());
        return "/home";
    }

    @PostMapping("save")
    public String save(@ModelAttribute("mail") Mail mail, Model model) {
        mailService.addNewForm(mail);
        List<Mail> mailList = mailService.showList();
        model.addAttribute("message", "Add new Success");
        model.addAttribute("mailList", mailList);

        return "/list";
    }


}
