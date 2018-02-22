package CDP;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author gkrause
 */
@Entity
@Inheritance ( strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    String nome;
    private String telefone;

    public Pessoa()
    {
        
    }

    public Pessoa(String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public Pessoa(int codigo, String nome, String telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
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

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    
    
}
