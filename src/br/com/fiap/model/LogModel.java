package br.com.fiap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "NETLOG")
public class LogModel {
	
	@Id
	@GeneratedValue
	private int idLog;
	
	@Temporal(TemporalType.DATE)
	private Date dataLog;
	
	private String caminho;
	private String origem;
	
	
	public int getIdLog() {
		return idLog;
	}
	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}
	public Date getDataLog() {
		return dataLog;
	}
	public void setDataLog(Date dataLog) {
		this.dataLog = dataLog;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}

}
