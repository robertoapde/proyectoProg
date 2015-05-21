package Controlador;
import Vista.*;

public class Main {
    
    static ControladorCarga controlC;
    
    static VentanaCarga vista1 = new VentanaCarga();
    
    public static void main(String[] args) {
        controlC = new ControladorCarga(vista1);
        controlC.iniciar();
    }
}