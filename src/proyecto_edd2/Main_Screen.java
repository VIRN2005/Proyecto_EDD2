package proyecto_edd2;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main_Screen extends javax.swing.JFrame {

    File file = null;
    String metadata;

    public Main_Screen() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setResizable(true);

        Inicio.setVisible(true);
        pb.setVisible(true);
        Menu.setVisible(false);
        start.setVisible(false);
        pn_archivos.setVisible(false);
        pn_campos.setVisible(false);

        AdmBarra h = new AdmBarra(pb);
        Thread hilo = new Thread(h);
        hilo.start();

        if (!h.isFlag()) {
            pb.setVisible(false);
            start.setVisible(true);
        } else {
            start.setVisible(false);
            pb.setVisible(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_nuevoA = new javax.swing.JDialog();
        pn_nuevoA = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tf_nuevoA = new javax.swing.JTextField();
        bt_crearA = new javax.swing.JButton();
        FondoJD = new javax.swing.JLabel();
        jd_abrirA = new javax.swing.JDialog();
        pn_abrirA = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_Filepath = new javax.swing.JTextField();
        bt_openF = new javax.swing.JButton();
        bt_buscarA = new javax.swing.JButton();
        FondoJD1 = new javax.swing.JLabel();
        jd_listarC = new javax.swing.JDialog();
        pn_listarC = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_listarC = new javax.swing.JTable();
        FondoJD2 = new javax.swing.JLabel();
        jd_modificarC = new javax.swing.JDialog();
        pn_modificarC = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_modificarC = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        FondoJD3 = new javax.swing.JLabel();
        jd_borrarC = new javax.swing.JDialog();
        pn_BorrarC = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_borrarC = new javax.swing.JTable();
        bt_deleteC = new javax.swing.JButton();
        FondoJD4 = new javax.swing.JLabel();
        jd_crearC = new javax.swing.JDialog();
        pn_crearC = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_nameA = new javax.swing.JTextField();
        ff_longitudA = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        bt_deleteC1 = new javax.swing.JButton();
        cb_dataType = new javax.swing.JComboBox<>();
        FondoJD5 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jl_archivo = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        ArchivosButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CamposButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RegistrosButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        IndicesButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EstandarizacionButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pn_archivos = new javax.swing.JPanel();
        bt_abrirA = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bt_nuevoA = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_salvarA = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bt_cerrarA = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bt_salir = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        pn_campos = new javax.swing.JPanel();
        bt_listarC = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        bt_crearC = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bt_modificarC = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        bt_borrarC = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        start = new javax.swing.JLabel();
        pb = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        pn_nuevoA.setBackground(new java.awt.Color(17, 30, 58));
        pn_nuevoA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Nuevo Archivo");
        pn_nuevoA.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 90, 700, -1));

        jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Ingrese nombre del archivo:");
        pn_nuevoA.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 700, -1));

        tf_nuevoA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_nuevoA.add(tf_nuevoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 470, 40));

        bt_crearA.setBackground(new java.awt.Color(195, 22, 28));
        bt_crearA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_crearA.setForeground(new java.awt.Color(255, 255, 255));
        bt_crearA.setText("Crear Archivo");
        bt_crearA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearAMouseClicked(evt);
            }
        });
        pn_nuevoA.add(bt_crearA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 40));

        FondoJD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_nuevoA.add(FondoJD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_nuevoALayout = new javax.swing.GroupLayout(jd_nuevoA.getContentPane());
        jd_nuevoA.getContentPane().setLayout(jd_nuevoALayout);
        jd_nuevoALayout.setHorizontalGroup(
            jd_nuevoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nuevoALayout.createSequentialGroup()
                .addComponent(pn_nuevoA, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_nuevoALayout.setVerticalGroup(
            jd_nuevoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_nuevoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_abrirA.setBackground(new java.awt.Color(17, 30, 58));
        pn_abrirA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Abrir Archivo");
        pn_abrirA.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 90, 700, -1));

        jLabel36.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Elija el archivo que desea abrir:");
        pn_abrirA.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 700, -1));

        tf_Filepath.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_abrirA.add(tf_Filepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 420, 40));

        bt_openF.setBackground(new java.awt.Color(195, 22, 28));
        bt_openF.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_openF.setForeground(new java.awt.Color(255, 255, 255));
        bt_openF.setText("Abrir Archivo");
        bt_openF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_openFMouseClicked(evt);
            }
        });
        pn_abrirA.add(bt_openF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 40));

        bt_buscarA.setText("...");
        bt_buscarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarAMouseClicked(evt);
            }
        });
        pn_abrirA.add(bt_buscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, 40));

        FondoJD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_abrirA.add(FondoJD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_abrirALayout = new javax.swing.GroupLayout(jd_abrirA.getContentPane());
        jd_abrirA.getContentPane().setLayout(jd_abrirALayout);
        jd_abrirALayout.setHorizontalGroup(
            jd_abrirALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_abrirALayout.createSequentialGroup()
                .addComponent(pn_abrirA, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_abrirALayout.setVerticalGroup(
            jd_abrirALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_abrirA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_listarC.setBackground(new java.awt.Color(17, 30, 58));
        pn_listarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Listar Campos");
        pn_listarC.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jt_listarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud"
            }
        ));
        jScrollPane1.setViewportView(jt_listarC);

        pn_listarC.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 300));

        FondoJD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_listarC.add(FondoJD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_listarCLayout = new javax.swing.GroupLayout(jd_listarC.getContentPane());
        jd_listarC.getContentPane().setLayout(jd_listarCLayout);
        jd_listarCLayout.setHorizontalGroup(
            jd_listarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarCLayout.createSequentialGroup()
                .addComponent(pn_listarC, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_listarCLayout.setVerticalGroup(
            jd_listarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_modificarC.setBackground(new java.awt.Color(17, 30, 58));
        pn_modificarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Modificar Campos");
        pn_modificarC.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jt_modificarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud"
            }
        ));
        jScrollPane2.setViewportView(jt_modificarC);

        pn_modificarC.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 250));

        jButton1.setBackground(new java.awt.Color(195, 22, 28));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modificar");
        pn_modificarC.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        FondoJD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_modificarC.add(FondoJD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_modificarCLayout = new javax.swing.GroupLayout(jd_modificarC.getContentPane());
        jd_modificarC.getContentPane().setLayout(jd_modificarCLayout);
        jd_modificarCLayout.setHorizontalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addComponent(pn_modificarC, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_modificarCLayout.setVerticalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_modificarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_BorrarC.setBackground(new java.awt.Color(17, 30, 58));
        pn_BorrarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Borrar Campos");
        pn_BorrarC.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jt_borrarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud"
            }
        ));
        jScrollPane3.setViewportView(jt_borrarC);

        pn_BorrarC.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 250));

        bt_deleteC.setBackground(new java.awt.Color(195, 22, 28));
        bt_deleteC.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_deleteC.setForeground(new java.awt.Color(255, 255, 255));
        bt_deleteC.setText("Borrar");
        pn_BorrarC.add(bt_deleteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        FondoJD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_BorrarC.add(FondoJD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_borrarCLayout = new javax.swing.GroupLayout(jd_borrarC.getContentPane());
        jd_borrarC.getContentPane().setLayout(jd_borrarCLayout);
        jd_borrarCLayout.setHorizontalGroup(
            jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarCLayout.createSequentialGroup()
                .addComponent(pn_BorrarC, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_borrarCLayout.setVerticalGroup(
            jd_borrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_BorrarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_crearC.setBackground(new java.awt.Color(17, 30, 58));
        pn_crearC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Crear Campos");
        pn_crearC.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jLabel41.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Longitud:");
        pn_crearC.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        tf_nameA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_crearC.add(tf_nameA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 390, 30));

        ff_longitudA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ff_longitudA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_crearC.add(ff_longitudA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 390, 30));

        jLabel42.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Nombre del atributo:");
        pn_crearC.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel43.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Tipo de dato:");
        pn_crearC.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        bt_deleteC1.setBackground(new java.awt.Color(195, 22, 28));
        bt_deleteC1.setFont(new java.awt.Font("Lane - Narrow", 1, 18)); // NOI18N
        bt_deleteC1.setForeground(new java.awt.Color(255, 255, 255));
        bt_deleteC1.setText("Crear");
        pn_crearC.add(bt_deleteC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        cb_dataType.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        cb_dataType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "Int", "Char" }));
        pn_crearC.add(cb_dataType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 390, 30));

        FondoJD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_crearC.add(FondoJD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_crearCLayout = new javax.swing.GroupLayout(jd_crearC.getContentPane());
        jd_crearC.getContentPane().setLayout(jd_crearCLayout);
        jd_crearCLayout.setHorizontalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearCLayout.createSequentialGroup()
                .addComponent(pn_crearC, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_crearCLayout.setVerticalGroup(
            jd_crearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_crearC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 30, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_archivo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_archivo.setForeground(new java.awt.Color(255, 255, 255));
        jl_archivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_archivo.setText("Archivo en uso: Ninguno");
        jPanel1.add(jl_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        Menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 260, 50));

        MenuBar.setBackground(new java.awt.Color(17, 30, 58));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArchivosButton.setBackground(new java.awt.Color(17, 30, 58));
        ArchivosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchivosButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ArchivosButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ArchivosButtonMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(17, 30, 58));
        jLabel1.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Archivos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout ArchivosButtonLayout = new javax.swing.GroupLayout(ArchivosButton);
        ArchivosButton.setLayout(ArchivosButtonLayout);
        ArchivosButtonLayout.setHorizontalGroup(
            ArchivosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        ArchivosButtonLayout.setVerticalGroup(
            ArchivosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivosButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MenuBar.add(ArchivosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, -1));

        CamposButton.setBackground(new java.awt.Color(17, 30, 58));
        CamposButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CamposButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CamposButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CamposButtonMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Campos");

        javax.swing.GroupLayout CamposButtonLayout = new javax.swing.GroupLayout(CamposButton);
        CamposButton.setLayout(CamposButtonLayout);
        CamposButtonLayout.setHorizontalGroup(
            CamposButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        CamposButtonLayout.setVerticalGroup(
            CamposButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamposButtonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        MenuBar.add(CamposButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 300, -1));

        RegistrosButton.setBackground(new java.awt.Color(17, 30, 58));
        RegistrosButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrosButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrosButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registros");

        javax.swing.GroupLayout RegistrosButtonLayout = new javax.swing.GroupLayout(RegistrosButton);
        RegistrosButton.setLayout(RegistrosButtonLayout);
        RegistrosButtonLayout.setHorizontalGroup(
            RegistrosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        RegistrosButtonLayout.setVerticalGroup(
            RegistrosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrosButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MenuBar.add(RegistrosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, -1));

        IndicesButton.setBackground(new java.awt.Color(17, 30, 58));
        IndicesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IndicesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IndicesButtonMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Índices");

        javax.swing.GroupLayout IndicesButtonLayout = new javax.swing.GroupLayout(IndicesButton);
        IndicesButton.setLayout(IndicesButtonLayout);
        IndicesButtonLayout.setHorizontalGroup(
            IndicesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        IndicesButtonLayout.setVerticalGroup(
            IndicesButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndicesButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MenuBar.add(IndicesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 300, -1));

        EstandarizacionButton.setBackground(new java.awt.Color(17, 30, 58));
        EstandarizacionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EstandarizacionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EstandarizacionButtonMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estandarización");

        javax.swing.GroupLayout EstandarizacionButtonLayout = new javax.swing.GroupLayout(EstandarizacionButton);
        EstandarizacionButton.setLayout(EstandarizacionButtonLayout);
        EstandarizacionButtonLayout.setHorizontalGroup(
            EstandarizacionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        EstandarizacionButtonLayout.setVerticalGroup(
            EstandarizacionButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstandarizacionButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        MenuBar.add(EstandarizacionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, -1));

        Menu.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 770));

        pn_archivos.setBackground(new java.awt.Color(51, 51, 51));
        pn_archivos.setForeground(new java.awt.Color(255, 255, 255));
        pn_archivos.setPreferredSize(new java.awt.Dimension(1366, 768));
        pn_archivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_abrirA.setBackground(new java.awt.Color(17, 30, 58));
        bt_abrirA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_abrirAMouseClicked(evt);
            }
        });
        bt_abrirA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir-carpeta-con-documento.png"))); // NOI18N
        bt_abrirA.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 44, -1, 70));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_abrirA.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Abrir Archivo");
        bt_abrirA.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 220, -1));

        pn_archivos.add(bt_abrirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 220, 210));

        bt_nuevoA.setBackground(new java.awt.Color(17, 30, 58));
        bt_nuevoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_nuevoAMouseClicked(evt);
            }
        });
        bt_nuevoA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-nuevo.png"))); // NOI18N
        bt_nuevoA.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 80, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_nuevoA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nuevo Archivo");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_nuevoA.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 160, 220, -1));

        pn_archivos.add(bt_nuevoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 220, 210));

        bt_salvarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_salvarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarAMouseClicked(evt);
            }
        });
        bt_salvarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        bt_salvarA.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_salvarA.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Salvar Archivo");
        bt_salvarA.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 220, -1));

        pn_archivos.add(bt_salvarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 220, 210));

        bt_cerrarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_cerrarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarAMouseClicked(evt);
            }
        });
        bt_cerrarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carpeta.png"))); // NOI18N
        bt_cerrarA.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_cerrarA.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel17.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cerrar Archivo");
        bt_cerrarA.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        pn_archivos.add(bt_cerrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 220, 210));

        bt_salir.setBackground(new java.awt.Color(17, 30, 58));
        bt_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salirMouseClicked(evt);
            }
        });
        bt_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        bt_salir.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 44, -1, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_salir.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Salir");
        bt_salir.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 210, -1));

        pn_archivos.add(bt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 220, 210));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_archivos.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(pn_archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -5, 1370, 780));

        pn_campos.setBackground(new java.awt.Color(51, 51, 51));
        pn_campos.setForeground(new java.awt.Color(255, 255, 255));
        pn_campos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_listarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_listarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarCMouseClicked(evt);
            }
        });
        bt_listarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles.png"))); // NOI18N
        bt_listarC.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 34, 70, 80));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Orange.png"))); // NOI18N
        bt_listarC.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel23.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Listar Campos");
        bt_listarC.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 220, -1));

        pn_campos.add(bt_listarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 220, 210));

        bt_crearC.setBackground(new java.awt.Color(17, 30, 58));
        bt_crearC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearCMouseClicked(evt);
            }
        });
        bt_crearC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina.png"))); // NOI18N
        bt_crearC.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 80));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Orange.png"))); // NOI18N
        bt_crearC.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Crear Campos");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_crearC.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 160, 220, -1));

        pn_campos.add(bt_crearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 220, 210));

        bt_modificarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_modificarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarCMouseClicked(evt);
            }
        });
        bt_modificarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rebautizar.png"))); // NOI18N
        bt_modificarC.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 44, 90, 70));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Orange.png"))); // NOI18N
        bt_modificarC.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel32.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Modificar Campos");
        bt_modificarC.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        pn_campos.add(bt_modificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 220, 210));

        bt_borrarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_borrarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_borrarCMouseClicked(evt);
            }
        });
        bt_borrarC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        bt_borrarC.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Orange.png"))); // NOI18N
        bt_borrarC.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel35.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Borrar Campos");
        bt_borrarC.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 210, -1));

        pn_campos.add(bt_borrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 390, 220, 210));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_campos.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(pn_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -5, -1, 770));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Menu.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botón.png"))); // NOI18N
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        Inicio.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1370, 120));

        pb.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 640, 40));

        Titulo.setFont(new java.awt.Font("Coolvetica Rg", 0, 80)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("STANDARD FILE MANAGER");
        Inicio.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1360, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Inicio.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        Inicio.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_startMouseClicked

    private void ArchivosButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivosButtonMouseEntered
        ArchivosButton.setBackground(new Color(255, 87, 87));
    }//GEN-LAST:event_ArchivosButtonMouseEntered

    private void ArchivosButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivosButtonMouseExited
        ArchivosButton.setBackground(new Color(17, 30, 58));
    }//GEN-LAST:event_ArchivosButtonMouseExited

    private void CamposButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamposButtonMouseEntered
        CamposButton.setBackground(new Color(251, 147, 67));
    }//GEN-LAST:event_CamposButtonMouseEntered

    private void CamposButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamposButtonMouseExited
        CamposButton.setBackground(new Color(17, 30, 58));
    }//GEN-LAST:event_CamposButtonMouseExited

    private void RegistrosButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosButtonMouseEntered
        RegistrosButton.setBackground(new Color(27, 199, 78));
    }//GEN-LAST:event_RegistrosButtonMouseEntered

    private void RegistrosButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosButtonMouseExited
        RegistrosButton.setBackground(new Color(17, 30, 58));
    }//GEN-LAST:event_RegistrosButtonMouseExited

    private void IndicesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndicesButtonMouseEntered
        IndicesButton.setBackground(new Color(0, 151, 178));
    }//GEN-LAST:event_IndicesButtonMouseEntered

    private void IndicesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndicesButtonMouseExited
        IndicesButton.setBackground(new Color(17, 30, 58));
    }//GEN-LAST:event_IndicesButtonMouseExited

    private void EstandarizacionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstandarizacionButtonMouseEntered
        EstandarizacionButton.setBackground(new Color(140, 82, 255));
    }//GEN-LAST:event_EstandarizacionButtonMouseEntered

    private void EstandarizacionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstandarizacionButtonMouseExited
        EstandarizacionButton.setBackground(new Color(17, 30, 58));
    }//GEN-LAST:event_EstandarizacionButtonMouseExited

    private void ArchivosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchivosButtonMouseClicked
        pn_campos.setVisible(false);

        if (pn_archivos.isVisible()) {
            pn_archivos.setVisible(false);
        } else {
            pn_archivos.setVisible(true);
        }
    }//GEN-LAST:event_ArchivosButtonMouseClicked

    private void CamposButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamposButtonMouseClicked
        pn_archivos.setVisible(false);

        if (pn_campos.isVisible()) {
            pn_campos.setVisible(false);
        } else {
            pn_campos.setVisible(true);
        }
    }//GEN-LAST:event_CamposButtonMouseClicked

    private void bt_nuevoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nuevoAMouseClicked
        AbrirJD(jd_nuevoA);
    }//GEN-LAST:event_bt_nuevoAMouseClicked

    private void bt_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_salirMouseClicked

    private void bt_abrirAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_abrirAMouseClicked
        AbrirJD(jd_abrirA);
    }//GEN-LAST:event_bt_abrirAMouseClicked

    private void bt_listarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarCMouseClicked
        AbrirJD(jd_listarC);
    }//GEN-LAST:event_bt_listarCMouseClicked

    private void bt_modificarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarCMouseClicked
        AbrirJD(jd_modificarC);
    }//GEN-LAST:event_bt_modificarCMouseClicked

    private void bt_borrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_borrarCMouseClicked
        AbrirJD(jd_borrarC);
    }//GEN-LAST:event_bt_borrarCMouseClicked

    private void bt_crearCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearCMouseClicked
        AbrirJD(jd_crearC);
    }//GEN-LAST:event_bt_crearCMouseClicked

    private void bt_buscarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarAMouseClicked
        try {
            JFileChooser jfc = new JFileChooser();
            java.io.File archivo;
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                file = (File) archivo;

                tf_Filepath.setText(file.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Archivo no soportado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_buscarAMouseClicked

    private void bt_openFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_openFMouseClicked
        jd_abrirA.setVisible(false);
        JOptionPane.showMessageDialog(this, "Archivo abierto con éxito");

        ActualizarLabel();
    }//GEN-LAST:event_bt_openFMouseClicked

    private void bt_crearAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearAMouseClicked
        file = new File("./" + tf_nuevoA.getText());

        file.createFile();

        jd_nuevoA.setVisible(false);
        JOptionPane.showMessageDialog(this, "Archivo creado con éxito");
        ActualizarLabel();
    }//GEN-LAST:event_bt_crearAMouseClicked

    private void bt_salvarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarAMouseClicked
        if (file != null) {
            file.saveFile();
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!");
        }
    }//GEN-LAST:event_bt_salvarAMouseClicked

    private void bt_cerrarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarAMouseClicked
        int opcion = JOptionPane.showConfirmDialog(null, "Si cierras el archivo no se guardarán los cambios, ¿Estás seguro que quiere cerrar el archivo?", "Cerrar Archivo", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            if (file != null) {
                file = null;
                metadata = "";
                JOptionPane.showMessageDialog(this, "¡Se cerró el archivo!");
                ActualizarLabel();
            } else {
                JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!");
            }
        }
    }//GEN-LAST:event_bt_cerrarAMouseClicked

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
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Screen().setVisible(true);
            }
        });
    }

    public static void AbrirJD(JDialog JD) {
        JD.setModal(true);
        JD.pack();
        JD.setLocationRelativeTo(null);
        JD.setResizable(false);
        JD.setVisible(true);
    }

    public void ActualizarLabel() {
        if (file != null) {
            String text = "Archivo en uso: ";
            jl_archivo.setText(text + file.getName());
        } else {
            jl_archivo.setText("Archivo en uso: Ninguno");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArchivosButton;
    private javax.swing.JPanel CamposButton;
    private javax.swing.JPanel EstandarizacionButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel FondoJD;
    private javax.swing.JLabel FondoJD1;
    private javax.swing.JLabel FondoJD2;
    private javax.swing.JLabel FondoJD3;
    private javax.swing.JLabel FondoJD4;
    private javax.swing.JLabel FondoJD5;
    private javax.swing.JPanel IndicesButton;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel RegistrosButton;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bt_abrirA;
    private javax.swing.JPanel bt_borrarC;
    private javax.swing.JButton bt_buscarA;
    private javax.swing.JPanel bt_cerrarA;
    private javax.swing.JButton bt_crearA;
    private javax.swing.JPanel bt_crearC;
    private javax.swing.JButton bt_deleteC;
    private javax.swing.JButton bt_deleteC1;
    private javax.swing.JPanel bt_listarC;
    private javax.swing.JPanel bt_modificarC;
    private javax.swing.JPanel bt_nuevoA;
    private javax.swing.JButton bt_openF;
    private javax.swing.JPanel bt_salir;
    private javax.swing.JPanel bt_salvarA;
    private javax.swing.JComboBox<String> cb_dataType;
    private javax.swing.JFormattedTextField ff_longitudA;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_abrirA;
    private javax.swing.JDialog jd_borrarC;
    private javax.swing.JDialog jd_crearC;
    private javax.swing.JDialog jd_listarC;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JDialog jd_nuevoA;
    private javax.swing.JLabel jl_archivo;
    private javax.swing.JTable jt_borrarC;
    private javax.swing.JTable jt_listarC;
    private javax.swing.JTable jt_modificarC;
    private javax.swing.JProgressBar pb;
    private javax.swing.JPanel pn_BorrarC;
    private javax.swing.JPanel pn_abrirA;
    private javax.swing.JPanel pn_archivos;
    private javax.swing.JPanel pn_campos;
    private javax.swing.JPanel pn_crearC;
    private javax.swing.JPanel pn_listarC;
    private javax.swing.JPanel pn_modificarC;
    private javax.swing.JPanel pn_nuevoA;
    private javax.swing.JLabel start;
    private javax.swing.JTextField tf_Filepath;
    private javax.swing.JTextField tf_nameA;
    private javax.swing.JTextField tf_nuevoA;
    // End of variables declaration//GEN-END:variables
}
