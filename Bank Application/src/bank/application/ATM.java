package bank.application;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends javax.swing.JFrame {
    BankModel bankDetailAccessObj = new BankModel();
    public ATM(BankModel bankDetail) { 
        initComponents();
        bankDetailAccessObj = bankDetail;
        setVisible(true);
        ImageIcon icon = new ImageIcon("src\\images\\atm.jpg");      
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon sacledIcon = new ImageIcon(imgScale);
        lblPic.setIcon(sacledIcon);
        labelID.setText("Welcome ! " + bankDetail.getName() + " "+bankDetail.getFatherName());
        
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
             dispose();
            }
        });
        
        btnWithdraw.addActionListener(new ActionListener() {
             public void actionPerformed (ActionEvent e) {
                dispose();
                new WithdrawalView(bankDetailAccessObj);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFastWithdraw = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnCredit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 660));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFastWithdraw.setBackground(java.awt.Color.black);
        btnFastWithdraw.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnFastWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnFastWithdraw.setText("Fast Withdraw");
        btnFastWithdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFastWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFastWithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(btnFastWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 140, -1));

        btnBalance.setBackground(java.awt.Color.black);
        btnBalance.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBalance.setForeground(new java.awt.Color(255, 255, 255));
        btnBalance.setText("Balance Inquiry");
        btnBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, -1));

        btnWithdraw.setBackground(java.awt.Color.black);
        btnWithdraw.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw Ammount");
        btnWithdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        btnCredit.setBackground(java.awt.Color.black);
        btnCredit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCredit.setForeground(new java.awt.Color(255, 255, 255));
        btnCredit.setText("Credit Ammount");
        btnCredit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditActionPerformed(evt);
            }
        });
        getContentPane().add(btnCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 120, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 255));
        btnExit.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 70, 20));

        labelID.setBackground(new java.awt.Color(0, 0, 0));
        labelID.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));
        labelID.setText("Welcome ! Husnain Naeem ");
        getContentPane().add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceActionPerformed
        dispose();
        new BalanceView(bankDetailAccessObj);
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditActionPerformed
      
        dispose();
        new CreditView(bankDetailAccessObj);
    }//GEN-LAST:event_btnCreditActionPerformed

    private void btnFastWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFastWithdrawActionPerformed
       
    }//GEN-LAST:event_btnFastWithdrawActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCredit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFastWithdraw;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
