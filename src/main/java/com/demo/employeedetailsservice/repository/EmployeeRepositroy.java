package com.demo.employeedetailsservice.repository;

import com.demo.employeedetailsservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositroy extends JpaRepository<Employee,Long> {
}
