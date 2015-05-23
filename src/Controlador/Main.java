package Controlador;

import Vista.*;
import javax.swing.JOptionPane;

public class Main {
    
    static ControladorCarga controlC;
    
    static VentanaCarga vista1 = new VentanaCarga();
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Pulse 'Aceptar' y espere alrededor de 30 segundos."+"\nDisculpe las molestias.");
        
        controlC = new ControladorCarga(vista1);
        controlC.iniciar();
    }
}