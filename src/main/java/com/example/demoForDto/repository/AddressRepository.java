package com.example.demoForDto.repository;

import com.example.demoForDto.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,String> {
}
