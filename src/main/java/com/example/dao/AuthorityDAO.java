package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Authorities;

public interface AuthorityDAO extends JpaRepository<Authorities,Integer>{

}
