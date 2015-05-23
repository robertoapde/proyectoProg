package Controlador;

import Modelo.ModeloRegistro;
import Vista.Registro;
import Vista.VentanaCarga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorRegistro implements ActionListener{
    VentanaCarga vista1 = Controlador.Main.controlC.vista1;
    Registro vista2 = Controlador.Main.controlC.vista2;
    
    ModeloRegistro modeloR = new ModeloRegistro();

    public enum AccionMVC{
        btnRegistrarseComenzar,
        btnRegistrarseSalir,
        Picaro,
        Mago,
        Guerrero
    }
      public ControladorRegistro(Registro vista2)
    {
        this.vista2 = vista2;
    }
    
    public void iniciar(){
        try{
            this.vista2.btnRegistrarseComenzar.setActionCommand("btnRegistrarseComenzar");
            this.vista2.btnRegistrarseComenzar.addActionListener(this);
            this.vista2.btnRegistrarseSalir.setActionCommand("btnRegistrarseSalir");
            this.vista2.btnRegistrarseSalir.addActionListener(this);
            this.vista2.radioPicaro.setActionCommand("Picaro");
            this.vista2.radioPicaro.addActionListener(this);
            this.vista2.radioPicaro.setSelected(true);
            this.vista2.radioMago.setActionCommand("Mago");
            this.vista2.radioMago.addActionListener(this);
            this.vista2.radioGuerrero.setActionCommand("Guerrero");
            this.vista2.radioGuerrero.addActionListener(this);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar ControladorHijas");
        }
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
                vista1.setVisible(true);
                vista2.dispose();
                break;
            case Picaro:
                vista2.radioPicaro.setSelected(true);
                break;
            case Mago:
                vista2.radioMago.setSelected(true);
                break;
            case Guerrero:
                vista2.radioGuerrero.setSelected(true);
                break;
        }
    }
}