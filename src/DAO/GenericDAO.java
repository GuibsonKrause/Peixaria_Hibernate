package DAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

/**
 *
 * @author gkrause
 */
public class GenericDAO
{

    public GenericDAO()
    {
        
    }
    
    public void inserir( Object obj ) throws SQLException, ClassNotFoundException {
        
        Session sessao;
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.save(obj);
        
        sessao.getTransaction().commit();
        sessao.close();                
    }
    
    public void alterar ( Object obj ) throws ClassNotFoundException, SQLException {

        Session sessao;
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.update(obj);
        
        sessao.getTransaction().commit();
        sessao.close();        
    }
    
    public void excluir ( Object obj ) throws SQLException {
        Session sessao;
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        sessao.delete(obj);
        
        sessao.getTransaction().commit();
        sessao.close();
    }
    
    public List listar(Class classe) {
        
        List lista;
        Session sessao;
        
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        Criteria cons = sessao.createCriteria(classe);
        lista = cons.list();  
        
        sessao.getTransaction().commit();
        sessao.close();
                               
        return lista;
    }
    
    public int contar(Class classe) {
        
        int total;
        Session sessao;
        
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        Criteria cons = sessao.createCriteria(classe);
        total = ((Number) cons.setProjection(Projections.rowCount()).uniqueResult()).intValue();
        
        sessao.getTransaction().commit();
        sessao.close();
                               
        return total;
    }
    
    public Object get(Class classe, Serializable id ) throws SQLException {
        
        List lista;
        Session sessao;
        
        sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
        sessao.beginTransaction();
        
        Object obj = sessao.get(classe, id);
        
        sessao.getTransaction().commit();
        sessao.close();
        
        return obj;
    }
}
