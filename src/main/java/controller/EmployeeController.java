package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService=new EmployeeService();
    @GetMapping("")
    public ModelAndView showAll(){
        List<Employee> list=employeeService.findAll();
        return new ModelAndView("home","list",list);
    }
    @GetMapping("create")
    public ModelAndView showFormCrate(){
        return new  ModelAndView("create","e",new Employee());
    }
    @PostMapping("create")
    public ModelAndView crate(@ModelAttribute Employee e){
        int id = (int) (Math.random()*1000);
        e.setId(id);
        employeeService.create(e);
        return new ModelAndView("redirect:/employees");
    }
}
