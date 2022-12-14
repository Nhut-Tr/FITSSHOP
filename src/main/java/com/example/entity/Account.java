package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "Account")
public class Account implements Serializable{
	@Id
	String username;
	String password;
	String fullname;
	String email;
	boolean gender;
	boolean active;
	boolean logged;

	@OneToMany(mappedBy = "userName")
	List<Order> orders;
	
	@OneToMany(mappedBy = "userName")
	List<Authorities> authorities;
	
	@OneToMany(mappedBy = "userName")
	List<Rate> rates;
	
	@OneToMany(mappedBy = "userName")
	List<Discount> discounts;
	
}
