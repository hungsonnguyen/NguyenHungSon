package com.example.test_examination_module4.controller;

import com.example.test_examination_module4.dto.ProductDto;
import com.example.test_examination_module4.model.Product;
import com.example.test_examination_module4.model.ProductType;
import com.example.test_examination_module4.service.ProductService;
import com.example.test_examination_module4.service.ProductTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;


    @GetMapping("/list")
    public ModelAndView listCustomers(@RequestParam(name = "search", defaultValue = "") String name,
                                      @RequestParam(name = "price", defaultValue = "") double price,
                                      @RequestParam(name = "productTypes", defaultValue = "")String prodcutTypeName,
                                      @PageableDefault(value = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        ModelAndView modelAndView = null;
        Page<Product> products = productService.findAll(pageable);
        modelAndView = new ModelAndView("product/index");
        modelAndView.addObject("products",products);

//        if (productTypeService.equals("")) {
//            Page<Product> products = productService.findAllByProductName(name,pageable);
//            modelAndView = new ModelAndView("product/index");
//            modelAndView.addObject("searchName",name);
//            modelAndView.addObject("products", products);
//        } else {
//            Page<Product> products =productService.findAllByNameContainingAndPriceAndProductType_Name(name, price,prodcutTypeName, pageable);
//            modelAndView = new ModelAndView("product/index", "products",products);
//            modelAndView.addObject("searchName",name);
//            modelAndView.addObject("price",price);
//            modelAndView.addObject("searchTypeProduct",prodcutTypeName);
//        }
        //        Gửi hiển thị list typelist sang trang index
        List<ProductType> productTypes = productTypeService.findAll();
        modelAndView.addObject("productTypes", productTypes);
        return modelAndView;

    }

    @GetMapping("/search/{id}")
    public ModelAndView searhById(@PathVariable int id) {
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/view");
        modelAndView.addObject("product", product);
        return modelAndView;
    }


    @GetMapping("/create")
    public ModelAndView showCreateForm(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("transaction/create");
        List<ProductType> productTypes = productTypeService.findAll();
        modelAndView.addObject("productTypes", productTypes);
        modelAndView.addObject("productDto", new ProductDto());
        return modelAndView;
    }


    @PostMapping("/create")
    public String saveCustomer(@Valid @ModelAttribute(name = "productDto") ProductDto productDto, BindingResult bindingResult, @PageableDefault(value = 5, sort = "id",
            direction = Sort.Direction.ASC) Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            List<ProductType> productTypes = productTypeService.findAll();
            model.addAttribute("productTypes", productTypes);
            return "product/create";
        } else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);
            productService.save(product);
            redirectAttributes.addFlashAttribute("message", "New product created successfully");
            return "redirect:/product/list";
        }

    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id, Pageable pageable) {
        if (productService.findById(id) != null) {
            ModelAndView modelAndView = new ModelAndView("product/edit");
            List<ProductType> productTypes = productTypeService.findAll();
            modelAndView.addObject("productTypes", productTypes);

            modelAndView.addObject("product", productService.findById(id));
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute(name = "transaction") Product product, Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "New product edited successfully");
        return "redirect:/product/list";
    }


    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam(name = "id") int id,RedirectAttributes redirectAttributes) {
        productService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Customer delete successfully");
        return "redirect:/product/list";
    }

}
