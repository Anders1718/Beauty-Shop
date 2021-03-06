/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana_principal;
import mpstore.Inicio1;
import Beauty.Inicio2;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    
    public Inicio() {
        
        initComponents();
        this.setTitle("Inicio");
        this.setLocationRelativeTo(null);
        transpareciaBoton();
        //setIconImage(new ImageIcon(getClass().getResource("imagenes1/LogoFamil.png")).getImage());
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFac3 = new javax.swing.JButton();
        jButtonFac1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonFac3.setBackground(new java.awt.Color(204, 0, 51));
        jButtonFac3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButtonFac3.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFac3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Beauty logo.png"))); // NOI18N
        jButtonFac3.setText("Beauty");
        jButtonFac3.setBorder(null);
        jButtonFac3.setBorderPainted(false);
        jButtonFac3.setContentAreaFilled(false);
        jButtonFac3.setDefaultCapable(false);
        jButtonFac3.setFocusPainted(false);
        jButtonFac3.setFocusable(false);
        jButtonFac3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFac3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFac3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFac3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 470, 440));

        jButtonFac1.setBackground(new java.awt.Color(204, 0, 51));
        jButtonFac1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButtonFac1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFac1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/Mp logo.jpeg"))); // NOI18N
        jButtonFac1.setText("MP Store");
        jButtonFac1.setBorder(null);
        jButtonFac1.setBorderPainted(false);
        jButtonFac1.setContentAreaFilled(false);
        jButtonFac1.setDefaultCapable(false);
        jButtonFac1.setFocusPainted(false);
        jButtonFac1.setFocusable(false);
        jButtonFac1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFac1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFac1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 450, 440));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void transpareciaBoton(){
        
    }
    private void jButtonFac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFac1ActionPerformed
        Inicio1 F = new Inicio1();
        F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonFac1ActionPerformed

    private void jButtonFac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFac3ActionPerformed
        Inicio2 F = new Inicio2();
        F.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonFac3ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFac1;
    private javax.swing.JButton jButtonFac3;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
