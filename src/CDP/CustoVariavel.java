package CDP;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gkrause
 */
@Entity
public class CustoVariavel implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    private String custoVariavel;
    private float preco;
    
    @Temporal (TemporalType.DATE)
    private Date date;
    
    public CustoVariavel()
    {
        
    }

    public CustoVariavel(String custoVariavel, float preco, Date date)
    {
        this.custoVariavel = custoVariavel;
        this.preco = preco;
        this.date = date;
    }
    
    public CustoVariavel(int codigo, String custoVariavel, float preco, Date date)
    {
        this.custoVariavel = custoVariavel;
        this.preco = preco;
        this.date = date;
        this.codigo = codigo;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getCustoVariavel()
    {
        return custoVariavel;
    }

    public void setCustoVariavel(String custoVariavel)
    {
        this.custoVariavel = custoVariavel;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    public String getDataStr()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        return formato.format(date);
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
    
    @Override
    public String toString()
    {
        return custoVariavel;
    }
    
    public Object[] toArray()
    {
        return new Object[]
        {
            this, preco, getDataStr()
        };
    }
    
}
