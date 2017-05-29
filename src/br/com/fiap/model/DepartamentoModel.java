package br.com.fiap.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class DepartamentoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEPARTAMENTOMODEL")
	@SequenceGenerator(name = "SEQ_DEPARTAMENTOMODEL", sequenceName = "SEQ_DEPARTAMENTOMODEL", allocationSize = 1)
	private int idDepartamento;
	
	private String nomeDepartamento;
	
	@OneToMany
	@JoinColumn(name="idDepartamento")
	private List<FuncionarioModel> funcionarios;
	
	public DepartamentoModel() {}
	
	public DepartamentoModel(int id, String nome){
		this.idDepartamento = id;
		this.nomeDepartamento = nome;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public List<FuncionarioModel> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioModel> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
