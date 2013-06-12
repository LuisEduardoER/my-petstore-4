package petstore;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class CadastrarAnimal extends javax.swing.JFrame {

    List<PreencheCombo> especie;
    List<PreencheCombo> raca;
    Long idCliente;

    public CadastrarAnimal() throws SQLException {
        initComponents();
        desabilitaDados();
        PreencherComboEspecie();
        PreencherComboRaca();
    }

    public CadastrarAnimal(Cliente cliente) throws SQLException {
        initComponents();
        desabilitaDados();
        PreencherComboEspecie();
        PreencherComboRaca();
        txtProprietario.setText(cliente.getNome());
        idCliente = cliente.getId_cliente();
        txtProprietario.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnVoltarHome = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProprietario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtApelido = new javax.swing.JTextField();
        txtRGA = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        txtPesquisar = new javax.swing.JButton();
        cmbSexo = new javax.swing.JComboBox();
        cmbEspecie = new javax.swing.JComboBox();
        cmbRaca = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtNumDoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Animal");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Animal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltarHome.setText("Voltar para Home");
        btnVoltarHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarHomeActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltarHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sair)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Sair, btnVoltarHome});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltarHome)
                    .addComponent(Sair))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Sair, btnCadastrar, btnVoltarHome});

        jLabel2.setText("ID");

        jLabel3.setText("Proprietário");

        jLabel4.setText("Nome Completo");

        jLabel5.setText("Apelido");

        jLabel6.setText("Sexo");

        jLabel7.setText("RGA");

        jLabel8.setText("Data de Nascimento");

        jLabel9.setText("Espécie");

        jLabel10.setText("Observações");

        jLabel11.setText("Cor");

        jLabel12.setText("Raça");

        txtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelidoActionPerformed(evt);
            }
        });

        txtRGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGAActionPerformed(evt);
            }
        });

        txtDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtNascActionPerformed(evt);
            }
        });

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        txtPesquisar.setText("Pesquisar");
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Feminino", "Masculino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        cmbEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecieActionPerformed(evt);
            }
        });

        cmbRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRacaActionPerformed(evt);
            }
        });

        jLabel13.setText("Número de Documento");

        txtNumDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDtNasc)
                    .addComponent(txtCor)
                    .addComponent(jScrollPane1)
                    .addComponent(cmbRaca, 0, 388, Short.MAX_VALUE)
                    .addComponent(cmbEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumDoc))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRGA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbEspecie, cmbRaca, cmbSexo, jScrollPane1, txtApelido, txtCor, txtDtNasc, txtId, txtNome, txtNumDoc, txtRGA});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtRGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbEspecie, cmbRaca, cmbSexo, txtApelido, txtCor, txtDtNasc, txtId, txtNome, txtNumDoc, txtProprietario, txtRGA});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed

    private void txtRGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGAActionPerformed

    private void txtDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtNascActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtNumDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDocActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "ATENÇÂO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_SairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (verificaDados()) {
            cadastro();
            new Home().show();
            dispose();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed

        PesquisarClienteCadastro pesquisar;
        try {
            pesquisar = new PesquisarClienteCadastro(txtProprietario.getText());
            pesquisar.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void cmbEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecieActionPerformed
        try {
            PreencherComboRaca();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbEspecieActionPerformed

    private void cmbRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRacaActionPerformed
    }//GEN-LAST:event_cmbRacaActionPerformed

    private void btnVoltarHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarHomeActionPerformed
        new Home().show();
        dispose();
    }//GEN-LAST:event_btnVoltarHomeActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
    }//GEN-LAST:event_cmbSexoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new CadastrarAnimal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastrarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarHome;
    private javax.swing.JComboBox cmbEspecie;
    private javax.swing.JComboBox cmbRaca;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JButton txtPesquisar;
    private javax.swing.JTextField txtProprietario;
    private javax.swing.JTextField txtRGA;
    // End of variables declaration//GEN-END:variables

    private boolean verificaDados() {
        if (!txtNome.getText().equals("") && !txtProprietario.getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Falta campos a ser preenchido", "Informação", 2);
            return false;
        }
    }

    private void cadastro() {
        try {
            Animal animal = new Animal();

            animal.setProprietario(txtProprietario.getText());
            animal.setNome_animal(txtNome.getText());
            animal.setApelido(txtApelido.getText());

            //Pega o valor da ComboBox Sexo 
            animal.setSexo(cmbSexo.getSelectedItem().toString());

            animal.setRga(txtRGA.getText());
            animal.setNum_doc(txtNumDoc.getText());
            animal.setData_nasc(txtDtNasc.getText());

            //Pega o valor da ComboBox Especie 
            animal.setEspecie(cmbEspecie.getSelectedItem().toString());

            //Pega o valor da ComboBox Raca 
            animal.setRaca(cmbRaca.getSelectedItem().toString());

            animal.setCor(txtCor.getText());
            animal.setObservacoes(txtObservacoes.getText());

            animal.setId_cliente(idCliente);
            AnimalDao dao = new AnimalDao();
            dao.adiciona(animal);
            JOptionPane.showMessageDialog(null, "Animal inserido com sucesso", "Informação", 1);
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao cadastrar novo animal" + ex);
        }
    }

    public void desabilitaDados() {
        txtId.setEditable(false);
    }

    public void limparCampos() {
        txtId.setText("");
        txtProprietario.setText("");
        txtNome.setText("");
        txtApelido.setText("");
        cmbSexo.setSelectedIndex(1);
        txtRGA.setText("");
        txtNumDoc.setText("");
        txtDtNasc.setText("");
        cmbEspecie.setSelectedIndex(1);
        cmbRaca.setSelectedIndex(1);
        txtCor.setText("");
        txtObservacoes.setText("");
    }

    public void PreencherComboEspecie() throws SQLException {
        PreencheComboDao dao = new PreencheComboDao();
        especie = dao.getListaEspecie();
        mostraPesquisaEspecie(especie);
    }

    private void mostraPesquisaEspecie(List<PreencheCombo> especie) throws SQLException {
        for (int i = 0; i < especie.size(); i++) {
            cmbEspecie.addItem(especie.get(i).getEspecie());
        }
    }

    public void PreencherComboRaca() throws SQLException {
        cmbRaca.removeAllItems();
        PreencheComboDao dao = new PreencheComboDao();
        if (cmbEspecie.getSelectedItem().equals("Canina")) {
            raca = dao.getListaCanina();
        } else {
            raca = dao.getListaFelina();
        }
        mostraPesquisaRaca(raca);
    }

    private void mostraPesquisaRaca(List<PreencheCombo> raca) throws SQLException {
        for (int i = 0; i < raca.size(); i++) {
            cmbRaca.addItem(raca.get(i).getRaca());
        }
    }
}
