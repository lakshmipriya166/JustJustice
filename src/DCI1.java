
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DCI1 extends javax.swing.JFrame {

    /**
     * Creates new form DCI
     */
    public DCI1() {
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("OS NO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 63, 24);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("CLIENT'S NAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 160, 140, 24);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("FATHER'S NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 230, 148, 24);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("RESIDENTIAL ADDRESS:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(396, 296, 212, 24);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("PERMANENT ADDRESS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(57, 296, 209, 24);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("MOBILE NUMBER:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 190, 155, 24);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("EMAIL ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 243, 79, 24);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("IA NUMBER:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 100, 103, 24);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setText("UNDERSECTION:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 140, 149, 24);

        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 88, 41));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 100, 131, 25);

        jTextField2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 88, 41));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 160, 131, 21);

        jTextField3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 88, 41));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 230, 127, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 88, 41));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(57, 335, 218, 101);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(153, 88, 41));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(396, 335, 208, 101);

        jTextField4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 88, 41));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(550, 94, 120, 25);

        jTextField5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(153, 88, 41));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(550, 138, 120, 25);

        jTextField6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 88, 41));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(550, 184, 120, 25);

        jTextField7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 88, 41));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(550, 244, 120, 25);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton2.setText("ADD CASE DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(258, 439, 163, 27);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("CLIENT DETAILS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(218, 19, 293, 43);

        jButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(79, 34, 71, 27);

        jLabel11.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel11.setOpaque(true);
        jLabel11.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 740, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Client client=new Client(); 
        client.setOsno(jTextField1.getText());
        client.setName(jTextField2.getText());
        client.setFname(jTextField3.getText());
        client.setIano(Long.parseLong(jTextField4.getText()));
        client.setUsec(jTextField5.getText());
        client.setMno(jTextField6.getText());
        client.setEmail(jTextField7.getText());
        client.setAddr(jTextArea1.getText());
        client.setPaddr(jTextArea2.getText());
        
        client.addCivilClientDetail();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new CROPENPAGE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new CIOPENPAGE().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DCI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DCI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
