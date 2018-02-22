package CCI;

import CDP.Cliente;
import CDP.Endereco;
import CDP.Fornecedor;
import CDP.Item;
import CDP.Peixe;
import CIH.Outros.Ajuda;
import CIH.Cadastrar.CadastrarCliente;
import CIH.Cadastrar.CadastrarFornecedor;
import CIH.Cadastrar.CadastrarPeixe;
import CIH.Cadastrar.CadastrarItem;
import CIH.Pesquisar.PesquisarCliente;
import CIH.Pesquisar.PesquisarFornecedor;
import CIH.Pesquisar.PesquisarPeixe;
import CIH.Pesquisar.PesquisarItem;
import CIH.Outros.Relatorio;
import CIH.Outros.TelaCustoFixo;
import CIH.Outros.TelaCustoVariavel;
import CIH.Outros.TelaLogin;
import CIH.Outros.TelaPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import CIH.Outros.ClasseErro;
import DAO.EnderecoDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author gkrause
 */
public class GerenciadorCIH
{

    private GerenciadorCDP gerCDP;

    private Ajuda objAjuda;
    private CadastrarCliente objCadastrarCliente;
    private CadastrarFornecedor objCadastrarFornecedor;
    private CadastrarPeixe objCadastrarPeixe;
    private CadastrarItem objCadastrarItem;
    private PesquisarCliente objPesquisarCliente;
    private PesquisarFornecedor objPesquisarFornecedor;
    private PesquisarPeixe objPesquisarPeixe;
    private PesquisarItem objPesquisarProduto;
    private Relatorio objRelatorio;
    private TelaCustoFixo objTelaCustoFixo;
    private TelaCustoVariavel objTelaCustoVariavel;
    private TelaLogin objTelaLogin;
    private TelaPrincipal objTelaPrincipal;
    private ClasseErro objClasseErro;
    private EnderecoDAO endDAO;

    public GerenciadorCIH()
    {
        try
        {
            gerCDP = new GerenciadorCDP();
            classeErro();
            endDAO = new EnderecoDAO(this);

            objAjuda = null;
            objCadastrarCliente = null;
            objCadastrarFornecedor = null;
            objCadastrarPeixe = null;
            objCadastrarItem = null;
            objPesquisarCliente = null;
            objPesquisarFornecedor = null;
            objPesquisarPeixe = null;
            objPesquisarProduto = null;
            objRelatorio = null;
            objTelaCustoFixo = null;
            objTelaCustoVariavel = null;
            objTelaLogin = null;
            objTelaPrincipal = null;
        } catch (ClassNotFoundException erro)
        {
            JOptionPane.showMessageDialog(null, "Classe não encontrado.");
            gerCDP = null;
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "ERRO de conexão. " + erro.getMessage());
            gerCDP = null;
        }
    }

    public EnderecoDAO getEndDAO()
    {
        return endDAO;
    }

    public Endereco buscaCep(String cep)
    {
        Endereco endereco;
        endereco = endDAO.buscaCep(cep);
        return endereco;
    }

    public List splitEndereco(Object obj)
    {
        List list = new ArrayList();
        String toString = obj.toString();
        list.add(toString.split(","));
        return list;

    }

    public GerenciadorCDP getGerCDP()
    {
        return gerCDP;
    }

    public void classeErro()
    {
        objClasseErro = new ClasseErro(objTelaPrincipal);
    }

    public void janelaLogin()
    {
        if (objTelaLogin == null)
        {
            objTelaLogin = new TelaLogin(this);
        }
        objTelaLogin.setVisible(true);

    }

    public void janelaPrincipal()
    {
        objTelaPrincipal = new TelaPrincipal(null, true, this);
        objTelaPrincipal.setVisible(true);
    }

    public void janelaAjuda()
    {
        if (objAjuda == null)
        {
            objAjuda = new Ajuda(null, true, this);
        }
        objAjuda.setVisible(true);
    }

    public void janelaCadCliente()
    {
        objCadastrarCliente = new CadastrarCliente(null, true, this, true);
        objCadastrarCliente.setVisible(true);
    }

    public void janelaCadFornecedor()
    {
        objCadastrarFornecedor = new CadastrarFornecedor(null, true, this, true);
        objCadastrarFornecedor.setVisible(true);
    }

    public void janelaCadPeixe()
    {
        objCadastrarPeixe = new CadastrarPeixe(null, true, this, true);
        objCadastrarPeixe.setVisible(true);
    }

    public void janelaCadItem()
    {
        objCadastrarItem = new CadastrarItem(null, true, this, true);
        objCadastrarItem.setVisible(true);
    }

    public void janelaPesqCliente()
    {
        if (objPesquisarCliente == null)
        {
            objPesquisarCliente = new PesquisarCliente(null, true, this);
        }
        objPesquisarCliente.setVisible(true);
    }

    public void janelaPesqFornecedor()
    {
        if (objPesquisarFornecedor == null)
        {
            objPesquisarFornecedor = new PesquisarFornecedor(null, true, this);
        }
        objPesquisarFornecedor.setVisible(true);
    }

    public void janelaPesqPeixe()
    {
        if (objPesquisarPeixe == null)
        {
            objPesquisarPeixe = new PesquisarPeixe(null, true, this);
        }
        objPesquisarPeixe.setVisible(true);
    }

    public void janelaPesqProduto()
    {
        if (objPesquisarProduto == null)
        {
            objPesquisarProduto = new PesquisarItem(null, true, this);
        }
        objPesquisarProduto.setVisible(true);
    }

    public void janelaRelatorio()
    {
        if (objRelatorio == null)
        {
            objRelatorio = new Relatorio(null, true, this);
        }
        objRelatorio.setVisible(true);
    }

    public void janelaCustoFixo()
    {
        objTelaCustoFixo = new TelaCustoFixo(null, true, this);
        objTelaCustoFixo.setVisible(true);
    }

    public void janelaCustoVariavel()
    {
        objTelaCustoVariavel = new TelaCustoVariavel(null, true, this);
        objTelaCustoVariavel.setVisible(true);
    }

    public void carregarComboFornecedor(JComboBox cmb)
    {

        List lista;
        try
        {
            lista = gerCDP.listarFornecedores();
            cmb.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(objCadastrarItem, "ERRO ao listar fornecedores. " + erro.getMessage());
        }

    }

    public void carregarComboPeixe(JComboBox cmb)
    {
        List lista;
        try
        {
            lista = gerCDP.listarPeixes();
            cmb.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(objCadastrarItem, "ERRO ao listar Peixes. " + erro.getMessage());
        }
    }

    public void carregarComboCliente(JComboBox cmb)
    {
        List lista;
        try
        {
            lista = gerCDP.listarClientes();
            cmb.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(objTelaPrincipal, "ERRO ao listar Clientes. " + erro.getMessage());
        }
    }

    public void carregarAlterarCliente(Cliente clienteSelecionado)
    {
        objCadastrarCliente = new CadastrarCliente(null, true, this, false, clienteSelecionado);
        objCadastrarCliente.setVisible(true);
    }

    public void carregarAlterarFornecedor(Fornecedor forneSelecionado)
    {
        objCadastrarFornecedor = new CadastrarFornecedor(null, true, this,
                false, forneSelecionado);
        objCadastrarFornecedor.setVisible(true);
    }

    public void carregarAlterarPeixe(Peixe peixeSelecionado)
    {
        objCadastrarPeixe = new CadastrarPeixe(null, true, this, false, peixeSelecionado);
        objCadastrarPeixe.setVisible(true);
    }

    public void carregarAlterarItem(Item itemSelecionado)
    {
        objCadastrarItem = new CadastrarItem(null, true, this, false, itemSelecionado);
        objCadastrarItem.setVisible(true);
    }

    public ClasseErro getObjClasseErro()
    {
        return objClasseErro;
    }

    public static void main(String[] args)
    {

        GerenciadorCIH gerCCI = new GerenciadorCIH();
        gerCCI.janelaLogin();

    }

}
