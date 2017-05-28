package br.com.fiap.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.fiap.model.RegiaoClienteModel;
import br.com.fiap.utils.HibernateUtil;

public class RegiaoClienteDAO {
	
	
	public List<RegiaoClienteModel> findAll(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<RegiaoClienteModel> lista = session.createQuery("from RegiaoClienteModel").list();
		return lista;
	}
	
	public RegiaoClienteModel getRegiao(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (RegiaoClienteModel) session.load(RegiaoClienteModel.class, id);
	}

}
