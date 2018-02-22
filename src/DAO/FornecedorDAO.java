package DAO;

import CDP.Fornecedor;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gkrause
 */
public class FornecedorDAO extends GenericDAO
{

    public FornecedorDAO() throws ClassNotFoundException, SQLException
    {

    }

    public List pesquisarNome(String nomePesq) throws SQLException
    {
        Session sessao = null;
        List<Fornecedor> lista = null;
        try
        {
            sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            Criteria consulta;
            consulta = sessao.createCriteria(Fornecedor.class);

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
