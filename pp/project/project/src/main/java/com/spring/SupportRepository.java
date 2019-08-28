package com.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Support;

public interface SupportRepository extends JpaRepository<Support, Integer> {

}
