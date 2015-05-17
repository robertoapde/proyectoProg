package proyectoprog;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class VentanaHijas extends javax.swing.JFrame {
    
    String historialString = "Historial de partida:";
    String historialCombateString = "Historial de combate: "; 

    public VentanaHijas() {
        initComponents();
        //prohibe cerrar con la X
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
       URL url = getClass().getResource("/icon/Icono_Espada.png");
       ImageIcon img = new ImageIcon(url);
        setIconImage(img.getImage());
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTaberna = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        btnComprarT = new javax.swing.JButton();
        btnAlojamientoT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        dialogTabernaCompra = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAceptarComTabern = new javax.swing.JButton();
        btnCancelarComTaber = new javax.swing.JButton();
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
        btnComprar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
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
        btnVenderT = new javax.swing.JButton();
        btnSalirT = new javax.swing.JButton();
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
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        btnEspecial = new javax.swing.JButton();
        btnMochilaCombate = new javax.swing.JButton();
        btnHuir = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        dialogHuir = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        dialogMochila = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        btnUsar = new javax.swing.JButton();
        btnEquipar = new javax.swing.JButton();
        SalirM = new javax.swing.JButton();
        btnSoltar = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogSoltar = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        dialogTiendaVenderVender = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        btnAceptarVenderVender = new javax.swing.JButton();
        btnCancelarVenderVender = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
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

        btnComprarT.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnComprarT.setForeground(new java.awt.Color(0, 153, 153));
        btnComprarT.setText("Comprar");
        btnComprarT.setBorder(new javax.swing.border.MatteBorder(null));
        btnComprarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarTActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 91, 375, -1));

        btnAlojamientoT.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnAlojamientoT.setForeground(new java.awt.Color(0, 153, 153));
        btnAlojamientoT.setText("Alojamiento");
        btnAlojamientoT.setBorder(new javax.swing.border.MatteBorder(null));
        btnAlojamientoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlojamientoTActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlojamientoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 181, 376, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 261, 373, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/taberna3.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

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

        btnAceptarComTabern.setText("Aceptar");

        btnCancelarComTaber.setText("Cancelar");
        btnCancelarComTaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComTaberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAceptarComTabern, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnCancelarComTaber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarComTabern)
                    .addComponent(btnCancelarComTaber))
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
        dialogTabernaAlojamiento.getContentPane().add(btnAceptarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 420, -1));

        btnCancelarAlojamiento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCancelarAlojamiento.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarAlojamiento.setText("Cancelar");
        btnCancelarAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCancelarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlojamientoActionPerformed(evt);
            }
        });
        dialogTabernaAlojamiento.getContentPane().add(btnCancelarAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 420, -1));

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

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
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
                        .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnComprar)
                    .addComponent(btnVender)
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
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 330, -1));

        btnAceptarCompraTienda.setForeground(new java.awt.Color(51, 51, 255));
        btnAceptarCompraTienda.setText("Aceptar");
        btnAceptarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(btnAceptarCompraTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 20));

        btnCancelarCompraTienda.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelarCompraTienda.setText("Cancelar");
        btnCancelarCompraTienda.setBorder(new javax.swing.border.MatteBorder(null));
        btnCancelarCompraTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraTiendaActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancelarCompraTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 370, 20));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 510, 310));

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

        btnVenderT.setText("Vender");
        jPanel6.add(btnVenderT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        btnSalirT.setText("Salir");
        btnSalirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirTActionPerformed(evt);
            }
        });
        jPanel6.add(btnSalirT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

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
        jPanel5.add(barraHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 10, 330, -1));
        jPanel5.add(barraEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 33, 330, -1));

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setText("0%");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 20, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 153));
        jLabel24.setText("0%");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 20, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 153));
        jLabel25.setText("HP:");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setOpaque(true);
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        historialCombate.setEditable(false);
        jScrollPane3.setViewportView(historialCombate);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 356, 195));

        jLabel26.setText("Enemigo:");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, -1));

        jLabel27.setText("Olonam");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 256, -1, -1));

        jLabel28.setText("Nv:");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 256, -1, -1));

        jLabel29.setText("99");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 256, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 153, 153));
        jLabel30.setText("HP:");
        jLabel30.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel30.setOpaque(true);
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 276, -1, -1));

        barraHPEn.setFocusTraversalPolicyProvider(true);
        jPanel5.add(barraHPEn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 276, 340, -1));

        jLabel31.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 153));
        jLabel31.setText("0%");
        jLabel31.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel31.setOpaque(true);
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 20, 20));

        btnAtacar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAtacar.setForeground(new java.awt.Color(0, 0, 255));
        btnAtacar.setText("Atacar");
        btnAtacar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        jPanel5.add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        btnDefender.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnDefender.setForeground(new java.awt.Color(0, 0, 255));
        btnDefender.setText("Defender");
        btnDefender.setBorder(new javax.swing.border.MatteBorder(null));
        btnDefender.setVerifyInputWhenFocusTarget(false);
        btnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenderActionPerformed(evt);
            }
        });
        jPanel5.add(btnDefender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        btnEspecial.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnEspecial.setForeground(new java.awt.Color(255, 51, 0));
        btnEspecial.setText("At.Especial");
        btnEspecial.setBorder(new javax.swing.border.MatteBorder(null));
        btnEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialActionPerformed(evt);
            }
        });
        jPanel5.add(btnEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        btnMochilaCombate.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnMochilaCombate.setForeground(new java.awt.Color(0, 0, 255));
        btnMochilaCombate.setText("Mochila");
        btnMochilaCombate.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochilaCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaCombateActionPerformed(evt);
            }
        });
        jPanel5.add(btnMochilaCombate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 50, -1));

        btnHuir.setBackground(new java.awt.Color(255, 51, 51));
        btnHuir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnHuir.setText("Huir");
        btnHuir.setBorder(new javax.swing.border.MatteBorder(null));
        btnHuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuirActionPerformed(evt);
            }
        });
        jPanel5.add(btnHuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 323, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 560, 370));

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

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setText("Asume tu error, tu vergüenza y tu fracaso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        dialogHuir.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Little Thanos.jpg"))); // NOI18N
        dialogHuir.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 580));

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

        btnUsar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnUsar.setForeground(new java.awt.Color(0, 51, 255));
        btnUsar.setText("Usar");
        btnUsar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnUsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 469, 300, -1));

        btnEquipar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnEquipar.setForeground(new java.awt.Color(0, 51, 255));
        btnEquipar.setText("Equipar");
        btnEquipar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnEquipar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 506, 300, -1));

        SalirM.setBackground(new java.awt.Color(255, 0, 0));
        SalirM.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        SalirM.setText("Salir");
        SalirM.setBorder(new javax.swing.border.MatteBorder(null));
        SalirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMActionPerformed(evt);
            }
        });
        jPanel7.add(SalirM, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 506, 300, -1));

        btnSoltar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnSoltar.setForeground(new java.awt.Color(0, 51, 255));
        btnSoltar.setText("Soltar");
        btnSoltar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.add(btnSoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 469, 300, -1));

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

        btnAceptar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 51, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 260, -1));

        btnCancelar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 260, -1));

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

        btnAceptarVenderVender.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAceptarVenderVender.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptarVenderVender.setText("Aceptar");
        btnAceptarVenderVender.setBorder(new javax.swing.border.MatteBorder(null));
        dialogTiendaVenderVender.getContentPane().add(btnAceptarVenderVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 20));

        btnCancelarVenderVender.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnCancelarVenderVender.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarVenderVender.setText("Cancelar");
        btnCancelarVenderVender.setBorder(new javax.swing.border.MatteBorder(null));
        dialogTiendaVenderVender.getContentPane().add(btnCancelarVenderVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 260, 20));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.JPG"))); // NOI18N
        dialogTiendaVenderVender.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 460, 250));

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
        getContentPane().add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 250, -1));

        btnMochila.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnMochila.setForeground(new java.awt.Color(51, 51, 255));
        btnMochila.setText("Mochila");
        btnMochila.setBorder(new javax.swing.border.MatteBorder(null));
        btnMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 250, -1));

        btnTaberna.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTaberna.setForeground(new java.awt.Color(51, 51, 255));
        btnTaberna.setText("Taberna");
        btnTaberna.setBorder(new javax.swing.border.MatteBorder(null));
        btnTaberna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabernaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTaberna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 250, -1));

        btnCombatir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCombatir.setForeground(new java.awt.Color(255, 0, 0));
        btnCombatir.setText("Combatir");
        btnCombatir.setBorder(new javax.swing.border.MatteBorder(null));
        btnCombatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirActionPerformed(evt);
            }
        });
        getContentPane().add(btnCombatir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 80));

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
        jScrollPane4.setViewportView(historial);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 180));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargaperso.jpg"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(-660, 0, 1110, 290));

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

    private void btnCancelarComTaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComTaberActionPerformed
        dialogTabernaCompra.dispose();//cierra el dialog 
    }//GEN-LAST:event_btnCancelarComTaberActionPerformed

    private void btnCancelarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlojamientoActionPerformed
        dialogTabernaAlojamiento.dispose();
    }//GEN-LAST:event_btnCancelarAlojamientoActionPerformed

    private void btnAlojamientoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlojamientoTActionPerformed
        dialogTabernaAlojamiento.setSize(300,250);
        dialogTabernaAlojamiento.setLocation(150,150);
        dialogTabernaAlojamiento.setVisible(true);
    }//GEN-LAST:event_btnAlojamientoTActionPerformed

    private void btnComprarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarTActionPerformed

        dialogTabernaCompra.setSize(400,400);
        dialogTabernaCompra.setLocation(150,150);
        dialogTabernaCompra.setVisible(true);
    }//GEN-LAST:event_btnComprarTActionPerformed

    private void dialogTabernaWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogTabernaWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogTabernaWindowClosed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        dialogTienda.setSize(625,700);
        dialogTienda.setLocation(100,100);
        dialogTienda.setVisible(true);
        
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        dialogTiendaComprar.setSize(400,350);
        dialogTiendaComprar.setLocation(100,100);
        dialogTiendaComprar.setVisible(true);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        dialogTiendaVender.setSize(420,350);
        dialogTiendaVender.setLocation(100,100);
        dialogTiendaVender.setVisible(true);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnCancelarCompraTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraTiendaActionPerformed
        dialogTiendaComprar.dispose();
    }//GEN-LAST:event_btnCancelarCompraTiendaActionPerformed

    private void btnSalirTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTiendaActionPerformed
         dialogTienda.dispose();
    }//GEN-LAST:event_btnSalirTiendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         dialogTaberna.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        historialString = historialString + "\n¡Combate iniciado!";
        historial.setText(historialString);
        historialCombateString = historialCombateString + "\n¡Olonam salvaje ha aparecido!";
        historialCombate.setText(historialCombateString);
        dialogCombatir.setSize(382, 410);
        dialogCombatir.setLocation(450, 325);
        dialogCombatir.setVisible(true);
    }//GEN-LAST:event_btnCombatirActionPerformed

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        historialCombateString = historialCombateString + "\nHa intentado atacar a Olonam, pero como es muy fuerte, esquiva fácilmente tus ataques.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        historialCombateString = historialCombateString + "\nNo puedes defenderte porque no quiero.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnDefenderActionPerformed

    private void btnEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialActionPerformed
        historialCombateString = historialCombateString + "\nNo, lo siento, no tienes nada de especial.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnEspecialActionPerformed

    private void btnMochilaCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaCombateActionPerformed
        historialCombateString = historialCombateString + "\nNo tienes mochila, porque eres pobre y ni siquiera llevas ropa puesta.";
        historialCombate.setText(historialCombateString);
    }//GEN-LAST:event_btnMochilaCombateActionPerformed

    private void btnHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuirActionPerformed
        historialCombateString = "Historial de combate:";
        historialCombate.setText(historialCombateString);
        dialogCombatir.dispose();
        dialogHuir.setSize(470,640);
        dialogHuir.setLocation(100,100);
        dialogHuir.setVisible(true);
        historialString = historialString + "\nCombate finalizado.";
        historial.setText(historialString);
    }//GEN-LAST:event_btnHuirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dialogHuir.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirTActionPerformed
        dialogTiendaVender.dispose();
    }//GEN-LAST:event_btnSalirTActionPerformed

    private void btnMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaActionPerformed
         dialogMochila.setSize(725,625);//ancho , largo
       dialogMochila.setLocation(100,100);
        dialogMochila.setVisible(true);
    }//GEN-LAST:event_btnMochilaActionPerformed

    private void SalirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMActionPerformed
        dialogMochila.dispose();
    }//GEN-LAST:event_SalirMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaHijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHijas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraEp;
    private javax.swing.JProgressBar Barrahp;
    private javax.swing.JButton SalirM;
    private javax.swing.JProgressBar barraEP;
    private javax.swing.JProgressBar barraHP;
    private javax.swing.JProgressBar barraHPEn;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarAlojamiento;
    private javax.swing.JButton btnAceptarComTabern;
    private javax.swing.JButton btnAceptarCompraTienda;
    private javax.swing.JButton btnAceptarVenderVender;
    private javax.swing.JButton btnAlojamientoT;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarAlojamiento;
    private javax.swing.JButton btnCancelarComTaber;
    private javax.swing.JButton btnCancelarCompraTienda;
    private javax.swing.JButton btnCancelarVenderVender;
    private javax.swing.JButton btnCombatir;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnComprarT;
    private javax.swing.JButton btnDefender;
    private javax.swing.JButton btnEquipar;
    private javax.swing.JButton btnEspecial;
    private javax.swing.JButton btnHuir;
    private javax.swing.JButton btnMochila;
    private javax.swing.JButton btnMochilaCombate;
    private javax.swing.JButton btnSalirT;
    private javax.swing.JButton btnSalirTienda;
    private javax.swing.JButton btnSoltar;
    private javax.swing.JButton btnTaberna;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnUsar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVenderT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dialogCombatir;
    private javax.swing.JDialog dialogHuir;
    private javax.swing.JDialog dialogMochila;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tablaVenderT;
    // End of variables declaration//GEN-END:variables
}
