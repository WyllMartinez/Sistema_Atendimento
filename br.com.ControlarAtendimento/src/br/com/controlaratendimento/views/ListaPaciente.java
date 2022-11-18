/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.controlaratendimento.views;

import br.com.controlaratendimento.models.Paciente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaPaciente extends javax.swing.JFrame {

    Paciente pacienteselecionado;

    ListaPaciente() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        informTablePaciente();
    }

    public Paciente chamaPaciente() {
        new ListaPaciente().setVisible(true);
        return pacienteselecionado;
    }

    public void informTablePaciente() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("IDade");

        for (int i = 0; i < CadastrarPaciente.p.getListagemPaciente().size(); i++) {
            modelo.addRow(new String[]{
                String.valueOf(CadastrarPaciente.p.getListagemPaciente().get(i).getId()),
                CadastrarPaciente.p.getListagemPaciente().get(i).getNome(),
                CadastrarPaciente.p.getListagemPaciente().get(i).getCpf(),
                String.valueOf(CadastrarPaciente.p.getListagemPaciente().get(i).getIdade()),});
        }
        tabelaListagemPaciente.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaListagemPaciente = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        selecionarPacienteLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaListagemPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Especialidade", "CRM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaListagemPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaListagemPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaListagemPaciente);

        selecionarPacienteLista.setBackground(new java.awt.Color(51, 204, 0));
        selecionarPacienteLista.setText("Selecionar");
        selecionarPacienteLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarPacienteListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecionarPacienteLista)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionarPacienteLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaListagemPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaListagemPacienteMouseClicked
        // TODO add your handling code here:
        if (tabelaListagemPaciente.getSelectedRow() > -1) {

        }
        tabelaListagemPaciente.getColumn(0);
        tabelaListagemPaciente.getColumn(1);
        tabelaListagemPaciente.getColumn(2);
        tabelaListagemPaciente.getColumn(3);
        tabelaListagemPaciente.getColumn(4);
        tabelaListagemPaciente.getColumn(5);
        return;

    }//GEN-LAST:event_tabelaListagemPacienteMouseClicked

    public JTable getTabelaListagemPaciente() {
        return tabelaListagemPaciente;
    }

    private void selecionarPacienteListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarPacienteListaActionPerformed

        int row = tabelaListagemPaciente.getSelectedRow();

        String codPc = String.valueOf(tabelaListagemPaciente.getValueAt(row, 0));
        String nomePc = String.valueOf(tabelaListagemPaciente.getValueAt(row, 1));
        String cpfPc = String.valueOf(tabelaListagemPaciente.getValueAt(row, 2));
        String idadePc = String.valueOf(tabelaListagemPaciente.getValueAt(row, 3));

        JOptionPane.showMessageDialog(null, "Cod" + codPc + "nome" + nomePc);

        pacienteselecionado = new Paciente();
        pacienteselecionado.setId(Integer.parseInt(codPc));
        pacienteselecionado.setNome(nomePc);
        pacienteselecionado.setCpf(cpfPc);
        pacienteselecionado.setIdade(Integer.parseInt(idadePc));

    }//GEN-LAST:event_selecionarPacienteListaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaPaciente lstPct = new ListaPaciente();
                lstPct.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton selecionarPacienteLista;
    private javax.swing.JTable tabelaListagemPaciente;
    // End of variables declaration//GEN-END:variables
}
