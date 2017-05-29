package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fiap.business.DepartamentoBusiness;
import br.com.fiap.business.FuncionarioBusiness;
import br.com.fiap.model.DepartamentoModel;
import br.com.fiap.model.FuncionarioModel;

@ManagedBean
public class FuncionarioBean {

	private FuncionarioModel funcionario = new FuncionarioModel();
	private List<FuncionarioModel> funcionarios = new ArrayList<FuncionarioModel>();
	private List<DepartamentoModel> departamentos = new ArrayList<DepartamentoModel>();
	private String mensagem = "";
	private String erro = "";
	
	public FuncionarioBean() {
		departamentos = new DepartamentoBusiness().findAll();
	}
	
	public void filtrar(){
		funcionarios = 
			new FuncionarioBusiness().findByCriteriaFilter(
					funcionario.getDepartamento().getIdDepartamento(), 
					funcionario.getNomeFuncionario(), 
					funcionario.getEmailFuncionario());
	}
	
	public String inserir(){
		new FuncionarioBusiness().save(funcionario);
		mensagem = "Cliente inserido com sucesso";
		funcionarios = new FuncionarioBusiness().findAll();
		return "funcionarios.xhtml";
	}

	public FuncionarioModel getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioModel funcionario) {
		this.funcionario = funcionario;
	}

	public List<FuncionarioModel> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioModel> funcionarios) {
		this.funcionarios = funcionarios;
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

	public List<DepartamentoModel> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<DepartamentoModel> departamentos) {
		this.departamentos = departamentos;
	}
}
