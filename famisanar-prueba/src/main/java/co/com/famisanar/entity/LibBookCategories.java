package co.com.famisanar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIB_BOOK_CATEGORIES")
public class LibBookCategories {

	@Id
	@Column(name = "CAT_ID")
	private Integer catId;

	@Column(name = "CAT_DESCRIPCION")
	private String catDescripcion;

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatDescripcion() {
		return catDescripcion;
	}

	public void setCatDescripcion(String catDescripcion) {
		this.catDescripcion = catDescripcion;
	}

}
