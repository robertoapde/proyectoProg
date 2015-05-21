package Controlador;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import Vista.VentanaHijas;

import Modelo.ModeloHijas;
import Vista.VentanaCarga;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ControladorHijas implements ActionListener, MouseListener{

    VentanaHijas vista = Controlador.Main.controlC.vista3;
    VentanaCarga vista2 = Controlador.Main.controlC.vista1;
    
    ModeloHijas modelo = new ModeloHijas();
    
    String historialString = "Historial de partida:";
    String historialCombateString = "Historial de combate: ";
    String usuario;
    
    String objetoTiendaSeleccionado = "";
    String objetoTabernaSeleccionado = "";
    String objetoMochilaSeleccionado = "";
    int precioObjetoTiendaSeleccionado = 0;
    int precioObjetoTabernaSeleccionado = 0;
    int precioObjetoMochilaSeleccionado = 0;
    String tipoObjetoMochilaSeleccionado = "";
    
    
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
    btnUsarObjetoCombate,
    btnSalirMochilaCombate,
    
    btnCambiarC,
    btnCerrarS,
    btnAceptarCambiarContraseña,
    btnCancelarCambiarContraseña,
    }
    
    public ControladorHijas(VentanaHijas vista){
        this.vista = vista;
    }
    
   public void iniciar(){        
        usuario = Controlador.Main.controlC.vista1.txtUsuario.getText();
        String [] i = this.modelo.getInfoInterfaz(usuario);
        this.setInfoInterfaz(i);
        JOptionPane.showMessageDialog(null, "Bienvenido, "+usuario+" ("+i[1]+" Nvl. "+i[0]+")");
       
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
        this.vista.btnUsarObjetoCombate.setActionCommand("btnUsarObjetoCombate");
        this.vista.btnUsarObjetoCombate.addActionListener(this);
        this.vista.btnSalirMochilaCombate.setActionCommand("btnSalirMochilaCombate");
        this.vista.btnSalirMochilaCombate.addActionListener(this);
        
        this.vista.tablaTienda.addMouseListener(this);
        this.vista.tablaTienda.setModel(modelo.getTablaTienda());
        this.vista.tablaTienda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.vista.tablaTaberna.addMouseListener(this);
        this.vista.tablaTaberna.setModel(modelo.getTablaTaberna());
        this.vista.tablaTaberna.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.vista.tablaMochila.addMouseListener(this);
        this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
        this.vista.tablaMochila.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.vista.tablaMochilaVender.addMouseListener(this);
        this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
        this.vista.tablaMochilaVender.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.vista.tablaMochilaCombate.addMouseListener(this);
        this.vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
        this.vista.tablaMochilaCombate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
                this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
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
                if(objetoTiendaSeleccionado != ""){
                    this.vista.dialogTiendaComprar.setSize(400,350);
                    this.vista.dialogTiendaComprar.setLocation(100,100);
                    this.vista.dialogTiendaComprar.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto del mercado");
                }
                break;
            case btnVenderTienda:
                this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
                historialString = historialString + "\nHas salido de la tienda";
                this.vista.dialogTiendaVender.setSize(420,350);
                this.vista.dialogTiendaVender.setLocation(100,100);
                this.vista.dialogTiendaVender.setVisible(true);
                break;   
            case btnSalirTienda:
                this.vista.dialogTienda.dispose();
                historialString = historialString + "\nHas vuelto del mercado.";
                vista.historial.setText(historialString);
                vista.dialogTiendaComprar.dispose();
                break;
            case btnAceptarCompraTienda:
                int oro = Integer.parseInt(this.vista.txtOro.getText());
                if(oro >= precioObjetoTiendaSeleccionado){
                    String usuario = this.vista.txtNombre.getText();
                    int funciona = this.modelo.comprarObjetoTienda(usuario, objetoTiendaSeleccionado);
                    if (funciona == 1){
                        JOptionPane.showMessageDialog(null, objetoTiendaSeleccionado+" comprad@.");
                        this.vista.txtOro.setText(String.valueOf(oro - precioObjetoTiendaSeleccionado));
                        this.setInfoBD();
                        String [] nuevoOroPostCompra = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevoOroPostCompra);
                        historialString = historialString + "\n"+objetoTiendaSeleccionado+" comprad@.";
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al comprar objeto.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Objeto demasiado caro.");
                }
                this.vista.dialogTiendaComprar.dispose();
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
                this.vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
                vista.dialogCombatir.setVisible(false);
                vista.dialogMochilaCombate.setVisible(true);
                vista.dialogMochilaCombate.setSize(470,640);
                vista.dialogMochilaCombate.setLocation(100,100);
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
                vista.dialogCombatir.setVisible(true);
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
            case btnUsarObjetoCombate:
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
    }
    
    public void setInfoBD(){
        String usuario = vista.txtNombre.getText();
        String nivel = vista.txtNivel.getText();
        String experiencia = vista.txtExperiencia.getText();
        String oro = vista.txtOro.getText();
        String vida;
        String energia ;
        String vidaMax ;
        String energiaMax ;
        
        modelo.actualizarBD(usuario, nivel, experiencia, oro);
    }
    
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()== 1)
        {
            int filaTienda = this.vista.tablaTienda.rowAtPoint(e.getPoint());
            int filaTaberna = this.vista.tablaTaberna.rowAtPoint(e.getPoint());
            int filaMochila = this.vista.tablaMochila.rowAtPoint(e.getPoint());
            
            if (filaTienda > -1){
                objetoTiendaSeleccionado = String.valueOf(this.vista.tablaTienda.getValueAt(filaTienda, 0));
                precioObjetoTiendaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaTienda.getValueAt(filaTienda, 1)));
            }else if(filaTienda == -1){
                objetoTiendaSeleccionado = "";
                precioObjetoTiendaSeleccionado = 0;
            }else if(filaTaberna > -1){
                objetoTabernaSeleccionado = String.valueOf(this.vista.tablaTaberna.getValueAt(filaTienda, 0));
                precioObjetoTabernaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaTaberna.getValueAt(filaTienda, 1)));
            }else if(filaTaberna == -1){
                objetoTabernaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
            }else if(filaMochila > -1){
                objetoMochilaSeleccionado = String.valueOf(this.vista.tablaMochila.getValueAt(filaTienda, 0));
                precioObjetoMochilaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochila.getValueAt(filaTienda, 1)));
                tipoObjetoMochilaSeleccionado = String.valueOf(this.vista.tablaMochila.getValueAt(filaTienda, 2));
            }else if(filaMochila == -1){
                objetoMochilaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
            }
        }
    }
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}