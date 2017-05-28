package br.com.fiap.business;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.ServicoModel;

public class ServicoBusiness {
	
	public List<ServicoModel> listarTodos() {
		
		List<ServicoModel> servicos =	new ArrayList<ServicoModel>();
		
		ServicoModel sm = new ServicoModel();
		sm.setNomeServico("Cloud Computing");
		sm.setDescricaoServico("O conceito de computação em nuvem (em inglês, cloud computing) refere-se à utilização da memória e da capacidade de armazenamento e cálculo de computadores e servidores compartilhados e interligados por meio da Internet, seguindo o princípio da computação em grade.");
		sm.setUrlImageServico("http://placehold.it/121x175/000/464646");
		servicos.add(sm);
		
		sm = new ServicoModel();
		sm.setNomeServico("SaaS");
		sm.setDescricaoServico("Software como serviço, do inglês Software as a service (SaaS), é uma forma de distribuição e comercialização de software. No modelo SaaS o fornecedor do software se responsabiliza por toda a estrutura necessária à disponibilização do sistema (servidores, conectividade, cuidados com segurança da informação) e o cliente utiliza o software via internet, pagando um valor pelo serviço oferto");
		sm.setUrlImageServico("http://placehold.it/121x175/E8117F/000");
		servicos.add(sm);
		
		sm = new ServicoModel();
		sm.setNomeServico("PasS");
		sm.setDescricaoServico("PaaS — Platform as a Service — em computação, consiste no serviço propriamente dito, de hospedagem e implementação de hardware e software, que é usado para prover aplicações (software como serviço) por meio da Internet. Oferece a possibilidade de substituir o paradigma de aplicações tradicional, no qual programas de computador são instalados na máquina do usuário e ficam assim muito mais restritos às configurações de hardware e software disponíveis nela, principalmente ao sistema operacional.");
		sm.setUrlImageServico("http://placehold.it/121x175/d2d2d2/000");
		servicos.add(sm);
		
		return servicos;
	}

}
