package CDP;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gkrause
 */
public class Relatorio implements Serializable
{
    private Date dataInicio;
    private Date dataFim;
    private Peixe peixe;
    private Cliente pessoa;

    public Relatorio()
    {
        
    }

    public Relatorio(Date dataInicio, Date dataFim)
    {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Peixe getPeixe()
    {
        return peixe;
    }

    public void setPeixe(Peixe peixe)
    {
        this.peixe = peixe;
    }

    public Cliente getPessoa()
    {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa)
    {
        this.pessoa = pessoa;
    }
    

    public Date getDataInicio()
    {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio)
    {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim()
    {
        return dataFim;
    }

    public void setDataFim(Date dataFim)
    {
        this.dataFim = dataFim;
    }
    
    
}
