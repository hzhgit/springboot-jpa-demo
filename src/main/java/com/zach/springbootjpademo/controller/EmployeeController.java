package com.zach.springbootjpademo.controller;

import com.zach.springbootjpademo.entity.Employee;
import com.zach.springbootjpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

