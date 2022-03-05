package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProdcuctService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProdcuctService prodcuctService = new ProductServiceImpl();


    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("products", prodcuctService.findAll());
        return "/index";

    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        prodcuctService.save(product);
        redirectAttributes.addFlashAttribute("success", "Add new product success!!!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(Model model, @PathVariable int id) {
        model.addAttribute("product", prodcuctService.searchById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        prodcuctService.delete(product.getId());
        redirectAttributes.addFlashAttribute("success", "Delete product success!!!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(Model model, @PathVariable int id) {
        model.addAttribute("product", prodcuctService.searchById(id));
        return "/view";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", prodcuctService.searchById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        prodcuctService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Update product success!!!");
        return "redirect:/product";
    }

    @PostMapping("/search")
    public String search(@RequestParam(name = "search") String search, Model model) {

        model.addAttribute("products",prodcuctService.searchByName(search));
        return "/index";
    }
}
