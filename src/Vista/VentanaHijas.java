package Vista;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class VentanaHijas extends javax.swing.JFrame {
    
    String historialString = "Historial de partida:";
    String historialCombateString = "Historial de combate: "; 

    public VentanaHijas() {
        initComponents();
        this.setTitle("Inicio de sesión");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTaberna.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTienda.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogHuir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogCombatir.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  
        dialogSoltar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTabernaCompra.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTiendaComprar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTiendaVender.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogTabernaAlojamiento.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dialogMochila.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
        jLabel17 = new javax.swing.JLabel();
        dialogTabernaCompra = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAceptarComprarTaberna = new javax.swing.JButton();
        btnCancelarComprarTaberna = new javax.swing.JButton();
        dialogTabernaAlojamiento = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnAceptarAlojamiento = new javax.swing.JButton();
        btnCancelarAlojamiento = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        dialogTienda = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnComprarTienda = new javax.swing.JButton();
        btnVenderTienda = new javax.swing.JButton();
        btnSalirTienda = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        dialogTiendaComprar = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnAceptarCompraTienda = new javax.swing.JButton();
        btnCancelarCompraTienda = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        dialogTiendaVender = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVenderT = new javax.swing.JTable();
        btnVenderVenderTienda = new javax.swing.JButton();
        btnSalirVenderTienda = new javax.swing.JButton();
        dialogCombatir = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        barraHP = new javax.swing.JProgressBar();
        barraEP = new javax.swing.JProgressBar();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        historialCombate = new javax.swing.JTextPane();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        barraHPEn = new javax.swing.JProgressBar();
        jLabel31 = new javax.swing.JLabel();
        btnCombatirAtacar = new javax.swing.JButton();
        btnCombatirDefender = new javax.swing.JButton();
        btnCombatirEspecial = new javax.swing.JButton();
        btnCombatirMochila = new javax.swing.JButton();
        btnCombatirHuir = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        dialogHuir = new javax.swing.JDialog();
        btnHuirPerder = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        dialogMochila = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        btnMochilaUsar = new javax.swing.JButton();
        btnMochilaEquipar = new javax.swing.JButton();
        btnMochilaSalir = new javax.swing.JButton();
        btnMochilaSoltar = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogSoltar = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnSoltarAceptar = new javax.swing.JButton();
        btnSoltarCancelar = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        dialogTiendaVenderVender = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        btnAceptarVenderVenderTienda = new javax.swing.JButton();
        btnCancelarVenderVenderTienda = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        dialogCambiarContraseña = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        dialogMochilaCombate = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        btnMochila = new javax.swing.JButton();
        btnTaberna = new javax.swing.JButton();
        btnCombatir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Barrahp = new javax.swing.JProgressBar();
        BarraEp = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        historialScroll = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextPane();
        jLabel39 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        dialogTaberna.setResizable(false);
        dialogTaberna.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                dialogTabernaWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnComprarTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnComprarTaberna.setText("Comprar");
        btnComprarTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnComprarTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTabernaActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprarTaberna, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 375, 40));

        btnAlojamientoTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAlojamientoTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnAlojamientoTaberna.setText("Alojamiento");
        btnAlojamientoTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnAlojamientoTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlojamientoTabernaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlojamientoTaberna, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 376, 40));

        btnSalirTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSalirTaberna.setForeground(new java.awt.Color(0, 153, 153));
        btnSalirTaberna.setText("Salir");
        btnSalirTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnSalirTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTabernaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirTaberna, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 373, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taberna3.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout dialogTabernaLayout = new javax.swing.GroupLayout(dialogTaberna.getContentPane());
        dialogTaberna.getContentPane().setLayout(dialogTabernaLayout);
        dialogTabernaLayout.setHorizontalGroup(
            dialogTabernaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTabernaLayout.setVerticalGroup(
            dialogTabernaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTabernaCompra.setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAceptarComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnCancelarComprarTaberna, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarComprarTaberna)
                    .addComponent(btnCancelarComprarTaberna))
                .addGap(0, 22, Short.MAX_VALUE))
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
        dialogTabernaAlojamiento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("     El alojamiento en la taberna ");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);
        dialogTabernaAlojamiento.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 300, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("       cuesta 30 monedas de oro ");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        dialogTabernaAlojamiento.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("(Tu  vida y energia se regeraran al 100%)");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);
        dialogTabernaAlojamiento.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        btnAceptarAlojamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAceptarAlojamiento.setForeground(new java.awt.Color(51, 51, 255));
        btnAceptarAlojamiento.setText("Aceptar");
        btnAceptarAlojamiento.setBorder(new javax.swing.border.MatteBorder(null));
        dialogTabernaAlojamiento.getContentPane().add(btnAceptarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 141, 420, 30));

        btnCancelarAlojamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelarAlojamiento.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarAlojamiento.setText("Cancelar");
        btnCancelarAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlojamientoActionPerformed(evt);
            }
        });
        dialogTabernaAlojamiento.getContentPane().add(btnCancelarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 420, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        dialogTabernaAlojamiento.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        dialogTienda.setResizable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

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

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Market.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnComprarTienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenderTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprarTienda)
                    .addComponent(btnVenderTienda)
                    .addComponent(btnSalirTienda))
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogTiendaLayout = new javax.swing.GroupLayout(dialogTienda.getContentPane());
        dialogTienda.getContentPane().setLayout(dialogTiendaLayout);
        dialogTiendaLayout.setHorizontalGroup(
            dialogTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogTiendaLayout.setVerticalGroup(
            dialogTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTiendaComprar.setResizable(false);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("¿Desea comprar el \"articulo\"?");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 330, -1));

        btnAceptarCompraTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarCompraTienda.setForeground(new java.awt.Color(51, 51, 255));
        btnAceptarCompraTienda.setText("Aceptar");
        btnAceptarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(btnAceptarCompraTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 30));

        btnCancelarCompraTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarCompraTienda.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarCompraTienda.setText("Cancelar");
        btnCancelarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancelarCompraTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraTiendaActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarCompraTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 370, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 290));

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

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVenderT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaVenderT);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 230));

        btnVenderVenderTienda.setText("Vender");
        jPanel6.add(btnVenderVenderTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnSalirVenderTienda.setText("Salir");
        btnSalirVenderTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVenderTiendaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalirVenderTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        javax.swing.GroupLayout dialogTiendaVenderLayout = new javax.swing.GroupLayout(dialogTiendaVender.getContentPane());
        dialogTiendaVender.getContentPane().setLayout(dialogTiendaVenderLayout);
        dialogTiendaVenderLayout.setHorizontalGroup(
            dialogTiendaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        dialogTiendaVenderLayout.setVerticalGroup(
            dialogTiendaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        dialogCombatir.setAlwaysOnTop(true);
        dialogCombatir.setModal(true);
        dialogCombatir.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("EP:");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setOpaque(true);
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, 20, -1));

        barraHP.setFocusTraversalPolicyProvider(true);
        jPanel5.add(barraHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 10, 340, -1));
        jPanel5.add(barraEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 33, 340, -1));

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setText("0%");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 153));
        jLabel24.setText("0%");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 20, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 153));
        jLabel25.setText("HP:");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setOpaque(true);
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        historialCombate.setEditable(false);
        jScrollPane3.setViewportView(historialCombate);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 380, 160));

        jLabel26.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("Enemigo:");
        jLabel26.setOpaque(true);
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 255));
        jLabel27.setText("Olonam");
        jLabel27.setOpaque(true);
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("Nv:");
        jLabel28.setOpaque(true);
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("99");
        jLabel29.setOpaque(true);
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 153));
        jLabel30.setText("HP:");
        jLabel30.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel30.setOpaque(true);
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        barraHPEn.setFocusTraversalPolicyProvider(true);
        jPanel5.add(barraHPEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, -1));

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 153));
        jLabel31.setText("0%");
        jLabel31.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel31.setOpaque(true);
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 20, 20));

        btnCombatirAtacar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirAtacar.setForeground(new java.awt.Color(0, 0, 255));
        btnCombatirAtacar.setText("Atacar");
        btnCombatirAtacar.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirAtacarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCombatirAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, 30));

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
        jPanel5.add(btnCombatirDefender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 30));

        btnCombatirEspecial.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirEspecial.setForeground(new java.awt.Color(255, 51, 0));
        btnCombatirEspecial.setText("At.Especial");
        btnCombatirEspecial.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirEspecialActionPerformed(evt);
            }
        });
        jPanel5.add(btnCombatirEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 30));

        btnCombatirMochila.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirMochila.setForeground(new java.awt.Color(0, 0, 255));
        btnCombatirMochila.setText("Mochila");
        btnCombatirMochila.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirMochilaActionPerformed(evt);
            }
        });
        jPanel5.add(btnCombatirMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 190, 30));

        btnCombatirHuir.setBackground(new java.awt.Color(255, 51, 51));
        btnCombatirHuir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCombatirHuir.setText("Huir");
        btnCombatirHuir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatirHuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirHuirActionPerformed(evt);
            }
        });
        jPanel5.add(btnCombatirHuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 400, 30));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 370));

        javax.swing.GroupLayout dialogCombatirLayout = new javax.swing.GroupLayout(dialogCombatir.getContentPane());
        dialogCombatir.getContentPane().setLayout(dialogCombatirLayout);
        dialogCombatirLayout.setHorizontalGroup(
            dialogCombatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogCombatirLayout.setVerticalGroup(
            dialogCombatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        dialogHuir.setAlwaysOnTop(true);
        dialogHuir.setModal(true);
        dialogHuir.setResizable(false);
        dialogHuir.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHuirPerder.setBackground(new java.awt.Color(255, 0, 0));
        btnHuirPerder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnHuirPerder.setText("Asume tu error, tu vergüenza y tu fracaso");
        btnHuirPerder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuirPerderActionPerformed(evt);
            }
        });
        dialogHuir.getContentPane().add(btnHuirPerder, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 450, 310, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Little Thanos.jpg"))); // NOI18N
        dialogHuir.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 530));

        dialogMochila.setAlwaysOnTop(true);
        dialogMochila.setModal(true);
        dialogMochila.setResizable(false);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable3);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 11, 462, 410));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tio pajo.jpg"))); // NOI18N
        jLabel33.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 11, -1, -1));

        btnMochilaUsar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaUsar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaUsar.setText("Usar");
        btnMochilaUsar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnMochilaUsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 458, 300, 30));

        btnMochilaEquipar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaEquipar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaEquipar.setText("Equipar");
        btnMochilaEquipar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnMochilaEquipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 506, 300, 30));

        btnMochilaSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnMochilaSalir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaSalir.setText("Salir");
        btnMochilaSalir.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochilaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaSalirActionPerformed(evt);
            }
        });
        jPanel7.add(btnMochilaSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 506, 300, 30));

        btnMochilaSoltar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaSoltar.setForeground(new java.awt.Color(0, 51, 255));
        btnMochilaSoltar.setText("Soltar");
        btnMochilaSoltar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnMochilaSoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 458, 300, 30));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -10, 1170, 560));

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

        dialogSoltar.setAlwaysOnTop(true);
        dialogSoltar.setModal(true);
        dialogSoltar.setResizable(false);
        dialogSoltar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSoltarAceptar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSoltarAceptar.setForeground(new java.awt.Color(0, 51, 255));
        btnSoltarAceptar.setText("Aceptar");
        btnSoltarAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.add(btnSoltarAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 260, -1));

        btnSoltarCancelar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSoltarCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnSoltarCancelar.setText("Cancelar");
        btnSoltarCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.add(btnSoltarCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 260, -1));

        jLabel34.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("¿Desea eliminar el objeto?");
        jLabel34.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel34.setOpaque(true);
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 400, 180));

        dialogSoltar.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 170));

        dialogTiendaVenderVender.setAlwaysOnTop(true);
        dialogTiendaVenderVender.setModal(true);
        dialogTiendaVenderVender.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("¿Quieres venderlo?");
        jLabel35.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel35.setOpaque(true);
        dialogTiendaVenderVender.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnAceptarVenderVenderTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarVenderVenderTienda.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptarVenderVenderTienda.setText("Aceptar");
        btnAceptarVenderVenderTienda.setBorder(new javax.swing.border.MatteBorder(null));
        dialogTiendaVenderVender.getContentPane().add(btnAceptarVenderVenderTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 20));

        btnCancelarVenderVenderTienda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarVenderVenderTienda.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarVenderVenderTienda.setText("Cancelar");
        btnCancelarVenderVenderTienda.setBorder(new javax.swing.border.MatteBorder(null));
        dialogTiendaVenderVender.getContentPane().add(btnCancelarVenderVenderTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 260, 20));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        dialogTiendaVenderVender.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 460, 250));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("¿Seguro que quieres cambiar de contraseña?");
        jLabel44.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel44.setOpaque(true);
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 40));

        jLabel43.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 51, 255));
        jLabel43.setText("Contraseña Nueva :");
        jLabel43.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel43.setOpaque(true);
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 20));

        jLabel45.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 51, 255));
        jLabel45.setText("Contraseña Antigua :");
        jLabel45.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel45.setOpaque(true);
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 20));

        jTextField1.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 320, 20));

        jTextField2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 320, 20));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Aceptar");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 30));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancelar");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, 30));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.JPG"))); // NOI18N
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        javax.swing.GroupLayout dialogCambiarContraseñaLayout = new javax.swing.GroupLayout(dialogCambiarContraseña.getContentPane());
        dialogCambiarContraseña.getContentPane().setLayout(dialogCambiarContraseñaLayout);
        dialogCambiarContraseñaLayout.setHorizontalGroup(
            dialogCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCambiarContraseñaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dialogCambiarContraseñaLayout.setVerticalGroup(
            dialogCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable4);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Usar");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Salir");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTienda.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTienda.setForeground(new java.awt.Color(51, 51, 255));
        btnTienda.setText("Tienda");
        btnTienda.setBorder(new javax.swing.border.MatteBorder(null));
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, 30));

        btnMochila.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnMochila.setForeground(new java.awt.Color(51, 51, 255));
        btnMochila.setText("Mochila");
        btnMochila.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 250, 30));

        btnTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTaberna.setForeground(new java.awt.Color(51, 51, 255));
        btnTaberna.setText("Taberna");
        btnTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabernaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaberna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, 30));

        btnCombatir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCombatir.setForeground(new java.awt.Color(255, 0, 0));
        btnCombatir.setText("Combatir");
        btnCombatir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirActionPerformed(evt);
            }
        });
        getContentPane().add(btnCombatir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, 90));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nombre:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Nivel:");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 50, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Clase:");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 50, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Exp :");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 50, 20));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Oro :");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 50, 20));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("HP:");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("EP:");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 20, 20));

        Barrahp.setBorder(new javax.swing.border.MatteBorder(null));
        Barrahp.setFocusTraversalPolicyProvider(true);
        getContentPane().add(Barrahp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 190, 20));

        BarraEp.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(BarraEp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 190, 20));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("0%");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("0%");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 20, -1));

        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("       Robrj");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, 20));

        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("         99");
        jLabel11.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 70, 20));

        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("      Picaro");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 20));

        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("  9999/9999");
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 70, 20));

        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("    10.000");
        jLabel14.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/picaro.png"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, 100));

        historial.setEditable(false);
        historialScroll.setViewportView(historial);

        getContentPane().add(historialScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 180));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 290));

        jMenu1.setText("Opciones");

        jMenu4.setText("Cambiar Contraseña");
        jMenu1.add(jMenu4);

        jMenu2.setText("Cerrar Sesión  ");
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabernaActionPerformed
        dialogTaberna.setSize(540,400);//anchura , altura
        dialogTaberna.setLocation(150,150);
        dialogTaberna.setVisible(true);
    }//GEN-LAST:event_btnTabernaActionPerformed

    private void btnCancelarComprarTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComprarTabernaActionPerformed
        dialogTabernaCompra.dispose();//cierra el dialog 
    }//GEN-LAST:event_btnCancelarComprarTabernaActionPerformed

    private void btnCancelarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlojamientoActionPerformed
        dialogTabernaAlojamiento.dispose();
    }//GEN-LAST:event_btnCancelarAlojamientoActionPerformed

    private void btnAlojamientoTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlojamientoTabernaActionPerformed
        dialogTabernaAlojamiento.setSize(300,250);
        dialogTabernaAlojamiento.setLocation(150,150);
        dialogTabernaAlojamiento.setVisible(true);
    }//GEN-LAST:event_btnAlojamientoTabernaActionPerformed

    private void btnComprarTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTabernaActionPerformed

        dialogTabernaCompra.setSize(400,400);
        dialogTabernaCompra.setLocation(150,150);
        dialogTabernaCompra.setVisible(true);
    }//GEN-LAST:event_btnComprarTabernaActionPerformed

    private void dialogTabernaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogTabernaWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTabernaWindowClosed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        dialogTienda.setSize(625,700);
        dialogTienda.setLocation(100,100);
        dialogTienda.setVisible(true);
        
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnComprarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTiendaActionPerformed
        dialogTiendaComprar.setSize(400,350);
        dialogTiendaComprar.setLocation(100,100);
        dialogTiendaComprar.setVisible(true);
    }//GEN-LAST:event_btnComprarTiendaActionPerformed

    private void btnVenderTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderTiendaActionPerformed
        dialogTiendaVender.setSize(420,350);
        dialogTiendaVender.setLocation(100,100);
        dialogTiendaVender.setVisible(true);
    }//GEN-LAST:event_btnVenderTiendaActionPerformed

    private void btnCancelarCompraTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraTiendaActionPerformed
        dialogTiendaComprar.dispose();
    }//GEN-LAST:event_btnCancelarCompraTiendaActionPerformed

    private void btnSalirTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTiendaActionPerformed
         dialogTienda.dispose();
    }//GEN-LAST:event_btnSalirTiendaActionPerformed

    private void btnSalirTabernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTabernaActionPerformed
         dialogTaberna.dispose();
    }//GEN-LAST:event_btnSalirTabernaActionPerformed

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        historialString = historialString + "\n¡Combate iniciado!";
        historial.setText(historialString);
        historialCombateString = historialCombateString + "\n¡Olonam salvaje ha aparecido!";
        historialCombate.setText(historialCombateString);
        dialogCombatir.setSize(382, 410);
        dialogCombatir.setLocation(450, 325);
        dialogCombatir.setVisible(true);
    }//GEN-LAST:event_btnCombatirActionPerformed

    private void btnCombatirAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirAtacarActionPerformed
        historialCombateString = historialCombateString + "\nHa intentado atacar a Olonam, pero como es muy fuerte, esquiva fácilmente tus ataques.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnCombatirAtacarActionPerformed

    private void btnCombatirDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirDefenderActionPerformed
        historialCombateString = historialCombateString + "\nNo puedes defenderte porque no quiero.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnCombatirDefenderActionPerformed

    private void btnCombatirEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirEspecialActionPerformed
        historialCombateString = historialCombateString + "\nNo, lo siento, no tienes nada de especial.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnCombatirEspecialActionPerformed

    private void btnCombatirMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirMochilaActionPerformed
        historialCombateString = historialCombateString + "\nNo tienes mochila, porque eres pobre y ni siquiera llevas ropa puesta.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnCombatirMochilaActionPerformed

    private void btnCombatirHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirHuirActionPerformed
        historialCombateString = "Historial de combate:";
        historialCombate.setText(historialCombateString);
        dialogCombatir.dispose();
        dialogHuir.setSize(470,640);
        dialogHuir.setLocation(100,100);
        dialogHuir.setVisible(true);
        historialString = historialString + "\nCombate finalizado.";
        historial.setText(historialString);
    }//GEN-LAST:event_btnCombatirHuirActionPerformed

    private void btnHuirPerderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuirPerderActionPerformed
        dialogHuir.dispose();
    }//GEN-LAST:event_btnHuirPerderActionPerformed

    private void btnSalirVenderTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVenderTiendaActionPerformed
        dialogTiendaVender.dispose();
    }//GEN-LAST:event_btnSalirVenderTiendaActionPerformed

    private void btnMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaActionPerformed
         dialogMochila.setSize(725,625);//ancho , largo
       dialogMochila.setLocation(100,100);
        dialogMochila.setVisible(true);
    }//GEN-LAST:event_btnMochilaActionPerformed

    private void btnMochilaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaSalirActionPerformed

    }//GEN-LAST:event_btnMochilaSalirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHijas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraEp;
    private javax.swing.JProgressBar Barrahp;
    private javax.swing.JProgressBar barraEP;
    private javax.swing.JProgressBar barraHP;
    private javax.swing.JProgressBar barraHPEn;
    public javax.swing.JButton btnAceptarAlojamiento;
    public javax.swing.JButton btnAceptarCompraTienda;
    public javax.swing.JButton btnAceptarComprarTaberna;
    public javax.swing.JButton btnAceptarVenderVenderTienda;
    public javax.swing.JButton btnAlojamientoTaberna;
    public javax.swing.JButton btnCancelarAlojamiento;
    public javax.swing.JButton btnCancelarCompraTienda;
    public javax.swing.JButton btnCancelarComprarTaberna;
    public javax.swing.JButton btnCancelarVenderVenderTienda;
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
    public javax.swing.JButton btnSalirTaberna;
    public javax.swing.JButton btnSalirTienda;
    public javax.swing.JButton btnSalirVenderTienda;
    public javax.swing.JButton btnSoltarAceptar;
    public javax.swing.JButton btnSoltarCancelar;
    public javax.swing.JButton btnTaberna;
    public javax.swing.JButton btnTienda;
    public javax.swing.JButton btnVenderTienda;
    public javax.swing.JButton btnVenderVenderTienda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dialogCambiarContraseña;
    private javax.swing.JDialog dialogCombatir;
    private javax.swing.JDialog dialogHuir;
    private javax.swing.JDialog dialogMochila;
    private javax.swing.JDialog dialogMochilaCombate;
    private javax.swing.JDialog dialogSoltar;
    private javax.swing.JDialog dialogTaberna;
    private javax.swing.JDialog dialogTabernaAlojamiento;
    private javax.swing.JDialog dialogTabernaCompra;
    private javax.swing.JDialog dialogTienda;
    private javax.swing.JDialog dialogTiendaComprar;
    private javax.swing.JDialog dialogTiendaVender;
    private javax.swing.JDialog dialogTiendaVenderVender;
    private javax.swing.JTextPane historial;
    private javax.swing.JTextPane historialCombate;
    private javax.swing.JScrollPane historialScroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tablaVenderT;
    // End of variables declaration//GEN-END:variables
}
