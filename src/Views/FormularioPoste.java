/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.Coneccao;
import Control.ControlePoste;
import Model.ModeloPoste;

/**
 *
 * @author trindade
 */
public class FormularioPoste extends javax.swing.JFrame {

    ModeloPoste mod =   new ModeloPoste();
    ControlePoste control = new ControlePoste();
    Coneccao conex = new Coneccao();
    
    
    
    public FormularioPoste() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlEtiquetaPoste = new javax.swing.JLabel();
        jlAlturaPoste = new javax.swing.JLabel();
        jlMaterialPoste = new javax.swing.JLabel();
        jcbMaterialPoste = new javax.swing.JComboBox<>();
        jtfEtiquetaPoste = new javax.swing.JTextField();
        jtfAlturaPoste = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfLatitude = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLongitude = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPontoDistribucao = new javax.swing.JTextField();
        jbSalvarCadastroPoste = new javax.swing.JButton();
        jbCancelarCadastroPoste = new javax.swing.JButton();
        jbExcluirCadastroPoste = new javax.swing.JButton();
        jbNovoCadastroPoste = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePostesCadastrados = new javax.swing.JTable();
        jtfPesquisarPostes = new javax.swing.JTextField();
        jbPesquisarPostes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlEtiquetaPoste.setText("Etiqueta:");

        jlAlturaPoste.setText("Altura:");

        jlMaterialPoste.setText("Material:");

        jcbMaterialPoste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madeira", "Metal", "Concreto" }));

        jtfEtiquetaPoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEtiquetaPosteActionPerformed(evt);
            }
        });

        jLabel2.setText("Latitude:");

        jLabel3.setText("Longitude:");

        jLabel4.setText("Ponto de Distribuição:");

        jtfPontoDistribucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPontoDistribucaoActionPerformed(evt);
            }
        });

        jbSalvarCadastroPoste.setText("Salvar");
        jbSalvarCadastroPoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarCadastroPosteActionPerformed(evt);
            }
        });

        jbCancelarCadastroPoste.setText("Cancelar");
        jbCancelarCadastroPoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCadastroPosteActionPerformed(evt);
            }
        });

        jbExcluirCadastroPoste.setText("Excluir");

        jbNovoCadastroPoste.setText("Novo");
        jbNovoCadastroPoste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoCadastroPosteActionPerformed(evt);
            }
        });

        jTablePostesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePostesCadastrados);

        jbPesquisarPostes.setText("Pesquisar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlEtiquetaPoste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEtiquetaPoste)
                        .addGap(18, 18, 18)
                        .addComponent(jlAlturaPoste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfAlturaPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlMaterialPoste)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfLongitude)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbMaterialPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPontoDistribucao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtfPesquisarPostes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jbPesquisarPostes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jbSalvarCadastroPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovoCadastroPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelarCadastroPoste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluirCadastroPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAlturaPoste)
                            .addComponent(jtfAlturaPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEtiquetaPoste)
                            .addComponent(jtfEtiquetaPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfPontoDistribucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMaterialPoste)
                    .addComponent(jcbMaterialPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisarPostes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarPostes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarCadastroPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovoCadastroPoste, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelarCadastroPoste)
                    .addComponent(jbExcluirCadastroPoste))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Cadastro de Postes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setSize(new java.awt.Dimension(620, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEtiquetaPosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEtiquetaPosteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEtiquetaPosteActionPerformed

    private void jtfPontoDistribucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPontoDistribucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPontoDistribucaoActionPerformed

    private void jbSalvarCadastroPosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarCadastroPosteActionPerformed
        // floa
        mod.setEtiqueta(Integer.parseInt(jtfEtiquetaPoste.getText()));
        mod.setAltura(Float.parseFloat(jtfAlturaPoste.getText()));
        mod.setLatitude(Float.parseFloat(jtfLatitude.getText()));
        mod.setLongitude(Float.parseFloat(jtfLongitude.getText()));
        mod.setP_D_etiqueta(Float.parseFloat(jtfPontoDistribucao.getText()));
        mod.setMaterial((String) jcbMaterialPoste.getSelectedItem());
        control.Salvar(mod);
    }//GEN-LAST:event_jbSalvarCadastroPosteActionPerformed

    private void jbNovoCadastroPosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoCadastroPosteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNovoCadastroPosteActionPerformed

    private void jbCancelarCadastroPosteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCadastroPosteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarCadastroPosteActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPoste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPoste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPoste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPoste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPoste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePostesCadastrados;
    private javax.swing.JButton jbCancelarCadastroPoste;
    private javax.swing.JButton jbExcluirCadastroPoste;
    private javax.swing.JButton jbNovoCadastroPoste;
    private javax.swing.JButton jbPesquisarPostes;
    private javax.swing.JButton jbSalvarCadastroPoste;
    private javax.swing.JComboBox<String> jcbMaterialPoste;
    private javax.swing.JLabel jlAlturaPoste;
    private javax.swing.JLabel jlEtiquetaPoste;
    private javax.swing.JLabel jlMaterialPoste;
    private javax.swing.JTextField jtfAlturaPoste;
    private javax.swing.JTextField jtfEtiquetaPoste;
    private javax.swing.JTextField jtfLatitude;
    private javax.swing.JTextField jtfLongitude;
    private javax.swing.JTextField jtfPesquisarPostes;
    private javax.swing.JTextField jtfPontoDistribucao;
    // End of variables declaration//GEN-END:variables
}
