
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class FCIVIL extends javax.swing.JFrame {

    /**
     * Creates new form FCIVIL
     */
    public FCIVIL() {
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

        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 202, 127, 23);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("EMAIL ID:");
        jLabel7.setEnabled(false);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(379, 253, 110, 24);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("MOBILE NUMBER:");
        jLabel6.setEnabled(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(375, 202, 190, 24);

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(560, 151, 120, 23);

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 151, 127, 23);

        jScrollPane1.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 354, 218, 91);

        jTextField7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField7.setEnabled(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(560, 253, 120, 23);

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 81, 131, 23);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton1.setText("ALTER CLIENT DETAIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 81, 200, 27);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("CLIENT'S NAME:");
        jLabel2.setEnabled(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 151, 170, 24);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("FATHER'S NAME:");
        jLabel3.setEnabled(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 202, 170, 20);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("ENTER OS NO.:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 81, 135, 24);

        jScrollPane2.setEnabled(false);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 354, 208, 91);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton2.setText("OK");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 81, 53, 27);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField4.setEnabled(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(184, 253, 127, 23);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("IA NUMBER:");
        jLabel8.setEnabled(false);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 253, 150, 24);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setText("UNDERSECTION:");
        jLabel9.setEnabled(false);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(379, 151, 180, 24);

        jTextField6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(560, 202, 120, 23);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("ADDRESS:");
        jLabel4.setEnabled(false);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 314, 91, 24);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("PERMANENT ADDRESS:");
        jLabel5.setEnabled(false);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 314, 209, 24);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setText("CLIENT DETAILS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 20, 293, 43);

        jButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(40, 20, 71, 27);

        jLabel.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel.setOpaque(true);
        jLabel.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel);
        jLabel.setBounds(0, 0, 740, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String osno1=jTextField1.getText();

        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        jLabel9.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField5.setEnabled(true);
        jTextField6.setEnabled(true);
        jTextField7.setEnabled(true);
        jTextArea1.setEnabled(true);
        jTextArea2.setEnabled(true);
        jButton2.setEnabled(true);
        
        Client client=new Client();
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
            Statement s=(Statement)con.createStatement();

            String q="select * from cdet_ci where osno='"+osno1+"';";

            ResultSet rs=s.executeQuery(q);
            int x=0;
            while(rs.next())
            {
                client.setOsno(rs.getString("osno"));
                client.setName(rs.getString("cname"));
                client.setFname(rs.getString("fname"));
                client.setIano(Long.parseLong(rs.getString("iano")));
                client.setUsec(rs.getString("usec"));
                client.setMno(rs.getString("mno"));
                client.setEmail(rs.getString("email"));
                client.setAddr(rs.getString("addr"));
                client.setPaddr(rs.getString("paddr"));
                
                jTextField2.setText(client.getName());
                jTextField3.setText(client.getFname());
                jTextField4.setText(Long.toString(client.getIano()));
                jTextField5.setText(client.getUsec());
                jTextField6.setText(client.getMno());
                jTextField7.setText(client.getEmail());
                jTextArea1.setText(client.getAddr());
                jTextArea2.setText(client.getPaddr());
                x++;
            }
            if(x==0)
            JOptionPane.showMessageDialog(null,"Client detail does not exist!");
            else
            {
                JOptionPane.showMessageDialog(null,"Edit to alter Client detail!");
            }
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
     
        client.alterCivilClientDetail();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(FCIVIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCIVIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCIVIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCIVIL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCIVIL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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