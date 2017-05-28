package br.com.fiap.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fiap.business.ProdutoBusiness;
import br.com.fiap.dao.LogDAO;
import br.com.fiap.model.LogModel;
import br.com.fiap.model.ProdutoModel;

@ManagedBean
public class ProdutoBean implements Serializable {

	private int idProduto;
	private ProdutoModel produto = new ProdutoModel();
	private List<ProdutoModel> produtos;
	
	
	public ProdutoBean(){
		produtos = new ProdutoBusiness().list();
	}
	
	
	public String alteracao() {
		ProdutoModel p = new ProdutoModel();
		p.setId(2);
		p.setNome("Produto 2");
		p.setDescricao("Descrição do Produto 2");
		this.produto = p;
		
		return "alteracao";
	}
	
	public String gravar(){
		System.out.println(this.produto.getNome());
		System.out.println(this.produto.getDescricao());
		return "index";
	}
	
	
	
	
	public List<ProdutoModel> getProdutos(){
		return produtos;
	}
	
	
	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public ProdutoModel getProduto() {
		return produto;
	}


	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	
	
}
