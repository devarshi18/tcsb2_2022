package loggerAssign.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class LoggerEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String ProdName;
	private Integer ProdPrice;
	private String ProdModel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public Integer getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(Integer prodPrice) {
		ProdPrice = prodPrice;
	}
	public String getProdModel() {
		return ProdModel;
	}
	public void setProdModel(String prodModel) {
		ProdModel = prodModel;
	}


}
