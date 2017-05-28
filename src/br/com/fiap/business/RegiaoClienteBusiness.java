package br.com.fiap.business;

import java.util.List;


import br.com.fiap.dao.RegiaoClienteDAO;
import br.com.fiap.model.RegiaoClienteModel;

public class RegiaoClienteBusiness {
	
	
	public List<RegiaoClienteModel> findAll(){
		return new RegiaoClienteDAO().findAll();
	}
	
	
	public RegiaoClienteModel getRegiao(int id){
		return new RegiaoClienteDAO().getRegiao(id);
	}
}
