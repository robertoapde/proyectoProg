package Controlador;

import Modelo.ModeloCarga;
import Vista.VentanaCarga;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaCarga;

import Modelo.ModeloCarga;

public class ControladorCarga {
    
    VentanaCarga vista ;
    
    ModeloCarga modelo = new ModeloCarga();
    
    public enum AccionMVC{
        btnLogin,
        btnRegistrarse,
        btnRegistrarseComenzar,
        btnRegistrarseSalir
    }
    
    public ControladorCarga(VentanaCarga vista)
    {
        this.vista = vista;
    }
    
    public void iniciar(){
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}