package Controlador;
import Vista.*;

public class Main {
    
    static ControladorCarga controlC;
    
    public static void main(String[] args) {
        controlC = new ControladorCarga(new VentanaCarga());
        controlC.iniciar();
    }
}