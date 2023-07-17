package bank.application;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

public class FrontView extends javax.swing.JFrame {

    public FrontView() {
        initComponents();
        scaleImage();
        setVisible(true);
    }

    public void scaleImage () {
        ImageIcon icon = new ImageIcon("src\\images\\bank1.png");      
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblPic.getWidth(),lblPic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon sacledIcon = new ImageIcon(imgScale);
        lblPic.setIcon(sacledIcon);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setBackground(java.awt.Color.white);
        titleLabel.setFont(new java.awt.Font("Palatino Linotype", 3, 22)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText(" MUSLIM BANK OF PAKISTAN");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 430, -1));

        msgLabel.setBackground(new java.awt.Color(255, 255, 255));
        msgLabel.setFont(new java.awt.Font("Palatino Linotype", 2, 18)); // NOI18N
        msgLabel.setForeground(new java.awt.Color(255, 255, 255));
        msgLabel.setText("Welcome to MBP - Where Banking Meets Simplicity and Security!");
        getContentPane().add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));
        getContentPane().add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrontView frontScreen = new FrontView();

                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        frontScreen.dispose();
                        new LoginView();
                        
                    }
                }, 5000); // Delay of 2 seconds (2000 milliseconds)
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
