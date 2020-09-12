package com.zach.springbootjpademo.service;

import com.zach.springbootjpademo.dao.EmployeeDao;
import com.zach.springbootjpademo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmp(Employee employee) {
        return employeeDao.save(employee);
    }

    public void delete(Integer id) {
        if(employeeDao.findById(id).isPresent()) {
            employeeDao.deleteById(id);
        }
    }

    public Employee update(Integer id,Employee employee) {
        if(employeeDao.findById(id).isPresent()){
            employee.setId(id);
            return employeeDao.save(employee);
        }
        return null;
    }

    public List<Employee> getAll() {
        return employeeDao.findAll();
    }
}
