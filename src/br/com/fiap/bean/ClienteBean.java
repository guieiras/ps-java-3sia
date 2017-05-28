package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import br.com.fiap.business.ClienteBusiness;
import br.com.fiap.business.RegiaoClienteBusiness;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.ProdutoModel;
import br.com.fiap.model.RegiaoClienteModel;
import br.com.fiap.utils.HibernateUtil;

@ManagedBean
public class ClienteBean {

	private int idCliente = 0;
	private ClienteModel cliente = new ClienteModel();
	private List<ClienteModel> clientes = new ArrayList<ClienteModel>();
	private List<RegiaoClienteModel> regioes = new ArrayList<RegiaoClienteModel>();
	private String mensagem = "";
	private String erro = "";
	
	public ClienteBean() {
		//clientes = new ClienteBusiness().findAll();
		regioes = new RegiaoClienteBusiness().findAll();
	}

	
	public void filtrar(){
		clientes = new ClienteBusiness().findByCriteriaFilter(
				cliente.getRegiaoCliente().getIdRegiaoCliente(), 
				cliente.getNomeCliente(), 
				cliente.getEnderecoCliente());
	}
	
	
	// Excluir Cliente
	public void excluir(){
		mensagem = "Cliente excluído com sucesso";
		new ClienteBusiness().delete(cliente);
		clientes = new ClienteBusiness().findAll();
	}
	
	public String  abrirEditar(){
		System.out.println("Editando usuário:" + cliente.getNomeCliente());
		return "clientes-editar.xhtml";
	}
	
	public String editar(){
		System.out.println("Gravando Cliente editado");
		if ( cliente.getNomeCliente().equals("flavio")  ) {
			erro = "Ops! Problemas";
			return "clientes-editar";
		} else {
			new ClienteBusiness().update(cliente);
			mensagem = "Cliente editado com sucesso";
			clientes = new ClienteBusiness().findAll();
			return "clientes";
		}
	}
	
	
	public String abrirInserir(){
		System.out.println("Abrindo Inserir");
		return "clientes-inserir.xhtml";
	}
	
	
	public String inserir(){
		System.out.println("Abrindo Inserir");
		
		if ( cliente.getNomeCliente().equals("flavio")  ) {
			erro = "Ops! Problemas";
			return "clientes-inserir";
		} else {
			new ClienteBusiness().save(cliente);
			mensagem = "Cliente inserido com sucesso";
			clientes = new ClienteBusiness().findAll();
			return "clientes";
		}
		
	}
	
	
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public List<ClienteModel> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteModel> clientes) {
		this.clientes = clientes;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	

	public String getErro() {
		return erro;
	}


	public void setErro(String erro) {
		this.erro = erro;
	}


	public List<RegiaoClienteModel> getRegioes() {
		return regioes;
	}


	public void setRegioes(List<RegiaoClienteModel> regioes) {
		this.regioes = regioes;
	}
	
	
	
	
	
	
}
