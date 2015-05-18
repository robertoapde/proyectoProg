package Vista;

import Vista.VentanaCarga;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        radioPicaro = new javax.swing.JRadioButton();
        radioMago =  new javax.swing.JRadioButton();
        radioGuerrero =  new javax.swing.JRadioButton();
        radioPicaro.setText("Picaro");
        radioMago.setText("Picaro");
        radioGuerrero.setText("Picaro");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioPicaro = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioMago = new javax.swing.JRadioButton();
        radioGuerrero = new javax.swing.JRadioButton();
        btnRegistrarseComenzar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JTextField();
        jTextConfiContraseña = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        btnRegistrarseSalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("resources/icono.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/picaro.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 106, 102));

        buttonGroup1.add(radioPicaro);
        radioPicaro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        radioPicaro.setForeground(new java.awt.Color(0, 153, 153));
        radioPicaro.setText("Picaro");
        radioPicaro.setBorder(new javax.swing.border.MatteBorder(null));
        radioPicaro.setBorderPainted(true);
        radioPicaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPicaroActionPerformed(evt);
            }
        });
        getContentPane().add(radioPicaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mago.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 105, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guerrero.png"))); // NOI18N
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 105, 102));

        buttonGroup1.add(radioMago);
        radioMago.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        radioMago.setForeground(new java.awt.Color(0, 153, 153));
        radioMago.setText("Mago");
        radioMago.setBorder(new javax.swing.border.MatteBorder(null));
        radioMago.setBorderPainted(true);
        radioMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMagoActionPerformed(evt);
            }
        });
        getContentPane().add(radioMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 70, 20));

        buttonGroup1.add(radioGuerrero);
        radioGuerrero.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        radioGuerrero.setForeground(new java.awt.Color(0, 153, 153));
        radioGuerrero.setText("Guerrero");
        radioGuerrero.setBorder(new javax.swing.border.MatteBorder(null));
        radioGuerrero.setBorderPainted(true);
        getContentPane().add(radioGuerrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 90, -1));

        btnRegistrarseComenzar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarseComenzar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarseComenzar.setForeground(new java.awt.Color(51, 51, 255));
        btnRegistrarseComenzar.setText("Comienza la aventura");
        btnRegistrarseComenzar.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrarseComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarseComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, 227, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Usuario :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText(" Contraseña :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Confirmar Contraseña :");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 244, 160, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Email :");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, -1));

        jTextUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 171, 330, -1));

        jTextContraseña.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 209, 330, -1));

        jTextConfiContraseña.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jTextConfiContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 247, 330, -1));

        jTextEmail.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 285, 330, -1));

        btnRegistrarseSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarseSalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarseSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnRegistrarseSalir.setText("Salir");
        btnRegistrarseSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrarseSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarseSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 323, 250, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 730, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioPicaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPicaroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPicaroActionPerformed

    private void radioMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMagoActionPerformed

    private void btnRegistrarseSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseSalirActionPerformed
        VentanaCarga vc = new VentanaCarga();
        vc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarseSalirActionPerformed

    private void btnRegistrarseComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseComenzarActionPerformed
        
    }//GEN-LAST:event_btnRegistrarseComenzarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
      
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarseComenzar;
    public javax.swing.JButton btnRegistrarseSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextConfiContraseña;
    private javax.swing.JTextField jTextContraseña;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JRadioButton radioGuerrero;
    private javax.swing.JRadioButton radioMago;
    private javax.swing.JRadioButton radioPicaro;
    // End of variables declaration//GEN-END:variables
}
