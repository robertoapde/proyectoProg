package Controlador;
import Clases.Enemigo;
import Clases.Guerrero;
import Clases.Mago;
import Clases.Picaro;
import Vista.*;

public class Main {
    
    static ControladorCarga controlC;
    
    static VentanaCarga vista1 = new VentanaCarga();
    
    public static void main(String[] args) {
        controlC = new ControladorCarga(vista1);
        controlC.iniciar();
        Guerrero g =new Guerrero();
        Mago m= new Mago();
        Enemigo e= new Enemigo();
        Picaro p = new Picaro();
    }
}