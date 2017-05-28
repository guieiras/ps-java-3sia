package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.business.ServicoBusiness;
import br.com.fiap.model.ServicoModel;

@ManagedBean
public class ServicosBean {

	
	private List<ServicoModel> servicos;
	
	
	public ServicosBean(){
		servicos = new ArrayList<ServicoModel>();
	}


	public List<ServicoModel> getServicos() {
		servicos = new ServicoBusiness().listarTodos();
		return servicos;
	}


	public void setServicos(List<ServicoModel> servicos) {
		this.servicos = servicos;
	}
	
	
	
	
}
