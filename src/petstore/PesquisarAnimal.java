package petstore;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class PesquisarAnimal extends javax.swing.JFrame {

    DefaultTableModel tmAnimal = new DefaultTableModel(null, new String[]{"Id Animal", "Proprietario", "Nome do Animal", "Apelido", "Sexo", "RGA", "Número do Documento", "Data de Nascimento", "Espécie", "Raca", "Cor", "Observações"});
    List<Animal> animal;
    ListSelectionModel lsmAnimal;

    public PesquisarAnimal() throws SQLException {
        initComponents();
        mostrarTodosAnimais();
    }

    public PesquisarAnimal(String nome) throws SQLException {
        initComponents();
        if (nome != null && !nome.equals("")) {
            AnimalDao dao = new AnimalDao();
            mostraPesquisa(dao.getLista(nome));
        } else {
            mostrarTodosAnimais();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Animal");

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setText("Pesquisar Animal");

        lblNome.setText("Nome Completo");

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
                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table.setModel(tmAnimal);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnHome.setText("Voltar para Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnHome)
                    .addComponent(btnSair)
                    .addComponent(btnDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    }//GEN-LAST:event_tableMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "ATENÇÃO ", javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    public void listarAnimal() throws SQLException {
        AnimalDao dao = new AnimalDao();
        animal = dao.getLista(txtNome.getText());
        mostraPesquisa(animal);
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            listarAnimal();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas com o campo de pesquisa" + ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (table.getSelectedRow() != -1) {
            Animal animalParaEditar = new Animal();
            animalParaEditar.setId_animal(Long.valueOf(table.getValueAt(table.getSelectedRow(), 0).toString()));
            animalParaEditar.setProprietario(table.getValueAt(table.getSelectedRow(), 1).toString());
            animalParaEditar.setNome_animal(table.getValueAt(table.getSelectedRow(), 2).toString());
            animalParaEditar.setApelido(table.getValueAt(table.getSelectedRow(), 3).toString());
            animalParaEditar.setSexo(table.getValueAt(table.getSelectedRow(), 4).toString());
            animalParaEditar.setRga(table.getValueAt(table.getSelectedRow(), 5).toString());
            animalParaEditar.setNum_doc(table.getValueAt(table.getSelectedRow(), 6).toString());
            animalParaEditar.setData_nasc(table.getValueAt(table.getSelectedRow(), 7).toString());
            animalParaEditar.setEspecie(table.getValueAt(table.getSelectedRow(), 8).toString());
            animalParaEditar.setRaca(table.getValueAt(table.getSelectedRow(), 9).toString());
            animalParaEditar.setCor(table.getValueAt(table.getSelectedRow(), 10).toString());
            animalParaEditar.setObservacoes(table.getValueAt(table.getSelectedRow(), 11).toString());
            try {
                new EditarAnimal(animalParaEditar).show();
            } catch (SQLException ex) {
                Logger.getLogger(PesquisarAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para editar", "Editar Animal", 1);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            excluirCadastro();
        } catch (SQLException ex) {
            Logger.getLogger(PesquisarAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home().show();
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PesquisarAnimal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarAnimal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void mostrarTodosAnimais() throws SQLException {
        AnimalDao dao = new AnimalDao();
        animal = dao.getLista();
        if (animal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado");
        } else {
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < animal.size(); i++) {
                tmAnimal.addRow(linha);
                tmAnimal.setValueAt(animal.get(i).getId_animal(), i, 0);
                tmAnimal.setValueAt(animal.get(i).getProprietario(), i, 1);
                tmAnimal.setValueAt(animal.get(i).getNome_animal(), i, 2);
                tmAnimal.setValueAt(animal.get(i).getApelido(), i, 3);
                tmAnimal.setValueAt(animal.get(i).getSexo(), i, 4);
                tmAnimal.setValueAt(animal.get(i).getRga(), i, 5);
                tmAnimal.setValueAt(animal.get(i).getNum_doc(), i, 6);
                tmAnimal.setValueAt(animal.get(i).getData_nasc(), i, 7);
                tmAnimal.setValueAt(animal.get(i).getEspecie(), i, 8);
                tmAnimal.setValueAt(animal.get(i).getRaca(), i, 9);
                tmAnimal.setValueAt(animal.get(i).getCor(), i, 10);
                tmAnimal.setValueAt(animal.get(i).getObservacoes(), i, 11);
                
            }
        }
    }

    private void mostraPesquisa(List<Animal> animal) throws SQLException {
        while (tmAnimal.getRowCount() > 0) {
            tmAnimal.removeRow(0);
        }
        if (animal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum animal cadastrado");
        } else {
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < animal.size(); i++) {
                tmAnimal.addRow(linha);
                tmAnimal.setValueAt(animal.get(i).getId_animal(), i, 0);
                tmAnimal.setValueAt(animal.get(i).getProprietario(), i, 1);
                tmAnimal.setValueAt(animal.get(i).getNome_animal(), i, 2);
                tmAnimal.setValueAt(animal.get(i).getApelido(), i, 3);
                tmAnimal.setValueAt(animal.get(i).getSexo(), i, 4);
                tmAnimal.setValueAt(animal.get(i).getRga(), i, 5);
                tmAnimal.setValueAt(animal.get(i).getNum_doc(), i, 6);
                tmAnimal.setValueAt(animal.get(i).getData_nasc(), i, 7);
                tmAnimal.setValueAt(animal.get(i).getEspecie(), i, 8);
                tmAnimal.setValueAt(animal.get(i).getRaca(), i, 9);
                tmAnimal.setValueAt(animal.get(i).getCor(), i, 10);
                tmAnimal.setValueAt(animal.get(i).getObservacoes(), i, 11);
            }
        }
    }

    public void listarAnimais() throws SQLException {
        AnimalDao dao = new AnimalDao();
        animal = dao.getLista(txtNome.getText());
        mostraPesquisa(animal);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void excluirCadastro() throws SQLException {
        if (table.getSelectedRow() != -1) {
            int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir cadastro do animal?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                AnimalDao dao = new AnimalDao();
                dao.remove(animal.get(table.getSelectedRow()));
                listarAnimais();
                JOptionPane.showMessageDialog(this, "Excluido com sucesso", "Exclusão", 1);
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um registro para excluir", "Excluir Cadastro de Animal", 1);
            }
        }
    }
}
