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
        this.vista.dialogTaberna.btnComprarTaberna.setActionCommand("dialogTaberna");
        this.vista.dialogTaberna.btnComprarTaberna.addActionListener(this);
        this.vista.dialogTaberna.btnAlojamientoTaberna.setActionCommand("btnAlojamientoTaberna");
        this.vista.dialogTaberna.btnAlojamientoTaberna.addActionListener(this);
        this.vista.dialogTaberna.btnSalirTaberna.setActionCommand("btnSalirTaberna");
        this.vista.dialogTaberna.btnSalirTaberna.addActionListener(this);
        this.vista.dialogTabernaCompra.btnAceptarComprarTaberna.setActionCommand("btnAceptarComprarTaberna");
        this.vista.dialogTabernaCompra.btnAceptarComprarTaberna.addActionListener(this);
        this.vista.dialogTabernaCompra.btnCancelarComprarTaberna.setActionCommand("btnCancelarComprarTaberna");
        this.vista.dialogTabernaCompra.btnCancelarComprarTaberna.addActionListener(this);
        this.vista.dialogTabernaAlojamiento.btnAceptarAlojamiento.setActionCommand("btnAceptarAlojamiento");
        this.vista.dialogTabernaAlojamiento.btnAceptarAlojamiento.addActionListener(this);
        this.vista.dialogTabernaAlojamiento.btnCancelarAlojamiento.setActionCommand("btnCancelarAlojamiento");
        this.vista.dialogTabernaAlojamiento.btnCancelarAlojamiento.addActionListener(this);
        this.vista.dialogTienda.btnComprarTienda.setActionCommand("btnComprarTienda");
        this.vista.dialogTienda.btnComprarTienda.addActionListener(this);
        this.vista.dialogTienda.btnVenderTienda.setActionCommand("btnVenderTienda");
        this.vista.dialogTienda.btnVenderTienda.addActionListener(this);
        this.vista.dialogTienda.btnSalirTienda.setActionCommand("btnSalirTienda");
        this.vista.dialogTienda.btnSalirTienda.addActionListener(this);
        this.vista.dialogTiendaComprar.btnAceptarCompraTienda.setActionCommand("btnAceptarCompraTienda");
        this.vista.dialogTiendaComprar.btnAceptarCompraTienda.addActionListener(this);
        this.vista.dialogTiendaComprar.btnCancelarCompraTienda.setActionCommand("btnCancelarCompraTienda");
        this.vista.dialogTiendaComprar.btnCancelarCompraTienda.addActionListener(this);
        this.vista.dialogTiendaVender.btnVenderVenderTienda.setActionCommand("btnVenderVenderTienda");
        this.vista.dialogTiendaVender.btnVenderVenderTienda.addActionListener(this);
        this.vista.dialogTiendaVender.btnSalirVenderTienda.setActionCommand("btnSalirVenderTienda");
        this.vista.dialogTiendaVender.btnSalirVenderTienda.addActionListener(this);
        this.vista.dialogCombatir.btnCombatirAtacar.setActionCommand("btnCombatirAtacar");
        this.vista.dialogCombatir.btnCombatirAtacar.addActionListener(this);
        this.vista.dialogCombatir.btnCombatirDefender.setActionCommand("btnCombatirDefender");
        this.vista.dialogCombatir.btnCombatirDefender.addActionListener(this);
        this.vista.dialogCombatir.btnCombatirEspecial.setActionCommand("btnCombatirEspecial");
        this.vista.dialogCombatir.btnCombatirEspecial.addActionListener(this);
        this.vista.dialogCombatir.btnCombatirMochila.setActionCommand("btnCombatirMochila");
        this.vista.dialogCombatir.btnCombatirMochila.addActionListener(this);
        this.vista.dialogCombatir.btnCombatirHuir.setActionCommand("btnCombatirHuir");
        this.vista.dialogCombatir.btnCombatirHuir.addActionListener(this);
        this.vista.dialogHuir.btnHuirPerder.setActionCommand("btnHuirPerder");
        this.vista.dialogHuir.btnHuirPerder.addActionListener(this);
        this.vista.dialogMochila.btnMochilaUsar.setActionCommand("btnMochilaUsar");
        this.vista.dialogMochila.btnMochilaUsar.addActionListener(this);
        this.vista.dialogMochila.btnMochilaSoltar.setActionCommand("btnMochilaSoltar");
        this.vista.dialogMochila.btnMochilaSoltar.addActionListener(this);
        this.vista.dialogMochila.btnMochilaEquipar.setActionCommand("btnMochilaEquipar");
        this.vista.dialogMochila.btnMochilaEquipar.addActionListener(this);
        this.vista.dialogMochila.btnMochilaSalir.setActionCommand("btnMochilaSalir");
        this.vista.dialogMochila.btnMochilaSalir.addActionListener(this);
        this.vista.dialogSoltar.btnSoltarAceptar.setActionCommand("btnSoltarAceptar");
        this.vista.dialogSoltar.btnSoltarAceptar.addActionListener(this);
        this.vista.dialogSoltar.btnSoltarCancelar.setActionCommand("btnSoltarCancelar");
        this.vista.dialogSoltar.btnSoltarCancelar.addActionListener(this);
        this.vista.dialogTiendaVenderVender.btnAceptarVenderVenderTienda.setActionCommand("btnAceptarVenderVenderTienda");
        this.vista.dialogTiendaVenderVender.btnAceptarVenderVenderTienda.addActionListener(this);
        this.vista.dialogTiendaVenderVender.btnCancelarVenderVenderTienda.setActionCommand("btnCancelarVenderVenderTienda");
        this.vista.dialogTiendaVenderVender.btnCancelarVenderVenderTienda.addActionListener(this);
        
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