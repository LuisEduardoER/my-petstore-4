package petstore;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class PesquisarCliente extends javax.swing.JFrame {

    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Id Cliente", "Nome", "Data Nascimento", "Sexo", "Estado Civil", "Profissão", "RG", "CPF", "Logradouro", "Endereco", "Número", "Bairro", "CEP", "Cidade", "UF", "Telefone Res", "Telefone Com", "Celular", "Email"});
    List<Cliente> cliente;
    ListSelectionModel lsmCliente;

    public PesquisarCliente() throws SQLException {
        initComponents();
        mostrarTodosClientes();
    }

    public PesquisarCliente(String nome) throws SQLException {
        initComponents();
        mostrarTodosClientes();
        if (nome != null && !nome.equals("")) {
            ClienteDao dao = new ClienteDao();
            mostraPesquisa(dao.getLista(nome));
        } else {
            mostrarTodosClientes();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Cliente");

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setText("Pesquisar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnHome.setText("Voltar para Home");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setFocusable(false);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeletar, btnEditar, btnHome, btnSair});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletar)
                    .addComponent(btnEditar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHome)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNome.setText("Nome");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabela.setModel(tmCliente);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
    }//GEN-LAST:event_TabelaMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            listarCliente();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas com o campo de pesquisa" + ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (Tabela.getSelectedRow() != -1) {
            Cliente clienteParaEditar = new Cliente();
            clienteParaEditar.setId_cliente(Long.valueOf(Tabela.getValueAt(Tabela.getSelectedRow(), 0).toString()));
            clienteParaEditar.setNome(Tabela.getValueAt(Tabela.getSelectedRow(), 1).toString());
            clienteParaEditar.setData_nasc(Tabela.getValueAt(Tabela.getSelectedRow(), 2).toString());
            clienteParaEditar.setSexo(Tabela.getValueAt(Tabela.getSelectedRow(), 3).toString());
            clienteParaEditar.setEstado_civil(Tabela.getValueAt(Tabela.getSelectedRow(), 4).toString());
            clienteParaEditar.setProfissao(Tabela.getValueAt(Tabela.getSelectedRow(), 5).toString());
            clienteParaEditar.setRg(Tabela.getValueAt(Tabela.getSelectedRow(), 6).toString());
            clienteParaEditar.setCpf(Tabela.getValueAt(Tabela.getSelectedRow(), 7).toString());
            clienteParaEditar.setLogradouro(Tabela.getValueAt(Tabela.getSelectedRow(), 8).toString());
            clienteParaEditar.setEndereco(Tabela.getValueAt(Tabela.getSelectedRow(), 9).toString());
            clienteParaEditar.setNumero(Long.valueOf(Tabela.getValueAt(Tabela.getSelectedRow(), 10).toString()));
            clienteParaEditar.setBairro(Tabela.getValueAt(Tabela.getSelectedRow(), 11).toString());
            clienteParaEditar.setCep(Tabela.getValueAt(Tabela.getSelectedRow(), 12).toString());
            clienteParaEditar.setCidade(Tabela.getValueAt(Tabela.getSelectedRow(), 13).toString());
            clienteParaEditar.setUf(Tabela.getValueAt(Tabela.getSelectedRow(), 14).toString());
            clienteParaEditar.setTel_res(Tabela.getValueAt(Tabela.getSelectedRow(), 15).toString());
            clienteParaEditar.setTel_com(Tabela.getValueAt(Tabela.getSelectedRow(), 16).toString());
            clienteParaEditar.setCelular(Tabela.getValueAt(Tabela.getSelectedRow(), 17).toString());
            clienteParaEditar.setEmail(Tabela.getValueAt(Tabela.getSelectedRow(), 18).toString());
            new EditarCliente(clienteParaEditar).show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para editar", "Editar Cliente", 1);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home().show();
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            excluirCadastro();
        } catch (SQLException ex) {
            Logger.getLogger(PesquisarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PesquisarCliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void mostrarTodosClientes() throws SQLException {
        ClienteDao dao = new ClienteDao();
        cliente = dao.getLista();
        if (cliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado");
        } else {
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cliente.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(cliente.get(i).getId_cliente(), i, 0);
                tmCliente.setValueAt(cliente.get(i).getNome(), i, 1);
                tmCliente.setValueAt(cliente.get(i).getData_nasc(), i, 2);
                tmCliente.setValueAt(cliente.get(i).getSexo(), i, 3);
                tmCliente.setValueAt(cliente.get(i).getEstado_civil(), i, 4);
                tmCliente.setValueAt(cliente.get(i).getProfissao(), i, 5);
                tmCliente.setValueAt(cliente.get(i).getRg(), i, 6);
                tmCliente.setValueAt(cliente.get(i).getCpf(), i, 7);
                tmCliente.setValueAt(cliente.get(i).getLogradouro(), i, 8);
                tmCliente.setValueAt(cliente.get(i).getEndereco(), i, 9);
                tmCliente.setValueAt(cliente.get(i).getNumero(), i, 10);
                tmCliente.setValueAt(cliente.get(i).getBairro(), i, 11);
                tmCliente.setValueAt(cliente.get(i).getCep(), i, 12);
                tmCliente.setValueAt(cliente.get(i).getCidade(), i, 13);
                tmCliente.setValueAt(cliente.get(i).getUf(), i, 14);
                tmCliente.setValueAt(cliente.get(i).getTel_res(), i, 15);
                tmCliente.setValueAt(cliente.get(i).getTel_com(), i, 16);
                tmCliente.setValueAt(cliente.get(i).getCelular(), i, 17);
                tmCliente.setValueAt(cliente.get(i).getEmail(), i, 18);
            }
        }
    }

    private void listarCliente() throws SQLException {
        ClienteDao dao = new ClienteDao();
        cliente = dao.getLista(txtNome.getText());
        mostraPesquisa(cliente);
    }

    private void mostraPesquisa(List<Cliente> cliente) throws SQLException {
        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
        if (cliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado");
        } else {
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < cliente.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(cliente.get(i).getId_cliente(), i, 0);
                tmCliente.setValueAt(cliente.get(i).getNome(), i, 1);
                tmCliente.setValueAt(cliente.get(i).getData_nasc(), i, 2);
                tmCliente.setValueAt(cliente.get(i).getSexo(), i, 3);
                tmCliente.setValueAt(cliente.get(i).getEstado_civil(), i, 4);
                tmCliente.setValueAt(cliente.get(i).getProfissao(), i, 5);
                tmCliente.setValueAt(cliente.get(i).getRg(), i, 6);
                tmCliente.setValueAt(cliente.get(i).getCpf(), i, 7);
                tmCliente.setValueAt(cliente.get(i).getLogradouro(), i, 8);
                tmCliente.setValueAt(cliente.get(i).getEndereco(), i, 9);
                tmCliente.setValueAt(cliente.get(i).getNumero(), i, 10);
                tmCliente.setValueAt(cliente.get(i).getBairro(), i, 11);
                tmCliente.setValueAt(cliente.get(i).getCep(), i, 12);
                tmCliente.setValueAt(cliente.get(i).getCidade(), i, 13);
                tmCliente.setValueAt(cliente.get(i).getUf(), i, 14);
                tmCliente.setValueAt(cliente.get(i).getTel_res(), i, 15);
                tmCliente.setValueAt(cliente.get(i).getTel_com(), i, 16);
                tmCliente.setValueAt(cliente.get(i).getCelular(), i, 17);
                tmCliente.setValueAt(cliente.get(i).getEmail(), i, 18);
            }
        }
    }

    private void excluirCadastro() throws SQLException {
        if (Tabela.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir cadastro do cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                ClienteDao dao = new ClienteDao();
                dao.remove(cliente.get(Tabela.getSelectedRow()));
                listarCliente();
                JOptionPane.showMessageDialog(this, "Excluido com sucesso", "Exclusão", 1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para excluir", "Excluir Cadastro de Cliente", 1);
        }
    }
}
