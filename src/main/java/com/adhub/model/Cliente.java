package com.adhub.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @Column(name = "major_id")
	private Integer majorID;
	
	@NotNull
	@Column(name = "nome", nullable=false)
	private String nome;
	
	@NotNull
	@Column(name = "cpf_cnpj", nullable=false)
	private String cpf_cnpj;
	
	@NotNull
	@Column(name = "endereco", nullable=false)
	private String endereco;

	@NotNull
	@Column(name = "cep", nullable=false)
	private String cep;
	
	@NotNull
	@Column(name = "cidade", nullable=false)
	private String cidade;
	
	@NotNull
	@Column(name = "estado", nullable=false)
	private String estado;
	
	@NotNull
	@Column(name = "bairro", nullable=false)
	private String bairro;
	
	@NotNull
	@Column(name = "numero", nullable=false)
	private String numero;
	
	@Column(name = "telefone")
	private String telefoneRes;
	
	@Column(name = "telefone_cel")
	private String telefone_cel;
	
	@NotNull
	@Column(name = "email", nullable=false)
	private String email;
	
	@NotNull
	@Column(name = "senha", nullable=false)
	private String senha;
	
	@NotNull
	@Column(name = "flg_ativo", nullable=false )
	private boolean ativo;
	
	@NotNull
	@Column(name = "url_logo", nullable=false )
	private String urlLogo;
	
	public Integer getMajorID() {
		return majorID;
	}

	public void setMajorID(Integer majorID) {
		this.majorID = majorID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefoneRes() {
		return telefoneRes;
	}

	public void setTelefoneRes(String telefoneRes) {
		this.telefoneRes = telefoneRes;
	}

	public String getTelefone_cel() {
		return telefone_cel;
	}

	public void setTelefone_cel(String telefone_cel) {
		this.telefone_cel = telefone_cel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public long getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(long ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	@Column(name = "ultima_atualizacao" )
	private long ultimaAtualizacao;
	
}
