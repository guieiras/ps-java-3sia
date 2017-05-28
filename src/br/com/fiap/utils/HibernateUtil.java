package br.com.fiap.utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.fiap.model.ClienteModel;
import br.com.fiap.model.LogModel;
import br.com.fiap.model.ProdutoModel;
import br.com.fiap.model.RegiaoClienteModel;
import br.com.fiap.model.UsuarioModel;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

    private HibernateUtil() { }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
        	try {
                AnnotationConfiguration ac = new AnnotationConfiguration();
                
                ac.addAnnotatedClass(ProdutoModel.class);
                ac.addAnnotatedClass(RegiaoClienteModel.class);
                ac.addAnnotatedClass(ClienteModel.class);
                ac.addAnnotatedClass(UsuarioModel.class);
                
                
                sessionFactory = ac.configure().buildSessionFactory();
            } catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return sessionFactory;
    }
}
