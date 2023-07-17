package bank.application;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginView extends JFrame {
   private  Controller controller = new Controller();
   private BankModel bankDetail = new BankModel();
    public LoginView() {
        super("WELCOME TO MBP");        
         setLocation(2000,200);
         getContentPane().setBackground(Color.WHITE);
         initComponents(); 
         ImageIcon logoIcon = new ImageIcon("src\\images\\titleLogo.png");     
         setIconImage(logoIcon.getImage());
         btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            setVisible(false);
            dispose();
            new SignUpPDView ();
            }
        });
         btnLogin.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
            String mpinHash = getSHA512Hash(mpinText.getText());
            if (controller.checkLogin(accText.getText(), mpinHash)) {
                bankDetail = controller.getAllDetail(accText.getText());
                dispose();
                new ATM(bankDetail);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Login or Password", "Failed!", JOptionPane.PLAIN_MESSAGE);
            }
        }
         });
          setVisible(true);    
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
    
    
    // Leave below
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleName = new javax.swing.JLabel();
        accLabel = new javax.swing.JLabel();
        mpinLabel = new javax.swing.JLabel();
        mpinText = new javax.swing.JPasswordField();
        accText = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setLocation(new java.awt.Point(300, 150));
        setPreferredSize(new java.awt.Dimension(650, 450));
        setResizable(false);

        titleName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleName.setText("MUSLIM BANK OF PAKISTAN");

        accLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        accLabel.setText("ACCOUNT NO :");

        mpinLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        mpinLabel.setText("MPIN :");

        mpinText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpinTextActionPerformed(evt);
            }
        });

        btnLogin.setBackground(java.awt.Color.lightGray);
        btnLogin.setForeground(java.awt.Color.black);
        btnLogin.setText("LOGIN");

        btnSignup.setBackground(java.awt.Color.lightGray);
        btnSignup.setForeground(java.awt.Color.black);
        btnSignup.setText("SIGN UP");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mpinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLogin)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnSignup)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(mpinText)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(titleName, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(titleName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpinLabel)
                    .addComponent(mpinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSignup))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mpinTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpinTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpinTextActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignupActionPerformed
     // end
     
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLabel;
    javax.swing.JTextField accText;
    javax.swing.JButton btnLogin;
    javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mpinLabel;
    javax.swing.JPasswordField mpinText;
    private javax.swing.JLabel titleName;
    // End of variables declaration//GEN-END:variables
}
