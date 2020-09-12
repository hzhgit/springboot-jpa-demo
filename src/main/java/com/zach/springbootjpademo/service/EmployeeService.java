package com.zach.springbootjpademo.service;

import com.zach.springbootjpademo.dao.EmployeeDao;
import com.zach.springbootjpademo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmp(Employee employee) {
        return employeeDao.save(employee);
    }

    public void delete(Integer id) {
        employeeDao.deleteById(id);
    }
}
