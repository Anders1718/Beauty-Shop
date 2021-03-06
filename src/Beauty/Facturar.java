/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beauty;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author User
 */
public class Facturar extends javax.swing.JFrame {
    String user = "root";
    String clave = "";
    String url = "jdbc:mysql://localhost:3306/mpstore";
    Connection con;
    Statement stmt;
    ResultSet rs;
    String datos[] = new String [4]; 
    DefaultTableModel modelo = new DefaultTableModel();
   
    
    /**
     * Creates new form Inicio
     */
    public Facturar() {
        
        initComponents();
        this.setTitle("Facturar - Beauty");
        this.setLocationRelativeTo(null);
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        jTextFieldFecha.setText(fecha());
       buscarCliente();
       jTextFieldCantidad.setText("1");
       
        

        
        
          
       
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

        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabelPrecio5 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelPrecio3 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelPrecio4 = new javax.swing.JLabel();
        jLabelPrecio2 = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelSumas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldFecha.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jTextFieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFechaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 240, -1));

        jTextFieldMonto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoActionPerformed(evt);
            }
        });
        jTextFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 240, -1));

        jLabelPrecio5.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio5.setText("CANTIDAD:");
        jLabelPrecio5.setOpaque(true);
        getContentPane().add(jLabelPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 130, -1));

        jTextFieldCantidad.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 240, -1));

        jLabelPrecio3.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio3.setText("TIPO:");
        jLabelPrecio3.setOpaque(true);
        getContentPane().add(jLabelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 80, -1));

        jComboBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxClienteMouseClicked(evt);
            }
        });
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 220, 40));

        jButtonListo.setBackground(new java.awt.Color(201, 116, 88));
        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListo.setText("REGISTRAR VENTA");
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.setOpaque(true);
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, -1, 40));

        jButtonCancelar1.setBackground(new java.awt.Color(201, 116, 88));
        jButtonCancelar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/x cancelar.png"))); // NOI18N
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setBorderPainted(false);
        jButtonCancelar1.setContentAreaFilled(false);
        jButtonCancelar1.setDefaultCapable(false);
        jButtonCancelar1.setOpaque(true);
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 230, 50));

        jLabelPrecio4.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio4.setText("FECHA:");
        jLabelPrecio4.setOpaque(true);
        getContentPane().add(jLabelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 90, -1));

        jLabelPrecio2.setBackground(new java.awt.Color(201, 116, 88));
        jLabelPrecio2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio2.setText("VALOR:");
        jLabelPrecio2.setOpaque(true);
        getContentPane().add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 90, -1));

        jButtonInicio.setBackground(new java.awt.Color(201, 116, 88));
        jButtonInicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inicio.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.setOpaque(true);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/Beauty logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1310, 650));

        jLabelSumas.setText("jLabel1");
        getContentPane().add(jLabelSumas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void seleccionarCliente(String sele){

        try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombre LIKE '%"+sele+"%' ORDER BY nombre ASC");

                while(rs.next()){
                    jTextFieldMonto.setText(rs.getString(4));                   
                }
                         
        } catch (SQLException ex) {
            Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    void buscarCliente(){
        try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario ORDER BY nombre ASC ");

                while(rs.next()){
                    jComboBoxCliente.addItem(rs.getString(2));
                }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public static String fecha(){
       Date fecha = new Date();
       SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
       return formatofecha.format(fecha);
    }
     
    
    
    
    private void jTextFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoKeyTyped
        char n = evt.getKeyChar();
        if(n < '0' || n> '9') evt.consume();
    }//GEN-LAST:event_jTextFieldMontoKeyTyped

    private void jTextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMontoActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        boolean sw2=false;
        
            
        if(jTextFieldMonto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingres?? el precio de venta");
            sw2=true;
        }else if(jTextFieldFecha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingres?? la fecha");
            sw2=true;
        }else if(jTextFieldCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingres?? la cantidad");
            sw2=true;
        }
        
       
       else if(sw2==false){
           
           int precioCompra=0 , ganancia=0 , total=0 , cantidad=0;
           
           try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombre LIKE "
                    + "'"+jComboBoxCliente.getSelectedItem().toString()+"' ");

                while(rs.next()){
                    precioCompra=Integer.parseInt(rs.getString(3));
                }
        
            
            } catch (SQLException ex) {
                Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ganancia = Integer.parseInt(jTextFieldMonto.getText())- precioCompra;
            if(jTextFieldCantidad.getText().equals("0")){
                total = ganancia * 1;
            }else{
                total = ganancia * Integer.parseInt(jTextFieldCantidad.getText());
            }
            
            
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO ventas VALUES('0','"+jComboBoxCliente.getSelectedItem().toString()+"' "
                        + ", '"+precioCompra+"'"
                        + ",'"+jTextFieldMonto.getText()+"','"+ganancia+"', '"+jTextFieldCantidad.getText()+"'"
                                + " , '"+jTextFieldFecha.getText()+"' , '"+total+"')");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error");
                Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario WHERE nombre LIKE "
                    + "'"+jComboBoxCliente.getSelectedItem().toString()+"' ");

                while(rs.next()){
                    cantidad=Integer.parseInt(rs.getString(6));
                }
        
            
            } catch (SQLException ex) {
                Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cantidad = cantidad - Integer.parseInt(jTextFieldCantidad.getText());
            
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("UPDATE usuario SET cantidad = '"+cantidad+"' WHERE nombre = '"
                        +jComboBoxCliente.getSelectedItem().toString()+"'");
                
            } catch (SQLException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            
           
           jTextFieldCantidad.setText("1");
            
            
            
            
        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        
        jTextFieldMonto.setText("");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        Inicio2 I = new Inicio2();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaKeyTyped

    private void jComboBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxClienteMouseClicked

    }//GEN-LAST:event_jComboBoxClienteMouseClicked

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        String selectedValue = jComboBoxCliente.getSelectedItem().toString();
        
        seleccionarCliente(selectedValue);
        
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jTextFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadKeyTyped

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
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JLabel jLabelPrecio3;
    private javax.swing.JLabel jLabelPrecio4;
    private javax.swing.JLabel jLabelPrecio5;
    private javax.swing.JLabel jLabelSumas;
    public javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldFecha;
    public javax.swing.JTextField jTextFieldMonto;
    // End of variables declaration//GEN-END:variables
}
