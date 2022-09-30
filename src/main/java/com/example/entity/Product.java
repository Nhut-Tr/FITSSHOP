package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "Product")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	@Column(name="Price")
	Double price;
	Integer stock;
	Integer sold;
	String description;
	String origin;
	String material;
	boolean active;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	Category categoryId;
	
	@JsonIgnore
	@OneToMany(mappedBy= "productColor")
	List<ProductColor> productColors;
	
	@JsonIgnore
	@OneToMany(mappedBy= "productImage")
	List<ProductImage> productImages;
	
	@JsonIgnore
	@OneToMany(mappedBy= "productSize")
	List<ProductSize> productSizes;
	
	@JsonIgnore
	@OneToMany(mappedBy= "productVideo")
	List<ProductVideo> productVideos;
	
	@JsonIgnore
	@OneToMany(mappedBy= "commentImage")
	List<CommentImage> commentImages ;
	
	@JsonIgnore
	@OneToMany(mappedBy= "commentVideo")
	List<CommentVideo> commentVideos;
	
	
	
	
}
