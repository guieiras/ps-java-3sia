package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.business.RegiaoClienteBusiness;
import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.RegiaoClienteModel;

@ManagedBean
public class RegiaoClienteBean {
	
	
	private List<RegiaoClienteModel> regioes = new ArrayList<RegiaoClienteModel>();
	private RegiaoClienteModel regiao = new RegiaoClienteModel();
	
	
	public RegiaoClienteBean(){
		regioes = new RegiaoClienteBusiness().findAll();
	}


	public String getRegiao(int idRegiao){
		/*
		RegiaoClienteModel r = new  RegiaoClienteModel(1,"Asa Sul");
		
		List<ClienteModel> listaClientes = new ArrayList<ClienteModel>();
		ClienteModel c = new ClienteModel();
		c.setNomeCliente("Cristiano Romario 1");
		c.setCpfCliente("120.123.988-02");
		listaClientes.add(c);
		
		
		c = new ClienteModel();
		c.setNomeCliente("Cristiano Romario 2");
		c.setCpfCliente("120.123.988-02");
		listaClientes.add(c);
		
		
		c = new ClienteModel();
		c.setNomeCliente("Cristiano Romario 3");
		c.setCpfCliente("120.123.988-02");
		listaClientes.add(c);
		
		// Adicionando a lista no Objeto
		r.setClientes(listaClientes);
		
		
		regiao = r;
		*/
		
		regiao = new RegiaoClienteBusiness().getRegiao(idRegiao);
		
		return "clientes-por-regiao-detalhes";
	}
	
	
	
	public List<RegiaoClienteModel> getRegioes() {
		return regioes;
	}


	public void setRegioes(List<RegiaoClienteModel> regioes) {
		this.regioes = regioes;
	}


	public RegiaoClienteModel getRegiao() {
		return regiao;
	}


	public void setRegiao(RegiaoClienteModel regiao) {
		this.regiao = regiao;
	}


	
	
	
	
	

}
