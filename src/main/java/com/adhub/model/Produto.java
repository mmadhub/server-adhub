package com.adhub.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
@NamedQueries({ @NamedQuery(name = "Produto.buscaProdutoPorMajor", query = "SELECT prod FROM Produto prod  WHERE prod.majorID = :majorID"),

})
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "minor_id")
	private Integer minorID;

	@NotNull
	@Column(name = "major_id", nullable = false)
	private Integer majorID;

	public Integer getMinorID() {
		return minorID;
	}

	public void setMinorID(Integer minorID) {
		this.minorID = minorID;
	}

	public Integer getMajorID() {
		return majorID;
	}

	public void setMajorID(Integer majorID) {
		this.majorID = majorID;
	}

	public List<Propaganda> getPropagandas() {
		return propagandas;
	}

	public void setPropagandas(List<Propaganda> propagandas) {
		this.propagandas = propagandas;
	}

	@Transient
	private List<Propaganda> propagandas;

}
