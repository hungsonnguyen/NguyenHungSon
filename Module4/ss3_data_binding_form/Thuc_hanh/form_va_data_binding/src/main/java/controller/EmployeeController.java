package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new com.codegym.model.Employee());
        return "employee/create";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") com.codegym.model.Employee employee, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employee/info";
    }
}
