package CIH.Cadastrar;

import CCI.GerenciadorCIH;
import CDP.Fornecedor;
import CDP.Item;
import CDP.Peixe;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author gkrause
 */
public class CadastrarItem extends javax.swing.JFrame
{

    private GerenciadorCIH gerCCI;
    private Boolean flag;
    private Item item;

    /**
     * Creates new form Cadastrar_Produto
     */
    public CadastrarItem(java.awt.Frame parent, boolean modal, GerenciadorCIH ger, Boolean flag)
    {
        this.setLocationRelativeTo(null);
        gerCCI = ger;
        initComponents();
        this.flag = flag;
        this.setResizable(false);

        if (flag == true)
        {
            btnSalvar.setVisible(false);

        } else
        {
            btnCadastrar.setVisible(false);
            btnCadastrar.setVisible(false);
            btnNovoForn.setVisible(false);
            btnNovoPeixe.setVisible(false);
        }
    }

    public CadastrarItem(java.awt.Frame parent, boolean modal, GerenciadorCIH ger, Boolean flag, Item item)
    {
        this.setLocationRelativeTo(null);
        gerCCI = ger;
        initComponents();
        this.setResizable(false);
        this.flag = flag;
        this.item = item;

        if (flag == true)
        {
            btnSalvar.setVisible(false);

        } else
        {
            btnCadastrar.setVisible(false);
            btnNovoForn.setVisible(false);
            btnNovoPeixe.setVisible(false);
        }

        txtCodigo.setText(String.valueOf(item.getCodigo()));
        txtData.setText(item.getDateStr());
        cbxFornecedor.setSelectedItem(item.getFornecedor());
        cbxPeixe.setSelectedItem(item.getPeixe());
        spinPeso.setValue(item.getPeso());
        spinPreco.setValue(item.getPrecoCompra());
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
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPeixe = new javax.swing.JLabel();
        cbxPeixe = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblPeso = new javax.swing.JLabel();
        spinPeso = new javax.swing.JSpinner();
        lblKg = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        spinPreco = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnNovoPeixe = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovoForn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Item"));

        lblCodigo.setText("Código:");

        txtCodigo.setEditable(false);

        lblPeixe.setText("Peixe:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblPeso.setText("Peso:");

        spinPeso.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.5f));

        lblKg.setText("Kg");

        lblData.setText("Data:");

        try
        {
            javax.swing.text.MaskFormatter data =
            new javax.swing.text.MaskFormatter("##/##/####");
            txtData = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e)
        {
        }
        txtData.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtDataActionPerformed(evt);
            }
        });

        lblFornecedor.setText("Fornecedor:");

        lblPreco.setText("Preço/Kg da Compra:");

        spinPreco.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.5f));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFornecedor)
                    .addComponent(lblPeixe)
                    .addComponent(lblCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxPeixe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addComponent(cbxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco)
                            .addComponent(lblData))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKg)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFornecedor)
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPeso)
                                .addComponent(spinPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblKg)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco)
                            .addComponent(spinPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeixe))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/limpar.png"))); // NOI18N
        btnLimpar.setPreferredSize(new java.awt.Dimension(50, 30));
        btnLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar);

        btnNovoPeixe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/add.png"))); // NOI18N
        btnNovoPeixe.setText("Peixe");
        btnNovoPeixe.setPreferredSize(new java.awt.Dimension(140, 30));
        btnNovoPeixe.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoPeixeActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovoPeixe);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/calcelar.png"))); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/add.png"))); // NOI18N
        btnCadastrar.setMnemonic('C');
        btnCadastrar.setText("Item");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/salvar.png"))); // NOI18N
        btnSalvar.setMnemonic('A');
        btnSalvar.setPreferredSize(new java.awt.Dimension(50, 30));
        btnSalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);

        btnNovoForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/add.png"))); // NOI18N
        btnNovoForn.setText("Fornecedor");
        btnNovoForn.setPreferredSize(new java.awt.Dimension(140, 30));
        btnNovoForn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoFornActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovoForn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtDataActionPerformed
    {//GEN-HEADEREND:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CadastrarItem.this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        try
        {
            Fornecedor fornecedor = (Fornecedor) cbxFornecedor.getSelectedItem();
            Peixe peixe = (Peixe) cbxPeixe.getSelectedItem();
            String custoVariavel = cbxPeixe.getSelectedItem().toString();
            float peso = (float) spinPeso.getValue();
            float precoKg = (float) spinPreco.getValue();
            float precoTotal = peso * precoKg;
            peixe.setQtdEstoque(peixe.getQtdEstoque() + peso);

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(txtData.getText());

            if (((JButton) evt.getSource()).getMnemonic() == 'C')
            {
                int idItem = gerCCI.getGerCDP().inserirItem(precoKg, custoVariavel, precoTotal, peso, data, fornecedor, peixe);
                JOptionPane.showMessageDialog(this, "Item " + idItem + " inserido com sucesso.");

            } else
            {
                int idItem = gerCCI.getGerCDP().alterarItem(item.getCodigo(), item.getCustoVariavel().getCodigo(), precoKg, custoVariavel, precoTotal, peso, data, fornecedor, peixe);
                JOptionPane.showMessageDialog(this, "Item " + idItem + " alterado com sucesso.");

            }
        } catch (SQLException | ClassNotFoundException | HeadlessException erro)
        {
            JOptionPane.showMessageDialog(this, "ERRO não previsto! " + erro.getMessage());
        } catch (ParseException erro)
        {
            JOptionPane.showMessageDialog(this, "ERRO! " + erro.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimparActionPerformed
    {//GEN-HEADEREND:event_btnLimparActionPerformed
        spinPeso.setValue(0);
        spinPreco.setValue(0);
        txtData.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        gerCCI.carregarComboFornecedor(cbxFornecedor);
        gerCCI.carregarComboPeixe(cbxPeixe);
        if (this.flag == false)
        {
            cbxFornecedor.setSelectedItem(item.getFornecedor());
            cbxPeixe.setSelectedItem(item.getPeixe());
        }
    }//GEN-LAST:event_formComponentShown

    private void btnNovoFornActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoFornActionPerformed
    {//GEN-HEADEREND:event_btnNovoFornActionPerformed
        gerCCI.janelaCadFornecedor();

    }//GEN-LAST:event_btnNovoFornActionPerformed

    private void btnNovoPeixeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoPeixeActionPerformed
    {//GEN-HEADEREND:event_btnNovoPeixeActionPerformed
        gerCCI.janelaCadPeixe();

    }//GEN-LAST:event_btnNovoPeixeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovoForn;
    private javax.swing.JButton btnNovoPeixe;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JComboBox<String> cbxPeixe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblPeixe;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JSpinner spinPeso;
    private javax.swing.JSpinner spinPreco;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
