package bank.application;
import static bank.application.LoginView.getSHA512Hash;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ReviewForm extends javax.swing.JFrame {
  Controller objControl = new Controller();
    public ReviewForm(BankModel bankDetail) {
        initComponents();
         Random random = new Random();
         int randomNumber = random.nextInt(90000) + 10000;
         String accountNo = "MBP-LHR-" +randomNumber; 
         setLabelValues(bankDetail);
         accoutNoOutLbl.setText(accountNo);
         bankDetail.setAccoNo(accountNo);
         saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mpinHash = getSHA512Hash (bankDetail.getMpin());
                bankDetail.setMpin(mpinHash);
                objControl.saveData(bankDetail);
                JOptionPane.showMessageDialog(null,"You account has been created---Thanks fo using MBP","Welcome!",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new FirstDepositView(bankDetail);
                
            }
        });
           cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
        });
        
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        logoLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AccountTypeOutLbl = new javax.swing.JLabel();
        martialOutLbl = new javax.swing.JLabel();
        employmentOutLbl = new javax.swing.JLabel();
        nameOutLbl = new javax.swing.JLabel();
        fnameOutLbl = new javax.swing.JLabel();
        cnicOutLbl = new javax.swing.JLabel();
        adressOutLbl = new javax.swing.JLabel();
        mailAdressOutLbl = new javax.swing.JLabel();
        accoutNoOutLbl = new javax.swing.JLabel();
        mpinOutLbl = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(634, 625));

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Name : ");

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel2.setText("Form Review & Account Confirmation");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Father Name : ");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Cnic :");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Address : ");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Mailing Adress :");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel7.setText("Account Details");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Account No :");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Mpin :");

        AccountTypeOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AccountTypeOutLbl.setText("Account Type :");

        martialOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        martialOutLbl.setText("martial");

        employmentOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        employmentOutLbl.setText("employment");

        nameOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nameOutLbl.setText("jLabel13");

        fnameOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        fnameOutLbl.setText("jLabel14");

        cnicOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cnicOutLbl.setText("jLabel15");

        adressOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        adressOutLbl.setText("jLabel16");

        mailAdressOutLbl.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        mailAdressOutLbl.setText("jLabel17");

        accoutNoOutLbl.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        accoutNoOutLbl.setText("jLabel18");

        mpinOutLbl.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        mpinOutLbl.setText("jLabel19");

        cancelBtn.setBackground(new java.awt.Color(51, 51, 255));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        saveBtn.setBackground(new java.awt.Color(51, 51, 255));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adressOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(mailAdressOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cnicOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(logoLbl)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accoutNoOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(mpinOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(AccountTypeOutLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(cancelBtn)
                                .addGap(107, 107, 107)
                                .addComponent(saveBtn)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(martialOutLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employmentOutLbl)
                        .addGap(132, 132, 132))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameOutLbl))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fnameOutLbl))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cnicOutLbl))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adressOutLbl))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mailAdressOutLbl))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accoutNoOutLbl)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpinOutLbl)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addComponent(AccountTypeOutLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(martialOutLbl)
                    .addComponent(employmentOutLbl))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setLabelValues(BankModel bankDetail) {
        AccountTypeOutLbl.setText("Account Type : " + bankDetail.getAccType());
        accoutNoOutLbl.setText(bankDetail.getAccoNo());
        adressOutLbl.setText(bankDetail.getAddress());
        cnicOutLbl.setText(bankDetail.getCnic());        
        employmentOutLbl.setText(bankDetail.getEmploymentSta()); 
        fnameOutLbl.setText(bankDetail.getFatherName()); 
        mailAdressOutLbl.setText(bankDetail.getMailingAddress()); 
        martialOutLbl.setText(bankDetail.getMartialSta()); 
    mpinOutLbl.setText(String.valueOf(bankDetail.getMpin()));
        nameOutLbl.setText(bankDetail.getName());        
    }
    
     public static String getSHA512Hash(String input) {
        try {
            MessageDigest sha512Digest = MessageDigest.getInstance("SHA-512");
            byte[] hashBytes = sha512Digest.digest(input.getBytes());

            // Convert the byte array to hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountTypeOutLbl;
    private javax.swing.JLabel accoutNoOutLbl;
    private javax.swing.JLabel adressOutLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel cnicOutLbl;
    private javax.swing.JLabel employmentOutLbl;
    private javax.swing.JLabel fnameOutLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel mailAdressOutLbl;
    private javax.swing.JLabel martialOutLbl;
    private javax.swing.JLabel mpinOutLbl;
    private javax.swing.JLabel nameOutLbl;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
