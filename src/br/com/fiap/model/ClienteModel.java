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
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTEMODEL")
	@SequenceGenerator(name = "SEQ_CLIENTEMODEL", sequenceName = "SEQ_CLIENTEMODEL", allocationSize = 1)  
	private int idCliente;
	
	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private boolean cadastroAtivo;
	private double valorPatrimonio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IDREGIAOCLIENTE")
	private RegiaoClienteModel regiaoCliente = new RegiaoClienteModel();
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public boolean isCadastroAtivo() {
		return cadastroAtivo;
	}
	public void setCadastroAtivo(boolean cadastroAtivo) {
		this.cadastroAtivo = cadastroAtivo;
	}
	public double getValorPatrimonio() {
		return valorPatrimonio;
	}
	public void setValorPatrimonio(double valorPatrimonio) {
		this.valorPatrimonio = valorPatrimonio;
	}
	
	/*
	public int getIdRegiaoCliente() {
		return idRegiaoCliente;
	}
	public void setIdRegiaoCliente(int idRegiaoCliente) {
		this.idRegiaoCliente = idRegiaoCliente;
	}
	*/
	
	public RegiaoClienteModel getRegiaoCliente() {
		return regiaoCliente;
	}
	public void setRegiaoCliente(RegiaoClienteModel regiaoCliente) {
		this.regiaoCliente = regiaoCliente;
	}

		
	
	
}
