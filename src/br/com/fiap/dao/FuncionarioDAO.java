package br.com.fiap.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.fiap.model.FuncionarioModel;
import br.com.fiap.utils.HibernateUtil;

public class FuncionarioDAO {
	
	public List<FuncionarioModel> findAll(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from FuncionarioModel").list();
	}
	
	public FuncionarioModel findByKey(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		FuncionarioModel c = (FuncionarioModel) session.load(FuncionarioModel.class, id);
		return c;
	}
	
	public List<FuncionarioModel> findByCriteriaFilter(int idDepartamento, String nome, String email) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(FuncionarioModel.class, "FuncionarioModel");
		criteria.createAlias("FuncionarioModel.departamento", "D");

		if(idDepartamento != 0) {
			criteria.add(Restrictions.eq("D.idDepartamento", idDepartamento ));
		}

		if( (nome != null) && ( ! nome.equals("") ) ) {
			criteria.add(Restrictions.ilike("FuncionarioModel.nomeFuncionario", nome.toLowerCase(), MatchMode.ANYWHERE));
		}
		
		if( (email != null) && ( ! email.equals("") ) ) {
			criteria.add(Restrictions.ilike("FuncionarioModel.emailFuncionario", email.toLowerCase(), MatchMode.ANYWHERE ));
		}

		return criteria.list();
	}
	
	public void save(FuncionarioModel funcionario){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(funcionario);
		t.commit();
	}
	
	public void update(FuncionarioModel cliente) {}
	
	public void delete(FuncionarioModel cliente) {}
	
}
