package br.com.fiap.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class RegiaoClienteModel {
	
	@Id
	@GeneratedValue
	private int idRegiaoCliente;
	
	private String nomeRegiaoCliente;
	
	@OneToMany
	@JoinColumn(name="idRegiaoCliente")
	private List<ClienteModel> clientes;
	
	
	public RegiaoClienteModel(){
		
	}
	
	public RegiaoClienteModel(int id, String nome){
		this.idRegiaoCliente = id;
		this.nomeRegiaoCliente = nome;
	}
	
	
	public int getIdRegiaoCliente() {
		return idRegiaoCliente;
	}
	public void setIdRegiaoCliente(int idRegiaoCliente) {
		this.idRegiaoCliente = idRegiaoCliente;
	}
	public String getNomeRegiaoCliente() {
		return nomeRegiaoCliente;
	}
	public void setNomeRegiaoCliente(String nomeRegiaoCliente) {
		this.nomeRegiaoCliente = nomeRegiaoCliente;
	}

	public List<ClienteModel> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteModel> clientes) {
		this.clientes = clientes;
	}

	
	
	
}
