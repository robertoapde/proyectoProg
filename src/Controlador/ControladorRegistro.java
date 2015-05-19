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
                    String user = this.vista2.jTextUsuario.getText();
                    String contraseña = this.vista2.jTextContraseña.getText();
                    String confContraseña=this.vista2.jTextConfiContraseña.getText();
                    String email = this.vista2.jTextEmail.getText();
                    
                    if(user.equals("") || contraseña.equals("") || confContraseña.equals("") || email.equals("")){
                        JOptionPane.showMessageDialog(null,"Rellene todos los campos necesarios");
                    }else{
                        if(contraseña.equals(confContraseña)){
                            if(this.vista2.radioPicaro.isSelected()){
                                if(modeloR.nuevoPicaro(user, contraseña, email) == true){
                                    JOptionPane.showMessageDialog(null, "Picaro "+user+" creado");
                                    vista1.setVisible(true);
                                    vista2.dispose();
                                }
                            }else if(this.vista2.radioMago.isSelected()){
                                
                            }else if(this.vista2.radioGuerrero.isSelected()){
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"Seleccione una de las clases disponibles");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                        }
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