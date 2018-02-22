package DAO;

import CDP.Cliente;
import CDP.Pessoa;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gkrause
 */
public class ClienteDAO extends GenericDAO
{

    public ClienteDAO() throws ClassNotFoundException, SQLException
    {

    }

    public List pesquisarNome(String nomePesq) throws SQLException
    {
        Session sessao = null;
        List<Pessoa> lista = null;
        try
        {
            sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            Criteria consulta;
            consulta = sessao.createCriteria(Cliente.class);

            consulta.add(Restrictions.like("nome", "%" + nomePesq + "%"));
            
            lista = consulta.list();

            sessao.getTransaction().commit();

        } catch (HibernateException he)
        {
            sessao.getTransaction().rollback();
        } finally
        {
            if (sessao != null)
            {
                sessao.close();
            }
            return lista;
        }
    }

}
