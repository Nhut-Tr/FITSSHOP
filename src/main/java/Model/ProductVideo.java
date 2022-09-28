package Model;
import java.util.List;

import javax.persistence.Column;
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
@Table(name = "ProductVideo")
public class ProductVideo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String videoName;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	List<Product> product;
	
}
