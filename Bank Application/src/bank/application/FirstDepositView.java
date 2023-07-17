package bank.application;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstDepositView extends javax.swing.JFrame {
    Controller controller = new Controller();
    public FirstDepositView(BankModel bankDetail) {
        initComponents();
        setVisible(true);
        
        ImageIcon icon = new ImageIcon("src\\images\\atm.jpg");      
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon sacledIcon = new ImageIcon(imgScale);
        lblPic.setIcon(sacledIcon);
        
        btnSave.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
                bankDetail.setBalance(Double.parseDouble(ammountTextField.getText()));
                controller.setBalance(bankDetail.getBalance(),bankDetail.getAccoNo());
                dispose();
                new LoginView();
          }
        });
        
         btnClear.addActionListener(new ActionListener() {
            @Override
              public void actionPerformed(ActionEvent e) {
               ammountTextField.setText("");
          }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ammountTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ammountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammountTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ammountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 170, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Enter Here : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        btnSave.setBackground(new java.awt.Color(51, 153, 0));
        btnSave.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 70, 30));

        btnClear.setBackground(new java.awt.Color(204, 0, 51));
        btnClear.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 70, 30));

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ammountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammountTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammountTextField;
    javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPic;
    // End of variables declaration//GEN-END:variables
}
