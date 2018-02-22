package CDP;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author gkrause
 */
@Entity
public class Item implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private float precoCompra;
    private float peso;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedor;

    @OneToOne
    @JoinColumn(name = "id_Peixe")
    @Cascade(CascadeType.SAVE_UPDATE)
    private Peixe peixe;

    @OneToOne
    @JoinColumn(name = "id_CustoVariavel")
    @Cascade(CascadeType.SAVE_UPDATE)
    private CustoVariavel custoVariavel;

    public Item()
    {

    }

    public Item(CustoVariavel custoVariavel, float precoCompra, float peso, Date date,
            Fornecedor fornecedor, Peixe peixe)
    {
        this.precoCompra = precoCompra;
        this.peso = peso;
        this.date = date;
        this.fornecedor = fornecedor;
        this.peixe = peixe;
        this.custoVariavel = custoVariavel;
    }

    public Item(int codigo, CustoVariavel custoVariavel, float precoCompra, float peso, Date date,
            Fornecedor fornecedor, Peixe peixe)
    {
        this.precoCompra = precoCompra;
        this.peso = peso;
        this.date = date;
        this.fornecedor = fornecedor;
        this.peixe = peixe;
        this.custoVariavel = custoVariavel;
        this.codigo = codigo;
    }

    public CustoVariavel getCustoVariavel()
    {
        return custoVariavel;
    }

    public void setCustoVariavel(CustoVariavel custoVariavel)
    {
        this.custoVariavel = custoVariavel;
    }
    

    public Fornecedor getFornecedor()
    {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor)
    {
        this.fornecedor = fornecedor;
    }

    public Peixe getPeixe()
    {
        return peixe;
    }

    public void setPeixe(Peixe peixe)
    {
        this.peixe = peixe;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public float getPrecoCompra()
    {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra)
    {
        this.precoCompra = precoCompra;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public Date getDate()
    {
        return date;
    }

    public String getDateStr()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(date);
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return peixe.getNome();
    }

    public Object[] toArray()
    {
        return new Object[]
        {
            this, peso, precoCompra, codigo, fornecedor, getDateStr()
        };
    }

}
