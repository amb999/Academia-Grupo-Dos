package ar.com.academia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import ar.com.academia.bean.Usuario;
import ar.com.academia.dao.UsuarioDAO;

public class UsuarioDAOImpl implements UsuarioDAO {

	private SessionFactory sessionFactory;
	    
	public UsuarioDAOImpl() {}
	
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public Boolean validarUsuario(String usuario) {
		final Session session = getSessionFactory().openSession();
        final Transaction tx = session.beginTransaction();
        Usuario usuarioDBTest = null;
        
        try {
            tx.begin();
            //TODO hacer consulta
            List<Usuario> usuarios = (List<Usuario>) session.createCriteria(Usuario.class)
           	     .add( Restrictions.like("usuario", "%"+usuario+"%") )
           	     .addOrder( Order.asc("usuario") )
           	     .list();
            if(!usuarios.isEmpty()) {
            usuarioDBTest = (Usuario) session.get(Usuario.class,usuarios.get(0).getId()); 
            }
            tx.commit();

        } catch (final HibernateException e) {
            tx.rollback();
        } finally {
            session.close();
        }
        
		if (usuarioDBTest==null) {
			return false;
		}
		
		return true;
	}

	@Override
	public Boolean validarPassword(String usuario, String password) {
		
		final Session session = getSessionFactory().openSession();
        final Transaction tx = session.beginTransaction();
        Usuario usuarioDBTest = null;
        try {
        	
            tx.begin();
            
            
            String hql = "FROM " + Usuario.class.getName() + " WHERE usuario = :usuario AND password = :password ";
            Query query = session.createQuery(hql);
            query.setParameter("usuario", usuario).setParameter("password", password);
            List<Usuario> usuarios = query.list();
            
            if(!usuarios.isEmpty()) {
                usuarioDBTest = (Usuario) session.get(Usuario.class,usuarios.get(0).getId()); 
                }
            
            tx.commit();

        } catch (final HibernateException e) {
            tx.rollback();
        } finally {
            session.close();
        }
		
		if (usuarioDBTest==null) {
			return false;
		}
		
		return true;
	}

}
