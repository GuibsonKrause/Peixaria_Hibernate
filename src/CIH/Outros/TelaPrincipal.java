package CIH.Outros;

import CCI.GerenciadorCIH;
import CDP.Cliente;
import CDP.Peixe;
import CDP.PeixeVendido;
import CDP.Venda;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gkrause
 */
public class TelaPrincipal extends javax.swing.JFrame
{

    private GerenciadorCIH gerCCI;
    private Venda venda;

    /**
     * Creates new form Tela_Principal
     *
     * @param ger
     */
    public TelaPrincipal(java.awt.Frame parent, boolean modal, GerenciadorCIH ger)
    {
        this.setLocationRelativeTo(null);
        gerCCI = ger;
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblPeixe = new javax.swing.JLabel();
        cbxPeixe = new javax.swing.JComboBox<>();
        lblPeso = new javax.swing.JLabel();
        spinPeso = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        lblCliente = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        txtDisponivel = new javax.swing.JTextField();
        btnCarrinho = new javax.swing.JButton();
        btnExcluirCarrinho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarrinho = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemMCliente = new javax.swing.JMenu();
        itemMCadCliente = new javax.swing.JMenuItem();
        itemMCadFornecedor = new javax.swing.JMenuItem();
        itemMCadPeixe = new javax.swing.JMenuItem();
        itemMCadItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemMCustoF = new javax.swing.JMenuItem();
        itemMCustoV = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMPesqCliente = new javax.swing.JMenuItem();
        itemMPesqFornecedor = new javax.swing.JMenuItem();
        itemMPesqPeixe = new javax.swing.JMenuItem();
        itemMPesqProduto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemMRelatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda"));

        lblPeixe.setText("Peixe:");

        cbxPeixe.setName(""); // NOI18N
        cbxPeixe.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbxPeixeItemStateChanged(evt);
            }
        });

        lblPeso.setText("Peso:");

        spinPeso.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.5f));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCliente.setText("Cliente:");

        txtDisponivel.setEditable(false);

        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/carrinho.png"))); // NOI18N
        btnCarrinho.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCarrinhoActionPerformed(evt);
            }
        });

        btnExcluirCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/deletar.png"))); // NOI18N
        btnExcluirCarrinho.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirCarrinhoActionPerformed(evt);
            }
        });

        jLabel1.setText("Estoque:");

        txtTotal.setEditable(false);

        lblTotal.setText("Total:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho"));

        tableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Peixe:", "Valor:"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tableCarrinho.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tableCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCarrinho);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/refresh.png"))); // NOI18N
        btnRefresh.setPreferredSize(new java.awt.Dimension(105, 24));
        btnRefresh.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPeso))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCliente)
                            .addComponent(lblPeixe))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxCliente, 0, 103, Short.MAX_VALUE)
                            .addComponent(cbxPeixe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCarrinho)
                        .addGap(32, 32, 32)
                        .addComponent(btnExcluirCarrinho)
                        .addGap(26, 26, 26)
                        .addComponent(lblTotal)
                        .addGap(0, 0, 0)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeixe)
                    .addComponent(cbxPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(spinPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirCarrinho)
                    .addComponent(btnCarrinho)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(105, 24));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        btnVender.setText("Vender");
        btnVender.setPreferredSize(new java.awt.Dimension(105, 24));
        btnVender.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVenderActionPerformed(evt);
            }
        });
        jPanel2.add(btnVender);

        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovoCliente);

        itemMCliente.setText("Cadastro");

        itemMCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/cliente.png"))); // NOI18N
        itemMCadCliente.setText("Cliente");
        itemMCadCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCadClienteActionPerformed(evt);
            }
        });
        itemMCliente.add(itemMCadCliente);

        itemMCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/fornecedor.png"))); // NOI18N
        itemMCadFornecedor.setText("Fornecedor");
        itemMCadFornecedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCadFornecedorActionPerformed(evt);
            }
        });
        itemMCliente.add(itemMCadFornecedor);

        itemMCadPeixe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/fish.png"))); // NOI18N
        itemMCadPeixe.setText("Peixe");
        itemMCadPeixe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCadPeixeActionPerformed(evt);
            }
        });
        itemMCliente.add(itemMCadPeixe);

        itemMCadItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/produto.png"))); // NOI18N
        itemMCadItem.setText("Item");
        itemMCadItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCadItemActionPerformed(evt);
            }
        });
        itemMCliente.add(itemMCadItem);

        jMenuBar1.add(itemMCliente);

        jMenu5.setText("Custos");

        itemMCustoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Custo_Fixo.png"))); // NOI18N
        itemMCustoF.setText("Custo Fixo");
        itemMCustoF.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCustoFActionPerformed(evt);
            }
        });
        jMenu5.add(itemMCustoF);

        itemMCustoV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Custo_Variavel.png"))); // NOI18N
        itemMCustoV.setText("Custo Variável");
        itemMCustoV.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMCustoVActionPerformed(evt);
            }
        });
        jMenu5.add(itemMCustoV);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Pesquisa");

        itemMPesqCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/lupa_pesquisar.png"))); // NOI18N
        itemMPesqCliente.setText("Cliente");
        itemMPesqCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMPesqClienteActionPerformed(evt);
            }
        });
        jMenu2.add(itemMPesqCliente);

        itemMPesqFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/lupa_pesquisar.png"))); // NOI18N
        itemMPesqFornecedor.setText("Fornecedor");
        itemMPesqFornecedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMPesqFornecedorActionPerformed(evt);
            }
        });
        jMenu2.add(itemMPesqFornecedor);

        itemMPesqPeixe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/lupa_pesquisar.png"))); // NOI18N
        itemMPesqPeixe.setText("Peixe");
        itemMPesqPeixe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMPesqPeixeActionPerformed(evt);
            }
        });
        jMenu2.add(itemMPesqPeixe);

        itemMPesqProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/lupa_pesquisar.png"))); // NOI18N
        itemMPesqProduto.setText("Item");
        itemMPesqProduto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMPesqProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(itemMPesqProduto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        itemMRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Grafico.png"))); // NOI18N
        itemMRelatorios.setText("Relatórios");
        itemMRelatorios.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemMRelatoriosActionPerformed(evt);
            }
        });
        jMenu3.add(itemMRelatorios);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMCadFornecedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCadFornecedorActionPerformed
    {//GEN-HEADEREND:event_itemMCadFornecedorActionPerformed
        gerCCI.janelaCadFornecedor();
    }//GEN-LAST:event_itemMCadFornecedorActionPerformed

    private void itemMCadClienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCadClienteActionPerformed
    {//GEN-HEADEREND:event_itemMCadClienteActionPerformed
        gerCCI.janelaCadCliente();
    }//GEN-LAST:event_itemMCadClienteActionPerformed

    private void itemMCadPeixeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCadPeixeActionPerformed
    {//GEN-HEADEREND:event_itemMCadPeixeActionPerformed
        gerCCI.janelaCadPeixe();
    }//GEN-LAST:event_itemMCadPeixeActionPerformed

    private void itemMCadItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCadItemActionPerformed
    {//GEN-HEADEREND:event_itemMCadItemActionPerformed
        gerCCI.janelaCadItem();
    }//GEN-LAST:event_itemMCadItemActionPerformed

    private void itemMCustoFActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCustoFActionPerformed
    {//GEN-HEADEREND:event_itemMCustoFActionPerformed
        gerCCI.janelaCustoFixo();
    }//GEN-LAST:event_itemMCustoFActionPerformed

    private void itemMPesqClienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMPesqClienteActionPerformed
    {//GEN-HEADEREND:event_itemMPesqClienteActionPerformed
        gerCCI.janelaPesqCliente();
    }//GEN-LAST:event_itemMPesqClienteActionPerformed

    private void itemMPesqFornecedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMPesqFornecedorActionPerformed
    {//GEN-HEADEREND:event_itemMPesqFornecedorActionPerformed
        gerCCI.janelaPesqFornecedor();
    }//GEN-LAST:event_itemMPesqFornecedorActionPerformed

    private void itemMPesqPeixeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMPesqPeixeActionPerformed
    {//GEN-HEADEREND:event_itemMPesqPeixeActionPerformed
        gerCCI.janelaPesqPeixe();
    }//GEN-LAST:event_itemMPesqPeixeActionPerformed

    private void itemMPesqProdutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMPesqProdutoActionPerformed
    {//GEN-HEADEREND:event_itemMPesqProdutoActionPerformed
        gerCCI.janelaPesqProduto();
    }//GEN-LAST:event_itemMPesqProdutoActionPerformed

    private void itemMRelatoriosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMRelatoriosActionPerformed
    {//GEN-HEADEREND:event_itemMRelatoriosActionPerformed
        gerCCI.janelaRelatorio();
    }//GEN-LAST:event_itemMRelatoriosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        TelaPrincipal.this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void itemMCustoVActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_itemMCustoVActionPerformed
    {//GEN-HEADEREND:event_itemMCustoVActionPerformed
        gerCCI.janelaCustoVariavel();
    }//GEN-LAST:event_itemMCustoVActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVenderActionPerformed
    {//GEN-HEADEREND:event_btnVenderActionPerformed
        try
        {
            Cliente cliente = (Cliente) cbxCliente.getSelectedItem();
            venda.setCliente(cliente);
            venda.setDate(new Date());
            int idVenda = gerCCI.getGerCDP().inserirVenda(venda);
            JOptionPane.showMessageDialog(this, "Venda realizada com sucesso");
        } catch (SQLException | ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, "Erro " + ex.getMessage());
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoClienteActionPerformed
    {//GEN-HEADEREND:event_btnNovoClienteActionPerformed
        gerCCI.janelaCadCliente();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        gerCCI.carregarComboPeixe(cbxPeixe);
        gerCCI.carregarComboCliente(cbxCliente);
        txtTotal.setText("0");

        Peixe peixe = (Peixe) cbxPeixe.getSelectedItem();
        if (peixe != null)
        {
            txtDisponivel.setText(String.valueOf(peixe.getQtdEstoque()));
        }

        Venda objvenda = new Venda();
        this.venda = objvenda;

    }//GEN-LAST:event_formComponentShown

    private void cbxPeixeItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxPeixeItemStateChanged
    {//GEN-HEADEREND:event_cbxPeixeItemStateChanged
        Peixe peixe = (Peixe) cbxPeixe.getSelectedItem();
        txtDisponivel.setText(String.valueOf(peixe.getQtdEstoque()));
    }//GEN-LAST:event_cbxPeixeItemStateChanged

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCarrinhoActionPerformed
    {//GEN-HEADEREND:event_btnCarrinhoActionPerformed
        // TODO add your handling code here:
        Peixe peixe = (Peixe) cbxPeixe.getSelectedItem();
        float peso = (float) spinPeso.getValue();
        float preco = peso * peixe.getPrecoVenda();
        float total;
        total = Float.valueOf(txtTotal.getText());
        if (peso > peixe.getQtdEstoque())
        {
            JOptionPane.showMessageDialog(this, "Quantidade indisponível em estoque!");
        } else
        {
            ((DefaultTableModel) tableCarrinho.getModel()).addRow(new Object[1]);
            int linha = tableCarrinho.getRowCount() - 1;
            int col = 0;
            tableCarrinho.setValueAt(peixe, linha, col++);
            tableCarrinho.setValueAt(preco, linha, col++);

            peixe.setQtdEstoque(peixe.getQtdEstoque() - peso);
            txtDisponivel.setText(String.valueOf(peixe.getQtdEstoque()));

            PeixeVendido peixeVendido = new PeixeVendido(peso, peixe, venda);

            venda.getListPeixeVendido().add(peixeVendido);

            total += preco;
            txtTotal.setText(String.valueOf(total));
            venda.setCustoTotal(total);
        }
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void btnExcluirCarrinhoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirCarrinhoActionPerformed
    {//GEN-HEADEREND:event_btnExcluirCarrinhoActionPerformed
        // TODO add your handling code here:
        Peixe peixe = (Peixe) tableCarrinho.getValueAt(tableCarrinho.getSelectedRow(), 0);
        float preco = (float) tableCarrinho.getValueAt(tableCarrinho.getSelectedRow(), 1);
        float total;

        float estoque = peixe.getQtdEstoque();
        total = Float.valueOf(txtTotal.getText());
        total -= preco;
        
        txtTotal.setText(String.valueOf(total));
        venda.setCustoTotal((float) total);
        estoque += preco / peixe.getPrecoVenda();
        txtDisponivel.setText(String.valueOf(estoque));

        for (int i = 0; i < venda.getListPeixeVendido().size(); i++)
        {
            if (venda.getListPeixeVendido().get(i).getPeixe() == peixe
                    && venda.getListPeixeVendido().get(i).getPreco() == preco)
            {
                venda.getListPeixeVendido().remove(i);
            }
        }

        ((DefaultTableModel) tableCarrinho.getModel()).removeRow(tableCarrinho.getSelectedRow());
    }//GEN-LAST:event_btnExcluirCarrinhoActionPerformed

    private void tableCarrinhoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableCarrinhoMouseClicked
    {//GEN-HEADEREND:event_tableCarrinhoMouseClicked
        Peixe peixe = (Peixe) tableCarrinho.getValueAt(tableCarrinho.getSelectedRow(), 0);
        cbxPeixe.setSelectedItem(peixe);
    }//GEN-LAST:event_tableCarrinhoMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRefreshActionPerformed
    {//GEN-HEADEREND:event_btnRefreshActionPerformed
        gerCCI.carregarComboPeixe(cbxPeixe);
        gerCCI.carregarComboCliente(cbxCliente);
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnExcluirCarrinho;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxPeixe;
    private javax.swing.JMenuItem itemMCadCliente;
    private javax.swing.JMenuItem itemMCadFornecedor;
    private javax.swing.JMenuItem itemMCadItem;
    private javax.swing.JMenuItem itemMCadPeixe;
    private javax.swing.JMenu itemMCliente;
    private javax.swing.JMenuItem itemMCustoF;
    private javax.swing.JMenuItem itemMCustoV;
    private javax.swing.JMenuItem itemMPesqCliente;
    private javax.swing.JMenuItem itemMPesqFornecedor;
    private javax.swing.JMenuItem itemMPesqPeixe;
    private javax.swing.JMenuItem itemMPesqProduto;
    private javax.swing.JMenuItem itemMRelatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblPeixe;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spinPeso;
    private javax.swing.JTable tableCarrinho;
    private javax.swing.JTextField txtDisponivel;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
