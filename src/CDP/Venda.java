package CDP;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author gkrause
 */
@Entity
public class Venda implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Temporal(TemporalType.DATE)
    private Date date;

    private float custoTotal;

    @OneToMany(mappedBy = "venda", fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    List<PeixeVendido> listPeixeVendido;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    Cliente cliente;

    public Venda()
    {
        listPeixeVendido = new ArrayList();
    }

    public Venda(Date date)
    {
        this.date = date;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public List<PeixeVendido> getListPeixeVendido()
    {
        return listPeixeVendido;
    }

    public void setListPeixeVendido(List<PeixeVendido> listPeixeVendido)
    {
        this.listPeixeVendido = listPeixeVendido;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getDataNascStr()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return formato.format(date);
    }

    public float getCustoTotal()
    {
        return custoTotal;
    }

    public void setCustoTotal(float custoTotal)
    {
        this.custoTotal = custoTotal;
    }

    @Override
    public String toString()
    {
        return String.valueOf(custoTotal);
    }

    public Object[] toArray()
    {
        return new Object[]
        {
            getCliente(), this
        };
    }

}
