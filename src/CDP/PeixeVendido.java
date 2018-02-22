package CDP;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author gkrause
 */
@Entity
public class PeixeVendido implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private float preco;

    private float pesoPeixe;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    Peixe peixe;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    Venda venda;

    public PeixeVendido()
    {

    }

    public PeixeVendido(float pesoPeixe, Peixe peixe, Venda venda)
    {
        this.pesoPeixe = pesoPeixe;
        this.peixe = peixe;
        this.venda = venda;
        this.preco = pesoPeixe * peixe.getPrecoVenda();

    }

    public Peixe getPeixe()
    {
        return peixe;
    }

    public void setPeixe(Peixe peixe)
    {
        this.peixe = peixe;
    }

    public Venda getVenda()
    {
        return venda;
    }

    public void setVenda(Venda venda)
    {
        this.venda = venda;
    }
    

    public PeixeVendido(float preco)
    {
        this.preco = preco;
    }

    public float getPreco()
    {
        return preco;
    }

    public float getPesoPeixe()
    {
        return pesoPeixe;
    }

    public void setPesoPeixe(float pesoPeixe)
    {
        this.pesoPeixe = pesoPeixe;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

}
