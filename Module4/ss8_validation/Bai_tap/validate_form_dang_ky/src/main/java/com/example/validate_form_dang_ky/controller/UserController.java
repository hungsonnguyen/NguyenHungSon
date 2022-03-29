package com.example.validate_form_dang_ky.controller;


import com.example.validate_form_dang_ky.model.User;
import com.example.validate_form_dang_ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/login")
    public String checkValidation(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/index";
        } else {
            userService.update(user);
            model.addAttribute("user", user);
            return "/result";
        }
    }
}
