/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Juan
 */
public class VistaRequerimientosGUI extends javax.swing.JFrame {

    /**
     * Creates new form VistaRequerimientosGUI
     */
    public VistaRequerimientosGUI() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Requerimientos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnR1 = new javax.swing.JButton();
        btnR2 = new javax.swing.JButton();
        btnR3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("REQUERIMIENTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 12, -1, 24));

        btnR1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnR1.setText("R.1");
        btnR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 48, 90, 90));

        btnR2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnR2.setText("R.2");
        btnR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 156, 90, 90));

        btnR3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnR3.setText("R.3");
        btnR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 264, 90, 90));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REQUERIMIENTO #1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, -1, 31));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REQUERIMIENTO #2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, -1, 31));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REQUERIMIENTO #3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 31));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR1ActionPerformed
        // TODO add your handling code here:
        VistaRequerimiento1 vr = new VistaRequerimiento1();
        vr.setVisible(true);
    }//GEN-LAST:event_btnR1ActionPerformed

    private void btnR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR2ActionPerformed
        // TODO add your handling code here:
        VistaRequerimiento2 vr = new VistaRequerimiento2();
        vr.setVisible(true);
    }//GEN-LAST:event_btnR2ActionPerformed

    private void btnR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR3ActionPerformed
        // TODO add your handling code here:
        VistaRequerimiento3 vr = new VistaRequerimiento3();
        vr.setVisible(true);
    }//GEN-LAST:event_btnR3ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaRequerimientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRequerimientosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRequerimientosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnR1;
    private javax.swing.JButton btnR2;
    private javax.swing.JButton btnR3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
