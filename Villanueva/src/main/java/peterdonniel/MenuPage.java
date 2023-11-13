/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peterdonniel;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Peter
 */
public class MenuPage extends javax.swing.JFrame {

    /**
     * Creates new form MenuPage
     */
    public MenuPage() {
        initComponents();

        try {
            BufferedImage img1 = null;
            img1 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\Chicken Fried.jfif"));
            Image image1 = img1.getScaledInstance(jImage1.getWidth(), jImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal1 = new ImageIcon(image1);
            jImage1.setIcon(meal1);

            BufferedImage img2 = null;
            img2 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\Pork SIsig.jfif"));
            Image image2 = img2.getScaledInstance(jlImage2.getWidth(), jlImage2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal2 = new ImageIcon(image2);
            jlImage2.setIcon(meal2);

            BufferedImage img3 = null;
            img3 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\Pork Lechon.jfif"));
            Image image3 = img3.getScaledInstance(jImage3.getWidth(), jImage3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal3 = new ImageIcon(image3);
            jImage3.setIcon(meal3);

            BufferedImage img4 = null;
            img4 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\Coke Float.JFIF"));
            Image image4 = img4.getScaledInstance(jImage4.getWidth(), jImage4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal4 = new ImageIcon(image4);
            jImage4.setIcon(meal4);

            BufferedImage img5 = null;
            img5 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\MtDew.JFIF"));
            Image image5 = img5.getScaledInstance(jImage5.getWidth(), jImage5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal5 = new ImageIcon(image5);
            jImage5.setIcon(meal5);

            BufferedImage img6 = null;
            img6 = ImageIO.read(new File("C:\\Users\\Peter\\Documents\\NetBeansProjects\\Villanueva\\src\\main\\java\\peterdonniel\\Royal.jfif"));
            Image image6 = img6.getScaledInstance(jImage6.getWidth(), jImage6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon meal6 = new ImageIcon(image6);
            jImage6.setIcon(meal6);

        } catch (Exception e) {

        }

        jImage1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jImage1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jImage1.setBorder(null);
            }
        });
        jlImage2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jlImage2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jlImage2.setBorder(null);
            }
        });
        jImage3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jImage3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jImage3.setBorder(null);
            }
        });
        jImage4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jImage4.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jImage4.setBorder(null);
            }
        });
        jImage5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jImage5.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jImage5.setBorder(null);
            }
        });
        jImage6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the border or any other style when the mouse enters
                jImage6.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                jImage6.setBorder(null);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlHeader = new javax.swing.JLabel();
        jImage6 = new javax.swing.JLabel();
        jImage4 = new javax.swing.JLabel();
        jImage1 = new javax.swing.JLabel();
        jImage3 = new javax.swing.JLabel();
        jImage5 = new javax.swing.JLabel();
        jlImage2 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1080, 1920));
        setSize(new java.awt.Dimension(1080, 1920));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlHeader.setBackground(new java.awt.Color(51, 51, 255));
        jlHeader.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jlHeader.setForeground(new java.awt.Color(0, 0, 0));
        jlHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHeader.setText("VILLANUEVA RESTAURANT MEALS & DRINKS");
        jlHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 5, true));
        jPanel1.add(jlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1380, 110));
        jlHeader.getAccessibleContext().setAccessibleParent(jlHeader);

        jImage6.setBackground(new java.awt.Color(0, 0, 0));
        jImage6.setForeground(new java.awt.Color(204, 204, 255));
        jImage6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, 370, 210));

        jImage4.setBackground(new java.awt.Color(0, 0, 0));
        jImage4.setForeground(new java.awt.Color(204, 204, 255));
        jImage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 370, 210));

        jImage1.setBackground(new java.awt.Color(0, 0, 0));
        jImage1.setForeground(new java.awt.Color(204, 204, 255));
        jImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 370, 210));

        jImage3.setBackground(new java.awt.Color(0, 0, 0));
        jImage3.setForeground(new java.awt.Color(204, 204, 255));
        jImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 180, 370, 210));

        jImage5.setBackground(new java.awt.Color(0, 0, 0));
        jImage5.setForeground(new java.awt.Color(204, 204, 255));
        jImage5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 370, 210));

        jlImage2.setBackground(new java.awt.Color(0, 0, 0));
        jlImage2.setForeground(new java.awt.Color(204, 204, 255));
        jlImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 370, 210));

        btnOrder.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        btnOrder.setText("PROCEED TO ORDER");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 650, 370, 70));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALL MEAL ORDERS INCLUDES UNLI-RICE PROMO!!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 580, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        perualila mainFrame = new perualila();
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setVisible(true);
        this.dispose(); // Close the login frame

    }//GEN-LAST:event_btnOrderActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jImage1;
    private javax.swing.JLabel jImage3;
    private javax.swing.JLabel jImage4;
    private javax.swing.JLabel jImage5;
    private javax.swing.JLabel jImage6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlHeader;
    private javax.swing.JLabel jlImage2;
    // End of variables declaration//GEN-END:variables
}
