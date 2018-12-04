/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ControlDAO.Coneccao;
import ControlDAO.ControleCaixa;
import Model.ModeloCaixa;

/**
 *
 * @author trindade
 */
public class FormularioCaixa extends javax.swing.JFrame {

    ModeloCaixa mod =   new ModeloCaixa();
    ControleCaixa control = new ControleCaixa();
    Coneccao conex = new Coneccao();
    
    /**
     * Creates new form FormularioCaixa
     */
    
    public FormularioCaixa() {
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

        jPanelTipoCaixa = new javax.swing.JPanel();
        jlEtiquetaCaixa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPotencia = new javax.swing.JLabel();
        jLabelLatitude = new javax.swing.JLabel();
        jLabelLongitude = new javax.swing.JLabel();
        jtfEtiquetaCaixa = new javax.swing.JTextField();
        jtfPotenciaCaixa = new javax.swing.JTextField();
        jtfLatitudeCaixa = new javax.swing.JTextField();
        jtfLongitudeCaixa = new javax.swing.JTextField();
        jbSalvarCadastroPDistribuicao = new javax.swing.JButton();
        jbNovoCadastroPDistribuicao = new javax.swing.JButton();
        jbCancelarCadastroPDistribuicao = new javax.swing.JButton();
        jbExcluirCadastroPDistribuicao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfPesquisarCaixa = new javax.swing.JTextField();
        jbPesquisarPDistribuição = new javax.swing.JButton();
        jcbTipoCaixa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTipoCaixa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlEtiquetaCaixa.setText("Etiqueta:");

        jLabel2.setText("Tipo da caixa:");

        jLabelPotencia.setText("Potencia:");

        jLabelLatitude.setText("Latitude:");

        jLabelLongitude.setText("Longitude:");

        jtfEtiquetaCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEtiquetaCaixaActionPerformed(evt);
            }
        });

        jtfLatitudeCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLatitudeCaixaActionPerformed(evt);
            }
        });

        jbSalvarCadastroPDistribuicao.setText("Salvar");
        jbSalvarCadastroPDistribuicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarCadastroPDistribuicaoActionPerformed(evt);
            }
        });

        jbNovoCadastroPDistribuicao.setText("Novo");
        jbNovoCadastroPDistribuicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoCadastroPDistribuicaoActionPerformed(evt);
            }
        });

        jbCancelarCadastroPDistribuicao.setText("Cancelar");
        jbCancelarCadastroPDistribuicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCadastroPDistribuicaoActionPerformed(evt);
            }
        });

        jbExcluirCadastroPDistribuicao.setText("Excluir");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbPesquisarPDistribuição.setText("Pesquisar");
        jbPesquisarPDistribuição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarPDistribuiçãoActionPerformed(evt);
            }
        });

        jcbTipoCaixa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aérea", "Subterrânea" }));

        javax.swing.GroupLayout jPanelTipoCaixaLayout = new javax.swing.GroupLayout(jPanelTipoCaixa);
        jPanelTipoCaixa.setLayout(jPanelTipoCaixaLayout);
        jPanelTipoCaixaLayout.setHorizontalGroup(
            jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                        .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelLatitude)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfLatitudeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                                .addComponent(jLabelLongitude)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfLongitudeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfPesquisarCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisarPDistribuição)))
                        .addContainerGap())
                    .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                        .addComponent(jlEtiquetaCaixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEtiquetaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(jLabelPotencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPotenciaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTipoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jbSalvarCadastroPDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNovoCadastroPDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelarCadastroPDistribuicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluirCadastroPDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTipoCaixaLayout.setVerticalGroup(
            jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoCaixaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEtiquetaCaixa)
                            .addComponent(jtfEtiquetaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPotencia)
                            .addComponent(jtfPotenciaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbTipoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLatitude)
                            .addComponent(jtfLatitudeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLongitude)
                    .addComponent(jtfLongitudeCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPesquisarCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarPDistribuição))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvarCadastroPDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovoCadastroPDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelarCadastroPDistribuicao)
                    .addComponent(jbExcluirCadastroPDistribuicao))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pontos de Distribução");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanelTipoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTipoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEtiquetaCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEtiquetaCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEtiquetaCaixaActionPerformed

    private void jbSalvarCadastroPDistribuicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarCadastroPDistribuicaoActionPerformed
        // Salvar na caixa de inspeção
        mod.setEtiqueta(Integer.parseInt(jtfEtiquetaCaixa.getText()));
        mod.setPotencia(Float.parseFloat(jtfPotenciaCaixa.getText()));
        mod.setTipoCaixa((String) jcbTipoCaixa.getSelectedItem());     ////verificar se erro
        mod.setLatitude(Float.parseFloat(jtfLatitudeCaixa.getText()));
        mod.setLongitude(Float.parseFloat(jtfLongitudeCaixa.getText()));
                
        control.Salvar(mod);
        
    }//GEN-LAST:event_jbSalvarCadastroPDistribuicaoActionPerformed

    private void jbNovoCadastroPDistribuicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoCadastroPDistribuicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNovoCadastroPDistribuicaoActionPerformed

    private void jbCancelarCadastroPDistribuicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCadastroPDistribuicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarCadastroPDistribuicaoActionPerformed

    private void jbPesquisarPDistribuiçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarPDistribuiçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisarPDistribuiçãoActionPerformed

    private void jtfLatitudeCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLatitudeCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLatitudeCaixaActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLatitude;
    private javax.swing.JLabel jLabelLongitude;
    private javax.swing.JLabel jLabelPotencia;
    private javax.swing.JPanel jPanelTipoCaixa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCancelarCadastroPDistribuicao;
    private javax.swing.JButton jbExcluirCadastroPDistribuicao;
    private javax.swing.JButton jbNovoCadastroPDistribuicao;
    private javax.swing.JButton jbPesquisarPDistribuição;
    private javax.swing.JButton jbSalvarCadastroPDistribuicao;
    private javax.swing.JComboBox<String> jcbTipoCaixa;
    private javax.swing.JLabel jlEtiquetaCaixa;
    private javax.swing.JTextField jtfEtiquetaCaixa;
    private javax.swing.JTextField jtfLatitudeCaixa;
    private javax.swing.JTextField jtfLongitudeCaixa;
    private javax.swing.JTextField jtfPesquisarCaixa;
    private javax.swing.JTextField jtfPotenciaCaixa;
    // End of variables declaration//GEN-END:variables
}
