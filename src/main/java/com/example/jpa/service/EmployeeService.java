package com.example.jpa.service;

import com.example.jpa.entity.EmployeeRequest;
import com.example.jpa.model.Employee;
import com.example.jpa.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    public void addEmployee(EmployeeRequest employeeRequest) {


        var employee = Employee.builder()
                .name(employeeRequest.getName())
                .email(employeeRequest.getEmail())
                .address(employeeRequest.getAddress())
                .build();

        employeeRepository.save(employee);
    }
}
