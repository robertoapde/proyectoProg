package Controlador;

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
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
        }catch (UnsupportedLookAndFeelException ex){}
        catch (ClassNotFoundException ex){}
        catch (InstantiationException ex){}
        catch (IllegalAccessException ex){}
        
        this.vista.btnCombatir.setActionCommand("btnCombatir");
        this.vista.btnCombatir.addActionListener(this);
        this.vista.btnMochila.setActionCommand("btnMochila");
        this.vista.btnMochila.addActionListener(this);
        this.vista.btnTienda.setActionCommand("btnTienda");
        this.vista.btnTienda.addActionListener(this);
        this.vista.btnTaberna.setActionCommand("btnTaberna");
        this.vista.btnTaberna.addActionListener(this);
        this.vista.btnComprarTaberna.setActionCommand("dialogTaberna");
        this.vista.btnComprarTaberna.addActionListener(this);
        this.vista.btnAlojamientoTaberna.setActionCommand("btnAlojamientoTaberna");
        this.vista.btnAlojamientoTaberna.addActionListener(this);
        this.vista.btnSalirTaberna.setActionCommand("btnSalirTaberna");
        this.vista.btnSalirTaberna.addActionListener(this);
        this.vista.btnAceptarComprarTaberna.setActionCommand("btnAceptarComprarTaberna");
        this.vista.btnAceptarComprarTaberna.addActionListener(this);
        this.vista.btnCancelarComprarTaberna.setActionCommand("btnCancelarComprarTaberna");
        this.vista.btnCancelarComprarTaberna.addActionListener(this);
        this.vista.btnAceptarAlojamiento.setActionCommand("btnAceptarAlojamiento");
        this.vista.btnAceptarAlojamiento.addActionListener(this);
        this.vista.btnCancelarAlojamiento.setActionCommand("btnCancelarAlojamiento");
        this.vista.btnCancelarAlojamiento.addActionListener(this);
        this.vista.btnComprarTienda.setActionCommand("btnComprarTienda");
        this.vista.btnComprarTienda.addActionListener(this);
        this.vista.btnVenderTienda.setActionCommand("btnVenderTienda");
        this.vista.btnVenderTienda.addActionListener(this);
        this.vista.btnSalirTienda.setActionCommand("btnSalirTienda");
        this.vista.btnSalirTienda.addActionListener(this);
        this.vista.btnAceptarCompraTienda.setActionCommand("btnAceptarCompraTienda");
        this.vista.btnAceptarCompraTienda.addActionListener(this);
        this.vista.btnCancelarCompraTienda.setActionCommand("btnCancelarCompraTienda");
        this.vista.btnCancelarCompraTienda.addActionListener(this);
        this.vista.btnVenderVenderTienda.setActionCommand("btnVenderVenderTienda");
        this.vista.btnVenderVenderTienda.addActionListener(this);
        this.vista.btnSalirVenderTienda.setActionCommand("btnSalirVenderTienda");
        this.vista.btnSalirVenderTienda.addActionListener(this);
        this.vista.btnCombatirAtacar.setActionCommand("btnCombatirAtacar");
        this.vista.btnCombatirAtacar.addActionListener(this);
        this.vista.btnCombatirDefender.setActionCommand("btnCombatirDefender");
        this.vista.btnCombatirDefender.addActionListener(this);
        this.vista.btnCombatirEspecial.setActionCommand("btnCombatirEspecial");
        this.vista.btnCombatirEspecial.addActionListener(this);
        this.vista.btnCombatirMochila.setActionCommand("btnCombatirMochila");
        this.vista.btnCombatirMochila.addActionListener(this);
        this.vista.btnCombatirHuir.setActionCommand("btnCombatirHuir");
        this.vista.btnCombatirHuir.addActionListener(this);
        this.vista.btnHuirPerder.setActionCommand("btnHuirPerder");
        this.vista.btnHuirPerder.addActionListener(this);
        this.vista.btnMochilaUsar.setActionCommand("btnMochilaUsar");
        this.vista.btnMochilaUsar.addActionListener(this);
        this.vista.btnMochilaSoltar.setActionCommand("btnMochilaSoltar");
        this.vista.btnMochilaSoltar.addActionListener(this);
        this.vista.btnMochilaEquipar.setActionCommand("btnMochilaEquipar");
        this.vista.btnMochilaEquipar.addActionListener(this);
        this.vista.btnMochilaSalir.setActionCommand("btnMochilaSalir");
        this.vista.btnMochilaSalir.addActionListener(this);
        this.vista.btnSoltarAceptar.setActionCommand("btnSoltarAceptar");
        this.vista.btnSoltarAceptar.addActionListener(this);
        this.vista.btnSoltarCancelar.setActionCommand("btnSoltarCancelar");
        this.vista.btnSoltarCancelar.addActionListener(this);
        this.vista.btnAceptarVenderVenderTienda.setActionCommand("btnAceptarVenderVenderTienda");
        this.vista.btnAceptarVenderVenderTienda.addActionListener(this);
        this.vista.btnCancelarVenderVenderTienda.setActionCommand("btnCancelarVenderVenderTienda");
        this.vista.btnCancelarVenderVenderTienda.addActionListener(this);
        
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