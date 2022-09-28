package Model;

import java.util.List;

import javax.persistence.Entity;
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
@Table(name = "Rate")
public class Rate {
	@Id
	Integer id;
	Integer stars;
	String comment;
	
	@ManyToOne
	@JoinColumn(name = "userName")
	Account userName;
	
	@ManyToOne
	@JoinColumn(name= "product_id")
	List<Product> products;
}
