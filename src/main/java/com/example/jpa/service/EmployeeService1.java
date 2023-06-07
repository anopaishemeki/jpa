package com.example.jpa.service;

import com.example.jpa.entity.EmployeeRequest;
import com.example.jpa.entity.EmployeeRequest1;
import com.example.jpa.model.Address1;
import com.example.jpa.model.Employee;
import com.example.jpa.model.Employee1;
import com.example.jpa.repository.EmployeeRepository;
import com.example.jpa.repository.EmployeeRepository1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService1 {

    private final EmployeeRepository1 employeeRepository1;
    public void addEmployee(EmployeeRequest1 employeeRequest1) {

         List<Address1> address1List = employeeRequest1.getAddressList();
         System.out.println(employeeRequest1.getAddressList());

        var employee = Employee1.builder()
                .name(employeeRequest1.getName())
                .email(employeeRequest1.getEmail())
                .addressList(address1List)
                .build();

        employeeRepository1.save(employee);
    }
}
