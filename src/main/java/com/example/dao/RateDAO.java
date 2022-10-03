package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Rate;

public interface RateDAO extends JpaRepository<Rate, Integer>{

}
