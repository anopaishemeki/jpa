package com.example.jpa.controller;

import com.example.jpa.entity.EmployeeRequest;
import com.example.jpa.entity.EmployeeRequest1;
import com.example.jpa.service.EmployeeService1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController1 {

    private final EmployeeService1 employeeService1;

    @PostMapping("/add1")
    public void addEmployee(@RequestBody EmployeeRequest1 employeeRequest1) {
        employeeService1.addEmployee(employeeRequest1);
    }

    @PutMapping("/update1")
    public void updateEmployee(@RequestBody EmployeeRequest1 employeeRequest1){

    }
}
