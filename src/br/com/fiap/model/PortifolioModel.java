package br.com.fiap.model;

import java.util.List;

public class PortifolioModel {

	private int idPortifolio;
	private String nomePortifolio;
	private String sobreNomePortifolio;
	private String descricaoPortifolio;
	private String urlFotoPrincipal;
	private List<PortifolioDetalheModel> detalhes;
	private List<PortifolioFotosModel> fotos;
	
	
	public int getIdPortifolio() {
		return idPortifolio;
	}
	public void setIdPortifolio(int idPortifolio) {
		this.idPortifolio = idPortifolio;
	}
	public String getNomePortifolio() {
		return nomePortifolio;
	}
	public void setNomePortifolio(String nomePortifolio) {
		this.nomePortifolio = nomePortifolio;
	}
	public String getSobreNomePortifolio() {
		return sobreNomePortifolio;
	}
	public void setSobreNomePortifolio(String sobreNomePortifolio) {
		this.sobreNomePortifolio = sobreNomePortifolio;
	}
	public String getDescricaoPortifolio() {
		return descricaoPortifolio;
	}
	public void setDescricaoPortifolio(String descricaoPortifolio) {
		this.descricaoPortifolio = descricaoPortifolio;
	}
	public List<PortifolioDetalheModel> getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(List<PortifolioDetalheModel> detalhes) {
		this.detalhes = detalhes;
	}
	public List<PortifolioFotosModel> getFotos() {
		return fotos;
	}
	public void setFotos(List<PortifolioFotosModel> fotos) {
		this.fotos = fotos;
	}
	public String getUrlFotoPrincipal() {
		return urlFotoPrincipal;
	}
	public void setUrlFotoPrincipal(String urlFotoPrincipal) {
		this.urlFotoPrincipal = urlFotoPrincipal;
	}
	
	
	
	
	
	
}
