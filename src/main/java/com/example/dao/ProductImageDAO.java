package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage, Integer>{

}
