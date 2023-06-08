package com.demo.employeedetailsservice.controller;

import com.demo.employeedetailsservice.entity.Employee;
import com.demo.employeedetailsservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/api/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/fetch-employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
}
