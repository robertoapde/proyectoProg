package proyectoprog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VentanaCarga extends javax.swing.JFrame {
    
    Conexion conexion = new Conexion();
    Connection con = conexion.getConnection();
    String[] datos = new String[2];

    public VentanaCarga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("     Usuario :");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.black));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 110, 20);

        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(180, 90, 280, 20);

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPassword);
        txtPassword.setBounds(180, 150, 280, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText(" Contraseña :");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 150, 110, 20);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 51, 255));
        btnLogin.setText("Inicio");
        btnLogin.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(10, 230, 210, 30);

        btnRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(java.awt.Color.red);
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse);
        btnRegistrarse.setBounds(250, 230, 220, 30);

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoprog/entrada.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 485, 303);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtUsuario.getText() == ""){
            JOptionPane.showMessageDialog(null, "Introduzca un usuario");
        }else if(txtPassword.getText() == ""){
            JOptionPane.showMessageDialog(null, "Introduzca una contraseña");        
        }else if(txtUsuario.getText() == "" && txtPassword.getText() == ""){
            JOptionPane.showMessageDialog(null, "Introduzca su usuario y contraseña");
        }else{
            try{
                CargaUsuario cU = new CargaUsuario(con);
                datos = CargaUsuario.cargaDatos();
            
                if(txtUsuario.getText().equals(datos[0]) && txtPassword.getText().equals(datos[1])){
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña correctos");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
       CPersonajes per = new CPersonajes();
       per.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
