package com.example.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "Rate")
public class Rate implements Serializable{
	@Id
	Integer id;
	Integer stars;
	String comment;
	
	@ManyToOne
	@JoinColumn(name = "userName")
	Account userName;
	
	@ManyToOne
	@JoinColumn(name ="productid")
	private Product product;
	
	@OneToMany(mappedBy = "rate")
	private List<CommentImage> commentImages;
	
	@OneToMany(mappedBy = "rate")
	private List<CommentVideo> commentVideos;
}
