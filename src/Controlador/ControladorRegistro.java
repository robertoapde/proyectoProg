package Controlador;

import Modelo.ModeloRegistro;
import Vista.Registro;
import Vista.VentanaCarga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.w3c.dom.events.MouseEvent;


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
    
    public void iniciar(){
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
                            if(this.vista2.radioPicaro.isSelected() == true){
                                boolean creado;
                                creado = modeloR.nuevoPicaro(user, contraseña, email);
                                if(creado == true){
                                    JOptionPane.showMessageDialog(null, "Picaro "+user+" creado");
                                    vista1.setVisible(true);
                                    vista2.dispose();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error al crear picaro");
                                }
                            }else if(this.vista2.radioMago.isSelected() == true){
                                boolean creado;
                                creado = modeloR.nuevoMago(user, contraseña, email);
                                if(creado == true){
                                    JOptionPane.showMessageDialog(null, "Mago "+user+" creado");
                                    vista1.setVisible(true);
                                    vista2.dispose();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error al crear mago");
                                }
                            }else if(this.vista2.radioGuerrero.isSelected() == true){
                                boolean creado;
                                creado = modeloR.nuevoGuerrero(user, contraseña, email);
                                if(creado == true){
                                    JOptionPane.showMessageDialog(null, "Guerrero "+user+" creado");
                                    vista1.setVisible(true);
                                    vista2.dispose();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error al crear guerrero");
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"Seleccione una de las clases disponibles");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                        }
                    }
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al crear");
                }
                 break;
            case btnRegistrarseSalir:
                this.vista1.setSize(580, 390);
                this.vista1.setLocation(150,150);
                vista1.setVisible(true);
                vista2.dispose();
                break;
        }
    }
}