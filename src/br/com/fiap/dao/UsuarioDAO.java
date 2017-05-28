package br.com.fiap.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.fiap.exception.DAOException;
import br.com.fiap.model.UsuarioModel;
import br.com.fiap.utils.HibernateUtil;

public class UsuarioDAO {

	public UsuarioModel login(String usuario, String senha) throws DAOException {
	
		try {
		
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			String comando = "from UsuarioModel as U " + 
							 " where " +
							 " 		U.loginUsuario = :login   AND " + 
							 "  	U.senhaUsuario = :senha  ";
			
			Query query = session.createQuery(comando);
			query.setParameter("login", usuario);
			query.setParameter("senha", senha);
			return (UsuarioModel) query.uniqueResult();
			
		} catch (Exception e) {
			throw new DAOException("Problema no DAO Usuario - " + e.getMessage() );
		}
	}
	
}
