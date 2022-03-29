package codegym.ss7_mo_rong_ung_dung_blog.controller;


import codegym.ss7_mo_rong_ung_dung_blog.model.Category;
import codegym.ss7_mo_rong_ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;
    @GetMapping("")
    public ModelAndView listProvinces(@PageableDefault(value = 5,sort = "")Pageable pageable) {
        Iterable<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveProvince(@ModelAttribute("category") Category category) {
        categoryService.save(category);

        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categories", categoryService.findAll());
        modelAndView.addObject("message", "New categories created successfully");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView updateProvince(@ModelAttribute("category") Category category) {
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("category", categoryService.findAll());
        modelAndView.addObject("message", "Category updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category", category.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deleteProvince(@ModelAttribute("category") Category category, Model model) {
        categoryService.remove(category.getId());
        model.addAttribute("categories", categoryService.findAll());
        return "/province/list";
    }
}
