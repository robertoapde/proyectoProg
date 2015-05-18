package Controlador;

import Modelo.ModeloCarga;
import Vista.Registro;
import Vista.VentanaCarga;
import Vista.VentanaHijas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ControladorCarga implements ActionListener, MouseListener{
    
    VentanaCarga vista1;
    Registro vista2;
    VentanaHijas vista3;
    
    ModeloCarga modelo = new ModeloCarga();
    
    public enum AccionMVC{
        btnLogin,
        btnRegistrarse,
        btnRegistrarseComenzar,
        btnRegistrarseSalir
    }
    
    public ControladorCarga(VentanaCarga vista1, Registro vista2)
    {
        this.vista1 = vista1;
        this.vista2 = vista2;
    }
    
    public void iniciar(){
        this.vista1.btnLogin.setActionCommand("btnLogin");
        this.vista1.btnLogin.addActionListener(this);
        this.vista1.btnRegistrarse.setActionCommand("btnRegistrarse");
        this.vista1.btnRegistrarse.addActionListener(this);
        this.vista2.btnRegistrarseComenzar.setActionCommand("btnRegistrarseComenzar");
        this.vista2.btnRegistrarseComenzar.addActionListener(this);
        this.vista2.btnRegistrarseSalir.setActionCommand("btnRegistrarseSalir");
        this.vista2.btnRegistrarseSalir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnLogin:
                String u = this.vista1.txtUsuario.getText();
                String p = this.vista1.txtPassword.getText();
                if(this.modelo.login(u, p) == true){
                    vista3.setSize(1599, 782);
                    vista3.setLocation(150,150);
                    vista3.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "No ha sido posible conectar");
                }
                break;
            case btnRegistrarse:
                break;
            case btnRegistrarseComenzar:
                break;
            case btnRegistrarseSalir:
                break;
        }
    }
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}