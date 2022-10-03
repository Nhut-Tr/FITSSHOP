package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Discount;

public interface DiscountDAO extends JpaRepository<Discount, Integer>{

}
