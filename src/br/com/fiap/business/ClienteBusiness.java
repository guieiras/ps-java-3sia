package br.com.fiap.business;

import java.util.List;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.model.ClienteModel;

public class ClienteBusiness {
	
	public List<ClienteModel> findAll(){
		return new ClienteDAO().findAll();
	}
	
	public ClienteModel findByKey(int id){
		return new ClienteDAO().findByKey(id);
	}
	
	public List<ClienteModel> findByFilter(int idRegiao, String nomeCliente, String enderecoCliente){
		return new ClienteDAO().findByFilter(idRegiao, nomeCliente, enderecoCliente);
	}
	
	public List<ClienteModel> findByCriteriaFilter(int idRegiao, String nomeCliente, String enderecoCliente){
		return new ClienteDAO().findByCriteriaFilter(idRegiao, nomeCliente, enderecoCliente);
	}
	
	
	public void save(ClienteModel cliente){
		new ClienteDAO().save(cliente);
	}
	
	public void update(ClienteModel cliente){
		new ClienteDAO().update(cliente);
	}
	
	public void delete(ClienteModel cliente){
		new ClienteDAO().delete(cliente);
	}

}
