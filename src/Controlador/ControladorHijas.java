package Controlador;

import Clases.Enemigo;
import Clases.Guerrero;
import Clases.Mago;
import Clases.ObjetoTemp;
import Clases.Picaro;
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
    String tipoObjetoMochilaSeleccionado = "";
    int efectoObjetoMochilaSeleccionado = 0;
    int efectoObjetoTabernaSeleccionado = 0;
    String objetoMochilaCombateSeleccionado = "";
    int efectoObjetoMochilaCombateSeleccionado = 0;
    String tipoObjetoMochilaCombateSeleccionado = "";
    
    
    Guerrero g ;
    Mago m;
    Enemigo en ;
    Picaro p ;
    ObjetoTemp o;
    
    Enemigo enemigo;
    String nombreEne;
    int vidaEne;
    int nivelEne;
    int experienciaEne;
    int dañoEne;
    int armaduraEne;
    int oroEne;
    int ataqueEne;
    
    int cont = 5, contNv = 1;
    
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
   
     public int ExpMax(int Nivel){
        int cont = 5;
        int contNv =1 ;
        int  ExpMax=0;
        for(int i = 0; i >= Nivel ; i++){
         ExpMax = cont * 25 * contNv;
         cont++;
         contNv = contNv * 2;
         }
       return ExpMax;
    }
     
   public void iniciar(){
        try{
           vista.historial.setText(historialString);
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
            this.vista.tablaTienda.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaTienda.getTableHeader().setResizingAllowed(false);

            this.vista.tablaTaberna.addMouseListener(this);
            this.vista.tablaTaberna.setModel(modelo.getTablaTaberna());
            this.vista.tablaTaberna.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaTaberna.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaTienda.getTableHeader().setResizingAllowed(false);

            this.vista.tablaMochila.addMouseListener(this);
            this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
            this.vista.tablaMochila.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaMochila.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaMochila.getTableHeader().setResizingAllowed(false);

            this.vista.tablaMochilaVender.addMouseListener(this);
            this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
            this.vista.tablaMochilaVender.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaMochilaVender.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaMochilaVender.getTableHeader().setResizingAllowed(false);

            this.vista.tablaMochilaCombate.addMouseListener(this);
            this.vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
            this.vista.tablaMochilaCombate.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaMochilaCombate.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaMochilaCombate.getTableHeader().setResizingAllowed(false);

            this.vista.btnCambiarC.setActionCommand("btnCambiarC");
            this.vista.btnCambiarC.addActionListener(this);
            this.vista.btnCerrarS.setActionCommand("btnCerrarS");
            this.vista.btnCerrarS.addActionListener(this);
            this.vista.btnAceptarCambiarContraseña.setActionCommand("btnAceptarCambiarContraseña");
            this.vista.btnAceptarCambiarContraseña.addActionListener(this);
            this.vista.btnCancelarCambiarContraseña.setActionCommand("btnCancelarCambiarContraseña");
            this.vista.btnCancelarCambiarContraseña.addActionListener(this);

            
            int armadura = this.modelo.obtenerArmadura(usuario);
            int daño = this.modelo.obtenerDaño(usuario);
            int ataque = this.modelo.obtenerAtaque(usuario); 
            int nivel = Integer.parseInt(this.vista.txtNivel.getText());
            int expMax = this.ExpMax(nivel);
            int PV = Integer.parseInt(this.vista.txtPV.getText());
            int PE = Integer.parseInt(this.vista.txtPE.getText());
            int PVMax =Integer.parseInt(this.vista.txtPVMax.getText());
            int PEMax =Integer.parseInt(this.vista.txtPEMax.getText());
            int oroCombate = Integer.parseInt(this.vista.txtOro.getText());
            int experiencia=Integer.parseInt(this.vista.txtExperiencia.getText());


            if(this.vista.txtClase.getText().equals("Picaro")){
                historialCombateString = historialCombateString + "\nPicaro";
                vista.historialCombate.setText(historialCombateString);
                p= new Picaro(PV,PE,PVMax,PEMax, armadura, daño, ataque,oroCombate,experiencia ,expMax,nivel);
                o = new ObjetoTemp(p.getPV(), p.getPE(),p.getMaxPV(),p.getMaxPV(), p.getArmadura(), p.getDaño(), p.getAtaque(), p.getOro(), p.getExperiencia(),p.getExpMax(),p.getNivel());
            }else if(this.vista.txtClase.getText().equals("Mago")){
                historialCombateString = historialCombateString + "\nMago";
                vista.historialCombate.setText(historialCombateString);
                m= new Mago(PV,PE,PVMax,PEMax, armadura, daño, ataque,oroCombate,experiencia ,expMax,nivel);
                o = new ObjetoTemp(m.getPV(), m.getPE(),m.getMaxPV(),m.getMaxPV(), m.getArmadura(), m.getDaño(), m.getAtaque(), m.getOro(), m.getExperiencia(),m.getExpMax(),m.getNivel());
            } else if(this.vista.txtClase.getText().equals("Guerrero")){
                historialCombateString = historialCombateString + "\nGuerrero";
                vista.historialCombate.setText(historialCombateString);
                g= new Guerrero(PV,PE,PVMax,PEMax, armadura, daño, ataque,oroCombate,experiencia ,expMax,nivel);
                o = new ObjetoTemp(g.getPV(), g.getPE(),g.getMaxPV(),g.getMaxPE(), g.getArmadura(), g.getDaño(), g.getAtaque(), g.getOro(), g.getExperiencia(),g.getExpMax(),g.getNivel());
            }

            this.vista.txtPVEnemigo.setText(String.valueOf(vidaEne));
            this.vista.txtNombreCombate.setText(usuario);
            this.vista.txtPVCombate.setText(this.vista.txtPV.getText());
            this.vista.txtPVCombateMax.setText(this.vista.txtPVMax.getText());
            this.vista.txtPECombate.setText(this.vista.txtPE.getText());
            this.vista.txtPECombateMax.setText(this.vista.txtPEMax.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar ControladorHijas");
            e.printStackTrace();
        }
    }
   
    
    public void actionPerformed(ActionEvent e) {
        
        switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case btnCombatir:
                int nivelUsuario = Integer.parseInt(vista.txtNivel.getText());
                
                if(nivelUsuario == 1){
                    String[][] enemigos = new String[2][8];
                    enemigos = modelo.datosEnemigo(nivelUsuario);
                    int huir = (int) (Math.random()*(2));
                    nombreEne = enemigos[huir][0];
                    vidaEne = Integer.parseInt(enemigos[huir][1]);
                    nivelEne = Integer.parseInt(enemigos[huir][2]);
                    experienciaEne = Integer.parseInt(enemigos[huir][3]);
                    dañoEne = Integer.parseInt(enemigos[huir][4]);
                    armaduraEne = Integer.parseInt(enemigos[huir][5]);
                    oroEne = Integer.parseInt(enemigos[huir][6]);
                    ataqueEne = Integer.parseInt(enemigos[huir][7]);
                    en = new Enemigo(vidaEne, armaduraEne, dañoEne, ataqueEne);
                }else{
                    String[][] enemigos = new String[3][8];
                    enemigos = modelo.datosEnemigo(nivelUsuario);
                    int huir = (int) (Math.random()*(3));
                    nombreEne = enemigos[huir][0];
                    vidaEne = Integer.parseInt(enemigos[huir][1]);
                    nivelEne = Integer.parseInt(enemigos[huir][2]);
                    experienciaEne = Integer.parseInt(enemigos[huir][3]);
                    dañoEne = Integer.parseInt(enemigos[huir][4]);
                    armaduraEne = Integer.parseInt(enemigos[huir][5]);
                    oroEne = Integer.parseInt(enemigos[huir][6]);
                    ataqueEne = Integer.parseInt(enemigos[huir][7]);
                    en = new Enemigo(vidaEne, armaduraEne, dañoEne, ataqueEne);
                }
               
                historialCombateString="";
                this.vista.historialCombate.setText(historialCombateString);
                historialString = historialString + "";
                this.vista.historial.setText(historialString);
                historialString = historialString + "\n¡Combate iniciado!";
                this.vista.historial.setText(historialString);
                historialCombateString = historialCombateString + "\n¡"+nombreEne+" ha aparecido!";
                this.vista.historialCombate.setText(historialCombateString);
                this.vista.dialogCombatir.setSize(420, 540);
                this.vista.dialogCombatir.setLocation(450, 325);
                
                this.vista.txtNombreCombate.setText(usuario);
                this.vista.txtPVCombate.setText(this.vista.txtPV.getText());
                this.vista.txtPVCombateMax.setText(this.vista.txtPVMax.getText());
                this.vista.txtPECombate.setText(this.vista.txtPE.getText());
                this.vista.txtPECombateMax.setText(this.vista.txtPEMax.getText());
                
                this.vista.txtPVEnemigo.setText(String.valueOf(vidaEne));
                this.vista.txtPVEnemigoMax.setText(String.valueOf(vidaEne));
                this.vista.txtNombreEnemigo.setText(nombreEne);
                this.vista.txtNivelEnemigo.setText(String.valueOf(nivelEne));
                
                this.vista.setVisible(false);
                this.vista.dialogCombatir.setVisible(true);
                this.vista.txtPVEnemigo.setText(String.valueOf(en.getPV()));
                break;
                
            case  btnMochila:
                this.vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                if(vista.txtEquipo.getText().equals("")){
                    this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tio pajo.jpg")));
                }else{
                    this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+vista.txtEquipo.getText()+".png")));
                }
                historialString = historialString + "\nMochila abierta.";
                vista.historial.setText(historialString);
                vista.setVisible(false);
                this.vista.dialogMochila.setSize(720, 580);
                this.vista.dialogMochila.setLocation(100,100);
                this.vista.dialogMochila.setVisible(true);
                break;
                
            case btnTienda:
                historialString = historialString + "\nPaseas por el mercado.";
                vista.historial.setText(historialString);
                vista.setVisible(false);
                this.vista.dialogTienda.setSize(630, 658);
                this.vista.dialogTienda.setLocation(100,100);
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnTaberna:
                historialString = historialString + "\nHas entrado en la taberna.";
                vista.historial.setText(historialString);
                vista.setVisible(false);
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
                this.vista.dialogTabernaAlojamiento.setLocation(75,75);
                this.vista.dialogTabernaAlojamiento.setVisible(true);
                break;
                
            case btnSalirTaberna:
                this.vista.dialogTaberna.setVisible(false);
                historialString = historialString + "\nHas salido de la taberna.";
                vista.historial.setText(historialString);
                this.vista.setVisible(true);
                break;
                
            case btnAceptarComprarTaberna:
                if(objetoTabernaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un alimento.");
                }else{
                    if((Integer.parseInt(vista.txtOro.getText()) - precioObjetoTabernaSeleccionado) < 0){
                        JOptionPane.showMessageDialog(null, "No tienes suficiente oro.");
                    }else{
                        if(objetoTabernaSeleccionado.equals("Pan") || objetoTabernaSeleccionado.equals("Pollo") || objetoTabernaSeleccionado.equals("Conejo")){
                            if(vista.txtPV.getText().equals(vista.txtPVMax.getText())){
                                JOptionPane.showMessageDialog(null, "Ya tienes la vida al máximo.");
                            }else{
                                int nuevoOro = Integer.parseInt(vista.txtOro.getText()) - precioObjetoTabernaSeleccionado;
                                int nuevoPV = Integer.parseInt(vista.txtPV.getText()) + efectoObjetoTabernaSeleccionado;
                                if(nuevoPV > Integer.parseInt(vista.txtPVMax.getText())){
                                    nuevoPV = Integer.parseInt(vista.txtPVMax.getText());
                                }
                                vista.txtOro.setText(String.valueOf(nuevoOro));
                                vista.txtPV.setText(String.valueOf(nuevoPV));
                                objetoTabernaSeleccionado = "";
                                this.setInfoBD();
                                String [] nuevaVidaPostCoTa = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevaVidaPostCoTa);
                            }                                
                            
                        }else{
                            if(vista.txtPE.getText().equals(vista.txtPEMax.getText())){
                                JOptionPane.showMessageDialog(null, "Ya tienes la energía al máximo.");
                            }else{
                                int nuevoOro = Integer.parseInt(vista.txtOro.getText()) - precioObjetoTabernaSeleccionado;
                                int nuevoPE = Integer.parseInt(vista.txtPE.getText()) + efectoObjetoTabernaSeleccionado;
                                if(nuevoPE > Integer.parseInt(vista.txtPEMax.getText())){
                                    nuevoPE = Integer.parseInt(vista.txtPEMax.getText());
                                }
                                vista.txtOro.setText(String.valueOf(nuevoOro));
                                vista.txtPE.setText(String.valueOf(nuevoPE));
                                objetoTabernaSeleccionado = "";
                                this.setInfoBD();
                                String [] nuevaEnergiaPostCoTa = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevaEnergiaPostCoTa);
                            }
                        } 
                    }
                }
                break;
                
            case btnCancelarComprarTaberna:
                this.vista.dialogTabernaCompra.setVisible(false);
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnAceptarAlojamiento:
                int oroP = Integer.parseInt(vista.txtOro.getText());
                String vida = vista.txtPV.getText();
                String energia = vista.txtPE.getText();
                if(vida.equals(vista.txtPVMax.getText()) && energia.equals(vista.txtPEMax.getText())){
                    JOptionPane.showMessageDialog(null, "Ya tienes la vida y energía al máximo.");
                }else{
                    if(oroP >= 30){
                        oroP = oroP - 30;
                        vista.txtOro.setText(String.valueOf(oroP));
                        vista.txtPV.setText(vista.txtPVMax.getText());
                        vista.txtPE.setText(vista.txtPEMax.getText());
                        this.setInfoBD();
                        String [] nuevaVidaPostAlojamiento = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevaVidaPostAlojamiento);
                        JOptionPane.showMessageDialog(null, "Te alojas en la posada y te recuperas.");
                        vista.dialogTabernaAlojamiento.setVisible(false);
                    }
                }
                this.vista.dialogTabernaAlojamiento.setVisible(false);
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnCancelarAlojamiento:
                this.vista.dialogTabernaAlojamiento.setVisible(false);
                this.vista.dialogTaberna.setVisible(true);
                break;
                
            case btnComprarTienda:
                if(objetoTiendaSeleccionado != ""){
                    this.vista.dialogTienda.setVisible(false);
                    this.vista.dialogTiendaComprar.setSize(470, 320);
                    this.vista.dialogTiendaComprar.setLocation(50,50);
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
                this.vista.dialogTienda.setVisible(false);
                historialString = historialString + "\nHas vuelto del mercado.";
                vista.historial.setText(historialString);
                vista.dialogTiendaComprar.setVisible(false);
                this.vista.setVisible(true);
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
                        objetoTiendaSeleccionado = "";
                        vista.dialogTienda.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al comprar objeto.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Objeto demasiado caro.");
                }
                this.vista.dialogTiendaComprar.setVisible(false);
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnCancelarCompraTienda:
                this.vista.dialogTiendaComprar.setVisible(false);
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnVenderVenderTienda:
                if(objetoMochilaVenderSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    this.vista.dialogTiendaVender.setVisible(false);
                    this.vista.dialogTiendaVenderVender.setSize(410, 270);
                    this.vista.dialogTiendaVenderVender.setLocation(50,50);
                    this.vista.dialogTiendaVenderVender.setVisible(true);
                }
                break;
                
            case btnSalirVenderTienda:
                this.vista.dialogTiendaVender.setVisible(false);
                this.vista.dialogTienda.setVisible(true);
                break;
                
            case btnCombatirAtacar:
               
                    historialCombateString = historialCombateString +"\n---------Tu Turno----------";
                    vista.historialCombate.setText(historialCombateString);
                    if(this.vista.txtArma.getText().equals("")){
                        historialCombateString = historialCombateString + "\nRealizando el ataque";
                    }
                    historialCombateString = historialCombateString + "\nHas lanzado un ataque  "+this.vista.txtArma.getText();//+Arma;
                    vista.historialCombate.setText(historialCombateString);
                    o.Atacar();
                    if (o.getGolpe() > armaduraEne) {
                        historialCombateString = historialCombateString +"\nTu ATAQUE ha IMPACTADO";
                        vista.historialCombate.setText(historialCombateString);
                        vidaEne=vidaEne - o.getDaño();
                        this.vista.txtPVEnemigo.setText(String.valueOf(vidaEne));
                                
                        
                        vista.historialCombate.setText(historialCombateString);
                        vista.historialCombate.setText(historialCombateString);
                        if(vidaEne <= 0){
                            this.vista.txtOro.setText(String.valueOf(Integer.parseInt(vista.txtOro.getText())+ oroEne));
                            this.vista.txtExperiencia.setText(String.valueOf(Integer.parseInt(vista.txtExperiencia.getText())+experienciaEne));
                            this.vista.dialogCombatir.dispose();
                            this.vista.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Termino el combate. Has ganado.");
                            JOptionPane.showMessageDialog(null, "Has gando : "+oroEne+" oro.");
                                        
                        }
                        o.setTurno(false);    
                    }else{
                                
                        historialCombateString = historialCombateString +"\nTu ATAQUE ha FALLADO";
                        vista.historialCombate.setText(historialCombateString);
                        o.setTurno(false);    
                    }
                    o.setTurno(false);     
                                   
                    historialCombateString = historialCombateString +"\n---------Turno Enemigo----------";
                    vista.historialCombate.setText(historialCombateString);
                    historialCombateString = historialCombateString +"\nEl enemigo se dispone a atacar";
                    vista.historialCombate.setText(historialCombateString);
                    en.Atacar();
                    if (en.getGolpe() > o.getArmadura()) {

                        historialCombateString = historialCombateString +"\nEl enemigo ha impactado el ataque";
                        vista.historialCombate.setText(historialCombateString);

                        int vidaH = Integer.parseInt(this.vista.txtPVCombate.getText()) - dañoEne;
                        this.vista.txtPVCombate.setText(String.valueOf(vidaH));
                        this.vista.txtPV.setText(String.valueOf(vidaH));

                        
                        vista.historialCombate.setText(historialCombateString);
                        if(Integer.parseInt(this.vista.txtPVCombate.getText()) <= 0){
                            this.vista.txtExperiencia.setText(String.valueOf(Integer.parseInt(this.vista.txtExperiencia.getText()) - (25 * Integer.parseInt(this.vista.txtNivel.getText()) * 3)));
                            this.vista.txtOro.setText(String.valueOf(Integer.parseInt(this.vista.txtOro.getText()) - (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText()))));
                            this.vista.txtPV.setText(vista.txtPVMax.getText());
                            if(Integer.parseInt(this.vista.txtExperiencia.getText()) < 0 ){
                                this.vista.txtExperiencia.setText("0");
                            }
                            if (Integer.parseInt(this.vista.txtOro.getText()) < 0){
                                this.vista.txtOro.setText("0");
                            }
                            o.setTurno(true);
                        o.setTurno(true);    
                        this.vista.dialogCombatir.dispose();
                        this.vista.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Termino el combate. Has perdido.");
                        JOptionPane.showMessageDialog(null, "Has perdido : "+ (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText())) +" oro.");

                        }
                    }else{

                        historialCombateString = historialCombateString +"\nEl enemigo ha fallado el ataque";
                        vista.historialCombate.setText(historialCombateString);
                        o.setTurno(true);
                    }
                    o.setTurno(true);
                
                if(Integer.parseInt(vista.txtPVCombate.getText()) <= 0){
                    historialString = historialString + "\nHas perdido.";
                    vista.historial.setText(historialString);
                    o.setArmadura(o.getArmadura()-o.getDefensa());
                    o.setDefensa(0);
                    this.vista.txtPV.setText(vista.txtPVMax.getText());
                    this.vista.dialogCombatir.dispose();
                    this.vista.setVisible(true);
                    this.setInfoBD();
                    String [] nuevosStatPostSubida = this.modelo.getInfoInterfaz(usuario);
                    this.setInfoInterfaz(nuevosStatPostSubida);
                }else if(vidaEne <= 0){
                    o.setArmadura(o.getArmadura() - o.getDefensa());
                    o.setDefensa(0);
                    historialString = historialString + "\nHas ganado.";
                    if(Integer.parseInt(vista.txtExperiencia.getText()) > Integer.parseInt(vista.txtExperienciaMax.getText())){
                        modelo.subirNivel(usuario, vista.txtClase.getText());
                        String [] nuevosStatPostSubida1 = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevosStatPostSubida1);
                        int n = Integer.parseInt(vista.txtNivel.getText());
                        vista.txtNivel.setText(String.valueOf(n + 1));
                        int px = -(Integer.parseInt(vista.txtExperiencia.getText()) - Integer.parseInt(vista.txtExperienciaMax.getText()));
                        vista.txtExperiencia.setText(String.valueOf(px));
                        cont++;
                        contNv = contNv * 2;
                        vista.txtExperienciaMax.setText(String.valueOf(cont * 25 * contNv));
                        this.setInfoBD();
                        String [] nuevosStatPostSubida2 = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevosStatPostSubida2);
                    }else if(Integer.parseInt(vista.txtExperiencia.getText()) == Integer.parseInt(vista.txtExperienciaMax.getText())){
                        modelo.subirNivel(usuario, vista.txtClase.getText());
                        String [] nuevosStatPostSubida1 = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevosStatPostSubida1);
                        int n = Integer.parseInt(vista.txtNivel.getText());
                        vista.txtNivel.setText(String.valueOf(n + 1));
                        vista.txtExperiencia.setText("0");
                        cont++;
                        contNv = contNv * 2;
                        vista.txtExperienciaMax.setText(String.valueOf(cont * 25 * contNv));
                        this.setInfoBD();
                        String [] nuevosStatPostSubida2 = this.modelo.getInfoInterfaz(usuario);
                        this.setInfoInterfaz(nuevosStatPostSubida2);
                    }
                    
                    vista.historial.setText(historialString);
                    this.vista.dialogCombatir.dispose();
                    this.vista.setVisible(true);
                }
     
            
                break;
                
            case btnCombatirDefender:
                
                    historialCombateString = historialCombateString +"\n---------Tu Turno----------";
                    vista.historialCombate.setText(historialCombateString);
                    historialCombateString = historialCombateString + "\nPOSICION DEFENSIVA";
                    vista.historialCombate.setText(historialCombateString);
                    o.Defensa();
                    if(o.getDefensa()<4){
            
                        historialCombateString = historialCombateString + "\nDURO como la PIEDRA";
                        o.setTurno(false);
                    }else{
                        historialCombateString = historialCombateString + "\nTu DEFENSA esta al MÁXIMO";
                        o.setTurno(true);
                    }
                  
                        historialCombateString = historialCombateString +"\n---------Turno Enemigo----------";
                        vista.historialCombate.setText(historialCombateString);
                        historialCombateString = historialCombateString +"\nEl enemigo se dispone a atacar";
                        vista.historialCombate.setText(historialCombateString);
                        en.Atacar();
                        if (en.getGolpe() > o.getArmadura()){
                            historialCombateString = historialCombateString +"\nEl enemigo ha impactado el ataque";
                            vista.historialCombate.setText(historialCombateString);
                            int vidaH = Integer.parseInt(this.vista.txtPVCombate.getText()) - dañoEne;
                            this.vista.txtPVCombate.setText(String.valueOf(vidaH));
                            this.vista.txtPV.setText(String.valueOf(vidaH));
                            vista.historialCombate.setText(historialCombateString);
                            if(Integer.parseInt(vista.txtPVCombate.getText())<=0){
                                this.vista.txtExperiencia.setText(String.valueOf(Integer.parseInt(vista.txtExperiencia.getText()) - (25 * Integer.parseInt(vista.txtNivel.getText()) * 3)));                                
                                this.vista.txtPV.setText(vista.txtPVMax.getText());
                                if(Integer.parseInt(vista.txtExperiencia.getText()) < 0 ){
                                    vista.txtExperiencia.setText("0");
                                    this.vista.txtExperiencia.setText(String.valueOf(Integer.parseInt(vista.txtExperiencia.getText()) - (25 * Integer.parseInt(vista.txtNivel.getText()) * 3)));
                                    o.setArmadura(o.getArmadura()-o.getDefensa());
                                    o.setDefensa(0);
                                    this.vista.txtOro.setText(String.valueOf(o.getOro() - (5 * 4 * Integer.parseInt(vista.txtNivel.getText()))));
                                    if (Integer.parseInt(vista.txtOro.getText()) < 0){
                                        vista.txtOro.setText("0");

                                    }
                                    o.setTurno(true);
                                    this.vista.dialogCombatir.dispose();
                                    this.vista.setVisible(true);
                                    JOptionPane.showMessageDialog(null, "Termino el combate. Has perdido.");
                                    JOptionPane.showMessageDialog(null, "Has perdido : "+ (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText()))+" oro.");
                                }
                            
                            historialString = historialString + "\nHas perdido.";
                            vista.historial.setText(historialString);
                            vista.txtPV.setText(vista.txtPVMax.getText());
                            this.setInfoBD();
                            String [] nuevosStatPostSubida = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevosStatPostSubida);
                            this.vista.dialogCombatir.dispose();
                            this.vista.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Termino el combate. Has perdido.");
                            o.setTurno(true);
                            }
                           
                   
                        }else{
                            historialCombateString = historialCombateString +"\nEl enemigo ha fallado el ataque";
                            vista.historialCombate.setText(historialCombateString);
                            o.setTurno(true);                         
                        }
                        
                
                break;
                
            case btnCombatirEspecial:
                
            if(Integer.parseInt(vista.txtPECombate.getText())>=4){
                historialCombateString = historialCombateString +"\n---------Tu Turno----------";
                vista.historialCombate.setText(historialCombateString);
                
                    historialCombateString = historialCombateString + "\nHas lanzado un golpe especial";
                    vista.historialCombate.setText(historialCombateString);
                    vista.txtPECombate.setText(String.valueOf(Integer.parseInt(vista.txtPECombate.getText())-4));
                    
                        
                    
                        historialCombateString = historialCombateString + "\nHas lanzado un ataque especial ";
                        vista.historialCombate.setText(historialCombateString);
                        o.AtaqueEspecial();
                    
                        
                        if (o.getGolpe() > armaduraEne) {
                            historialCombateString = historialCombateString +"\nTu ATAQUE ha IMPACTADO";
                            vista.historialCombate.setText(historialCombateString);
                            vidaEne = vidaEne - (o.getDaño()+ 5);
                            this.vista.txtPVEnemigo.setText(String.valueOf(vidaEne));
                            
                                   
                                
                                   
                            historialCombateString = historialCombateString +"\nDaño Hecho:"+ o.getDaño()+"\nEnergia gastada: "+Integer.parseInt(vista.txtPECombate.getText());
                            vista.historialCombate.setText(historialCombateString);
                            vista.historialCombate.setText(historialCombateString);
                            if(vidaEne<=0){
                                this.vista.txtOro.setText(String.valueOf(Integer.parseInt(vista.txtOro.getText())+ oroEne));
                                this.vista.txtExperiencia.setText(String.valueOf(Integer.parseInt(vista.txtExperiencia.getText())+experienciaEne));
                                this.vista.dialogCombatir.dispose();
                                this.vista.setVisible(true);
                                JOptionPane.showMessageDialog(null, "Termino el combate. Has ganado.");
                                JOptionPane.showMessageDialog(null, "Has ganado : "+ oroEne +" oro.");
                                        
                            }
                            o.setTurno(false);    
                        }else{
                            historialCombateString = historialCombateString +"\nTu ATAQUE ha FALLADO";
                            vista.historialCombate.setText(historialCombateString);
                            o.setTurno(false);    
                        }
                        o.setTurno(false);     
                    
                        historialCombateString = historialCombateString +"\n---------Turno Enemigo----------";
                        vista.historialCombate.setText(historialCombateString);
                        historialCombateString = historialCombateString +"\nEl enemigo se dispone a atacar";
                        vista.historialCombate.setText(historialCombateString);
                        en.Atacar();
                        if (en.getGolpe() > o.getArmadura()) {
                            historialCombateString = historialCombateString +"\nEl enemigo ha impactado el ataque";
                            vista.historialCombate.setText(historialCombateString);
                            
                            this.vista.txtPVCombate.setText(String.valueOf(Integer.parseInt(this.vista.txtPVCombate.getText()) - dañoEne));
                            
                            
                            vista.historialCombate.setText(historialCombateString);
                            if(Integer.parseInt(this.vista.txtPVCombate.getText()) <= 0){
                                this.vista.txtExperiencia.setText(String.valueOf((Integer.parseInt(this.vista.txtNivel.getText())) - (25 * (Integer.parseInt(this.vista.txtNivel.getText()) * 3))));
                                this.vista.txtOro.setText(String.valueOf(Integer.parseInt(this.vista.txtOro.getText()) - (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText()))));
                                this.vista.txtPV.setText(vista.txtPVMax.getText());
                                if(Integer.parseInt(this.vista.txtExperiencia.getText()) < 0 ){
                                    o.setExperiencia(0);
                                    this.vista.txtExperiencia.setText(String.valueOf(0));
                                    o.setArmadura(o.getArmadura() - o.getDefensa());
                                    o.setDefensa(0);
                                  
                                    if (Integer.parseInt(this.vista.txtOro.getText())<0){
                                        this.vista.txtOro.setText(String.valueOf(0));
                                        
                                    }
                                    o.setTurno(true);
                                    this.vista.dialogCombatir.dispose();
                                    this.vista.setVisible(true);
                                    JOptionPane.showMessageDialog(null, "Termino el combate.");
                                    JOptionPane.showMessageDialog(null, "Has perdido : "+ (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText()))+" oro.");

                                }
                            }
                            o.setTurno(true);
                        }else{
                                historialCombateString = historialCombateString +"\nEl enemigo ha fallado el ataque";
                                vista.historialCombate.setText(historialCombateString);
                                o.setTurno(true);
                        }
                        if(Integer.parseInt(vista.txtPVCombate.getText()) <= 0){
                            historialString = historialString + "\nHas perdido.";
                            o.setArmadura(o.getArmadura() - o.getDefensa());
                            o.setDefensa(0);
                            this.vista.txtPV.setText(vista.txtPVMax.getText());
                            vista.historial.setText(historialString);
                            this.vista.dialogCombatir.dispose();
                            this.vista.setVisible(true);
                            this.setInfoBD();
                            String [] nuevosStatPostSubida = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevosStatPostSubida);
                            JOptionPane.showMessageDialog(null, "Ha termino el combate. Has perdido.");
                            JOptionPane.showMessageDialog(null, "Has perdido : "+ (5 * 4 * Integer.parseInt(this.vista.txtNivel.getText())) +" oro.");
                        }else if(vidaEne <= 0){
                            historialString = historialString + "\nHas ganado.";
                            o.setArmadura(o.getArmadura() - o.getDefensa());
                            o.setDefensa(0);
                            if(Integer.parseInt(vista.txtExperiencia.getText()) > Integer.parseInt(vista.txtExperienciaMax.getText())){
                                modelo.subirNivel(usuario, vista.txtClase.getText());
                                String [] nuevosStatPostSubida1 = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevosStatPostSubida1);
                                int n = Integer.parseInt(vista.txtNivel.getText());
                                vista.txtNivel.setText(String.valueOf(n + 1));
                                int px = -(Integer.parseInt(vista.txtExperiencia.getText()) - Integer.parseInt(vista.txtExperienciaMax.getText()));
                                vista.txtExperiencia.setText(String.valueOf(px));
                                cont++;
                                contNv = contNv * 2;
                                vista.txtExperienciaMax.setText(String.valueOf(cont * 25 * contNv));
                                this.setInfoBD();
                                String [] nuevosStatPostSubida2 = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevosStatPostSubida2);
                            }else if(Integer.parseInt(vista.txtExperiencia.getText()) == Integer.parseInt(vista.txtExperienciaMax.getText())){
                                modelo.subirNivel(usuario, vista.txtClase.getText());
                                String [] nuevosStatPostSubida1 = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevosStatPostSubida1);
                                int n = Integer.parseInt(vista.txtNivel.getText());
                                vista.txtNivel.setText(String.valueOf(n + 1));
                                vista.txtExperiencia.setText("0");
                                cont++;
                                contNv = contNv * 2;
                                vista.txtExperienciaMax.setText(String.valueOf(cont * 25 * contNv));
                                this.setInfoBD();
                                String [] nuevosStatPostSubida2 = this.modelo.getInfoInterfaz(usuario);
                                this.setInfoInterfaz(nuevosStatPostSubida2);
                            }
                            vista.historial.setText(historialString);
                            this.vista.dialogCombatir.dispose();
                            this.vista.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Termino el combate. Has ganado.");
                            JOptionPane.showMessageDialog(null, "Has ganado : "+ en.getOro()+" oro.");
                        }
            }else{
                JOptionPane.showMessageDialog(null, "No tienes suficiente energia.");
            }        
                   
                
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
                    vista.dialogHuir.setVisible(false);
                    vista.dialogCombatir.setVisible(false);
                    this.vista.setVisible(true);
                break;
                
            case btnMochilaUsar:
                if(objetoMochilaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    if(tipoObjetoMochilaSeleccionado.equals("usable_HP")){
                        if(vista.txtPV.getText().equals(vista.txtPVMax.getText())){
                            JOptionPane.showMessageDialog(null, "Ya tienes la vida al máximo.");
                        }else{
                            int nuevoPV = Integer.parseInt(vista.txtPV.getText()) + efectoObjetoMochilaSeleccionado;
                            if(nuevoPV > Integer.parseInt(vista.txtPVMax.getText())){
                                nuevoPV = Integer.parseInt(vista.txtPVMax.getText());
                            }
                            vista.txtPV.setText(String.valueOf(nuevoPV));
                            modelo.soltarObjeto(objetoMochilaSeleccionado, usuario);
                            JOptionPane.showMessageDialog(null, "Poción de vida usada.");
                            this.setInfoBD();
                            String [] nuevaVidaPostPocion = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevaVidaPostPocion);
                            vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                        }
                    }else if(tipoObjetoMochilaSeleccionado.equals("usable_EP")){
                        if(vista.txtPE.getText().equals(vista.txtPEMax.getText())){
                            JOptionPane.showMessageDialog(null, "Ya tienes la energía al máximo.");
                        }else{
                            int nuevoPE = Integer.parseInt(vista.txtPE.getText()) + efectoObjetoMochilaSeleccionado;
                            if(nuevoPE > Integer.parseInt(vista.txtPEMax.getText())){
                                nuevoPE = Integer.parseInt(vista.txtPEMax.getText());
                            }
                            vista.txtPE.setText(String.valueOf(nuevoPE));
                            modelo.soltarObjeto(objetoMochilaSeleccionado, usuario);
                            JOptionPane.showMessageDialog(null, "Poción de energía usada.");
                            this.setInfoBD();
                            String [] nuevaEnergiaPostPocion = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevaEnergiaPostPocion);
                            vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                        }
                    }else if(tipoObjetoMochilaSeleccionado.equals("usable_DAÑO")){
                        JOptionPane.showMessageDialog(null, "Este objeto no puede ser usado aquí.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione un objeto usable.");
                    }
                }
                break;
                
            case btnMochilaSoltar:
                if(objetoMochilaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    vista.dialogMochila.setVisible(false);
                    vista.dialogSoltar.setSize(350, 200);
                    vista.dialogSoltar.setLocation(50,50);
                    vista.dialogSoltar.setVisible(true);
                }
                break;
                
            case btnMochilaEquipar:
                if(objetoMochilaSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto equipable.");
                }else{
                    switch (objetoMochilaSeleccionado) {
                    case "Armadura Ligera I":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera I.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Armadura Ligera II":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera II.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Armadura Ligera III":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Ligera III.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Armadura Intermedia I":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia I.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Armadura Intermedia II":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia II.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Armadura Intermedia III":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Intermedia III.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Armadura Pesada I":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada I.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    case "Armadura Pesada II":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada II.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    case "Armadura Pesada III":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtEquipo.getText().equals("")){
                                String objeto = vista.txtEquipo.getText();
                                modelo.desequiparEquipo(objeto, usuario);
                                vista.txtEquipo.setText("");
                            }
                            this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Armadura Pesada III.png")));
                            this.vista.txtEquipo.setText(objetoMochilaSeleccionado);
                            String equipo = vista.txtEquipo.getText();
                            modelo.equiparEquipo(equipo, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    case "Daga Espectral":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Daga Vampirica":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Daga Agonia de las Sombras":
                        if(vista.txtClase.getText().equals("Picaro")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un picaro.");
                        }
                        break;
                    case "Baston del Crepusculo":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Baston del Ocaso":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Baston de Hinojosa":
                        if(vista.txtClase.getText().equals("Mago")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un mago.");
                        }
                        break;
                    case "Espada Viento Furioso":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    case "Espada Frostmourne":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    case "Espada Mata Dioses":
                        if(vista.txtClase.getText().equals("Guerrero")){
                            if(!vista.txtArma.getText().equals("")){
                                String objeto = vista.txtArma.getText();
                                modelo.desequiparArma(objeto, usuario);
                                vista.txtArma.setText("");
                            }
                            this.vista.txtArma.setText(objetoMochilaSeleccionado);
                            String arma = vista.txtArma.getText();
                            modelo.equiparArma(arma, efectoObjetoMochilaSeleccionado, usuario);
                        }else{
                            JOptionPane.showMessageDialog(null, "Este objeto solo puede ser equipado por un guerrero.");
                        }
                        break;
                    }
                }
                break;
                
            case btnMochilaSalir:
                this.vista.dialogMochila.setVisible(false);
                historialString = historialString + "\nHas cerrado la mochila.";
                vista.historial.setText(historialString);
                this.vista.setVisible(true);
                break;
                
            case btnSoltarAceptar:
                if(objetoMochilaSeleccionado.equals(vista.txtEquipo.getText())){
                    String equipo = vista.txtEquipo.getText();
                    modelo.desequiparEquipo(equipo, usuario);
                    vista.txtEquipo.setText("");
                    this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tio pajo.jpg")));
                }else if(objetoMochilaSeleccionado.equals(vista.txtArma.getText())){
                    String arma = vista.txtArma.getText();
                    modelo.desequiparArma(arma, usuario);
                    vista.txtArma.setText("");
                }
                modelo.soltarObjeto(objetoMochilaSeleccionado, usuario);
                vista.tablaMochila.setModel(modelo.getTablaMochila(usuario));
                JOptionPane.showMessageDialog(null, "Objeto soltado y perdido para siempre.");
                vista.dialogSoltar.setVisible(false);
                vista.dialogMochila.setVisible(true);
                break;
                
            case btnSoltarCancelar:
                this.vista.dialogSoltar.setVisible(false);
                vista.dialogMochila.setVisible(true);
                break;
                
            case btnAceptarVenderVenderTienda:
                if(objetoMochilaSeleccionado.equals(vista.txtEquipo.getText())){
                    String equipo = vista.txtEquipo.getText();
                    modelo.desequiparEquipo(equipo, usuario);
                    vista.txtEquipo.setText("");
                    this.vista.fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tio pajo.jpg")));
                }else if(objetoMochilaSeleccionado.equals(vista.txtArma.getText())){
                    String arma = vista.txtArma.getText();
                    modelo.desequiparArma(arma, usuario);
                    vista.txtArma.setText("");
                }
                modelo.venderObjetoMochila(usuario, precioObjetoMochilaVenderSeleccionado, objetoMochilaVenderSeleccionado);
                int nuevoOro = Integer.parseInt(vista.txtOro.getText()) + precioObjetoMochilaVenderSeleccionado;
                vista.txtOro.setText(String.valueOf(nuevoOro));
                this.setInfoBD();
                String [] nuevoOroPostVenta = this.modelo.getInfoInterfaz(usuario);
                this.setInfoInterfaz(nuevoOroPostVenta);
                this.vista.dialogTiendaVenderVender.setVisible(false);
                this.vista.dialogTiendaVender.setVisible(true);
                this.vista.tablaMochilaVender.setModel(modelo.getTablaMochilaVender(usuario));
                break;
                
            case btnCancelarVenderVenderTienda:
                this.vista.dialogTiendaVenderVender.setVisible(false);
                this.vista.dialogTiendaVender.setVisible(true);
                break;
                
            case btnSalirMochilaCombate:
                this.vista.dialogMochilaCombate.setVisible(false);
                this.vista.dialogCombatir.setVisible(true);
                break;
                
            case btnUsarObjetoCombate:
                if(objetoMochilaCombateSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un objeto.");
                }else{
                    if(tipoObjetoMochilaCombateSeleccionado.equals("usable_HP")){
                        if(vista.txtPVCombate.getText().equals(vista.txtPVCombateMax.getText())){
                            JOptionPane.showMessageDialog(null, "Ya tienes la vida al máximo.");
                        }else{
                            int nuevoPV = Integer.parseInt(vista.txtPVCombate.getText()) + efectoObjetoMochilaCombateSeleccionado;
                            if(nuevoPV > Integer.parseInt(vista.txtPVCombateMax.getText())){
                                nuevoPV = Integer.parseInt(vista.txtPVCombateMax.getText());
                            }
                            vista.txtPVCombate.setText(String.valueOf(nuevoPV));
                            modelo.soltarObjeto(objetoMochilaCombateSeleccionado, usuario);
                            JOptionPane.showMessageDialog(null, "Poción de vida usada.");
                            this.setInfoBD();
                            String [] nuevaVidaPostPocion = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevaVidaPostPocion);
                            vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
                        }
                    }else if(tipoObjetoMochilaCombateSeleccionado.equals("usable_EP")){
                        if(vista.txtPECombate.getText().equals(vista.txtPECombateMax.getText())){
                            JOptionPane.showMessageDialog(null, "Ya tienes la energía al máximo.");
                        }else{
                            int nuevoPE = Integer.parseInt(vista.txtPECombate.getText()) + efectoObjetoMochilaCombateSeleccionado;
                            if(nuevoPE > Integer.parseInt(vista.txtPECombateMax.getText())){
                                nuevoPE = Integer.parseInt(vista.txtPECombateMax.getText());
                            }
                            vista.txtPECombate.setText(String.valueOf(nuevoPE));
                            modelo.soltarObjeto(objetoMochilaCombateSeleccionado, usuario);
                            JOptionPane.showMessageDialog(null, "Poción de energía usada.");
                            this.setInfoBD();
                            String [] nuevaEnergiaPostPocion = this.modelo.getInfoInterfaz(usuario);
                            this.setInfoInterfaz(nuevaEnergiaPostPocion);
                            vista.tablaMochilaCombate.setModel(modelo.getTablaMochilaCombate(usuario));
                        }
                    }else if(tipoObjetoMochilaCombateSeleccionado.equals("usable_DAÑO")){
                        JOptionPane.showMessageDialog(null, "Este objeto no puede ser usado aquí.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione un objeto usable.");
                    }
                }
                break;
                
            case btnCambiarC:
                this.vista.setVisible(false);
                this.vista.dialogCambiarContraseña.setVisible(true);
                this.vista.dialogCambiarContraseña.setSize(511, 330);
                this.vista.dialogCambiarContraseña.setLocation(100,100);
                break;
                
            case btnCerrarS:
                historialString = "Historial de partida:";
                vista.historial.setText(historialString);
                this.setInfoBD();
                System.exit(0);
                break;
                
            case btnAceptarCambiarContraseña:
                modelo.CambiarContraseña(this.vista.txtNombre.getText(),this.vista.jTextContraseñaA.getText(),this.vista.jTextContraseñaN.getText());
                this.vista.dialogCambiarContraseña.setVisible(false);
                this.vista.setVisible(true);
                break;
                
            case btnCancelarCambiarContraseña:
                this.vista.dialogCambiarContraseña.setVisible(false);
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
        String arma = s[8];
        String equipo = s[9];
        String expmax = s[10];
        vista.txtNombre.setText(usuario);
        vista.txtNivel.setText(nivel);
        vista.txtClase.setText(clase);
        vista.txtExperiencia.setText(experiencia);
        vista.txtOro.setText(oro);
        vista.txtPV.setText(vida);
        vista.txtPE.setText(energia);
        vista.txtPVMax.setText(vidaMax);
        vista.txtPEMax.setText(energiaMax);
        vista.txtArma.setText(arma);
        vista.txtEquipo.setText(equipo);
        vista.txtExperienciaMax.setText(expmax);
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
        String energia = vista.txtPE.getText();
        String vidaMax = vista.txtPVMax.getText();
        String energiaMax = vista.txtPEMax.getText();
        String arma = vista.txtArma.getText();
        String equipo = vista.txtEquipo.getText();
        String expmax = vista.txtExperienciaMax.getText();
        
        modelo.actualizarBD(usuario, nivel, experiencia, oro, vida, energia, vidaMax, energiaMax, arma, equipo, expmax);
    }
    
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()== 1)
        {
            int filaTienda = this.vista.tablaTienda.rowAtPoint(e.getPoint());
            int filaTaberna = this.vista.tablaTaberna.rowAtPoint(e.getPoint());
            int filaMochila = this.vista.tablaMochila.rowAtPoint(e.getPoint());
            int filaMochilaVender = this.vista.tablaMochilaVender.rowAtPoint(e.getPoint());
            int filaMochilaCombate = this.vista.tablaMochilaCombate.rowAtPoint(e.getPoint());
            
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
                efectoObjetoTabernaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaTaberna.getValueAt(filaTaberna, 2)));
            }else{
                objetoTabernaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
            }
            if(filaMochila > -1){
                objetoMochilaSeleccionado = String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 0));
                precioObjetoMochilaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 1)));
                tipoObjetoMochilaSeleccionado = String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 2));
                efectoObjetoMochilaSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochila.getValueAt(filaMochila, 3)));
            }else{
                objetoMochilaSeleccionado = "";
                precioObjetoTabernaSeleccionado = 0;
                tipoObjetoMochilaSeleccionado = "";
                efectoObjetoMochilaSeleccionado = 0;
            }
            if(filaMochilaVender > -1){
                objetoMochilaVenderSeleccionado = String.valueOf(this.vista.tablaMochilaVender.getValueAt(filaMochilaVender, 0));
                precioObjetoMochilaVenderSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochilaVender.getValueAt(filaMochilaVender, 1)));
            }else if(filaMochilaVender == -1){
                objetoMochilaVenderSeleccionado = "";
                precioObjetoMochilaVenderSeleccionado = 0;
            }
            if(filaMochilaCombate > -1){
                objetoMochilaCombateSeleccionado = String.valueOf(this.vista.tablaMochilaCombate.getValueAt(filaMochilaCombate, 0));
                tipoObjetoMochilaCombateSeleccionado = String.valueOf(this.vista.tablaMochilaCombate.getValueAt(filaMochilaCombate, 1));
                efectoObjetoMochilaCombateSeleccionado = Integer.parseInt(String.valueOf(this.vista.tablaMochilaCombate.getValueAt(filaMochilaCombate, 2)));
            }else if(filaMochilaCombate == -1){
                objetoMochilaCombateSeleccionado = "";
                efectoObjetoMochilaCombateSeleccionado = 0;
                tipoObjetoMochilaCombateSeleccionado = "";
            }
        }
    }
    
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
