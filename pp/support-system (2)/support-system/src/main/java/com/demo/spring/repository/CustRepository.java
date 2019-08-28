package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.model.Customer;

public interface CustRepository extends JpaRepository<Customer, String> {

}
