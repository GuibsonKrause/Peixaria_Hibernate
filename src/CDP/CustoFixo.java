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
public class CustoFixo implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    private String custoFixo;
    private float preco;
    
    @Temporal (TemporalType.DATE)
    private Date date;
    
    public CustoFixo()
    {
        
    }

    public CustoFixo(String custoFixo, float preco, Date date)
    {
        this.custoFixo = custoFixo;
        this.preco = preco;
        this.date = date;
    }
    
    public CustoFixo(int codigo, String custoFixo, float preco, Date date)
    {
        this.custoFixo = custoFixo;
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

    public String getCustoFixo()
    {
        return custoFixo;
    }

    public void setCustoFixo(String custoFixo)
    {
        this.custoFixo = custoFixo;
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
        return custoFixo;
    }
    
    public Object[] toArray()
    {
        return new Object[]
        {
            this, preco, getDataStr()
        };
    }
    

}
