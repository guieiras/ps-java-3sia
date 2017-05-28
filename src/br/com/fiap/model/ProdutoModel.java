package br.com.fiap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NETPRODUTO")
public class ProdutoModel {
	
	@Id
	@GeneratedValue
	@Column(name="IDPRODUTO")
	private int id;
	
	@Column(name="NOMEPRODUTO")
	private String nome; 
	
	@Column(name="DESCRICAOPRODUTO")
	private String descricao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
