package cg.wbd.grandemonstration;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class Logger {
//    @Pointcut("execution(*cg.wbd.grandemonstration.controller.CustomerController.findAll(..))")
    @AfterThrowing(pointcut = "execution(public * cg.wbd.grandemonstration.service.CustomerService.findAll(..))")
    public  void  error(){
        System.out.println("[CMS] ERROR!");
    }
}
