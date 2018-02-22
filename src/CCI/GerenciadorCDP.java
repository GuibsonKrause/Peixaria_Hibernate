package CCI;

import CDP.Cep;
import CDP.Endereco;
import CDP.Cliente;
import CDP.CustoFixo;
import CDP.CustoVariavel;
import CDP.Fisico;
import CDP.Fornecedor;
import CDP.Item;
import CDP.Juridico;
import CDP.Login;
import CDP.Peixe;
import CDP.PeixeVendido;
import CDP.Venda;
import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import DAO.GenericDAO;
import DAO.PeixeDAO;
import DAO.VendaDAO;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gkrause
 */
public class GerenciadorCDP
{

    private ClienteDAO cliDAO;
    private GenericDAO gerDAO;
    private FornecedorDAO forneDAO;
    private PeixeDAO peixeDAO;
    private VendaDAO vendaDAO;

    public GerenciadorCDP() throws ClassNotFoundException, SQLException
    {
        cliDAO = new ClienteDAO();
        gerDAO = new GenericDAO();
        forneDAO = new FornecedorDAO();
        peixeDAO = new PeixeDAO();
        vendaDAO = new VendaDAO();

    }
    
    public int listarVendas() throws SQLException
    {
        return gerDAO.contar(Venda.class);
    }

    public List listarFornecedores() throws SQLException
    {
        return gerDAO.listar(Fornecedor.class);
    }

    public List listarPeixes() throws SQLException
    {
        return gerDAO.listar(Peixe.class);
    }

    public List listarClientes() throws SQLException
    {
        return gerDAO.listar(Cliente.class);
    }
    
    public List listarLogin() throws SQLException
    {
        return gerDAO.listar(Login.class);
    }
    
    public int inserirVenda(Venda venda) throws SQLException, ClassNotFoundException
    {
        gerDAO.inserir(venda);
        return venda.getCodigo();
    }

    public int inserirCustoVariavel(String custoVariavel, float preco,
            Date date) throws SQLException, ClassNotFoundException
    {
        CustoVariavel objCustoVariavel = new CustoVariavel(custoVariavel, preco,
                date);
        gerDAO.inserir(objCustoVariavel);

        return objCustoVariavel.getCodigo();
    }

    public int alterarCustoVariavel(int codigo, String custoVariavel, float preco,
            Date date) throws SQLException, ClassNotFoundException
    {
        CustoVariavel objCustoVariavel = new CustoVariavel(codigo, custoVariavel, preco,
                date);
        gerDAO.alterar(objCustoVariavel);

        return objCustoVariavel.getCodigo();
    }
    
    public int inserirCustoFixo(String custoFixo, float preco, Date date)
            throws SQLException, ClassNotFoundException
    {
        CustoFixo objCustoFixo = new CustoFixo(custoFixo, preco, date);
        gerDAO.inserir(objCustoFixo);

        return objCustoFixo.getCodigo();
    }

    public int alterarCustoFixo(int codigo, String custoFixo, float preco,
            Date date) throws SQLException, ClassNotFoundException
    {
        CustoFixo objCustoFixo = new CustoFixo(codigo, custoFixo, preco, date);
        gerDAO.alterar(objCustoFixo);

        return objCustoFixo.getCodigo();
    }
    
    public int inserirItem(float precoKg, String custoVariavel, float precoCompra, float peso, Date date,
            Fornecedor fornecedor, Peixe peixe) throws SQLException,
            ClassNotFoundException
    {
        CustoVariavel objCustoVariavel = new CustoVariavel(custoVariavel, precoCompra, date);
        Item objItem = new Item(objCustoVariavel, precoCompra, peso, date, fornecedor, peixe);
        gerDAO.inserir(objItem);

        return objItem.getCodigo();
    }

    public int alterarItem(int codigoItem, int codigoCustoVariavel, float precoKg, String custoVariavel, float precoCompra, float peso, Date date,
            Fornecedor fornecedor, Peixe peixe) throws SQLException,
            ClassNotFoundException
    {
        CustoVariavel objCustoVariavel = new CustoVariavel(codigoCustoVariavel, custoVariavel, precoCompra, date);
        Item objItem = new Item(codigoItem, objCustoVariavel, precoCompra, peso, date, fornecedor, peixe);
        gerDAO.alterar(objItem);

        return objItem.getCodigo();
    }

    public int inserirPeixe(String nome, float precoVenda) throws SQLException,
            ClassNotFoundException
    {
        Peixe objPeixe = new Peixe(nome, precoVenda);
        gerDAO.inserir(objPeixe);

        return objPeixe.getCodigo();
    }

    public int alterarPeixe(int codigo, String nome, float precoVenda, float qtdEstoque) throws SQLException,
            ClassNotFoundException
    {
        Peixe objPeixe = new Peixe(codigo, nome, precoVenda, qtdEstoque);
        gerDAO.alterar(objPeixe);

        return objPeixe.getCodigo();
    }

    public int inserirFornecedorF(String nome, String telefone, String cnpj,
            String cpf, String logradouro, int numero, String bairro,
            String cidade, String estado, String cep) throws SQLException,
            ClassNotFoundException
    {
        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Fisico objFisico = new Fisico(nome, telefone, cpf, objCep);

        gerDAO.inserir(objFisico);

        return objFisico.getCodigo();

    }

    public int alterarFornecedorF(int codigo, String nome, String telefone, String cnpj,
            String cpf, String logradouro, int numero, String bairro,
            String cidade, String estado, String cep) throws SQLException,
            ClassNotFoundException
    {
        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Fisico objFisico = new Fisico(codigo, nome, telefone, cpf, objCep);

        gerDAO.alterar(objFisico);

        return objFisico.getCodigo();

    }

    public int inserirFornecedorJ(String nome, String telefone, String cnpj,
            String cpf, String logradouro, int numero, String bairro,
            String cidade, String estado, String cep) throws SQLException,
            ClassNotFoundException
    {
        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Juridico objJuridico = new Juridico(nome, telefone, cnpj, objCep);

        gerDAO.inserir(objJuridico);

        return objJuridico.getCodigo();

    }

    public int alterarFornecedorJ(int codigo, String nome, String telefone, String cnpj,
            String cpf, String logradouro, int numero, String bairro,
            String cidade, String estado, String cep) throws SQLException,
            ClassNotFoundException
    {
        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Juridico objJuridico = new Juridico(codigo, nome, telefone, cnpj, objCep);

        gerDAO.alterar(objJuridico);

        return objJuridico.getCodigo();

    }

    public int inserirCliente(String nome, String telefone, char sexo,
            String cpf, Date dataNasc, String logradouro, int numero,
            String bairro, String cidade, String estado, String cep)
            throws SQLException, ClassNotFoundException
    {

        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Cliente objCli = new Cliente(nome, telefone, sexo, cpf, dataNasc, objCep);

        gerDAO.inserir(objCli);

        return objCli.getCodigo();

    }

    public int alterarCliente(int codigo, String nome, String telefone, char sexo,
            String cpf, Date dataNasc, String logradouro, int numero,
            String bairro, String cidade, String estado, String cep)
            throws SQLException, ClassNotFoundException
    {

        Endereco objEndereco = new Endereco(logradouro, numero, bairro, cidade,
                estado);
        Cep objCep = new Cep(cep, objEndereco);
        Cliente objCli = new Cliente(codigo, nome, telefone, sexo, cpf, dataNasc,
                objCep);
        gerDAO.alterar(objCli);

        return objCli.getCodigo();

    }

    public void excluirCliente(Cliente cli) throws SQLException
    {
        gerDAO.excluir(cli);
    }

    public void pesquisarFornecedor(JTable tabela, String pesq)
            throws SQLException
    {
        List lista = null;
        Fornecedor fornecedor;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = forneDAO.pesquisarNome(pesq);

        Iterator<Fornecedor> it = lista.iterator();
        while (it.hasNext())
        {
            fornecedor = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(fornecedor.toArray());
        }

    }

    public void pesquisarItem(JTable tabela) throws SQLException
    {

        List lista = null;
        Item item;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = gerDAO.listar(Item.class);

        Iterator<Item> it = lista.iterator();
        while (it.hasNext())
        {
            item = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(item.toArray());
        }
    }

    public void pesquisarCliente(JTable tabela, String pesq) throws SQLException
    {

        List lista = null;
        Cliente cli;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = cliDAO.pesquisarNome(pesq);

        Iterator<Cliente> it = lista.iterator();
        while (it.hasNext())
        {
            cli = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(cli.toArray());
        }
    }

    public void pesquisarPeixe(JTable tabela, String pesq) throws SQLException
    {

        List lista = null;
        Peixe peixe;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = peixeDAO.pesquisarNome(pesq);

        Iterator<Peixe> it = lista.iterator();
        while (it.hasNext())
        {
            peixe = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(peixe.toArray());
        }
    }
    
    public float listarCustoFixo(JTable tabela) throws SQLException
    {
        List<CustoFixo> lista = null;
        CustoFixo custoFixo;
        float total = 0;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = gerDAO.listar(CustoFixo.class);

        Iterator<CustoFixo> it = lista.iterator();
        while (it.hasNext())
        {
            custoFixo = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(custoFixo.toArray());
        }
        for (int i = 0; i < lista.size(); i++)
        {
            total += lista.get(i).getPreco();
        }
        
        return total;
    }
    
    public float somarCustoFixo() throws SQLException
    {
        List<CustoFixo> lista = null;
        float total = 0;

        lista = gerDAO.listar(CustoFixo.class);

        for (int i = 0; i < lista.size(); i++)
        {
            total += lista.get(i).getPreco();
        }
        
        return total;
    }
    
    public float somarCustoVariavel() throws SQLException
    {
        List<CustoVariavel> lista = null;
        float total = 0;

        lista = gerDAO.listar(CustoVariavel.class);

        for (int i = 0; i < lista.size(); i++)
        {
            total += lista.get(i).getPreco();
        }
        
        return total;
    }
    
    public float receita() throws SQLException
    {
        List<PeixeVendido> lista = null;
        float total = 0;

        lista = gerDAO.listar(PeixeVendido.class);

        for (int i = 0; i < lista.size(); i++)
        {
            total += lista.get(i).getPreco();
        }
        
        return total;
    }
    
    public float listarCustoVariavel(JTable tabela) throws SQLException
    {
        List<CustoVariavel> lista = null;
        CustoVariavel custoVariavel;
        float total = 0;

        // APAGAR a TABELA
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);

        lista = gerDAO.listar(CustoVariavel.class);

        Iterator<CustoVariavel> it = lista.iterator();
        while (it.hasNext())
        {
            custoVariavel = it.next();
            ((DefaultTableModel) tabela.getModel()).addRow(custoVariavel.toArray());
        }
        for (int i = 0; i < lista.size(); i++)
        {
            total += lista.get(i).getPreco();
        }
        return total;
    }

    public void relatorio(JTable tableResultado, Date de, Date ate /*,Cliente cliente*/)
    {
        List<Venda> lista = null;
        Venda venda;
        ((DefaultTableModel) tableResultado.getModel()).setRowCount(0);
        
        lista = this.vendaDAO.pesquisar(de, ate /*,cliente*/);
        
        Iterator<Venda> it = lista.iterator();
        while (it.hasNext())
        {
            venda = it.next();
            ((DefaultTableModel) tableResultado.getModel()).addRow(venda.toArray());
        }
        
    }

}
