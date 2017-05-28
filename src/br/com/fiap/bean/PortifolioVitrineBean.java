package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.business.PortifolioBusiness;
import br.com.fiap.model.PortifolioModel;


@ManagedBean
public class PortifolioVitrineBean {

	private PortifolioModel item = new PortifolioModel();
	
	
	public PortifolioVitrineBean(){
		this.item = new PortifolioBusiness().getPortifolioVitrine();
	}


	public PortifolioModel getItem() {
		return item;
	}


	public void setItem(PortifolioModel item) {
		this.item = item;
	}
	
	
	
	
	
}
