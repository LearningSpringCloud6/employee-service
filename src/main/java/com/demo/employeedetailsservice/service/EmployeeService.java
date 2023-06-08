package com.demo.employeedetailsservice.service;

import com.demo.employeedetailsservice.entity.Employee;
import com.demo.employeedetailsservice.repository.EmployeeRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepositroy employeeRepositroy;

    public List<Employee> getAllEmployee() {
        return employeeRepositroy.findAll();
    }
}
