package bank.application;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BalanceView extends javax.swing.JFrame {
    
    public BalanceView(BankModel bankDetail) {
           initComponents();
           setVisible(true);
           ImageIcon icon = new ImageIcon("src\\images\\atm.jpg");      
           Image img = icon.getImage();
           Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
           ImageIcon sacledIcon = new ImageIcon(imgScale);
           lblPic.setIcon(sacledIcon); 
           balanceLabel.setText(bankDetail.getBalance()+" $");
           btnBack.addActionListener(new ActionListener () {
               public void actionPerformed (ActionEvent e) {
                   dispose();
                   new ATM (bankDetail);
               }
           });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balanceTextLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balanceTextLabel.setBackground(new java.awt.Color(0, 0, 0));
        balanceTextLabel.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        balanceTextLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceTextLabel.setText("Your Current Balance is : ");
        getContentPane().add(balanceTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        balanceLabel.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setText("0 $");
        getContentPane().add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        btnBack.setBackground(new java.awt.Color(0, 0, 204));
        btnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 70, 20));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 80, 20));

        lblPic.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceTextLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
