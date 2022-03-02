package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.service.IStudentService;
import vn.codegym.service.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Qualifier("studentServiceImpl")
    @Autowired
    private IStudentService studentService;


//    /*DI Constructor*/
//    public StudentController(IStudentService studentService) {
//        this.studentService = studentService;
//    }

//    /*Di Setter*/
//    @Autowired
//    public void setStudentService(IStudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping
    public ModelAndView showStudentList(){
        return new ModelAndView("student",
                "studentList", studentService.findAll());
    }
}
