package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Authorities")
public class Authorities implements Serializable{
	@Id
	Integer id;
	@ManyToOne
	@JoinColumn(name = "Roleid")
	Role role;
	@ManyToOne
	@JoinColumn(name = "userName")
	Account userName;
	
	
	
}
