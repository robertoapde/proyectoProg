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
    String historialCombateString = "Historial de combate:";
    String usuario;
    
    String objetoTiendaSeleccionado = "";
    String objetoTabernaSeleccionado = "";
    String objetoMochilaSeleccionado = "";
    int precioObjetoTiendaSeleccionado = 0;
    int precioObjetoTabernaSeleccionado = 0;
    int precioObjetoMochilaSeleccionado = 0;
    
    String objetoMochilaVenderSeleccionado = "";
    int precioObjetoMochilaVenderSeleccionado = 0;
    
    
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
    btnCancelarCambiarContraseña
    }
    
    public ControladorHijas(VentanaHijas vista){
        this.vista = vista;
    }
    
   public void iniciar(){        
        usuario = Controlador.Main.controlC.vista1.txtUsuario.getText();
        String [] i = this.modelo.getInfoInterfaz(usuario);
        this.setInfoInterfaz(i);
        JOptionPane.showMessageDialog(null, "Bienvenido, "+usuario+" ("+i[1]+" Nvl. "+i[0]+").");
       
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
                vista.dialogCombatir.setSize(420, 401);
                vista.dialogCombatir.setLocation(450, 325);
                vista.dialogCombatir.setVisible(true);
                break;
                
            case  btnMochila:
                this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                historialString = historialString + "\nMochila abierta.";
                vista.historial.setText(historialString);
                this.vista.dialogMochila.setSize(720, 580);
                this.vista.dialogMochila.setLocation(100,100);
                this.vista.dialogMochila.setVisible(true);
                break;
                
            case btnTienda:
                historialString = historialString + "\nPaseas por el mercado.";
                vista.historial.setText(historialString);
                this.vista.dialogTienda.setSize(630, 658);
                this.vista.dialogTienda.setLocation(100,100);
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnTaberna:
                historialString = historialString + "\nHas entrado en la taberna.";
                vista.historial.setText(historialString);
                this.vista.dialogTaberna.setSize(527, 353);
                this.vista.dialogTaberna.setLocation(150,150);
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnComprarTaberna:
                this.vista.dialogTaberna.setVisible(false);
                this.vista.dialogTabernaCompra.setSize(402, 361);
                this.vista.dialogTabernaCompra.setLocation(150,150);
                this.vista.dialogTabernaCompra.setVisible(true);
                break;
                
            case btnAlojamientoTaberna:
                this.vista.dialogTaberna.setVisible(false);
                this.vista.dialogTabernaAlojamiento.setSize(541, 275);
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
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnAceptarAlojamiento:
                int oroP = Integer.parseInt(vista.txtOro.getText());
                if(oroP >= 30){
                    oroP = oroP - 30;
                    vista.txtOro.setText(String.valueOf(oroP));
                    vista.txtPV.setText(vista.txtPVMax.getText());
                    vista.txtPE.setText(vista.txtPEMax.getText());
                    this.setInfoBD();
                    String [] nuevaVidaPostAlojamiento = this.modelo.getInfoInterfaz(usuario);
                    this.setInfoInterfaz(nuevaVidaPostAlojamiento);
                    JOptionPane.showMessageDialog(null, "Te alojas en la posada y te recuperas.");
                    vista.dialogTabernaAlojamiento.dispose();
                }
                break;
                
            case btnCancelarAlojamiento:
                this.vista.dialogTabernaAlojamiento.dispose();
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnComprarTienda:
                if(objetoTiendaSeleccionado != ""){
                    this.vista.dialogTienda.setVisible(false);
                    this.vista.dialogTiendaComprar.setSize(470, 320);
                    this.vista.dialogTiendaComprar.setLocation(100,100);
                    this.vista.dialogTiendaComprar.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto del mercado.");
                }
                break;
                
            case btnVenderTienda:
                this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
                this.vista.dialogTienda.setVisible(false);
                this.vista.dialogTiendaVender.setSize(400, 320);
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
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnVenderVenderTienda:
                if(objetoMochilaVenderSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    this.vista.dialogTiendaVender.setVisible(false);
                    this.vista.dialogTiendaVenderVender.setSize(410, 270);
                    this.vista.dialogTiendaVenderVender.setLocation(100,100);
                    this.vista.dialogTiendaVenderVender.setVisible(true);
                }
                break;
                
            case btnSalirVenderTienda:
                this.vista.dialogTiendaVender.dispose();
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnCombatirAtacar:
                historialCombateString = historialCombateString + "\nHas lanzado un ataque con tu ";//+Arma;
                vista.historialCombate.setText(historialCombateString);
                /*g.Atacar();
                            if (g.golpe > e.Armadura) {
                                     System.out.println("Tu ATAQUE ha IMPACTADO");
                                    e.PV = e.PV - g.daño;
                                     System.out.println("Daño Hecho:"+ g.daño);
                                    System.out.println("Enemigo: " + e.info());
                                if(e.PV<=0){
                                    g.Oro=g.Oro+e.Oro;
                                    g.Experiencia=g.Experiencia+e.Experiencia;
                                }
                              
                            }else{
                                    System.out.println("Tu ATAQUE fallado ha FALLADO");
                                    System.out.println("Enemigo: " + e.info());
                                }
                              g.setTurno(false);*/
                break;
                
            case btnCombatirDefender:
                historialCombateString = historialCombateString + "\nPOSICION DEFENSIVA";
                vista.historialCombate.setText(historialCombateString);
                /*if(g.Defensa<4){
                                g.Defensa();
                                System.out.println("DURO como la PIEDRA");
                                System.out.println("Guerrero: "+ g.info());
                                g.setTurno(false); 
                                
                         }else{
                               System.out.println("Tu DEFENSA esta al MÁXIMO");
                               g.setTurno(true);
                               System.out.println("Guerrero: "+ g.info());
                         }*/
                break;
                
            case btnCombatirEspecial:
                historialCombateString = historialCombateString + "\nLanzas un ATAQUE con todas tu FUERZAS";
                vista.historialCombate.setText(historialCombateString);
                /*g.AtaqueEspecial();                 
                            if (g.golpe > e.Armadura) {
                                System.out.println("¿Eso era personal?BOOM.");
                                e.PV = e.PV - g.daño;
                                System.out.println("Daño Hecho:"+ g.daño);
                                System.out.println("Enemigo: " + e.info());
                                if(e.PV<=0){
                                    g.Oro=g.Oro+e.Oro;
                                    g.Experiencia=g.Experiencia+e.Experiencia;
                                 }
                             
                            }else{
                                    System.out.println("Has fallado el ataque");
                                    System.out.println("Enemigo: " + e.info());
                                }
                              g.setTurno(false);*/
                break;
                
            case btnCombatirMochila:
                this.vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
                vista.dialogCombatir.setVisible(false);
                vista.dialogMochilaCombate.setSize(400, 313);
                vista.dialogMochilaCombate.setLocation(100,100);
                vista.dialogMochilaCombate.setVisible(true);
                vista.historialCombate.setText(historialCombateString);
                break;
                
            case btnCombatirHuir:
                historialCombateString = "Historial de combate:";
                vista.historialCombate.setText(historialCombateString);
                vista.dialogCombatir.dispose();
                vista.dialogHuir.setSize(420, 560);
                vista.dialogHuir.setLocation(100,100);
                vista.dialogHuir.setVisible(true);
                historialString = historialString + "\nCombate finalizado.";
                vista.historial.setText(historialString);
                break;
                
            case btnHuirPerder:
                /*g.Huir();
                if(s==1){
                    System.out.println("Has conseguido HUIR");
                    vista.dialogHuir.dispose();
                    vista.dialogCombatir.dispose();    
                }
                if(s==2){
                    System.out.println("NO puedes HUIR");
                }
                if(s==3){
                    System.out.println("No puedes HUIR");
                }*/
                vista.dialogHuir.dispose();
                vista.dialogCombatir.dispose();         
                break;
                
            case btnMochilaUsar:
                break;
                
            case btnMochilaSoltar:
                if(objetoMochilaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    vista.dialogMochila.setVisible(false);
                    vista.dialogSoltar.setSize(350, 200);
                    vista.dialogSoltar.setLocation(100,100);
                    vista.dialogSoltar.setVisible(true);
                }
                break;
                
            case btnMochilaEquipar:
                if(objetoMochilaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto equipable.");
                }else{
                    switch (objetoMochilaSeleccionado) {
                    case "Armadura Ligera I":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera I.png")));
                        break;
                    case "Armadura Ligera II":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera II.png")));
                        break;
                    case "Armadura Ligera III":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera III.png")));
                        break;
                    case "Armadura Intermedia I":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia I.png")));
                        break;
                    case "Armadura Intermedia II":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia II.png")));
                        break;
                    case "Armadura Intermedia III":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia III.png")));
                        break;
                    case "Armadura Pesada I":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada I.png")));
                        break;
                    case "Armadura Pesada II":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada II.png")));
                        break;
                    case "Armadura Pesada III":
                        this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada III.png")));
                        break;
                    }
                }
                break;
                
            case btnMochilaSalir:
                this.vista.dialogMochila.dispose();
                historialString = historialString + "\nHas cerrado la mochila.";
                vista.historial.setText(historialString);
                break;
                
            case btnSoltarAceptar:
                modelo.soltarObjeto(objetoMochilaSeleccionado, usuario);
                vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                JOptionPane.showMessageDialog(null, "Objeto soltado y perdido para siempre.");
                vista.dialogSoltar.dispose();
                vista.dialogMochila.setVisible(true);
                break;
                
            case btnSoltarCancelar:
                this.vista.dialogSoltar.dispose();
                vista.dialogMochila.setVisible(true);
                break;
                
            case btnAceptarVenderVenderTienda:
                modelo.venderObjetoMochila(usuario, precioObjetoMochilaVenderSeleccionado, objetoMochilaVenderSeleccionado);
                this.setInfoBD();
                String [] nuevoOroPostVenta = this.modelo.getInfoInterfaz(usuario);
                this.setInfoInterfaz(nuevoOroPostVenta);
                this.vista.dialogTiendaVenderVender.dispose();
                this.vista.dialogTiendaVender.setVisible(true);
                this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
                break;
                
            case btnCancelarVenderVenderTienda:
                this.vista.dialogTiendaVenderVender.dispose();
                this.vista.dialogTiendaVender.setVisible(true);
                break;
                
            case btnSalirMochilaCombate:
                this.vista.dialogMochilaCombate.dispose();
                this.vista.dialogCombatir.setVisible(true);
                break;
                
            case btnUsarObjetoCombate:
                break;
                
            case btnCambiarC:
                this.vista.setVisible(false);
                this.vista.dialogCambiarContraseña.setVisible(true);
                this.vista.dialogCambiarContraseña.setSize(511, 330);
                this.vista.dialogCambiarContraseña.setLocation(100,100);
                break;
                
            case btnCerrarS:
                this.setInfoBD();
                this.vista.dispose();
                this.vista2.setVisible(true);
                break;
                
            case btnAceptarCambiarContraseña:
                modelo.CambiarContraseña(this.vista.txtNombre.getText(),this.vista.jTextContraseñaA.getText(),this.vista.jTextContraseñaN.getText());
                this.vista.dialogCambiarContraseña.setVisible(false);
                this.vista.setVisible(true);
                break;
                
            case btnCancelarCambiarContraseña:
                this.vista.dialogCambiarContraseña.dispose();
                this.vista.setVisible(true);
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
        vista.txtPV.setText(vida);
        vista.txtPE.setText(energia);
        vista.txtPVMax.setText(vidaMax);
        vista.txtPEMax.setText(energiaMax);
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
        String vida = vista.txtPV.getText();
        String energia = vista.txtPE.getText();;
        String vidaMax = vista.txtPVMax.getText();;
        String energiaMax = vista.txtPEMax.getText();;
        
        modelo.actualizarBD(usuario, nivel, experiencia, oro, vida, energia, vidaMax, energiaMax);
    }
    
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()== 1)
        {
            int filaTienda = this.vista.tablaTienda.rowAtPoint(e.getPoint());
            int filaTaberna = this.vista.tablaTaberna.rowAtPoint(e.getPoint());
            int filaMochila = this.vista.tablaMochila.rowAtPoint(e.getPoint());
            int filaMochilaVender = this.vista.tablaMochilaVender.rowAtPoint(e.getPoint());
            
            if (filaTienda > -1){
                objetoTiendaSeleccionado = String.valueOf(this.vista.tablaTienda.getValueAt(filaTienda, 0));
                precioObjetoTiendaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaTienda.getValueAt(filaTienda, 1)));
            }else{
                objetoTiendaSeleccionado = "";
                precioObjetoTiendaSeleccionado = 0;
            }
            if(filaTaberna > -1){
                objetoTabernaSeleccionado = String.valueOf(this.vista.tablaTaberna.getValueAt(filaTaberna, 0));
                precioObjetoTabernaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaTaberna.getValueAt(filaTaberna, 1)));
            }else{
                objetoTabernaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
            }
            if(filaMochila > -1){
                objetoMochilaSeleccionado = String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 0));
                precioObjetoMochilaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 1)));
            }else{
                objetoMochilaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
            }
            if(filaMochilaVender > -1){
                objetoMochilaVenderSeleccionado = String.valueOf(this.vista.tablaMochilaVender.getValueAt(filaMochilaVender, 0));
                precioObjetoMochilaVenderSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochilaVender.getValueAt(filaMochilaVender, 1)));
            }else if(filaMochilaVender == -1){
                objetoMochilaVenderSeleccionado = "";
                precioObjetoMochilaVenderSeleccionado = 0;
            }
        }
    }
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}