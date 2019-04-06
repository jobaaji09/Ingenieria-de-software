package com.maave.maps2go.modelo;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDAO extends AbstractDAO<Usuario> {

    public UsuarioDAO() {
        super();
    }

    @Override
    public void agregar(Usuario usuario) {
        super.agregar(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        super.actualizar(usuario);
    }

    @Override
    public void borrar(Usuario usuario) {
        super.borrar(usuario);
    }

    public Usuario consultar(String id) {
        return super.consultarString(Usuario.class, id);
    }
    
<<<<<<< HEAD
    public Usuario consultarId(int id) {
        return super.consultarInt(Usuario.class, id); 
=======
    public Usuario consultarPorId(int id) {
        return super.consultarInt(Usuario.class, id);
>>>>>>> e30e5c1e20b3dbdd7e2be3ded93e73465646d9df
    }

    public List<Usuario> consultarTodos() {
        return super.consultarTodos(Usuario.class);
    }

    public Usuario buscaUsuario(String correo, String contrasenia) {
        Usuario u = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "from Usuario where correo = :correo and contrasenia = :contrasenia";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            query.setParameter("contrasenia", contrasenia);
            u = (Usuario) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return u;
    }

    public Usuario buscaPorCorreo(String correo) {
        Usuario u = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "from Usuario where correo = :correo";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            u = (Usuario) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return u;
    }

    public List<Usuario> buscaInformadores() {
        List<Usuario> obj =null;
        Session session = this.sessionFactory.openSession();
        Transaction tx =null;
        try{
            tx = session.beginTransaction();
            String hql = "from Usuario where rol = :rol";
            Query query = session.createQuery(hql);
            query.setParameter("rol", 2);
            obj = (List<Usuario>)query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return obj;
    }
    public boolean existeCorreo(String correo){
         Usuario u = null;
         Session session = this.sessionFactory.openSession();
         Transaction tx = null; 
         try{
             tx = session.beginTransaction();
             String hql = "from Usuario where correo = :correo";
             Query query = session.createQuery(hql);
             query.setParameter("correo", correo);
             u = (Usuario)query.uniqueResult();
             tx.commit();
         }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return u!= null;
    }
    
    public boolean existeNombre(String nombreUsuario){
         Usuario u = null;
         Session session = this.sessionFactory.openSession();
         Transaction tx = null; 
         try{
             tx = session.beginTransaction();
             String hql = "from Usuario where nombreUsuario = :nombreUsuario";
             Query query = session.createQuery(hql);
             query.setParameter("nombreUsuario", nombreUsuario);
             u = (Usuario)query.uniqueResult();
             tx.commit();
         }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return u!= null;    
    }
    
         public boolean existeCorreo(String correo){
         Usuario u = null;
         Session session = this.sessionFactory.openSession();
         Transaction tx = null; 
         try{
             tx = session.beginTransaction();
             String hql = "from Usuario where correo = :correo";
             Query query = session.createQuery(hql);
             query.setParameter("correo", correo);
             u = (Usuario)query.uniqueResult();
             tx.commit();
         }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return u!= null;    
    }
        
        public boolean existeNombre(String nombreUsuario){
         Usuario u = null;
         Session session = this.sessionFactory.openSession();
         Transaction tx = null; 
         try{
             tx = session.beginTransaction();
             String hql = "from Usuario where nombre_usuario = :nombreUsuario";
             Query query = session.createQuery(hql);
             query.setParameter("nombreUsuario", nombreUsuario);
             u = (Usuario)query.uniqueResult();
             tx.commit();
         }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return u!= null;    
    }


    public boolean existeCorreo(String correo) {
        Usuario u = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "from Usuario where correo = :correo";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            u = (Usuario) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return u != null;
    }

}
