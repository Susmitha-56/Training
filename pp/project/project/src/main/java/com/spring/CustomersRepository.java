package com.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Customers;

public interface CustomersRepository extends JpaRepository<Customers, String> {

}
