package Controlador;

import Modelo.ModeloCarga;
import Vista.Registro;
import Vista.VentanaCarga;
import Vista.VentanaHijas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCarga implements ActionListener{
    
    VentanaCarga vista1 = new VentanaCarga();
    Registro vista2 = new Registro();
    VentanaHijas vista3 = new VentanaHijas();
    String usuario;
    
    ModeloCarga modelo = new ModeloCarga();
    
    public enum AccionMVC{
        btnLogin,
        btnRegistrarse,
       
    }
    
    public ControladorCarga(VentanaCarga vista1)
    {
        this.vista1 = vista1;
        
    }
    
    public void iniciar(){
        this.vista1.setVisible(true);
        
        this.vista1.btnLogin.setActionCommand("btnLogin");
        this.vista1.btnLogin.addActionListener(this);
        this.vista1.btnRegistrarse.setActionCommand("btnRegistrarse");
        this.vista1.btnRegistrarse.addActionListener(this);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnLogin:
                try{
                    String u = this.vista1.txtUsuario.getText();
                    String p = this.vista1.txtPassword.getText();
                    
                    if(u.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca un usuario");
                    }else if(p.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca una contraseña");        
                    }else if(u.equals("") && p.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca su usuario y contraseña");
                    }else{
                        if(this.modelo.login(u, p) == 1){
                            this.vista3.setSize(480, 300);
                            this.vista3.setLocation(150,150);
                            this.vista3.setVisible(true);
                            usuario = u;
                        }else{
                            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al conectar");
                }
                break;
            case btnRegistrarse:
            
                this.vista2.setSize(580, 390);
                this.vista2.setLocation(150,150);
                this.vista2.setVisible(true);
                this.vista1.dispose();
                break;
            
        }
                                              
    
  
    }
}