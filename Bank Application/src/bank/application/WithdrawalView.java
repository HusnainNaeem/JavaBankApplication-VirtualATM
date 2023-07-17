package bank.application;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WithdrawalView extends javax.swing.JFrame {
    Controller controller = new Controller ();
    public WithdrawalView(BankModel bankDetail) {
        initComponents();
        setVisible(true);
        ImageIcon icon = new ImageIcon("src\\images\\atm.jpg");      
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon sacledIcon = new ImageIcon(imgScale);
        lblPic.setIcon(sacledIcon);
        btnBack.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e ) {
                dispose();
                new ATM(bankDetail);
            }
        });
        btnEnter.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e ) {
                if(bankDetail.debitBalance(Double.parseDouble(balanceTextField.getText()))){
                   controller.updateBalance(bankDetail);
                   dispose();
                   JOptionPane.showMessageDialog(null,"Your Withdrawl Has Been Performed Successfully! ","Withdrawl Successfull" ,JOptionPane.INFORMATION_MESSAGE);
                   dispose();
                   new ATM(bankDetail);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER THE AMMOUNT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 140, -1));

        balanceTextField.setBackground(new java.awt.Color(0, 0, 0));
        balanceTextField.setForeground(new java.awt.Color(255, 255, 255));
        balanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(balanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 220, 20));

        btnEnter.setBackground(new java.awt.Color(0, 153, 0));
        btnEnter.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 70, 20));

        btnBack.setBackground(new java.awt.Color(0, 0, 204));
        btnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 70, 20));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void balanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTextFieldActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
