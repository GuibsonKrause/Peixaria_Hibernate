package CDP;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author gkrause
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Fornecedor extends Pessoa implements Serializable
{

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Cep cep;

    public Fornecedor()
    {
        super();
    }
    
    public Fornecedor(String nome, String telefone, Cep cep)
    {
        super(nome, telefone);
        this.cep = cep;
    }

    public Fornecedor(int codigo, String nome, String telefone, Cep cep)
    {
        super(codigo, nome, telefone);
        this.cep = cep;
    }

    public Cep getCep()
    {
        return cep;
    }

    public void setCep(Cep cep)
    {
        this.cep = cep;
    }
    
    
    public String getCpf()
    {
        return null;
    }
    
    public String getCnpj()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return nome;
    }
    
    public Object[] toArray()
    {
        return null;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (getCodigo() != other.getCodigo()) {
            return false;
        }
        return true;
    }

}
