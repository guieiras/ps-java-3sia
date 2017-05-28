package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class FuncionarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FUNCIONARIOMODEL")
	@SequenceGenerator(name = "SEQ_FUNCIONARIOMODEL", sequenceName = "SEQ_FUNCIONARIOMODEL", allocationSize = 1)  
	private int idFuncionario;
	
	private String nomeFuncionario;
	private String emailFuncionario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDDEPARTAMENTO")
	private DepartamentoModel regiaoCliente = new DepartamentoModel();

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		this.emailFuncionario = emailFuncionario;
	}

	public DepartamentoModel getRegiaoCliente() {
		return regiaoCliente;
	}

	public void setRegiaoCliente(DepartamentoModel regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}
}
