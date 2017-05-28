package br.com.fiap.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.fiap.model.ClienteModel;
import br.com.fiap.utils.HibernateUtil;

public class ClienteDAO {

	
	public List<ClienteModel> findAll(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<ClienteModel> listaClientes = session.createQuery("from ClienteModel").list();
		return listaClientes;
	}
	
	public ClienteModel findByKey(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		ClienteModel c = (ClienteModel) session.load(ClienteModel.class, id);
		return c;
	}
	
	public List<ClienteModel> findByCriteriaFilter(int idRegiao, 
			String nomeCliente, String enderecoCliente){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		Criteria criteria = session.createCriteria(ClienteModel.class, "ClienteModel");
		criteria.createAlias("ClienteModel.regiaoCliente", "R");
		 
		if(idRegiao != 0) {
		  criteria.add(Restrictions.eq("R.idRegiaoCliente", idRegiao ));
		}
		 
		if( (nomeCliente != null) && ( ! nomeCliente.equals("") ) ) {
		  criteria.add(Restrictions.ilike("ClienteModel.nomeCliente", 
				  nomeCliente.toLowerCase(), MatchMode.ANYWHERE));
		}
		
		
		if( (enderecoCliente != null) && ( ! enderecoCliente.equals("") ) ) {
			criteria.add(Restrictions.ilike("ClienteModel.enderecoCliente", 
					enderecoCliente.toLowerCase(), MatchMode.ANYWHERE ));
		}
		
		List<ClienteModel> listaClientes = criteria.list();
		return listaClientes;
	}
	
	
	
	public List<ClienteModel> findByFilter(int idRegiao, String nomeCliente, String enderecoCliente){
		Session session = HibernateUtil.getSessionFactory().openSession();
		String comando = "from ClienteModel as C " + 
						 " where " +
						 " 	( 0  = :idregiao    	or C.regiaoCliente.idRegiaoCliente = :idregiao )  AND " + 
						 "  ( '' = :nomeCliente 	or C.nomeCliente 	 like :nomeCliente ) AND" + 
						 "  ( '' = :enderecoCliente or C.enderecoCliente like :enderecoCliente ) ";
		
		Query query = session.createQuery(comando);
		query.setParameter("idregiao", idRegiao);
		query.setParameter("nomeCliente", "%" + nomeCliente + "%");
		query.setParameter("enderecoCliente", "%" + enderecoCliente + "%");
		
		List<ClienteModel> listaClientes = query.list();
		return listaClientes;
	}
	
	
	
	public void save(ClienteModel cliente){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(cliente);
		t.commit();
	}
	
	public void update(ClienteModel cliente){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(cliente);
		t.commit();
	}
	
	public void delete(ClienteModel cliente){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(cliente);
		t.commit();
	}
	
}
