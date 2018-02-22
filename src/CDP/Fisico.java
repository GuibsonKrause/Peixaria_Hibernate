package CDP;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author gkrause
 */
@Entity
public class Fisico extends Fornecedor implements Serializable
{
    private String cpf;

    public Fisico()
    {
        super();
    }

    public Fisico(String nome, String telefone, String cpf, Cep cep)
    {
        super(nome, telefone, cep);
        this.cpf = cpf;
    }
    
    public Fisico(int codigo, String nome, String telefone, String cpf, Cep cep)
    {
        super(codigo, nome, telefone, cep);
        this.cpf = cpf;
    }
    
    @Override
    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
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
            this, getCodigo(), cpf, null
        };
    }
    
    
    
}
