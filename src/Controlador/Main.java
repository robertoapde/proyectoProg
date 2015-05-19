package Controlador;
import Vista.VentanaCarga;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        new ControladorCarga(new VentanaCarga()).iniciar();
    }
}