package Controlador;

import Vista.*;
import javax.swing.JOptionPane;

public class Main {
    
    static ControladorCarga controlC;
    
    static VentanaCarga vista1 = new VentanaCarga();
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Espere, por favor.");
        
        controlC = new ControladorCarga(vista1);
        controlC.iniciar();
    }
}