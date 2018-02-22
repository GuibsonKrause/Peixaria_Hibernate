package CDP;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;

/**
 *
 * @author gkrause
 */
@Entity
public class Peixe implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    private String nome;
    private float precoVenda;
    private float qtdEstoque;
    
    public Peixe()
    {
        
    }

    public Peixe(String nome, float precoVenda)
    {
        this.nome = nome;
        this.precoVenda = precoVenda;
    }
    
    public Peixe(int codigo, String nome, float precoVenda, float qtdEstoque)
    {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.codigo = codigo;
        this.qtdEstoque = qtdEstoque;
    }

    public float getQtdEstoque()
    {
        return qtdEstoque;
    }

    public void setQtdEstoque(float qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
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

    public float getPrecoVenda()
    {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda)
    {
        this.precoVenda = precoVenda;
    }
    

    @Override
    public String toString()
    {
        return nome;
    }
    
    public Object[] toArray()
    {
        return new Object[]
        {
            this, codigo, precoVenda
        };
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
        final Peixe other = (Peixe) obj;
        if (this.codigo != other.getCodigo()) {
            return false;
        }
        return true;
    }
    
}
