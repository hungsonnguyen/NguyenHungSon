package codegym.quan_ly_khach_hang_phan_trang.controller;

import codegym.quan_ly_khach_hang_phan_trang.model.Customer;
import codegym.quan_ly_khach_hang_phan_trang.service.ICustomerService;
import codegym.quan_ly_khach_hang_phan_trang.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private IProvinceService provinceService;

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/searchByName" )
    public ModelAndView searchByName(@RequestParam(name = "search") String name,@PageableDefault(value = 2,
            sort = "id", direction = Sort.Direction.DESC) Pageable pageable){

        ModelAndView modelAndView = new ModelAndView("customer/list", "customers",customerService.findByFirstName(name,pageable));
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("provinces",provinceService.findAll());
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }


    @PostMapping("/create")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer,Pageable pageable) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customerService.findAll(pageable));
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

    @GetMapping("")
    public ModelAndView listCustomers(@PageableDefault(value = 2,sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
        Iterable<Customer> customers = customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer,Pageable pageable) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/list");

        modelAndView.addObject("customers", customerService.findAll(pageable));
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:/customers";
    }
}
