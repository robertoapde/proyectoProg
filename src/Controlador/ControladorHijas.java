package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaHijas;

import Modelo.ModeloHijas;
import Vista.VentanaCarga;
import javax.swing.table.DefaultTableModel;

public class ControladorHijas implements ActionListener, MouseListener{

    VentanaHijas vista;
    VentanaCarga vista2;
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
    btnCancelarVenderVenderTienda,
    
    btnSalirMochilaCombate,
    btnUsarMochilaCombate,
    btnAceptarCambiarContraseña,
    btnCancelarCambiarContraseña
    }
    
    public ControladorHijas(VentanaHijas vista){
        this.vista = vista;
        
    }
    
   public void iniciar(){
        this.vista.setVisible(true);
       
        this.vista.btnCombatir.setActionCommand("btnCombatir");
        this.vista.btnCombatir.addActionListener(this);
        this.vista.btnMochila.setActionCommand("btnMochila");
        this.vista.btnMochila.addActionListener(this);
        this.vista.btnTienda.setActionCommand("btnTienda");
        this.vista.btnTienda.addActionListener(this);
        this.vista.btnTaberna.setActionCommand("btnTaberna");
        this.vista.btnTaberna.addActionListener(this);
        this.vista.btnComprarTaberna.setActionCommand("btnComprarTaberna");
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
        
        this.vista.tablaTienda.addMouseListener(this);
        this.vista.tablaTienda.setModel(modelo.getTablaTienda());
        
        this.vista.tablaTaberna.addMouseListener(this);
        this.vista.tablaTaberna.setModel(modelo.getTablaTaberna());
    }
    
    public void actionPerformed(ActionEvent e) {
        switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case btnCombatir:

                break;
            case  btnMochila:
                this.vista.dialogMochila.setSize(725,625);//ancho , largo
                this.vista.dialogMochila.setLocation(100,100);
                this.vista.dialogMochila.setVisible(true);
                break;
            case btnTienda:
                this.vista.dialogTienda.setSize(625,700);
                this.vista.dialogTienda.setLocation(100,100);
                this.vista.dialogTienda.setVisible(true);
                break;
            case btnTaberna:
                this.vista.dialogTaberna.setSize(540,400);
                this.vista.dialogTaberna.setLocation(150,150);
                this.vista.dialogTaberna.setVisible(true);
                break;
            case btnComprarTaberna:
                this.vista.dialogTabernaCompra.setSize(400,400);
                this.vista.dialogTabernaCompra.setLocation(150,150);
                this.vista.dialogTabernaCompra.setVisible(true);
                break;
            case btnAlojamientoTaberna:
                this.vista.dialogTabernaAlojamiento.setSize(300,250);
                this.vista.dialogTabernaAlojamiento.setLocation(150,150);
                this.vista.dialogTabernaAlojamiento.setVisible(true);
                break;
            case btnSalirTaberna:
                this.vista.dialogTaberna.dispose();
                break;
            case btnAceptarComprarTaberna:
                break;
            case btnCancelarComprarTaberna:
                this.vista.dialogTabernaCompra.dispose();
                break;
            case btnAceptarAlojamiento:
                break;
            case btnCancelarAlojamiento:
                this.vista.dialogTabernaAlojamiento.dispose();
                break;
            case btnComprarTienda:
                this.vista.dialogTiendaComprar.setSize(400,350);
                this.vista.dialogTiendaComprar.setLocation(100,100);
                this.vista.dialogTiendaComprar.setVisible(true);
                break;
            case btnVenderTienda:
                this.vista.dialogTiendaVender.setSize(420,350);
                this.vista.dialogTiendaVender.setLocation(100,100);
                this.vista.dialogTiendaVender.setVisible(true);
                break;   
            case btnSalirTienda:
                this.vista.dialogTienda.dispose();
                break;
            case btnAceptarCompraTienda:
                break;
            case btnCancelarCompraTienda:
                this.vista.dialogTiendaComprar.dispose();
                break;    
            case btnVenderVenderTienda:
                break;
            case btnSalirVenderTienda:
                this.vista.dialogTiendaVender.dispose();
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
                this.vista.dialogHuir.dispose();
                break; 
            case btnMochilaUsar:
                break;
            case btnMochilaSoltar:
                break;
            case btnMochilaEquipar:
                break;
            case btnMochilaSalir:
                this.vista.dialogMochila.dispose();
                break;
            case btnSoltarAceptar:
                break;
            case btnSoltarCancelar:
                this.vista.dialogSoltar.dispose();
                break;    
            case btnAceptarVenderVenderTienda:
                break;  
            case btnCancelarVenderVenderTienda:
                this.vista.dialogTiendaVenderVender.dispose();
                break;
            case btnSalirMochilaCombate:
                this.vista.dialogMochilaCombate.dispose();
                break;
            case btnUsarMochilaCombate:
                
                break;
            case btnAceptarCambiarContraseña:
                
                break;
            case btnCancelarCambiarContraseña:
                this.vista.dialogCambiarContraseña.dispose();
                break;
        }
    }
    
  
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}