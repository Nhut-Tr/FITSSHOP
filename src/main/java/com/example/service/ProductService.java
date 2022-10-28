package com.example.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.example.entity.Product;

public interface ProductService {
	Product findByID(int id);
	Page<Product> findAll(Pageable page);
	Product create(Product product);
	Product update(Product product);
	void delete(Product product);
	Page<Product> findByKeyword(String keyword);
}
