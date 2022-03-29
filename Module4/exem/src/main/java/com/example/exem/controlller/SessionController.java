package com.example.exem.controlller;


import com.example.exem.dto.SesssionDto;
import com.example.exem.model.Customer;
import com.example.exem.model.SessionType;
import com.example.exem.model.TranSaction;
import com.example.exem.service.CustomerService;
import com.example.exem.service.SessionService;
import com.example.exem.service.SessionTypeService;
import org.hibernate.Session;
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
        Page<TranSaction> tranSactions = sessionService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("session/index");
        modelAndView.addObject("tranSactions", tranSactions);
        return modelAndView;
    }

    @RequestMapping("/searchByName")
    public ModelAndView searchByName(@RequestParam(name = "search") String name, @PageableDefault(value = 2,
            sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        ModelAndView modelAndView = new ModelAndView("session/index", "sessions", sessionService.findByName(name, pageable));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("session/create");
        Page<Customer> customers = customerService.findAll(pageable);
        Page<SessionType> sessionTypes = sessionTypeService.findAll(pageable);

        modelAndView.addObject("customers", customers);
        modelAndView.addObject("sessionTypes", sessionTypes);
        modelAndView.addObject("sessionDto", new SesssionDto());
        return modelAndView;
    }


    @PostMapping("/create")
    public String saveCustomer(@Valid @ModelAttribute(name = "sessionDto") SesssionDto sessionDto, BindingResult bindingResult, @PageableDefault(value = 5, sort = "id",
            direction = Sort.Direction.ASC) Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            Page<SessionType> sessionTypes = sessionTypeService.findAll(pageable);
            Page<Customer> customers = customerService.findAll(pageable);
            model.addAttribute("sessionTypes", sessionTypes);
            model.addAttribute("customers", customers);
            return "session/create";
        } else {
            TranSaction tranSaction = new TranSaction();
            BeanUtils.copyProperties(sessionDto, tranSaction);
            sessionService.save(tranSaction);
            redirectAttributes.addFlashAttribute("message", "New customer created successfully");
            return "redirect:/session/list";
        }

    }


    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id, Pageable pageable) {
//        Optional<Customer> customer = customerService.findById(id);
        if (sessionService.findById(id) != null) {
            ModelAndView modelAndView = new ModelAndView("session/edit");
            Page<Customer> customers = customerService.findAll(pageable);
            Page<SessionType> sessionTypes = sessionTypeService.findAll(pageable);
            modelAndView.addObject("tranSaction", sessionService.findById(id));
            modelAndView.addObject("customers", customers);
            modelAndView.addObject("sessionTypes", sessionTypes);

            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute("tranSaction") TranSaction tranSaction, Pageable pageable, Model model, RedirectAttributes redirectAttributes) {
        sessionService.save(tranSaction);
        Page<TranSaction> tranSactions = sessionService.findAll(pageable);
        model.addAttribute("tranSactions", tranSactions);
        redirectAttributes.addFlashAttribute("message", "New customer edited successfully");
        return "redirect:/session/list";
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
        Page<TranSaction> tranSactions = sessionService.findAll(pageable);
        model.addAttribute("tranSactions", tranSactions);
        model.addAttribute("message", "Customer updated successfully");
        return "redirect:/customer/list";
    }
}
