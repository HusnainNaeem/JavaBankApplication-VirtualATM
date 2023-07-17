package bank.application;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class SignUpADView extends javax.swing.JFrame {
    
    public SignUpADView(BankModel bankDetail) {
        setTitle("Signup Form 2 of 2");
        initComponents();
         ButtonGroup groupMartial = new ButtonGroup();
         groupMartial.add(marriedRadioBtn);
         groupMartial.add(unMarriedRadioBtn);
         ButtonGroup groupAccountType = new ButtonGroup();
         groupAccountType.add(currAccRadioBtn);
         groupAccountType.add(savAccRadioBtn);
         
         saveContiBtn.addActionListener(new ActionListener () {
             public void actionPerformed  (ActionEvent e) {
                 if(validater()) {
                 getADFormDetail(bankDetail);
                 setVisible(false);
                 dispose();
                 new ReviewForm(bankDetail);
                 }
                 else {
                     JOptionPane.showMessageDialog(null,"Failure","Fill All the required Fields",JOptionPane.INFORMATION_MESSAGE);
                 }
             }
         });
         getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public void getADFormDetail(BankModel bankDetail) {
        bankDetail.setCnic(cnicTextField.getText());
        bankDetail.setReligon((String)religonTextField.getSelectedItem());
        if(marriedRadioBtn.isSelected()) {
            bankDetail.setMartialSta("Married");
        } else {
            bankDetail.setMartialSta("UnMarried");
        }
        if(currAccRadioBtn.isSelected()) {
            bankDetail.setAccType("Current");
        } else {
                bankDetail.setAccType("Saving");
        } 
        bankDetail.setEmploymentSta((String)employeeTextField.getSelectedItem());
        bankDetail.setMpin(mpinPassField.getText());
        bankDetail.setPin(Integer.parseInt(pinPassField.getText()));
    }
    
    public boolean validater() {
        if(cnicTextField.getText().isEmpty()) {
            return false;
        }
        if((!marriedRadioBtn.isSelected())&&(!unMarriedRadioBtn.isSelected())) {
            return false;
        }
        if((!savAccRadioBtn.isSelected())&&(!currAccRadioBtn.isSelected())) {
            return false;
        }
        if(mpinPassField.getText().isEmpty()) {
            return false;
        }
        if(pinPassField.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        religonTextField = new javax.swing.JComboBox<>();
        cnicTextField = new javax.swing.JTextField();
        marriedRadioBtn = new javax.swing.JRadioButton();
        unMarriedRadioBtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        employeeTextField = new javax.swing.JComboBox<>();
        incomeTextField = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        currAccRadioBtn = new javax.swing.JRadioButton();
        savAccRadioBtn = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        saveContiBtn = new javax.swing.JButton();
        pinPassField = new javax.swing.JPasswordField();
        mpinPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(200, 5));
        setPreferredSize(new java.awt.Dimension(640, 660));
        setResizable(false);

        jLabel1.setText("Cnic No : ");

        jLabel2.setText("Religon : ");

        jLabel3.setText("Martial Status :");

        jLabel4.setText("Employment Status :");

        religonTextField.setBackground(java.awt.Color.white);
        religonTextField.setForeground(new java.awt.Color(0, 0, 0));
        religonTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muslim","Hindu","Christian","Jeaus","Sikh","Budhist","Other"}));

        cnicTextField.setText("With Dashes");
        cnicTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicTextFieldActionPerformed(evt);
            }
        });

        marriedRadioBtn.setBackground(java.awt.Color.white);
        marriedRadioBtn.setText("Married");
        marriedRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        unMarriedRadioBtn.setBackground(java.awt.Color.white);
        unMarriedRadioBtn.setText("UnMarried");
        unMarriedRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setText("Monthly Income : ");

        employeeTextField.setBackground(java.awt.Color.white);
        employeeTextField.setForeground(java.awt.Color.black);
        employeeTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Employed","Un-employed"}));

        incomeTextField.setBackground(java.awt.Color.white);
        incomeTextField.setForeground(java.awt.Color.black);
        incomeTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Less Than 25K","25K-50K","50K-100K","More Than 1Lack" }));
        incomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel7.setText("Profession & Account Details");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setText("Account Type : ");

        currAccRadioBtn.setBackground(java.awt.Color.white);
        currAccRadioBtn.setText("Current Account  ");
        currAccRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currAccRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currAccRadioBtnActionPerformed(evt);
            }
        });

        savAccRadioBtn.setBackground(java.awt.Color.white);
        savAccRadioBtn.setText("Saving Account");
        savAccRadioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savAccRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savAccRadioBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setText("Account Requirments :");

        jCheckBox1.setBackground(java.awt.Color.white);
        jCheckBox1.setText("Sms Alerts");

        jCheckBox2.setBackground(java.awt.Color.white);
        jCheckBox2.setText("Email Aerts");

        jCheckBox3.setBackground(java.awt.Color.white);
        jCheckBox3.setText("Internet Baking");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(java.awt.Color.white);
        jCheckBox4.setText("Cheque Book");

        jLabel10.setText("Enter 5 Digit MPIN : ");

        jLabel11.setText("Enter 4 Digit ATM PIN :");

        saveContiBtn.setBackground(new java.awt.Color(51, 51, 255));
        saveContiBtn.setForeground(java.awt.Color.white);
        saveContiBtn.setText("Save & Continue ");
        saveContiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pinPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(marriedRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(unMarriedRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(religonTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cnicTextField)
                                    .addComponent(employeeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(incomeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pinPassField)
                                    .addComponent(mpinPassField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(currAccRadioBtn)
                        .addGap(56, 56, 56)
                        .addComponent(savAccRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveContiBtn)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cnicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(religonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(marriedRadioBtn)
                    .addComponent(unMarriedRadioBtn))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(employeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currAccRadioBtn)
                    .addComponent(savAccRadioBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mpinPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pinPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(saveContiBtn)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnicTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnicTextFieldActionPerformed

    private void incomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeTextFieldActionPerformed

    private void savAccRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savAccRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savAccRadioBtnActionPerformed

    private void currAccRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currAccRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currAccRadioBtnActionPerformed

    private void pinPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinPassFieldActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

 /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpADView(new BankModel());
            }
        });*/
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnicTextField;
    private javax.swing.JRadioButton currAccRadioBtn;
    private javax.swing.JComboBox<String> employeeTextField;
    private javax.swing.JComboBox<String> incomeTextField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
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
    private javax.swing.JRadioButton marriedRadioBtn;
    private javax.swing.JPasswordField mpinPassField;
    private javax.swing.JPasswordField pinPassField;
    private javax.swing.JComboBox<String> religonTextField;
    private javax.swing.JRadioButton savAccRadioBtn;
    private javax.swing.JButton saveContiBtn;
    private javax.swing.JRadioButton unMarriedRadioBtn;
    // End of variables declaration//GEN-END:variables
}
