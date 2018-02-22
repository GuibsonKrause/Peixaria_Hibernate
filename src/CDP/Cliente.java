package CDP;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author gkrause
 */
@Entity
public class Cliente extends Pessoa implements Serializable
{

    private char sexo;
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dataNasc;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Cep cep;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Venda> venda;
    

    public Cliente()
    {
        super();
    }

    public Cliente(String nome, String telefone, char sexo, String cpf, Date dataNasc, Cep cep)
    {
        super(nome, telefone);
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.cep = cep;
    }
    
    public Cliente(int codigo, String nome, String telefone, char sexo, String cpf, Date dataNasc, Cep cep)
    {
        super(codigo, nome, telefone);
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.cep = cep;
    }

    public List<Venda> getVenda()
    {
        return venda;
    }
    
    public Cep getCep()
    {
        return cep;
    }

    public void setCep(Cep cep)
    {
        this.cep = cep;
    }

    public void setVenda(List<Venda> venda)
    {
        this.venda = venda;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public Date getDataNasc()
    {
        return dataNasc;
    }

    public String getDataNascStr()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        return formato.format(dataNasc);
    }

    public void setDataNasc(Date dataNasc)
    {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString()
    {
        return getNome();
    }

    public Object[] toArray()
    {
        return new Object[]
        {
            this, cpf, getDataNascStr()
        };
    }

}
