/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eee_Login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Hesty
 */
public class sifreDegistir extends javax.swing.JFrame {

    int xS;
    int yS;

    ResultSet rs = null;
    PreparedStatement pst = null;
    public String user;

    public sifreDegistir() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public sifreDegistir(String eposta) {
        this.user = eposta;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelÜst = new javax.swing.JPanel();
        jLabelMinimized = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelAlt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        yeniSifreDegistir = new javax.swing.JLabel();
        yeniSifre = new javax.swing.JPasswordField();
        yeniSifre1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelÜst.setBackground(new java.awt.Color(243, 156, 18));
        jPanelÜst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelMinimized.setFont(new java.awt.Font("Arial Narrow", 0, 21)); // NOI18N
        jLabelMinimized.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimized.setText("—");
        jLabelMinimized.setToolTipText("");
        jLabelMinimized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizedMouseExited(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Arial Narrow", 0, 21)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setAlignmentY(0.0F);
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseReleased(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Century Gothic", 1, 21)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setText("Elazığ Ev Eşya");

        jPanelAlt.setBackground(new java.awt.Color(75, 75, 75));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resimler/giris.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(75, 75, 75));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Yeni Şifreyi Giriniz:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Yeni Sifreyi Tekrar Giriniz:");

        yeniSifreDegistir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        yeniSifreDegistir.setForeground(new java.awt.Color(255, 255, 255));
        yeniSifreDegistir.setText("Şifreyi Değiştir");
        yeniSifreDegistir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yeniSifreDegistir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yeniSifreDegistirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yeniSifreDegistirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yeniSifreDegistirMouseExited(evt);
            }
        });

        yeniSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniSifreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yeniSifreDegistir)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yeniSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(yeniSifre1))
                        .addGap(0, 54, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yeniSifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(yeniSifreDegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Şifreyi Değiştir");

        javax.swing.GroupLayout jPanelAltLayout = new javax.swing.GroupLayout(jPanelAlt);
        jPanelAlt.setLayout(jPanelAltLayout);
        jPanelAltLayout.setHorizontalGroup(
            jPanelAltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelAltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelAltLayout.setVerticalGroup(
            jPanelAltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanelAltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAltLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelÜstLayout = new javax.swing.GroupLayout(jPanelÜst);
        jPanelÜst.setLayout(jPanelÜstLayout);
        jPanelÜstLayout.setHorizontalGroup(
            jPanelÜstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelÜstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMinimized)
                .addGap(42, 42, 42)
                .addComponent(jLabelClose)
                .addGap(31, 31, 31))
            .addComponent(jPanelAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelÜstLayout.setVerticalGroup(
            jPanelÜstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelÜstLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelÜstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelÜstLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelÜstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose)
                            .addComponent(jLabelMinimized)
                            .addComponent(jLabelTitle)))
                    .addGroup(jPanelÜstLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(7, 7, 7)
                .addComponent(jPanelAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelÜst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelÜst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizedMouseClicked

    private void jLabelMinimizedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseEntered
        jLabelMinimized.setForeground(Color.red);
    }//GEN-LAST:event_jLabelMinimizedMouseEntered

    private void jLabelMinimizedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizedMouseExited
        jLabelMinimized.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinimizedMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setText(":(");
        jLabelClose.setForeground(Color.red);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setText("X");
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMousePressed

    }//GEN-LAST:event_jLabelCloseMousePressed

    private void jLabelCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseReleased

    }//GEN-LAST:event_jLabelCloseMouseReleased

    private void yeniSifreDegistirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yeniSifreDegistirMouseClicked
        String sfre = String.valueOf(yeniSifre.getPassword());
        String sfre1 = String.valueOf(yeniSifre1.getPassword());
        
        if (sfre.equals(sfre1)) {

            try {
                String updateQuery = "UPDATE `kullanicilar` SET `sifre`=?  WHERE eposta=? ";

                pst = mysqL.getConnection().prepareStatement(updateQuery);
                pst.setString(1, yeniSifre.getText());
                pst.setString(2, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Şifreniz Başarıyla Değişti");

                girisFrame grs = new girisFrame();
                grs.setVisible(true);
                grs.pack();
                this.dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Şifreler uyuşmuyor ");
        }
    }//GEN-LAST:event_yeniSifreDegistirMouseClicked

    private void yeniSifreDegistirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yeniSifreDegistirMouseEntered
        yeniSifreDegistir.setForeground(new Color(243, 156, 18));
    }//GEN-LAST:event_yeniSifreDegistirMouseEntered

    private void yeniSifreDegistirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yeniSifreDegistirMouseExited
        yeniSifreDegistir.setForeground(Color.white);
    }//GEN-LAST:event_yeniSifreDegistirMouseExited

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation((x - xS), (y - yS));
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        xS = evt.getX();
        yS = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void yeniSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeniSifreActionPerformed

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
            java.util.logging.Logger.getLogger(sifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sifreDegistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMinimized;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAlt;
    private javax.swing.JPanel jPanelÜst;
    private javax.swing.JPasswordField yeniSifre;
    private javax.swing.JPasswordField yeniSifre1;
    private javax.swing.JLabel yeniSifreDegistir;
    // End of variables declaration//GEN-END:variables
}
