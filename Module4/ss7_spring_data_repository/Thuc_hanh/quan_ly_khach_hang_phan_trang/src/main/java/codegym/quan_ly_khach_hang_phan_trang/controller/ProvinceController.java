package codegym.quan_ly_khach_hang_phan_trang.controller;


import codegym.quan_ly_khach_hang_phan_trang.model.Province;
import codegym.quan_ly_khach_hang_phan_trang.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private IProvinceService provinceService;
    @GetMapping("")
    public ModelAndView listProvinces() {
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveProvince(@ModelAttribute("province") Province province) {
        provinceService.save(province);

        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinceService.findAll());
        modelAndView.addObject("message", "New province created successfully");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
        Optional<Province> province = provinceService.findById(id);
        if (province.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/province/edit");
            modelAndView.addObject("province", province.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView updateProvince(@ModelAttribute("province") Province province) {
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinceService.findAll());
        modelAndView.addObject("message", "Province updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Optional<Province> province = provinceService.findById(id);
        if (province.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/province/delete");
            modelAndView.addObject("province", province.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deleteProvince(@ModelAttribute("province") Province province, Model model) {
        provinceService.remove(province.getId());
        model.addAttribute("provinces", provinceService.findAll());
        return "/province/list";
    }
}
