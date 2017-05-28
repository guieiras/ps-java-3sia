package br.com.fiap.dao;

import java.util.List;
import org.hibernate.Session;
import br.com.fiap.model.LogModel;
import br.com.fiap.utils.HibernateUtil;

public class LogDAO {

	public List<LogModel> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
		List<LogModel> lista = session.createQuery("from LogModel").list();
        return lista;
    }
	
}
