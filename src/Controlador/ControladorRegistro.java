/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloRegistro;
import Vista.Registro;
import Vista.VentanaCarga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorRegistro implements ActionListener{
    VentanaCarga vista1 = new VentanaCarga();
    Registro vista2 = new Registro();
    ModeloRegistro modeloR = new ModeloRegistro();

   


    public enum AccionMVC{
        btnRegistrarseComenzar,
        btnRegistrarseSalir
    }
      public ControladorRegistro(Registro vista2)
    {
        this.vista2 = vista2;
    }
    
    public void inicio (){
        this.vista2.setVisible(true);
        this.vista2.btnRegistrarseComenzar.setActionCommand("btnRegistrarseComenzar");
        this.vista2.btnRegistrarseComenzar.addActionListener(this);
        this.vista2.btnRegistrarseSalir.setActionCommand("btnRegistrarseSalir");
        this.vista2.btnRegistrarseSalir.addActionListener(this);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnRegistrarseComenzar:
                try{
                    String User = this.vista2.jTextUsuario.getText();
                    String Contraseña = this.vista2.jTextContraseña.getText();
                    String ConfContraseña=this.vista2.jTextConfiContraseña.getText();
                    String Email = this.vista2.jTextEmail.getText();
                    
                    if(User.equals("")){
                        JOptionPane.showMessageDialog(null,"rellene el campo usuario");
                    }else if(Contraseña.equals("")){
                        JOptionPane.showMessageDialog(null,"rellene el campo contraseña");
                    }else if(ConfContraseña.equals("")){
                        JOptionPane.showMessageDialog(null,"Tiene que confirmar la contraseña");
                    }else if(Contraseña != ConfContraseña){
                        JOptionPane.showMessageDialog(null,"La contraseñas no coinciden");
                    }else if (Email.equals("")){
                        JOptionPane.showMessageDialog(null,"rellene el campo email");
                    }else if(User.equals("") && Contraseña.equals("")){
                         JOptionPane.showMessageDialog(null,"rellene los campos en blanco");
                    }else if(User.equals("") && ConfContraseña.equals("")){
                         JOptionPane.showMessageDialog(null, "rellene los campos en blanco");
                     }else if(User.equals("") && Email.equals("")){
                        JOptionPane.showMessageDialog(null, "rellene los campos en blanco");
                    }else if(Contraseña.equals("") && ConfContraseña.equals("")){
                        JOptionPane.showMessageDialog(null, "rellene los campos en blanco");
                    }else if(Contraseña.equals("") && Email.equals("")){
                        JOptionPane.showMessageDialog(null, "rellene los campos en blanco");
                    }else if(ConfContraseña.equals("") && Email.equals("")){
                        JOptionPane.showMessageDialog(null, "rellene los campos en blanco");
                    }else if(User.equals("") && Contraseña.equals("") && ConfContraseña.equals("") && Email.equals("")){
                         JOptionPane.showMessageDialog(null,"rellene los campos en blanco");
                    }
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al conectar");
                }
                 break;
            case btnRegistrarseSalir:
                vista1.setVisible(true);
                vista2.dispose();
                break;
        }
    }
}
