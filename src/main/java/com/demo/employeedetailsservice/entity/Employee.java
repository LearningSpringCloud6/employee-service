package com.demo.employeedetailsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "designation")
    private  String designation;
    @Column(name = "is_project_allocated")
    private boolean isProjectAllocated;
    @Column(name = "contact_number")
    private long contactNumber;
    @Column(name = "experience")
    private  int experience;
}
