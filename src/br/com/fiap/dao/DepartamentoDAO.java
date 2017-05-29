package br.com.fiap.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fiap.model.DepartamentoModel;
import br.com.fiap.utils.HibernateUtil;

public class DepartamentoDAO {
	
	public List<DepartamentoModel> findAll(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from DepartamentoModel").list();
	}
	
	public DepartamentoModel getDepartamento(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (DepartamentoModel) session.load(DepartamentoModel.class, id);
	}
	
	public void save(DepartamentoModel departamento){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(departamento);
		t.commit();
	}

}
