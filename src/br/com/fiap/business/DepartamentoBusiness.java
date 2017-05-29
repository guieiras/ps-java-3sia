package br.com.fiap.business;

import java.util.List;

import br.com.fiap.dao.DepartamentoDAO;
import br.com.fiap.model.DepartamentoModel;

public class DepartamentoBusiness {
	public List<DepartamentoModel> findAll(){
		return new DepartamentoDAO().findAll();
	}
	
	public void save(DepartamentoModel departamento){
		new DepartamentoDAO().save(departamento);
	}
	
	public DepartamentoModel getDepartamento(int id){
		return new DepartamentoDAO().getDepartamento(id);
	}
}
