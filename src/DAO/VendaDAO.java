package DAO;

import CDP.Venda;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gkrause
 */
public class VendaDAO
{

    public VendaDAO()
    {
        
    }

    public List<Venda> pesquisar(Date de, Date ate/*, Cliente cliente*/) throws HibernateException
    {

        Session sessao = null;
        List<Venda> lista = null;
        try
        {
            sessao = hibernate.HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            Criteria consulta;
            consulta = sessao.createCriteria(Venda.class);

            consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

            // 2) ASSOCIAÇÕES
            consulta.setFetchMode("PeixeVendido", FetchMode.JOIN);
            consulta.setFetchMode("Cliente", FetchMode.JOIN);

            consulta.add(Restrictions.between("date", de, ate));
//            consulta.add(Restrictions.like("Cliente.nome", cliente));

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
