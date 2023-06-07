package com.example.jpa.entity;

import com.example.jpa.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequest {
    private String name;
    private String email;

    private Address address;
}
