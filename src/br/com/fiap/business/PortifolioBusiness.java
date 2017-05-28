package br.com.fiap.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.PortifolioDetalheModel;
import br.com.fiap.model.PortifolioFotosModel;
import br.com.fiap.model.PortifolioModel;

public class PortifolioBusiness {

	
	public PortifolioModel getPortifolioVitrine(){
		
		PortifolioModel portModel = new PortifolioModel();
		portModel.setIdPortifolio(1);
		portModel.setNomePortifolio("Projeto Web Java");
		portModel.setSobreNomePortifolio("JSF Views");
		portModel.setUrlFotoPrincipal("http://placehold.it/750x500/4db8ff/000");
		portModel.setDescricaoPortifolio("Aenean ornare convallis turpis tempor maximus. Proin condimentum arcu nisl, at malesuada nisl pretium ac. Suspendisse ac purus felis. Nam ligula ligula, venenatis sit amet nulla nec, euismod auctor risus. Sed cursus augue ante. Aenean non tincidunt nibh. Curabitur tincidunt purus magna, porta tempus turpis pharetra eget.");
		
		// Detalhes
		List<PortifolioDetalheModel> listaDetalhes = new ArrayList<PortifolioDetalheModel>();
		PortifolioDetalheModel det = new PortifolioDetalheModel();
		det.setIdPortifolioDetalhe(1);
		det.setDescricaoDetalhe("Vestibulum sit");
		listaDetalhes.add(det);
		
		det = new PortifolioDetalheModel();
		det.setIdPortifolioDetalhe(2);
		det.setDescricaoDetalhe("sit");
		listaDetalhes.add(det);
		
		det = new PortifolioDetalheModel();
		det.setIdPortifolioDetalhe(3);
		det.setDescricaoDetalhe("Vestibulum");
		listaDetalhes.add(det);
		
		portModel.setDetalhes(listaDetalhes);

		
		// Fotos
		List<PortifolioFotosModel> listaFotos = new ArrayList<PortifolioFotosModel>();
		PortifolioFotosModel foto = new PortifolioFotosModel();
		foto.setIdPortifolioFoto(1);
		foto.setDescricaoFoto("Foto 1");
		foto.setUrlFoto("http://placehold.it/500x300/464646/fff");
		listaFotos.add(foto);

		foto = new PortifolioFotosModel();
		foto.setIdPortifolioFoto(2);
		foto.setDescricaoFoto("Foto 2");
		foto.setUrlFoto("http://placehold.it/500x300/ff3333/464646");
		listaFotos.add(foto);
		
		foto = new PortifolioFotosModel();
		foto.setIdPortifolioFoto(3);
		foto.setDescricaoFoto("Foto 3");
		foto.setUrlFoto("http://placehold.it/500x300/000/464646");
		listaFotos.add(foto);
		
		foto = new PortifolioFotosModel();
		foto.setIdPortifolioFoto(1);
		foto.setDescricaoFoto("Foto 3");
		foto.setUrlFoto("http://placehold.it/500x300/464646/f4f4e3");
		listaFotos.add(foto);
		
		portModel.setFotos(listaFotos);
		
		
		return portModel;
	}
	
	
}
