package br.com.fiap.business;
import java.util.List;
import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.model.ProdutoModel;

public class ProdutoBusiness {

	public List<ProdutoModel> list() {
        return new ProdutoDAO().list();
	}

}


