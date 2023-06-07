package com.example.jpa.repository;

import com.example.jpa.model.Employee;
import com.example.jpa.model.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository1 extends JpaRepository<Employee1, Long> {
}
