package Controlador;

import Modelo.ModeloHijas;
import Vista.VentanaHijas;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaHijas;

import Modelo.ModeloHijas;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ControladorHijas implements ActionListener, MouseListener{

    VentanaHijas vista ;
    
    ModeloHijas modelo = new ModeloHijas();

    public enum AccionMVC{
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
    
    public ControladorHijas(VentanaHijas vista)
    {
        this.vista = vista;
    }
    
   public void iniciar(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {}
          catch (ClassNotFoundException ex) {}
          catch (InstantiationException ex) {}
          catch (IllegalAccessException ex) {}
    }
    
    public void actionPerformed(ActionEvent e) {
        switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case btnCombatir:
                break;
            case  btnMochila:
                break;
            case btnTienda:
                break;
            case btnTaberna:
                break;
            case btnComprarTaberna:
                break;
            case btnAlojamientoTaberna:
                break;
            case btnSalirTaberna:
                break;
            case btnAceptarComprarTaberna:
                break;
            case btnCancelarComprarTaberna:
                break;
            case btnAceptarAlojamiento:
                break;
            case btnCancelarAlojamiento:
                break;
            case btnComprarTienda:
                break;
            case btnVenderTienda:
                break;   
            case btnSalirTienda:
                break;
            case btnAceptarCompraTienda:
                break;
            case btnCancelarCompraTienda:
                break;    
            case btnVenderVenderTienda:
                break;
            case btnSalirVenderTienda:
                break;
            case btnCombatirAtacar:
                break;    
            case btnCombatirDefender:
                break;
            case btnCombatirEspecial:
                break;
            case btnCombatirMochila:
                break;
            case btnCombatirHuir:
                break;
            case btnHuirPerder:
                break; 
            case btnMochilaUsar:
                break;
            case btnMochilaSoltar:
                break;
            case btnMochilaEquipar:
                break;
            case btnMochilaSalir:
                break;
            case btnSoltarAceptar:
                break;
            case btnSoltarCancelar:
                break;    
            case btnAceptarVenderVenderTienda:
                break;  
            case btnCancelarVenderVenderTienda:
                break;    
        }
    }
    
  
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}