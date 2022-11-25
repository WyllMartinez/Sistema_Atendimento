
package br.com.controlaratendimento.views;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public Principal() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(950, 700);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuCadastro = new javax.swing.JMenu();
        cadastrarMedico = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        cadastrarPaciente = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        consultarMedico = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        consultarPaciente = new javax.swing.JMenuItem();
        menuAtendimento = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu9.setText("File");
        jMenuBar2.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar2.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jMenu4.setText("Cadastro");

        menuCadastro.setText("Médico");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        cadastrarMedico.setText("Cadastrar");
        cadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarMedico);

        jMenu4.add(menuCadastro);

        jMenu7.setText("Paciente");

        cadastrarPaciente.setText("Cadastrar");
        cadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPacienteActionPerformed(evt);
            }
        });
        jMenu7.add(cadastrarPaciente);

        jMenu4.add(jMenu7);

        jMenuBar1.add(jMenu4);

        menuConsultar.setText("Consultar");

        jMenu13.setText("Médico");

        consultarMedico.setText("Consultar");
        consultarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMedicoActionPerformed(evt);
            }
        });
        jMenu13.add(consultarMedico);

        menuConsultar.add(jMenu13);

        jMenu14.setText("Paciente");

        consultarPaciente.setText("Consultar");
        consultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPacienteActionPerformed(evt);
            }
        });
        jMenu14.add(consultarPaciente);

        menuConsultar.add(jMenu14);

        jMenuBar1.add(menuConsultar);

        menuAtendimento.setText("Atendimento");

        jMenu5.setText("Fila ");

        jMenuItem5.setText("Adicionar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        menuAtendimento.add(jMenu5);

        jMenuBar1.add(menuAtendimento);

        setJMenuBar(jMenuBar1);

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

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_menuCadastroActionPerformed

    private void cadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarMedicoActionPerformed
        // TODO add your handling code here:
        new CadastrarMedico().setVisible(true);

    }//GEN-LAST:event_cadastrarMedicoActionPerformed

    private void cadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPacienteActionPerformed
        // TODO add your handling code here:
        new CadastrarPaciente().setVisible(true);
    }//GEN-LAST:event_cadastrarPacienteActionPerformed

    private void consultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPacienteActionPerformed
        // TODO add your handling code here:

        new ConsultaPaciente().setVisible(true);
    }//GEN-LAST:event_consultarPacienteActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        AdicionarFila adcFila = new AdicionarFila();
        adcFila.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void consultarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMedicoActionPerformed
        // TODO add your handling code here:
        new ConsultaMedico().setVisible(true);

    }//GEN-LAST:event_consultarMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarMedico;
    private javax.swing.JMenuItem cadastrarPaciente;
    private javax.swing.JMenuItem consultarMedico;
    private javax.swing.JMenuItem consultarPaciente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsultar;
    // End of variables declaration//GEN-END:variables
}
