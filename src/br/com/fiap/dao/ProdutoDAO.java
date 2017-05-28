package br.com.fiap.dao;

import java.util.List;
import org.hibernate.Session;
import br.com.fiap.model.ProdutoModel;
import br.com.fiap.utils.HibernateUtil;

public class ProdutoDAO {
	
	public List<ProdutoModel> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<ProdutoModel> lista = session.createQuery("from ProdutoModel").list();
        return lista;
	}

}
