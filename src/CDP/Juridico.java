package CDP;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author gkrause
 */
@Entity
public class Juridico extends Fornecedor implements Serializable
{

    private String cnpj;

    public Juridico()
    {
        super();
    }

    public Juridico(String nome, String telefone, String cnpj, Cep cep)
    {
        super(nome, telefone, cep);
        this.cnpj = cnpj;
    }
    
    public Juridico(int codigo, String nome, String telefone, String cnpj, Cep cep)
    {
        super(codigo, nome, telefone, cep);
        this.cnpj = cnpj;
    }
    
    @Override
    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString()
    {
        return getNome();
    }
    
    @Override
    public Object[] toArray()
    {
        return new Object[]
        {
            this, getCodigo(), null, cnpj
        };
    }

}
