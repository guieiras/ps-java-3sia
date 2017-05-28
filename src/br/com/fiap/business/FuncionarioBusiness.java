package br.com.fiap.business;

import java.util.List;

import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.model.FuncionarioModel;

public class FuncionarioBusiness {
	
	public List<FuncionarioModel> findAll(){
		return new FuncionarioDAO().findAll();
	}
	
	public FuncionarioModel findByKey(int id){
		return new FuncionarioDAO().findByKey(id);
	}
	
	public List<FuncionarioModel> findByCriteriaFilter(int idDepartamento, String nome, String email) {
		return new FuncionarioDAO().findByCriteriaFilter(idDepartamento, nome, email);
	}
	
	public void save(FuncionarioModel funcionario){
		new FuncionarioDAO().save(funcionario);
	}
	
	public void update(FuncionarioModel funcionario){
		new FuncionarioDAO().update(funcionario);
	}
	
	public void delete(FuncionarioModel funcionario){
		new FuncionarioDAO().delete(funcionario);
	}

}
