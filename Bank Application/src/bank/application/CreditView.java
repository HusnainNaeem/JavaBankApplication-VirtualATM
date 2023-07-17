package bank.application;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class CreditView extends javax.swing.JFrame {
    Controller controller = new Controller();
    public CreditView(BankModel bankDetail) {
        initComponents();
        setVisible(true);
        ImageIcon icon = new ImageIcon("src\\images\\atm.jpg");      
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon sacledIcon = new ImageIcon(imgScale);
        lblPic.setIcon(sacledIcon);
        
        btnEnter.addActionListener(new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                dispose();
                bankDetail.creditBalanace(Double.parseDouble(ammountTextField.getText()));
                controller.updateBalance(bankDetail);
                JOptionPane.showMessageDialog(null,"Ammount Credit Sucessfully ! ","Success !",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new ATM(bankDetail);
            }
        });
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ATM(bankDetail);
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ammountTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER THE AMMOUNT ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 20));

        ammountTextField.setBackground(new java.awt.Color(0, 0, 0));
        ammountTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ammountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 230, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 204));
        btnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 70, 20));

        btnEnter.setBackground(new java.awt.Color(0, 153, 0));
        btnEnter.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        getContentPane().add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 70, 20));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditView(new BankModel()).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammountTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
