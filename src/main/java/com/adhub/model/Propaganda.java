package com.adhub.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "propaganda")
@NamedQueries({ @NamedQuery(name = "Propaganda.buscaPropagandasPorMajor", query = "SELECT prop FROM Propaganda prop  WHERE prop.majorID = :majorID"),
				@NamedQuery(name = "Propaganda.buscaPropagandasPorMajorEMinor", query = "SELECT prop FROM Propaganda prop  WHERE prop.majorID = :majorID AND prop.minorID = :minorID"),
})
public class Propaganda implements Serializable {

	/**
	 * teste
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propaganda_id")
	private Integer propagandaID;

	@NotNull
	@Column(name = "minor_id", nullable = false)
	private Integer minorID;

	@NotNull
	@Column(name = "major_id", nullable = false)
	private Integer majorID;

	@NotNull
	@Column(name = "menssagem_notificacao", nullable = false)
	private String mensagemNotificacao;

	@Column(name = "ultima_atualizacao")
	private long ultimaAtualizacao;

	@NotNull
	@Column(name = "url", nullable = false)
	private String url;

	@NotNull
	@Column(name = "proximidade", nullable = false)
	private Integer proximidade;

	@NotNull
	@Column(name = "nav_bar_color", nullable = false)
	private Integer navbarColor;

	@NotNull
	@Column(name = "categoria", nullable = false)
	private Integer categoria;

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Integer getPropagandaID() {
		return propagandaID;
	}

	public void setPropagandaID(Integer propagandaID) {
		this.propagandaID = propagandaID;
	}

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

	public String getMensagemNotificacao() {
		return mensagemNotificacao;
	}

	public void setMensagemNotificacao(String mensagemNotificacao) {
		this.mensagemNotificacao = mensagemNotificacao;
	}

	public long getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(long ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getProximidade() {
		return proximidade;
	}

	public void setProximidade(Integer proximidade) {
		this.proximidade = proximidade;
	}

	public Integer getNavbarColor() {
		return navbarColor;
	}

	public void setNavbarColor(Integer navbarColor) {
		this.navbarColor = navbarColor;
	}

}
