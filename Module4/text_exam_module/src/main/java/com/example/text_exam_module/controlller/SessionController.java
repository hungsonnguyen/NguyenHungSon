package com.example.text_exam_module.controlller;


import com.example.text_exam_module.model.Session;
import com.example.text_exam_module.service.impl.CustomerService;
import com.example.text_exam_module.service.impl.SessionService;
import com.example.text_exam_module.service.impl.SessionTypeService;
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

import javax.validation.Valid;

@Controller
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @Autowired
    private CustomerService customerService;

    @Autowired
   private SessionTypeService sessionTypeService;

    @GetMapping("/list")
    public ModelAndView listCustomers(@PageableDefault(value = 3, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        Page<Session> sessions = sessionService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("session/index");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @RequestMapping("/searchByName")
    public ModelAndView searchByName(@RequestParam(name = "search") String name, @PageableDefault(value = 2,
            sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        ModelAndView modelAndView = new ModelAndView("customer/index", "customers", sessionService.findByName(name, pageable));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        Page<CustomerType> customerTypes = customerTypeService.findAll(pageable);
        modelAndView.addObject("customerTypes", customerTypes);
        modelAndView.addObject("customerDto", new CustomerDto());
        return modelAndView;
    }


    @PostMapping("/create")
    public String saveCustomer(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult, @PageableDefault(value = 5, sort = "id",
            direction = Sort.Direction.ASC) Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            Page<CustomerType> customerTypes = customerTypeService.findAll(pageable);
            model.addAttribute("customerTypes", customerTypes);
            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            sessionService.save(customer);
            redirectAttributes.addFlashAttribute("message", "New customer created successfully");
            return "redirect:/customer/list";
        }

    }


    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id, Pageable pageable) {
//        Optional<Customer> customer = customerService.findById(id);
        if (sessionService.findById(id)!=null) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            Page<CustomerType> customerTypes = customerTypeService.findAll(pageable);
            modelAndView.addObject("customer", sessionService.findById(id));
            modelAndView.addObject("customerTypes", customerTypes);

            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute("customer") Customer customer, Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        sessionService.save(customer);
        Page<Customer> customers = sessionService.findAll(pageable);
        model.addAttribute("customers", customers);
        redirectAttributes.addFlashAttribute("message", "New customer edited successfully");
        return "redirect:/customer/list";
    }

//    @GetMapping("/delete/{id}")
//    public ModelAndView showDeleteForm(@PathVariable int id) {
//        Optional<Customer> customer = customerService.findById(id);
//        if (customer.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("customer/delete");
//            modelAndView.addObject("customer", customer.get());
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }

    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam(name = "id") int id, @PageableDefault(value = 2, sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {
        sessionService.remove(id);
        Page<Customer> customers = sessionService.findAll(pageable);
        model.addAttribute("customers", customers);
        model.addAttribute("message", "Customer updated successfully");
        return "redirect:/customer/list";
    }
}
