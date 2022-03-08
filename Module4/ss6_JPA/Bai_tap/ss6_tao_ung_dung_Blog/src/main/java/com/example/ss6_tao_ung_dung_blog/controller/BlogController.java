package com.example.ss6_tao_ung_dung_blog.controller;


import com.example.ss6_tao_ung_dung_blog.model.Blog;
import com.example.ss6_tao_ung_dung_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping({"/blog",""})
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String index(Model model) {
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes) {
//        blog.setId((int) (Math.random() * 10000));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Addnew Success");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog,Model model) {
        blogService.save(blog);
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogs", blogs);
        return "/index";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(RedirectAttributes redirectAttributes, Blog blog) {
        blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog",blogService.findById(id));
        return "/view";
    }
}
