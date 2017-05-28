package br.com.fiap.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.ServicoModel;

public class ServicoBusiness {
	
	public List<ServicoModel> listarTodos() {
		
		List<ServicoModel> servicos =	new ArrayList<ServicoModel>();
		
		ServicoModel sm = new ServicoModel();
		sm.setNomeServico("Cloud Computing");
		sm.setDescricaoServico("O conceito de computa��o em nuvem (em ingl�s, cloud computing) refere-se � utiliza��o da mem�ria e da capacidade de armazenamento e c�lculo de computadores e servidores compartilhados e interligados por meio da Internet, seguindo o princ�pio da computa��o em grade.");
		sm.setUrlImageServico("http://placehold.it/121x175/000/464646");
		servicos.add(sm);
		
		sm = new ServicoModel();
		sm.setNomeServico("SaaS");
		sm.setDescricaoServico("Software como servi�o, do ingl�s Software as a service (SaaS), � uma forma de distribui��o e comercializa��o de software. No modelo SaaS o fornecedor do software se responsabiliza por toda a estrutura necess�ria � disponibiliza��o do sistema (servidores, conectividade, cuidados com seguran�a da informa��o) e o cliente utiliza o software via internet, pagando um valor pelo servi�o oferto");
		sm.setUrlImageServico("http://placehold.it/121x175/E8117F/000");
		servicos.add(sm);
		
		sm = new ServicoModel();
		sm.setNomeServico("PasS");
		sm.setDescricaoServico("PaaS � Platform as a Service � em computa��o, consiste no servi�o propriamente dito, de hospedagem e implementa��o de hardware e software, que � usado para prover aplica��es (software como servi�o) por meio da Internet. Oferece a possibilidade de substituir o paradigma de aplica��es tradicional, no qual programas de computador s�o instalados na m�quina do usu�rio e ficam assim muito mais restritos �s configura��es de hardware e software dispon�veis nela, principalmente ao sistema operacional.");
		sm.setUrlImageServico("http://placehold.it/121x175/d2d2d2/000");
		servicos.add(sm);
		
		return servicos;
	}

}
