package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ProductSize;

public interface ProductSizeDAO extends JpaRepository<ProductSize, Integer>{

}
