package Controlador;

import Modelo.Modelo;
import Vista.VentanaCarga;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaCarga;
import Vista.VentanaHijas;

import Modelo.Modelo;

public class Controlador implements ActionListener, MouseListener{

    VentanaCarga vista1 ;
    VentanaHijas vista2 ;
    
    Modelo modelo = new Modelo();

    public enum AccionMVC{
    btnLogin,
    btnRegistrarse,
    btnCombatir,
    btnMochila,
    btnTienda,
    btnTaberna,
    btnComprarTaberna,
    btnAlojamientoTaberna,
    btnSalirTaberna,
    btnAceptarComprarTaberna,
    btnCancelarComprarTaberna,
    btnAceptarAlojamiento,
    btnCancelarAlojamiento,
    btnComprarTienda,
    btnVenderTienda,
    btnSalirTienda,
    btnAceptarCompraTienda,
    btnCancelarCompraTienda,
    btnVenderVenderTienda,
    btnSalirVenderTienda,
    btnCombatirAtacar,
    btnCombatirDefender,
    btnCombatirEspecial,
    btnCombatirMochila,
    btnCombatirHuir,
    btnHuirPerder,
    btnMochilaUsar,
    btnMochilaSoltar,
    btnMochilaEquipar,
    btnMochilaSalir,
    btnSoltarAceptar,
    btnSoltarCancelar,
    btnAceptarVenderVenderTienda,
    btnCancelarVenderVenderTienda
    }
    
    public Controlador(VentanaCarga vista1, VentanaHijas vista2)
    {
        this.vista1 = vista1;
        this.vista2 = vista2;
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