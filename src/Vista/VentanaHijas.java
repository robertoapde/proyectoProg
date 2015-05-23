package Vista;

public class VentanaHijas extends javax.swing.JFrame {
    
    String historialString = "Historial de partida:";
    String historialCombateString = "Historial de combate: "; 

    public VentanaHijas() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTaberna.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTabernaCompra.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTabernaAlojamiento.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTienda.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTiendaComprar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTiendaVender.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogCombatir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        dialogHuir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogMochila.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogSoltar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTiendaVenderVender.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogCambiarContraseña.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogMochilaCombate.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTaberna = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btnComprarTaberna = new javax.swing.JButton();
        btnAlojamientoTaberna = new javax.swing.JButton();
        btnSalirTaberna = new javax.swing.JButton();
        dialogTabernaCompra = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTaberna = new javax.swing.JTable();
        btnAceptarComprarTaberna = new javax.swing.JButton();
        btnCancelarComprarTaberna = new javax.swing.JButton();
        dialogTabernaAlojamiento = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnAceptarAlojamiento = new javax.swing.JButton();
        btnCancelarAlojamiento = new javax.swing.JButton();
        dialogTienda = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTienda = new javax.swing.JTable();
        btnComprarTienda = new javax.swing.JButton();
        btnVenderTienda = new javax.swing.JButton();
        btnSalirTienda = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        dialogTiendaComprar = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnCancelarCompraTienda = new javax.swing.JButton();
        btnAceptarCompraTienda = new javax.swing.JButton();
        dialogTiendaVender = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaMochilaVender = new javax.swing.JTable();
        btnVenderVenderTienda = new javax.swing.JButton();
        btnSalirVenderTienda = new javax.swing.JButton();
        dialogCombatir = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        historialCombate = new javax.swing.JTextPane();
        btnCombatirAtacar = new javax.swing.JButton();
        btnCombatirDefender = new javax.swing.JButton();
        btnCombatirEspecial = new javax.swing.JButton();
        btnCombatirMochila = new javax.swing.JButton();
        btnCombatirHuir = new javax.swing.JButton();
        txtNombreCombate = new javax.swing.JLabel();
        txtNombreEnemigo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPVEnemigoMax = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPVCombateMax = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPVEnemigo = new javax.swing.JLabel();
        txtPVCombate = new javax.swing.JLabel();
        txtPECombate = new javax.swing.JLabel();
        txtPECombateMax = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNivelEnemigo = new javax.swing.JLabel();
        dialogHuir = new javax.swing.JDialog();
        btnHuirPerder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        dialogMochila = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaMochila = new javax.swing.JTable();
        fotoEquipo = new javax.swing.JLabel();
        btnMochilaUsar = new javax.swing.JButton();
        btnMochilaEquipar = new javax.swing.JButton();
        btnMochilaSalir = new javax.swing.JButton();
        btnMochilaSoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtArma = new javax.swing.JLabel();
        txtEquipo = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogSoltar = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnSoltarAceptar = new javax.swing.JButton();
        btnSoltarCancelar = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        dialogTiendaVenderVender = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        btnAceptarVenderVenderTienda = new javax.swing.JButton();
        btnCancelarVenderVenderTienda = new javax.swing.JButton();
        dialogCambiarContraseña = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextContraseñaA = new javax.swing.JTextField();
        jTextContraseñaN = new javax.swing.JTextField();
        btnAceptarCambiarContraseña = new javax.swing.JButton();
        btnCancelarCambiarContraseña = new javax.swing.JButton();
        dialogMochilaCombate = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        btnUsarObjetoCombate = new javax.swing.JButton();
        btnSalirMochilaCombate = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMochilaCombate = new javax.swing.JTable();
        btnTienda = new javax.swing.JButton();
        btnMochila = new javax.swing.JButton();
        btnTaberna = new javax.swing.JButton();
        btnCombatir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtNivel = new javax.swing.JLabel();
        txtClase = new javax.swing.JLabel();
        txtExperiencia = new javax.swing.JLabel();
        txtOro = new javax.swing.JLabel();
        fotoClase = new javax.swing.JLabel();
        historialScroll = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        txtPV = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPE = new javax.swing.JLabel();
        txtPVMax = new javax.swing.JLabel();
        txtPEMax = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtExperienciaMax = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCambiarC = new javax.swing.JRadioButtonMenuItem();
        btnCerrarS = new javax.swing.JRadioButtonMenuItem();

        dialogTaberna.setModal(true);
        dialogTaberna.setResizable(false);
        dialogTaberna.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                dialogTabernaWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnComprarTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnComprarTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnComprarTaberna.setText("Comprar");
        btnComprarTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnComprarTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTabernaActionPerformed(evt);
            }
        });

        btnAlojamientoTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAlojamientoTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnAlojamientoTaberna.setText("Alojamiento");
        btnAlojamientoTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnAlojamientoTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlojamientoTabernaActionPerformed(evt);
            }
        });

        btnSalirTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSalirTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnSalirTaberna.setText("Salir");
        btnSalirTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnSalirTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTabernaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnSalirTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnAlojamientoTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnSalirTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnAlojamientoTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout dialogTabernaLayout = new javax.swing.GroupLayout(dialogTaberna.getContentPane());
        dialogTaberna.getContentPane().setLayout(dialogTabernaLayout);
        dialogTabernaLayout.setHorizontalGroup(
            dialogTabernaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogTabernaLayout.setVerticalGroup(
            dialogTabernaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dialogTabernaCompra.setModal(true);
        dialogTabernaCompra.setResizable(false);

        tablaTaberna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTaberna.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tablaTaberna);

        btnAceptarComprarTaberna.setText("Aceptar");

        btnCancelarComprarTaberna.setText("Cancelar");
        btnCancelarComprarTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComprarTabernaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAceptarComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnCancelarComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarComprarTaberna)
                    .addComponent(btnCancelarComprarTaberna)))
        );

        javax.swing.GroupLayout dialogTabernaCompraLayout = new javax.swing.GroupLayout(dialogTabernaCompra.getContentPane());
        dialogTabernaCompra.getContentPane().setLayout(dialogTabernaCompraLayout);
        dialogTabernaCompraLayout.setHorizontalGroup(
            dialogTabernaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTabernaCompraLayout.setVerticalGroup(
            dialogTabernaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTabernaAlojamiento.setResizable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("     El alojamiento en la taberna ");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("       cuesta 30 monedas de oro ");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("(Tu  vida y energia se regeraran al 100%)");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);

        btnAceptarAlojamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAceptarAlojamiento.setForeground(new java.awt.Color(51, 51, 255));
        btnAceptarAlojamiento.setText("Aceptar");
        btnAceptarAlojamiento.setBorder(new javax.swing.border.MatteBorder(null));

        btnCancelarAlojamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelarAlojamiento.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarAlojamiento.setText("Cancelar");
        btnCancelarAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlojamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogTabernaAlojamientoLayout = new javax.swing.GroupLayout(dialogTabernaAlojamiento.getContentPane());
        dialogTabernaAlojamiento.getContentPane().setLayout(dialogTabernaAlojamientoLayout);
        dialogTabernaAlojamientoLayout.setHorizontalGroup(
            dialogTabernaAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                .addGroup(dialogTabernaAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnAceptarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnCancelarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(dialogTabernaAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        dialogTabernaAlojamientoLayout.setVerticalGroup(
            dialogTabernaAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                .addGroup(dialogTabernaAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel19))
                    .addGroup(dialogTabernaAlojamientoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(37, 37, 37)
                .addComponent(btnAceptarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnCancelarAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        dialogTienda.setResizable(false);

        tablaTienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTienda.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tablaTienda);

        btnComprarTienda.setText("Comprar");
        btnComprarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTiendaActionPerformed(evt);
            }
        });

        btnVenderTienda.setText("Vender");
        btnVenderTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderTiendaActionPerformed(evt);
            }
        });

        btnSalirTienda.setText("Salir");
        btnSalirTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTiendaActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Market.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnComprarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel32)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprarTienda)
                    .addComponent(btnVenderTienda)
                    .addComponent(btnSalirTienda)))
        );

        javax.swing.GroupLayout dialogTiendaLayout = new javax.swing.GroupLayout(dialogTienda.getContentPane());
        dialogTienda.getContentPane().setLayout(dialogTiendaLayout);
        dialogTiendaLayout.setHorizontalGroup(
            dialogTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTiendaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogTiendaLayout.setVerticalGroup(
            dialogTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTiendaComprar.setResizable(false);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("¿Desea comprar el \"articulo\"?");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);

        btnCancelarCompraTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarCompraTienda.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarCompraTienda.setText("Cancelar");
        btnCancelarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancelarCompraTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraTiendaActionPerformed(evt);
            }
        });

        btnAceptarCompraTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarCompraTienda.setForeground(new java.awt.Color(51, 51, 255));
        btnAceptarCompraTienda.setText("Aceptar");
        btnAceptarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAceptarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnCancelarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnAceptarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnCancelarCompraTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout dialogTiendaComprarLayout = new javax.swing.GroupLayout(dialogTiendaComprar.getContentPane());
        dialogTiendaComprar.getContentPane().setLayout(dialogTiendaComprarLayout);
        dialogTiendaComprarLayout.setHorizontalGroup(
            dialogTiendaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTiendaComprarLayout.setVerticalGroup(
            dialogTiendaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTiendaVender.setResizable(false);

        tablaMochilaVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaMochilaVender.setShowVerticalLines(false);
        jScrollPane5.setViewportView(tablaMochilaVender);

        btnVenderVenderTienda.setText("Vender");

        btnSalirVenderTienda.setText("Salir");
        btnSalirVenderTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVenderTiendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnVenderVenderTienda)
                .addGap(93, 93, 93)
                .addComponent(btnSalirVenderTienda))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenderVenderTienda)
                    .addComponent(btnSalirVenderTienda)))
        );

        javax.swing.GroupLayout dialogTiendaVenderLayout = new javax.swing.GroupLayout(dialogTiendaVender.getContentPane());
        dialogTiendaVender.getContentPane().setLayout(dialogTiendaVenderLayout);
        dialogTiendaVenderLayout.setHorizontalGroup(
            dialogTiendaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTiendaVenderLayout.setVerticalGroup(
            dialogTiendaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogCombatir.setModal(true);
        dialogCombatir.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        historialCombate.setEditable(false);
        jScrollPane3.setViewportView(historialCombate);

        btnCombatirAtacar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirAtacar.setForeground(new java.awt.Color(0, 0, 255));
        btnCombatirAtacar.setText("Atacar");
        btnCombatirAtacar.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirAtacarActionPerformed(evt);
            }
        });

        btnCombatirDefender.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirDefender.setForeground(new java.awt.Color(0, 0, 255));
        btnCombatirDefender.setText("Defender");
        btnCombatirDefender.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirDefender.setVerifyInputWhenFocusTarget(false);
        btnCombatirDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirDefenderActionPerformed(evt);
            }
        });

        btnCombatirEspecial.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirEspecial.setForeground(new java.awt.Color(255, 51, 0));
        btnCombatirEspecial.setText("At.Especial");
        btnCombatirEspecial.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirEspecialActionPerformed(evt);
            }
        });

        btnCombatirMochila.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirMochila.setForeground(new java.awt.Color(0, 0, 255));
        btnCombatirMochila.setText("Mochila");
        btnCombatirMochila.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirMochilaActionPerformed(evt);
            }
        });

        btnCombatirHuir.setBackground(new java.awt.Color(255, 51, 51));
        btnCombatirHuir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirHuir.setText("Huir");
        btnCombatirHuir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirHuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirHuirActionPerformed(evt);
            }
        });

        txtNombreCombate.setBackground(new java.awt.Color(204, 204, 255));
        txtNombreCombate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreCombate.setOpaque(true);

        txtNombreEnemigo.setBackground(new java.awt.Color(255, 51, 51));
        txtNombreEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreEnemigo.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PV");
        jLabel14.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(204, 255, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("PE");
        jLabel22.setOpaque(true);

        txtPVEnemigoMax.setBackground(new java.awt.Color(255, 255, 255));
        txtPVEnemigoMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPVEnemigoMax.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(255, 204, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("PV");
        jLabel25.setOpaque(true);

        txtPVCombateMax.setBackground(new java.awt.Color(255, 255, 255));
        txtPVCombateMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPVCombateMax.setOpaque(true);

        jLabel16.setText("/");

        jLabel27.setText("/");

        txtPVEnemigo.setBackground(new java.awt.Color(255, 255, 255));
        txtPVEnemigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPVEnemigo.setOpaque(true);

        txtPVCombate.setBackground(new java.awt.Color(255, 255, 255));
        txtPVCombate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPVCombate.setOpaque(true);

        txtPECombate.setBackground(new java.awt.Color(255, 255, 255));
        txtPECombate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPECombate.setOpaque(true);

        txtPECombateMax.setBackground(new java.awt.Color(255, 255, 255));
        txtPECombateMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPECombateMax.setOpaque(true);

        jLabel33.setText("/");

        jLabel10.setText("Nvl:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtNombreEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNivelEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPVEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPVEnemigoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtNombreCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPVCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPVCombateMax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPECombate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPECombateMax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCombatirAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCombatirEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCombatirDefender, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCombatirMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnCombatirHuir, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNivelEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVEnemigoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVCombateMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPECombate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPECombateMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombatirAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCombatirEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombatirDefender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCombatirMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnCombatirHuir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dialogCombatirLayout = new javax.swing.GroupLayout(dialogCombatir.getContentPane());
        dialogCombatir.getContentPane().setLayout(dialogCombatirLayout);
        dialogCombatirLayout.setHorizontalGroup(
            dialogCombatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogCombatirLayout.setVerticalGroup(
            dialogCombatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogHuir.setModal(true);
        dialogHuir.setResizable(false);

        btnHuirPerder.setBackground(new java.awt.Color(255, 0, 0));
        btnHuirPerder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnHuirPerder.setText("Asume tu error, tu vergüenza y tu fracaso");
        btnHuirPerder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuirPerderActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Little Thanos.jpg"))); // NOI18N

        javax.swing.GroupLayout dialogHuirLayout = new javax.swing.GroupLayout(dialogHuir.getContentPane());
        dialogHuir.getContentPane().setLayout(dialogHuirLayout);
        dialogHuirLayout.setHorizontalGroup(
            dialogHuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(dialogHuirLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnHuirPerder, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dialogHuirLayout.setVerticalGroup(
            dialogHuirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogHuirLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHuirPerder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dialogMochila.setModal(true);
        dialogMochila.setResizable(false);

        tablaMochila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaMochila.setShowVerticalLines(false);
        jScrollPane6.setViewportView(tablaMochila);

        fotoEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tio pajo.jpg"))); // NOI18N
        fotoEquipo.setBorder(new javax.swing.border.MatteBorder(null));

        btnMochilaUsar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaUsar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaUsar.setText("Usar");
        btnMochilaUsar.setBorder(new javax.swing.border.MatteBorder(null));

        btnMochilaEquipar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaEquipar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaEquipar.setText("Equipar");
        btnMochilaEquipar.setBorder(new javax.swing.border.MatteBorder(null));

        btnMochilaSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnMochilaSalir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaSalir.setText("Salir");
        btnMochilaSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochilaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaSalirActionPerformed(evt);
            }
        });

        btnMochilaSoltar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaSoltar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaSoltar.setText("Soltar");
        btnMochilaSoltar.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ARMA:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EQUIPO:");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);

        txtArma.setBackground(new java.awt.Color(255, 255, 255));
        txtArma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtArma.setOpaque(true);

        txtEquipo.setBackground(new java.awt.Color(255, 255, 255));
        txtEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEquipo.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(fotoEquipo)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(txtArma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnMochilaUsar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnMochilaSoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnMochilaEquipar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnMochilaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoEquipo)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMochilaUsar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMochilaSoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMochilaEquipar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMochilaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout dialogMochilaLayout = new javax.swing.GroupLayout(dialogMochila.getContentPane());
        dialogMochila.getContentPane().setLayout(dialogMochilaLayout);
        dialogMochilaLayout.setHorizontalGroup(
            dialogMochilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogMochilaLayout.setVerticalGroup(
            dialogMochilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogSoltar.setModal(true);
        dialogSoltar.setResizable(false);

        btnSoltarAceptar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSoltarAceptar.setForeground(new java.awt.Color(0, 51, 255));
        btnSoltarAceptar.setText("Aceptar");
        btnSoltarAceptar.setBorder(new javax.swing.border.MatteBorder(null));

        btnSoltarCancelar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSoltarCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnSoltarCancelar.setText("Cancelar");
        btnSoltarCancelar.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("¿Desea soltar/eliminar el objeto?");
        jLabel34.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel34.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel34))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSoltarAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSoltarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel34)
                .addGap(41, 41, 41)
                .addComponent(btnSoltarAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnSoltarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dialogSoltarLayout = new javax.swing.GroupLayout(dialogSoltar.getContentPane());
        dialogSoltar.getContentPane().setLayout(dialogSoltarLayout);
        dialogSoltarLayout.setHorizontalGroup(
            dialogSoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogSoltarLayout.setVerticalGroup(
            dialogSoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dialogTiendaVenderVender.setModal(true);
        dialogTiendaVenderVender.setResizable(false);

        jLabel35.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("¿Quieres venderlo?");
        jLabel35.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel35.setOpaque(true);

        btnAceptarVenderVenderTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarVenderVenderTienda.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptarVenderVenderTienda.setText("Aceptar");
        btnAceptarVenderVenderTienda.setBorder(new javax.swing.border.MatteBorder(null));

        btnCancelarVenderVenderTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarVenderVenderTienda.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarVenderVenderTienda.setText("Cancelar");
        btnCancelarVenderVenderTienda.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout dialogTiendaVenderVenderLayout = new javax.swing.GroupLayout(dialogTiendaVenderVender.getContentPane());
        dialogTiendaVenderVender.getContentPane().setLayout(dialogTiendaVenderVenderLayout);
        dialogTiendaVenderVenderLayout.setHorizontalGroup(
            dialogTiendaVenderVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTiendaVenderVenderLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel35))
            .addGroup(dialogTiendaVenderVenderLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnAceptarVenderVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dialogTiendaVenderVenderLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnCancelarVenderVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dialogTiendaVenderVenderLayout.setVerticalGroup(
            dialogTiendaVenderVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTiendaVenderVenderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel35)
                .addGap(72, 72, 72)
                .addComponent(btnAceptarVenderVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelarVenderVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dialogCambiarContraseña.setResizable(false);

        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("¿Seguro que quieres cambiar de contraseña?");
        jLabel44.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel44.setOpaque(true);

        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 51, 255));
        jLabel43.setText("Contraseña Nueva :");
        jLabel43.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel43.setOpaque(true);

        jLabel45.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 51, 255));
        jLabel45.setText("Contraseña Antigua :");
        jLabel45.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel45.setOpaque(true);

        jTextContraseñaA.setBorder(new javax.swing.border.MatteBorder(null));
        jTextContraseñaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContraseñaAActionPerformed(evt);
            }
        });

        jTextContraseñaN.setBorder(new javax.swing.border.MatteBorder(null));

        btnAceptarCambiarContraseña.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarCambiarContraseña.setForeground(new java.awt.Color(0, 0, 204));
        btnAceptarCambiarContraseña.setText("Aceptar");
        btnAceptarCambiarContraseña.setBorder(new javax.swing.border.MatteBorder(null));

        btnCancelarCambiarContraseña.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarCambiarContraseña.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarCambiarContraseña.setText("Cancelar");
        btnCancelarCambiarContraseña.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel44))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextContraseñaA, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jTextContraseñaN, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAceptarCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancelarCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextContraseñaA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextContraseñaN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout dialogCambiarContraseñaLayout = new javax.swing.GroupLayout(dialogCambiarContraseña.getContentPane());
        dialogCambiarContraseña.getContentPane().setLayout(dialogCambiarContraseñaLayout);
        dialogCambiarContraseñaLayout.setHorizontalGroup(
            dialogCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        dialogCambiarContraseñaLayout.setVerticalGroup(
            dialogCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dialogMochilaCombate.setModal(true);
        dialogMochilaCombate.setResizable(false);

        btnUsarObjetoCombate.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnUsarObjetoCombate.setForeground(new java.awt.Color(0, 0, 255));
        btnUsarObjetoCombate.setText("Usar");
        btnUsarObjetoCombate.setBorder(new javax.swing.border.MatteBorder(null));
        btnUsarObjetoCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarObjetoCombateActionPerformed(evt);
            }
        });

        btnSalirMochilaCombate.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSalirMochilaCombate.setForeground(new java.awt.Color(255, 0, 0));
        btnSalirMochilaCombate.setText("Salir");
        btnSalirMochilaCombate.setBorder(new javax.swing.border.MatteBorder(null));

        tablaMochilaCombate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaMochilaCombate.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tablaMochilaCombate);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnUsarObjetoCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSalirMochilaCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsarObjetoCombate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnSalirMochilaCombate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout dialogMochilaCombateLayout = new javax.swing.GroupLayout(dialogMochilaCombate.getContentPane());
        dialogMochilaCombate.getContentPane().setLayout(dialogMochilaCombateLayout);
        dialogMochilaCombateLayout.setHorizontalGroup(
            dialogMochilaCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogMochilaCombateLayout.setVerticalGroup(
            dialogMochilaCombateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnTienda.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTienda.setForeground(new java.awt.Color(51, 51, 255));
        btnTienda.setText("Mercado");
        btnTienda.setBorder(new javax.swing.border.MatteBorder(null));
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });

        btnMochila.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnMochila.setForeground(new java.awt.Color(51, 51, 255));
        btnMochila.setText("Mochila");
        btnMochila.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaActionPerformed(evt);
            }
        });

        btnTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTaberna.setForeground(new java.awt.Color(51, 51, 255));
        btnTaberna.setText("Taberna");
        btnTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabernaActionPerformed(evt);
            }
        });

        btnCombatir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCombatir.setForeground(new java.awt.Color(255, 0, 0));
        btnCombatir.setText("Combatir");
        btnCombatir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nivel:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clase:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Exp:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Oro:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 153, 153));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setOpaque(true);

        txtNivel.setBackground(new java.awt.Color(255, 255, 255));
        txtNivel.setForeground(new java.awt.Color(0, 153, 153));
        txtNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNivel.setOpaque(true);

        txtClase.setBackground(new java.awt.Color(255, 255, 255));
        txtClase.setForeground(new java.awt.Color(0, 153, 153));
        txtClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtClase.setOpaque(true);

        txtExperiencia.setBackground(new java.awt.Color(255, 255, 255));
        txtExperiencia.setForeground(new java.awt.Color(0, 153, 153));
        txtExperiencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExperiencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtExperiencia.setOpaque(true);

        txtOro.setBackground(new java.awt.Color(255, 255, 255));
        txtOro.setForeground(new java.awt.Color(0, 153, 153));
        txtOro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtOro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtOro.setOpaque(true);

        fotoClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/picaro.png"))); // NOI18N
        fotoClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        historial.setEditable(false);
        historialScroll.setViewportView(historial);

        jLabel6.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 12)); // NOI18N
        jLabel6.setText("PV");

        txtPV.setBackground(new java.awt.Color(255, 255, 255));
        txtPV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPV.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 12)); // NOI18N
        jLabel8.setText("PE");

        txtPE.setBackground(new java.awt.Color(255, 255, 255));
        txtPE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPE.setOpaque(true);

        txtPVMax.setBackground(new java.awt.Color(255, 255, 255));
        txtPVMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPVMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPVMax.setOpaque(true);

        txtPEMax.setBackground(new java.awt.Color(255, 255, 255));
        txtPEMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPEMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPEMax.setOpaque(true);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("/");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("/");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("/");

        txtExperienciaMax.setBackground(new java.awt.Color(255, 255, 255));
        txtExperienciaMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExperienciaMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtExperienciaMax.setOpaque(true);

        jMenu1.setText("Opciones");

        btnCambiarC.setSelected(true);
        btnCambiarC.setText("Cambiar Contraseña");
        jMenu1.add(btnCambiarC);

        btnCerrarS.setSelected(true);
        btnCerrarS.setText("Cerrar Sesión");
        btnCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSActionPerformed(evt);
            }
        });
        jMenu1.add(btnCerrarS);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(fotoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtPE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtPEMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(txtExperienciaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(historialScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtOro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(txtPV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(txtPVMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnCombatir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50)
                                .addComponent(txtPE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(txtPEMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtExperienciaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(historialScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(txtOro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtPV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtPVMax, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnCombatir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabernaActionPerformed
      
    }//GEN-LAST:event_btnTabernaActionPerformed

    private void btnCancelarComprarTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComprarTabernaActionPerformed
       
    }//GEN-LAST:event_btnCancelarComprarTabernaActionPerformed

    private void btnCancelarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlojamientoActionPerformed
        
    }//GEN-LAST:event_btnCancelarAlojamientoActionPerformed

    private void btnAlojamientoTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlojamientoTabernaActionPerformed
        
    }//GEN-LAST:event_btnAlojamientoTabernaActionPerformed

    private void btnComprarTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTabernaActionPerformed

       
    }//GEN-LAST:event_btnComprarTabernaActionPerformed

    private void dialogTabernaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogTabernaWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTabernaWindowClosed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnComprarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTiendaActionPerformed
        
    }//GEN-LAST:event_btnComprarTiendaActionPerformed

    private void btnVenderTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderTiendaActionPerformed
        
    }//GEN-LAST:event_btnVenderTiendaActionPerformed

    private void btnCancelarCompraTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraTiendaActionPerformed
       
    }//GEN-LAST:event_btnCancelarCompraTiendaActionPerformed

    private void btnSalirTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTiendaActionPerformed
         
    }//GEN-LAST:event_btnSalirTiendaActionPerformed

    private void btnSalirTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTabernaActionPerformed
         
    }//GEN-LAST:event_btnSalirTabernaActionPerformed

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        
    }//GEN-LAST:event_btnCombatirActionPerformed

    private void btnCombatirAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirAtacarActionPerformed
        
    }//GEN-LAST:event_btnCombatirAtacarActionPerformed

    private void btnCombatirDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirDefenderActionPerformed
        
    }//GEN-LAST:event_btnCombatirDefenderActionPerformed

    private void btnCombatirEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirEspecialActionPerformed
        
    }//GEN-LAST:event_btnCombatirEspecialActionPerformed

    private void btnCombatirMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirMochilaActionPerformed
        
    }//GEN-LAST:event_btnCombatirMochilaActionPerformed

    private void btnCombatirHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirHuirActionPerformed
        
    }//GEN-LAST:event_btnCombatirHuirActionPerformed

    private void btnHuirPerderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuirPerderActionPerformed
        
    }//GEN-LAST:event_btnHuirPerderActionPerformed

    private void btnSalirVenderTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVenderTiendaActionPerformed
        
    }//GEN-LAST:event_btnSalirVenderTiendaActionPerformed

    private void btnMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaActionPerformed
       
    }//GEN-LAST:event_btnMochilaActionPerformed

    private void btnMochilaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaSalirActionPerformed
       
    }//GEN-LAST:event_btnMochilaSalirActionPerformed

    private void jTextContraseñaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContraseñaAActionPerformed

    }//GEN-LAST:event_jTextContraseñaAActionPerformed

    private void btnUsarObjetoCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarObjetoCombateActionPerformed

    }//GEN-LAST:event_btnUsarObjetoCombateActionPerformed

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHijas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarAlojamiento;
    public javax.swing.JButton btnAceptarCambiarContraseña;
    public javax.swing.JButton btnAceptarCompraTienda;
    public javax.swing.JButton btnAceptarComprarTaberna;
    public javax.swing.JButton btnAceptarVenderVenderTienda;
    public javax.swing.JButton btnAlojamientoTaberna;
    public javax.swing.JRadioButtonMenuItem btnCambiarC;
    public javax.swing.JButton btnCancelarAlojamiento;
    public javax.swing.JButton btnCancelarCambiarContraseña;
    public javax.swing.JButton btnCancelarCompraTienda;
    public javax.swing.JButton btnCancelarComprarTaberna;
    public javax.swing.JButton btnCancelarVenderVenderTienda;
    public javax.swing.JRadioButtonMenuItem btnCerrarS;
    public javax.swing.JButton btnCombatir;
    public javax.swing.JButton btnCombatirAtacar;
    public javax.swing.JButton btnCombatirDefender;
    public javax.swing.JButton btnCombatirEspecial;
    public javax.swing.JButton btnCombatirHuir;
    public javax.swing.JButton btnCombatirMochila;
    public javax.swing.JButton btnComprarTaberna;
    public javax.swing.JButton btnComprarTienda;
    public javax.swing.JButton btnHuirPerder;
    public javax.swing.JButton btnMochila;
    public javax.swing.JButton btnMochilaEquipar;
    public javax.swing.JButton btnMochilaSalir;
    public javax.swing.JButton btnMochilaSoltar;
    public javax.swing.JButton btnMochilaUsar;
    public javax.swing.JButton btnSalirMochilaCombate;
    public javax.swing.JButton btnSalirTaberna;
    public javax.swing.JButton btnSalirTienda;
    public javax.swing.JButton btnSalirVenderTienda;
    public javax.swing.JButton btnSoltarAceptar;
    public javax.swing.JButton btnSoltarCancelar;
    public javax.swing.JButton btnTaberna;
    public javax.swing.JButton btnTienda;
    public javax.swing.JButton btnUsarObjetoCombate;
    public javax.swing.JButton btnVenderTienda;
    public javax.swing.JButton btnVenderVenderTienda;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JDialog dialogCambiarContraseña;
    public javax.swing.JDialog dialogCombatir;
    public javax.swing.JDialog dialogHuir;
    public javax.swing.JDialog dialogMochila;
    public javax.swing.JDialog dialogMochilaCombate;
    public javax.swing.JDialog dialogSoltar;
    public javax.swing.JDialog dialogTaberna;
    public javax.swing.JDialog dialogTabernaAlojamiento;
    public javax.swing.JDialog dialogTabernaCompra;
    public javax.swing.JDialog dialogTienda;
    public javax.swing.JDialog dialogTiendaComprar;
    public javax.swing.JDialog dialogTiendaVender;
    public javax.swing.JDialog dialogTiendaVenderVender;
    public javax.swing.JLabel fotoClase;
    public javax.swing.JLabel fotoEquipo;
    public javax.swing.JTextPane historial;
    public javax.swing.JTextPane historialCombate;
    private javax.swing.JScrollPane historialScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTextField jTextContraseñaA;
    public javax.swing.JTextField jTextContraseñaN;
    public javax.swing.JTable tablaMochila;
    public javax.swing.JTable tablaMochilaCombate;
    public javax.swing.JTable tablaMochilaVender;
    public javax.swing.JTable tablaTaberna;
    public javax.swing.JTable tablaTienda;
    public javax.swing.JLabel txtArma;
    public javax.swing.JLabel txtClase;
    public javax.swing.JLabel txtEquipo;
    public javax.swing.JLabel txtExperiencia;
    public javax.swing.JLabel txtExperienciaMax;
    public javax.swing.JLabel txtNivel;
    public javax.swing.JLabel txtNivelEnemigo;
    public javax.swing.JLabel txtNombre;
    public javax.swing.JLabel txtNombreCombate;
    public javax.swing.JLabel txtNombreEnemigo;
    public javax.swing.JLabel txtOro;
    public javax.swing.JLabel txtPE;
    public javax.swing.JLabel txtPECombate;
    public javax.swing.JLabel txtPECombateMax;
    public javax.swing.JLabel txtPEMax;
    public javax.swing.JLabel txtPV;
    public javax.swing.JLabel txtPVCombate;
    public javax.swing.JLabel txtPVCombateMax;
    public javax.swing.JLabel txtPVEnemigo;
    public javax.swing.JLabel txtPVEnemigoMax;
    public javax.swing.JLabel txtPVMax;
    // End of variables declaration//GEN-END:variables
}
