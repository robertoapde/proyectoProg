package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaHijas;

import Modelo.ModeloHijas;
import Vista.VentanaCarga;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ControladorHijas implements ActionListener, MouseListener{

    VentanaHijas vista = Controlador.Main.controlC.vista3;
    VentanaCarga vista2 = Controlador.Main.controlC.vista1;
    
    ModeloHijas modelo = new ModeloHijas();
    
    String historialString = "Historial de partida:";
    String historialCombateString = "Historial de combate: ";
    String usuario;
    
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
    
    btnCambiarC,
    btnCerrarS,
    btnAceptarCambiarContraseña,
    btnCancelarCambiarContraseña,
    }
    
    public ControladorHijas(VentanaHijas vista){
        this.vista = vista;
    }
    
   public void iniciar(){
        this.vista.setVisible(true);
        usuario = Controlador.Main.controlC.vista1.txtUsuario.getText();
        String[] info = this.modelo.getInfoInterfaz(usuario);
        this.setInfoInterfaz(info);
       
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
        
        this.vista.tablaMochila.addMouseListener(this);
        this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
        
        this.vista.btnCambiarC.setActionCommand("btnCambiarC");
        this.vista.btnCambiarC.addActionListener(this);
        this.vista.btnCerrarS.setActionCommand("btnCerrarS");
        this.vista.btnCerrarS.addActionListener(this);
        this.vista.btnAceptarCambiarContraseña.setActionCommand("btnAceptarCambiarContraseña");
        this.vista.btnAceptarCambiarContraseña.addActionListener(this);
        this.vista.btnCancelarCambiarContraseña.setActionCommand("btnCancelarCambiarContraseña");
        this.vista.btnCancelarCambiarContraseña.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case btnCombatir:
                historialString = historialString + "\n¡Combate iniciado!";
                vista.historial.setText(historialString);
                historialCombateString = historialCombateString + "\n¡Olonam salvaje ha aparecido!";
                vista.historialCombate.setText(historialCombateString);
                vista.dialogCombatir.setSize(382, 410);
                vista.dialogCombatir.setLocation(450, 325);
                vista.dialogCombatir.setVisible(true);
                break;
            case  btnMochila:
                historialString = historialString + "\nMochila abierta.";
                vista.historial.setText(historialString);
                this.vista.dialogMochila.setSize(725,625);//ancho , largo
                this.vista.dialogMochila.setLocation(100,100);
                this.vista.dialogMochila.setVisible(true);
                break;
            case btnTienda:
                historialString = historialString + "\nPaseas por el mercado.";
                vista.historial.setText(historialString);
                this.vista.dialogTienda.setSize(625,700);
                this.vista.dialogTienda.setLocation(100,100);
                this.vista.dialogTienda.setVisible(true);
                break;
            case btnTaberna:
                historialString = historialString + "\nHas entrado en la taberna.";
                vista.historial.setText(historialString);
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
                historialString = historialString + "\nHas salido de la taberna.";
                vista.historial.setText(historialString);
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
                historialString = historialString + "\nHas vuelto del mercado.";
                vista.historial.setText(historialString);
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
                historialCombateString = historialCombateString + "\nHa intentado atacar a Olonam, pero como es muy fuerte, esquiva fácilmente tus ataques.";
                vista.historialCombate.setText(historialCombateString);
                break;    
            case btnCombatirDefender:
                historialCombateString = historialCombateString + "\nNo puedes defenderte porque no quiero.";
                vista.historialCombate.setText(historialCombateString);
                break;
            case btnCombatirEspecial:
                historialCombateString = historialCombateString + "\nNo, lo siento, no tienes nada de especial.";
                vista.historialCombate.setText(historialCombateString);
                break;
            case btnCombatirMochila:
                historialCombateString = historialCombateString + "\nNo tienes mochila, porque eres pobre y ni siquiera llevas ropa puesta.";
                vista.historialCombate.setText(historialCombateString);
                break;
            case btnCombatirHuir:
                historialCombateString = "Historial de combate:";
                vista.historialCombate.setText(historialCombateString);
                vista.dialogCombatir.dispose();
                vista.dialogHuir.setSize(470,640);
                vista.dialogHuir.setLocation(100,100);
                vista.dialogHuir.setVisible(true);
                historialString = historialString + "\nCombate finalizado.";
                vista.historial.setText(historialString);
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
                historialString = historialString + "\nHas cerrado la mochila.";
                vista.historial.setText(historialString);
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
            case btnCambiarC:
                this.vista.dialogCambiarContraseña.setVisible(true);
                this.vista.dialogCambiarContraseña.setSize(511, 301);
                this.vista.dialogCambiarContraseña.setLocation(100,100);
                break;
                
            case btnCerrarS:
                this.vista.dispose();
                this.vista2.setVisible(true);
                break;
                      
            case btnAceptarCambiarContraseña:
              
                modelo.CambiarContraseña(this.vista.txtNombre.getText(),this.vista.jTextContraseñaA.getText(),this.vista.jTextContraseñaN.getText() );
                break;
            case btnCancelarCambiarContraseña:
                this.vista.dialogCambiarContraseña.dispose();
                break;
        }
    }
    
    public void setInfoInterfaz(String[] s){
        String nivel = s[0];
        String clase = s[1];
        String experiencia = s[2];
        String oro = s[3];
        String vida = s[4];
        String energia = s[5];
        String vidaMax = s[6];
        String energiaMax = s[7];
        vista.txtNombre.setText(usuario);
        vista.txtNivel.setText(nivel);
        vista.txtClase.setText(clase);
        vista.txtExperiencia.setText(experiencia);
        vista.txtOro.setText(oro);
        switch (clase){
            case "Picaro":
                this.vista.fotoClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/picaro.png")));
                break;
            case "Mago":
                this.vista.fotoClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mago.jpg")));
                break;
            case "Guerrero":
                this.vista.fotoClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guerrero.png")));
                break;
        }
        JOptionPane.showMessageDialog(null, "Bienvenido, "+usuario+" ("+s[1]+" Nvl. "+s[0]+")");
    }
    
    public void mouseClicked(MouseEvent e) {}
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}