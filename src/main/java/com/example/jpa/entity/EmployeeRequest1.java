package com.example.jpa.entity;

import com.example.jpa.model.Address;
import com.example.jpa.model.Address1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequest1 {
    private String name;
    private String email;

    private List<Address1> addressList;
}
