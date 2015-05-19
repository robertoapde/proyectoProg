package Controlador;
import Vista.*;

public class Main {
    
    public static void main(String[] args) {
        new ControladorCarga(new VentanaCarga()).iniciar();
        new ControladorHijas(new VentanaHijas()).iniciar();
        new ControladorRegistro(new Registro()).iniciar();
    }
}