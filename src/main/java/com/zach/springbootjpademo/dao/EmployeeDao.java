package com.zach.springbootjpademo.dao;

import com.zach.springbootjpademo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
