package Model;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "Product")
public class Product {
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
	@JoinColumn(name = "categoryId")
	Category category;
	@OneToMany(mappedBy= "product_id")
	List<ProductColor> productColor;
	
	@OneToMany(mappedBy= "product_id")
	List<ProductImage> productImage;
	
	@OneToMany(mappedBy= "product_id")
	List<ProductSize> productSize;
	
	@OneToMany(mappedBy= "product_id")
	List<ProductVideo> productVideo ;
	
	@OneToMany(mappedBy= "product_id")
	List<CommentImage> commentImage ;
	
	@OneToMany(mappedBy= "product_id")
	List<CommentVideo> commentVideo;
	
	
	
	
}
