package com.zach.springbootjpademo.controller;

import com.zach.springbootjpademo.entity.Employee;
import com.zach.springbootjpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        System.out.println(employee.toString());
        return employeeService.saveEmp(employee);
    }

    @GetMapping("/{id}")
    public String del(@PathVariable Integer id){
        employeeService.delete(id);
        return "delete success!";
    }
}

