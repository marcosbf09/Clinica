/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica.View;

import Clinica.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class GerenciarDadosAdicionais extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarDadosAdicionais
     */
    public GerenciarDadosAdicionais() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botaoAdicionarDados = new javax.swing.JButton();
        botaoAlterarDados = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Área Médico"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciar Dados Adicionais dos Pacientes");

        jLabel2.setText("Digite o CPF do paciente:");

        botaoAdicionarDados.setText("Adicionar Dados");
        botaoAdicionarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarDadosActionPerformed(evt);
            }
        });

        botaoAlterarDados.setText("Alterar Dados");
        botaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarDadosActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar Dados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar(evt);
            }
        });

        jButton4.setText("Excluir Dados");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoAdicionarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarDadosActionPerformed
        // TODO add your handling code here:
        String cpf1 = jTextField1.getText();
        int cpf = Integer.parseInt(cpf1);
        AdicionarDadosAdicionais adiciona = new AdicionarDadosAdicionais();
        adiciona.chamar(cpf);
        adiciona.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_botaoAdicionarDadosActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        new TelaMedico().setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarDadosActionPerformed
        // TODO add your handling code here:
        String cpf1 = jTextField1.getText();
        int cpf = Integer.parseInt(cpf1);
        AlterarDadosAdicionais altera = new AlterarDadosAdicionais();
        altera.chamar(cpf);
        altera.setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_botaoAlterarDadosActionPerformed

    private void Consultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar
        // TODO add your handling code here:
        String cpf1 = jTextField1.getText();
        int cpf = Integer.parseInt(cpf1);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
            
        Cliente c = em.find(Cliente.class, cpf);
        
        String alergia = c.getAlergia();
        String cirurgia = c.getCirurgia();
        int colesterol = c.getColesterol();
        String doenca = c.getDoençaCardio();
        boolean bebe = c.isBebe();
        boolean diabete = c.isDiabete();
        boolean fuma = c.isFuma();
        String nome = c.getNome();
        
        StringBuffer mensagem = new StringBuffer();

            mensagem.append("DADOS ADICIONAIS DO PACIENTE: \n\nNome: "+ nome + "\nAlergias: " + alergia + "\nCirurgias: " + cirurgia + "\nColesterol: " + colesterol 
                    + "\nDoenças Cardiacas: " + doenca + "\nBebe? " + bebe + "\nFuma? " + fuma);

            JOptionPane.showMessageDialog(rootPane, mensagem);
        
        
        em.getTransaction().commit();
            
            
    }//GEN-LAST:event_Consultar

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
        // TODO add your handling code here:
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        String cpfs = jTextField1.getText();
        int cpf1 = Integer.parseInt(cpfs);
        Cliente c = em.find(Cliente.class, cpf1);
        
        c.setAlergia("");
        c.setCirurgia("");
        c.setDoençaCardio("");
        c.setDiabete(false);
        c.setColesterol(0);
        c.setFuma(false);
        c.setBebe(false);

        em.getTransaction().commit();
        
        StringBuffer mensagem = new StringBuffer();

        mensagem.append("DADOS ADICIONAIS DO PACIENTE FORAM REMOVIDOS!");

        JOptionPane.showMessageDialog(rootPane, mensagem);
    }//GEN-LAST:event_Excluir

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
            java.util.logging.Logger.getLogger(GerenciarDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarDadosAdicionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarDadosAdicionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarDados;
    private javax.swing.JButton botaoAlterarDados;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
