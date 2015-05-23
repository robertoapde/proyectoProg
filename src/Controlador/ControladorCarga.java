package Controlador;

import Modelo.ModeloCarga;
import Vista.Registro;
import Vista.VentanaCarga;
import Vista.VentanaHijas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCarga implements ActionListener{
    VentanaCarga vista1 = Main.vista1;
    Registro vista2;
    VentanaHijas vista3;
    
    ModeloCarga modelo;
    
    String usuario;
    
    ControladorRegistro controlR;
    ControladorHijas controlH;
    
    public enum AccionMVC{
        btnLogin,
        btnRegistrarse, 
    }
    
    public ControladorCarga(VentanaCarga vista1)
    {
        this.vista1 = vista1;      
    }
    
    public void iniciar(){
        try{
            vista2 = new Registro();
            vista3 = new VentanaHijas();

            modelo = new ModeloCarga();

            controlR = new ControladorRegistro(vista2);
            controlR.iniciar();

            controlH = new ControladorHijas(vista3);

            this.vista1.setVisible(true);
            this.vista1.setLocation(100,100);

            this.vista1.btnLogin.setActionCommand("btnLogin");
            this.vista1.btnLogin.addActionListener(this);
            this.vista1.btnRegistrarse.setActionCommand("btnRegistrarse");
            this.vista1.btnRegistrarse.addActionListener(this);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar ControladorCarga");
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnLogin:
                try{
                    String u = String.valueOf(this.vista1.txtUsuario.getText());
                    String p = String.valueOf(this.vista1.txtPassword.getText());
                    
                    if(u.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca un usuario");
                    }else if(p.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca una contraseña");        
                    }else if(u.equals("") && p.equals("")){
                        JOptionPane.showMessageDialog(null, "Introduzca su usuario y contraseña");
                    }else{
                        int logeado;
                        logeado = modelo.login(u, p);
                        if(logeado == 1){
                            setUsuario(u);
                            vista1.setVisible(false);
                            controlH.iniciar();
                            vista3.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                        }
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al conectar");
                }
                break;
            case btnRegistrarse:
                vista2.setVisible(true);
                vista1.setVisible(false);
                break;
        }
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String u){
        usuario = u;
    }
}