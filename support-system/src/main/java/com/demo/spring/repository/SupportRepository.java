package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.model.SupportRequest;

public interface SupportRepository extends JpaRepository<SupportRequest, String> {

}
