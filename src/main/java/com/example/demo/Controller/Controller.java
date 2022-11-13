package com.example.demo.Controller;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    EmployeeService employeeService = new EmployeeService();
    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public @ResponseBody EmployeeModel getEmployee(@PathVariable Integer id) {
        return employeeService.getById(id);
    }
}
