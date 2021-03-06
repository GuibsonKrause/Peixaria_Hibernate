package DAO;

import CCI.GerenciadorCIH;
import CDP.Endereco;
import Cep.WebServiceCep;

/**
 *
 * @author gkrause
 */
public class EnderecoDAO
{
    private GerenciadorCIH gerCIH;
    
    public EnderecoDAO(GerenciadorCIH gerCIH)
    {
        this.gerCIH = gerCIH;
    }
    
    public Endereco buscaCep(String cep)  
    {
        Endereco endereco = new Endereco();        

        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);

        if (webServiceCep.wasSuccessful())
        {
            endereco.setLogradouro(webServiceCep.getLogradouro());
            endereco.setBairro(webServiceCep.getBairro());
            endereco.setCidade(webServiceCep.getCidade());
            endereco.setEstado(webServiceCep.getUf());
        } else
        {
            gerCIH.getObjClasseErro().exibir(webServiceCep.getResultText());
        }
        
        return endereco;
    }
}
