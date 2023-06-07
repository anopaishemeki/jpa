package com.example.jpa.repository;

import com.example.jpa.model.Address;
import com.example.jpa.model.Address1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository1 extends JpaRepository<Address1, Long> {
}
