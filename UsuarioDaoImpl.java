/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupal.dao;

import inicio.UsuarioHibernateUtil;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;


public class UsuarioDaoImpl implements UsuarioDao {
   
    private final SessionFactory sessionFactory;
    
    public UsuarioDaoImpl(){
    sessionFactory = UsuarioHibernateUtil.getSessionFactory();
    
    }
        @Override
    public Usuario get(Long id) {
        Session session = sessionFactory.openSession();

        return (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("id", id)).uniqueResult();
    }

    
    
    @Override
     public void save(Usuario item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
    }

    
    @Override
    public void update(Usuario item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(item);
        session.getTransaction().commit();
    }

    
    @Override
    public void delete(Usuario item) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(item);
        session.getTransaction().commit();
    }

   
}
