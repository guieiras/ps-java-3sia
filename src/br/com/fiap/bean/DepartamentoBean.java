package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.business.DepartamentoBusiness;
import br.com.fiap.model.DepartamentoModel;

@ManagedBean
public class DepartamentoBean {

	private List<DepartamentoModel> departamentos = new ArrayList<DepartamentoModel>();
	private DepartamentoModel departamento = new DepartamentoModel();
	
	public DepartamentoBean(){
		departamentos = new DepartamentoBusiness().findAll();
	}

	public String getDepartamento(int idDepartamento){
		departamento = new DepartamentoBusiness().getDepartamento(idDepartamento);
		return "funcionarios-por-departamento";
	}
	
	public List<DepartamentoModel> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<DepartamentoModel> departamentos) {
		this.departamentos = departamentos;
	}

	public DepartamentoModel getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoModel departamento) {
		this.departamento = departamento;
	}
}
