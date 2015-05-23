package Controlador;

import Vista.*;
import javax.swing.JOptionPane;

public class Main {
    
    static ControladorCarga controlC;
    
    static VentanaCarga vista1 = new VentanaCarga();
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Espere un minuto, por favor. Literalmente.");
        
        controlC = new ControladorCarga(vista1);
        controlC.iniciar();
    }
}