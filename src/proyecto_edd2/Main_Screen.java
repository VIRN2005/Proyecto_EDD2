package proyecto_edd2;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class Main_Screen extends javax.swing.JFrame {

    File file = null;
//    File PersonFile, CityFile;
    Registro temp_record = new Registro();
    String metadata = "";
    java.io.File archivo = null;
    java.io.File folder = null;
    int Panel = 0, pos_ModCampo, pos_campo = 0;
    //BTree tree = new BTree(3);
    BufferedWriter bw;
    FileWriter fw;
    Admin_BTree ab;
    RandomAccessFile rf;
    Node search = new Node();

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
        pn_registros.setVisible(false);
        pn_indices.setVisible(false);
        pn_estandarizacion.setVisible(false);

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
        jLabel84 = new javax.swing.JLabel();
        cb_archivosdeprueba = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
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
        bt_modifyC = new javax.swing.JButton();
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
        TitleCampo = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tf_nameA = new javax.swing.JTextField();
        ff_longitudA = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        bt_createC = new javax.swing.JButton();
        cb_dataType = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        FondoJD5 = new javax.swing.JLabel();
        bg_key = new javax.swing.ButtonGroup();
        jd_enlazar = new javax.swing.JDialog();
        Search_File1 = new javax.swing.JButton();
        Search_File2 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Save_File = new javax.swing.JButton();
        Lista2 = new javax.swing.JScrollPane();
        jl_Enlazar2 = new javax.swing.JList<>();
        Lista1 = new javax.swing.JScrollPane();
        jl_Enlazar1 = new javax.swing.JList<>();
        Restart = new javax.swing.JButton();
        FlechaEnlazado = new javax.swing.JButton();
        Lista3 = new javax.swing.JScrollPane();
        jl_Enlazados = new javax.swing.JList<>();
        jLabel59 = new javax.swing.JLabel();
        Fotito = new javax.swing.JLabel();
        jd_crearR = new javax.swing.JDialog();
        bt_createR = new javax.swing.JButton();
        jl_campos = new javax.swing.JLabel();
        tf_campo = new javax.swing.JTextField();
        jl_crear = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_campos = new javax.swing.JTable();
        jLabel80 = new javax.swing.JLabel();
        Fotito1 = new javax.swing.JLabel();
        jd_listarR = new javax.swing.JDialog();
        pn_listarC1 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_listarR = new javax.swing.JTable();
        FondoJD6 = new javax.swing.JLabel();
        jd_buscarR = new javax.swing.JDialog();
        bt_searchR = new javax.swing.JButton();
        jl_campos1 = new javax.swing.JLabel();
        tf_keyB = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jl_campos2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jt_buscarR = new javax.swing.JTable();
        jLabel82 = new javax.swing.JLabel();
        cb_llaves = new javax.swing.JComboBox<>();
        Fotito2 = new javax.swing.JLabel();
        jd_borrarR = new javax.swing.JDialog();
        pn_listarC2 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        bt_listarBR = new javax.swing.JButton();
        jl_campos3 = new javax.swing.JLabel();
        tf_campo2 = new javax.swing.JTextField();
        jl_campos4 = new javax.swing.JLabel();
        bt_removeR = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jt_borrarR = new javax.swing.JTable();
        jLabel87 = new javax.swing.JLabel();
        cb_llaves2 = new javax.swing.JComboBox<>();
        FondoJD7 = new javax.swing.JLabel();
        jd_modificarR = new javax.swing.JDialog();
        pn_listarC3 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        bt_listarRM = new javax.swing.JButton();
        jl_campos5 = new javax.swing.JLabel();
        tf_campo3 = new javax.swing.JTextField();
        jl_campos6 = new javax.swing.JLabel();
        bt_modifyR = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jt_modificarR = new javax.swing.JTable();
        jLabel88 = new javax.swing.JLabel();
        cb_llavesM = new javax.swing.JComboBox<>();
        FondoJD8 = new javax.swing.JLabel();
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
        pn_registros = new javax.swing.JPanel();
        bt_modificarR = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        bt_introducirR = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        bt_buscarR = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        bt_borrarR = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        bt_listarR = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Fondo4 = new javax.swing.JLabel();
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
        bt_cruzarA = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        bt_salir = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        pn_estandarizacion = new javax.swing.JPanel();
        bt_exportarE = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        bt_exportarXML = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Fondo6 = new javax.swing.JLabel();
        pn_indices = new javax.swing.JPanel();
        bt_crearI = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        bt_reIndexarA = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        Fondo5 = new javax.swing.JLabel();
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
        Fondo2 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
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
        bt_crearA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        pn_abrirA.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jLabel36.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Elija un archivo externo:");
        pn_abrirA.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 700, -1));

        tf_Filepath.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_Filepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_FilepathActionPerformed(evt);
            }
        });
        pn_abrirA.add(tf_Filepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 460, 40));

        bt_openF.setBackground(new java.awt.Color(195, 22, 28));
        bt_openF.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_openF.setForeground(new java.awt.Color(255, 255, 255));
        bt_openF.setText("Abrir Archivo");
        bt_openF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_openF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_openFMouseClicked(evt);
            }
        });
        pn_abrirA.add(bt_openF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, 40));

        bt_buscarA.setText("...");
        bt_buscarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarAMouseClicked(evt);
            }
        });
        pn_abrirA.add(bt_buscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 40));

        jLabel84.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Elija un archivo de prueba:");
        pn_abrirA.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 700, -1));

        cb_archivosdeprueba.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        cb_archivosdeprueba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "PersonFile.txt", "CityFile.txt" }));
        pn_abrirA.add(cb_archivosdeprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 240, 40));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        pn_abrirA.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 300, 10));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        pn_abrirA.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 300, 10));

        jLabel85.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("O");
        pn_abrirA.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 70, -1));

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

            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud", "Key"
            }
        ));
        jScrollPane1.setViewportView(jt_listarC);
        if (jt_listarC.getColumnModel().getColumnCount() > 0) {
            jt_listarC.getColumnModel().getColumn(0).setHeaderValue("Nombre de campo");
            jt_listarC.getColumnModel().getColumn(1).setHeaderValue("Tipo de Dato");
            jt_listarC.getColumnModel().getColumn(2).setHeaderValue("Longitud");
            jt_listarC.getColumnModel().getColumn(3).setHeaderValue("Key");
        }

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

            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud", "Key"
            }
        ));
        jScrollPane2.setViewportView(jt_modificarC);

        pn_modificarC.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 250));

        bt_modifyC.setBackground(new java.awt.Color(195, 22, 28));
        bt_modifyC.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_modifyC.setForeground(new java.awt.Color(255, 255, 255));
        bt_modifyC.setText("Modificar");
        bt_modifyC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_modifyC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifyCMouseClicked(evt);
            }
        });
        pn_modificarC.add(bt_modifyC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

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

            },
            new String [] {
                "Nombre de campo", "Tipo de Dato", "Longitud", "Key"
            }
        ));
        jScrollPane3.setViewportView(jt_borrarC);

        pn_BorrarC.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 250));

        bt_deleteC.setBackground(new java.awt.Color(195, 22, 28));
        bt_deleteC.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        bt_deleteC.setForeground(new java.awt.Color(255, 255, 255));
        bt_deleteC.setText("Borrar");
        bt_deleteC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_deleteC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_deleteCMouseClicked(evt);
            }
        });
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

        TitleCampo.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        TitleCampo.setForeground(new java.awt.Color(255, 255, 255));
        TitleCampo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleCampo.setText("Crear Campos");
        pn_crearC.add(TitleCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jLabel41.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Marcar como llave: ");
        pn_crearC.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        tf_nameA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_nameA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pn_crearC.add(tf_nameA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 390, 30));

        ff_longitudA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ff_longitudA.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_crearC.add(ff_longitudA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 390, 30));

        jLabel42.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Nombre del atributo:");
        pn_crearC.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel43.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Tipo de dato:");
        pn_crearC.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        bt_createC.setBackground(new java.awt.Color(195, 22, 28));
        bt_createC.setFont(new java.awt.Font("Lane - Narrow", 1, 18)); // NOI18N
        bt_createC.setForeground(new java.awt.Color(255, 255, 255));
        bt_createC.setText("Crear");
        bt_createC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_createC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_createCMouseClicked(evt);
            }
        });
        pn_crearC.add(bt_createC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        cb_dataType.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        cb_dataType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "char", "float" }));
        pn_crearC.add(cb_dataType, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 390, 30));

        jLabel44.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Longitud:");
        pn_crearC.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        bg_key.add(si);
        si.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        si.setForeground(new java.awt.Color(255, 255, 255));
        si.setText("Sí");
        si.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_crearC.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 40, -1));

        bg_key.add(no);
        no.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("No");
        no.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_crearC.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

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

        jd_enlazar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_File1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        Search_File1.setText("Search File 1");
        Search_File1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_File1ActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(Search_File1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 120, 30));

        Search_File2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        Search_File2.setText("Search File 2");
        Search_File2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_File2MouseClicked(evt);
            }
        });
        Search_File2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_File2ActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(Search_File2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 30));

        Salir.setBackground(new java.awt.Color(195, 22, 28));
        Salir.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 17)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 270, 30));

        Save_File.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        Save_File.setText("Save File");
        Save_File.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_FileMouseClicked(evt);
            }
        });
        Save_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_FileActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(Save_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 270, 30));

        jl_Enlazar2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        Lista2.setViewportView(jl_Enlazar2);

        jd_enlazar.getContentPane().add(Lista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 120, 220));

        jl_Enlazar1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jl_Enlazar1.setModel(new DefaultListModel());
        Lista1.setViewportView(jl_Enlazar1);

        jd_enlazar.getContentPane().add(Lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 120, 220));

        Restart.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        Restart.setText("RESTART");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(Restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 260, 30));

        FlechaEnlazado.setText("➜");
        FlechaEnlazado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlechaEnlazadoMouseClicked(evt);
            }
        });
        FlechaEnlazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlechaEnlazadoActionPerformed(evt);
            }
        });
        jd_enlazar.getContentPane().add(FlechaEnlazado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 70, 30));

        jl_Enlazados.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        Lista3.setViewportView(jl_Enlazados);

        jd_enlazar.getContentPane().add(Lista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 270, 220));

        jLabel59.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Cruzar Archivos");
        jd_enlazar.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        Fotito.setForeground(new java.awt.Color(0, 0, 0));
        Fotito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        jd_enlazar.getContentPane().add(Fotito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jd_crearR.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_createR.setBackground(new java.awt.Color(195, 22, 28));
        bt_createR.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_createR.setForeground(new java.awt.Color(255, 255, 255));
        bt_createR.setText("Siguiente");
        bt_createR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_createR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_createRMouseClicked(evt);
            }
        });
        jd_crearR.getContentPane().add(bt_createR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, -1));

        jl_campos.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos.setText("Ingrese campo:");
        jd_crearR.getContentPane().add(jl_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 370, -1));

        tf_campo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_campo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jd_crearR.getContentPane().add(tf_campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 370, 30));

        jl_crear.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jl_crear.setForeground(new java.awt.Color(255, 255, 255));
        jl_crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_crear.setText("Introducir Registro");
        jd_crearR.getContentPane().add(jl_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 700, -1));

        jt_campos.setBackground(new java.awt.Color(243, 233, 220));
        jt_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Campo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_campos.setGridColor(new java.awt.Color(243, 233, 220));
        jScrollPane5.setViewportView(jt_campos);

        jd_crearR.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 190, 210));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clipboard.png"))); // NOI18N
        jd_crearR.getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 310));

        Fotito1.setForeground(new java.awt.Color(0, 0, 0));
        Fotito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        jd_crearR.getContentPane().add(Fotito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pn_listarC1.setBackground(new java.awt.Color(17, 30, 58));
        pn_listarC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Listar Registros");
        pn_listarC1.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, -1));

        jt_listarR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jt_listarR);

        pn_listarC1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 640, 300));

        FondoJD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_listarC1.add(FondoJD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_listarRLayout = new javax.swing.GroupLayout(jd_listarR.getContentPane());
        jd_listarR.getContentPane().setLayout(jd_listarRLayout);
        jd_listarRLayout.setHorizontalGroup(
            jd_listarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarRLayout.createSequentialGroup()
                .addComponent(pn_listarC1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_listarRLayout.setVerticalGroup(
            jd_listarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listarC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_buscarR.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_searchR.setBackground(new java.awt.Color(195, 22, 28));
        bt_searchR.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_searchR.setForeground(new java.awt.Color(255, 255, 255));
        bt_searchR.setText("Buscar");
        bt_searchR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_searchR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_searchRMouseClicked(evt);
            }
        });
        jd_buscarR.getContentPane().add(bt_searchR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jl_campos1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos1.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos1.setText("Escoja la llave con la que desea buscar:");
        jd_buscarR.getContentPane().add(jl_campos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 370, -1));

        tf_keyB.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_keyB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jd_buscarR.getContentPane().add(tf_keyB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 370, 30));

        jLabel81.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Buscar Registro");
        jd_buscarR.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 700, -1));

        jl_campos2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos2.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos2.setText("Ingrese la llave:");
        jd_buscarR.getContentPane().add(jl_campos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 370, -1));

        jt_buscarR.setBackground(new java.awt.Color(243, 233, 220));
        jt_buscarR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Campo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_buscarR.setGridColor(new java.awt.Color(243, 233, 220));
        jScrollPane6.setViewportView(jt_buscarR);

        jd_buscarR.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 190, 210));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clipboard.png"))); // NOI18N
        jd_buscarR.getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 310));

        cb_llaves.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jd_buscarR.getContentPane().add(cb_llaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 370, 30));

        Fotito2.setForeground(new java.awt.Color(0, 0, 0));
        Fotito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        jd_buscarR.getContentPane().add(Fotito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pn_listarC2.setBackground(new java.awt.Color(17, 30, 58));
        pn_listarC2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Borrar Registros");
        pn_listarC2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 700, -1));

        bt_listarBR.setBackground(new java.awt.Color(195, 22, 28));
        bt_listarBR.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_listarBR.setForeground(new java.awt.Color(255, 255, 255));
        bt_listarBR.setText("Listar");
        bt_listarBR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_listarBR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarBRMouseClicked(evt);
            }
        });
        pn_listarC2.add(bt_listarBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jl_campos3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos3.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos3.setText("Escoja la llave del registro a eliminar:");
        pn_listarC2.add(jl_campos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 360, -1));

        tf_campo2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_campo2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pn_listarC2.add(tf_campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 360, 30));

        jl_campos4.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos4.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos4.setText("Ingrese la llave:");
        pn_listarC2.add(jl_campos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 360, -1));

        bt_removeR.setBackground(new java.awt.Color(195, 22, 28));
        bt_removeR.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_removeR.setForeground(new java.awt.Color(255, 255, 255));
        bt_removeR.setText("Borrar");
        bt_removeR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_removeR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removeRMouseClicked(evt);
            }
        });
        pn_listarC2.add(bt_removeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jt_borrarR.setBackground(new java.awt.Color(243, 233, 220));
        jt_borrarR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Campo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_borrarR.setGridColor(new java.awt.Color(243, 233, 220));
        jScrollPane8.setViewportView(jt_borrarR);

        pn_listarC2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 190, 210));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clipboard.png"))); // NOI18N
        pn_listarC2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 310));

        cb_llaves2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_listarC2.add(cb_llaves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 360, 30));

        FondoJD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_listarC2.add(FondoJD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_borrarRLayout = new javax.swing.GroupLayout(jd_borrarR.getContentPane());
        jd_borrarR.getContentPane().setLayout(jd_borrarRLayout);
        jd_borrarRLayout.setHorizontalGroup(
            jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_borrarRLayout.createSequentialGroup()
                .addComponent(pn_listarC2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_borrarRLayout.setVerticalGroup(
            jd_borrarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listarC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_listarC3.setBackground(new java.awt.Color(17, 30, 58));
        pn_listarC3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Modificar Registros");
        pn_listarC3.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 700, -1));

        bt_listarRM.setBackground(new java.awt.Color(195, 22, 28));
        bt_listarRM.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_listarRM.setForeground(new java.awt.Color(255, 255, 255));
        bt_listarRM.setText("Listar");
        bt_listarRM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_listarRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarRMMouseClicked(evt);
            }
        });
        pn_listarC3.add(bt_listarRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jl_campos5.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos5.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos5.setText("Escoja la llave del registro a modificar:");
        pn_listarC3.add(jl_campos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 360, -1));

        tf_campo3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        tf_campo3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pn_listarC3.add(tf_campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 360, 30));

        jl_campos6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_campos6.setForeground(new java.awt.Color(255, 255, 255));
        jl_campos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_campos6.setText("Ingrese la llave:");
        pn_listarC3.add(jl_campos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 360, -1));

        bt_modifyR.setBackground(new java.awt.Color(195, 22, 28));
        bt_modifyR.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        bt_modifyR.setForeground(new java.awt.Color(255, 255, 255));
        bt_modifyR.setText("Modificar");
        bt_modifyR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_modifyR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modifyRMouseClicked(evt);
            }
        });
        pn_listarC3.add(bt_modifyR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jt_modificarR.setBackground(new java.awt.Color(243, 233, 220));
        jt_modificarR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Campo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_modificarR.setGridColor(new java.awt.Color(243, 233, 220));
        jScrollPane9.setViewportView(jt_modificarR);

        pn_listarC3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 190, 210));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clipboard.png"))); // NOI18N
        pn_listarC3.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 240, 310));

        cb_llavesM.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        pn_listarC3.add(cb_llavesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 360, 30));

        FondoJD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoJD.png"))); // NOI18N
        pn_listarC3.add(FondoJD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jd_modificarRLayout = new javax.swing.GroupLayout(jd_modificarR.getContentPane());
        jd_modificarR.getContentPane().setLayout(jd_modificarRLayout);
        jd_modificarRLayout.setHorizontalGroup(
            jd_modificarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarRLayout.createSequentialGroup()
                .addComponent(pn_listarC3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_modificarRLayout.setVerticalGroup(
            jd_modificarRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_listarC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setMinimumSize(new java.awt.Dimension(1280, 800));
        Menu.setPreferredSize(new java.awt.Dimension(1280, 800));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 30, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_archivo.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 18)); // NOI18N
        jl_archivo.setForeground(new java.awt.Color(255, 255, 255));
        jl_archivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_archivo.setText("Archivo en uso: Ninguno");
        jPanel1.add(jl_archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        Menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 280, -1));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosButtonMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IndicesButtonMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstandarizacionButtonMouseClicked(evt);
            }
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

        Menu.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        pn_registros.setBackground(new java.awt.Color(51, 51, 51));
        pn_registros.setForeground(new java.awt.Color(255, 255, 255));
        pn_registros.setPreferredSize(new java.awt.Dimension(1366, 768));
        pn_registros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_modificarR.setBackground(new java.awt.Color(17, 30, 58));
        bt_modificarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_modificarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarRMouseClicked(evt);
            }
        });
        bt_modificarR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        bt_modificarR.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 44, 70, 70));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green.png"))); // NOI18N
        bt_modificarR.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel46.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Modificar Registros");
        bt_modificarR.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 220, -1));

        pn_registros.add(bt_modificarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 220, 210));

        bt_introducirR.setBackground(new java.awt.Color(17, 30, 58));
        bt_introducirR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_introducirR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_introducirRMouseClicked(evt);
            }
        });
        bt_introducirR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        bt_introducirR.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 80, 70));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green.png"))); // NOI18N
        bt_introducirR.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel49.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Introducir Registros");
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_introducirR.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 160, 220, -1));

        pn_registros.add(bt_introducirR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 230, 210));

        bt_buscarR.setBackground(new java.awt.Color(17, 30, 58));
        bt_buscarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_buscarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_buscarRMouseClicked(evt);
            }
        });
        bt_buscarR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        bt_buscarR.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green.png"))); // NOI18N
        bt_buscarR.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel52.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Buscar Registros");
        bt_buscarR.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 220, -1));

        pn_registros.add(bt_buscarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 220, 210));

        bt_borrarR.setBackground(new java.awt.Color(17, 30, 58));
        bt_borrarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_borrarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_borrarRMouseClicked(evt);
            }
        });
        bt_borrarR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar_1.png"))); // NOI18N
        bt_borrarR.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green.png"))); // NOI18N
        bt_borrarR.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel55.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Borrar Registros");
        bt_borrarR.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        pn_registros.add(bt_borrarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 220, 210));

        bt_listarR.setBackground(new java.awt.Color(17, 30, 58));
        bt_listarR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_listarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarRMouseClicked(evt);
            }
        });
        bt_listarR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles.png"))); // NOI18N
        bt_listarR.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 44, 70, 70));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green.png"))); // NOI18N
        bt_listarR.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel58.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Listar Registros");
        bt_listarR.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 210, -1));

        pn_registros.add(bt_listarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 220, 210));

        Fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_registros.add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(pn_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 780));

        pn_archivos.setBackground(new java.awt.Color(51, 51, 51));
        pn_archivos.setForeground(new java.awt.Color(255, 255, 255));
        pn_archivos.setPreferredSize(new java.awt.Dimension(1366, 768));
        pn_archivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_abrirA.setBackground(new java.awt.Color(17, 30, 58));
        bt_abrirA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_archivos.add(bt_abrirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 220, 210));

        bt_nuevoA.setBackground(new java.awt.Color(17, 30, 58));
        bt_nuevoA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_archivos.add(bt_nuevoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 220, 210));

        bt_salvarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_salvarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_archivos.add(bt_salvarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 220, 210));

        bt_cerrarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_cerrarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_archivos.add(bt_cerrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 220, 210));

        bt_cruzarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_cruzarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_cruzarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cruzarAMouseClicked(evt);
            }
        });
        bt_cruzarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enlazar.png"))); // NOI18N
        bt_cruzarA.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 44, -1, 70));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Red.png"))); // NOI18N
        bt_cruzarA.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel77.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Cruzar Archivos");
        bt_cruzarA.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 210, -1));

        pn_archivos.add(bt_cruzarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 220, 210));

        bt_salir.setBackground(new java.awt.Color(17, 30, 58));
        bt_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_archivos.add(bt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, 220, 210));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_archivos.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Menu.add(pn_archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 780));

        pn_estandarizacion.setBackground(new java.awt.Color(51, 51, 51));
        pn_estandarizacion.setForeground(new java.awt.Color(255, 255, 255));
        pn_estandarizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_exportarE.setBackground(new java.awt.Color(17, 30, 58));
        bt_exportarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_exportarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exportarEMouseClicked(evt);
            }
        });
        bt_exportarE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-excel.png"))); // NOI18N
        bt_exportarE.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 80));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Purple.png"))); // NOI18N
        bt_exportarE.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel70.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Exportar Excel");
        jLabel70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_exportarE.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 160, 210, -1));

        pn_estandarizacion.add(bt_exportarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 220, 210));

        bt_exportarXML.setBackground(new java.awt.Color(17, 30, 58));
        bt_exportarXML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_exportarXML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exportarXMLMouseClicked(evt);
            }
        });
        bt_exportarXML.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/XML.png"))); // NOI18N
        bt_exportarXML.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, 80));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Purple.png"))); // NOI18N
        bt_exportarXML.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        jLabel73.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Exportar XML con Schema");
        bt_exportarXML.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, -1));

        pn_estandarizacion.add(bt_exportarXML, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 300, 210));

        Fondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_estandarizacion.add(Fondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        Menu.add(pn_estandarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pn_indices.setBackground(new java.awt.Color(51, 51, 51));
        pn_indices.setForeground(new java.awt.Color(255, 255, 255));
        pn_indices.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_crearI.setBackground(new java.awt.Color(17, 30, 58));
        bt_crearI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_crearI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearIMouseClicked(evt);
            }
        });
        bt_crearI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina.png"))); // NOI18N
        bt_crearI.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 80, 80));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Blue.png"))); // NOI18N
        bt_crearI.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, -1));

        jLabel64.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Crear Índices");
        jLabel64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_crearI.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 160, 210, -1));

        pn_indices.add(bt_crearI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 220, 210));

        bt_reIndexarA.setBackground(new java.awt.Color(17, 30, 58));
        bt_reIndexarA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_reIndexarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_reIndexarAMouseClicked(evt);
            }
        });
        bt_reIndexarA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        bt_reIndexarA.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 90, 80));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Blue.png"))); // NOI18N
        bt_reIndexarA.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 120, -1));

        jLabel67.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Re Indexar Archivos");
        bt_reIndexarA.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, -1));

        pn_indices.add(bt_reIndexarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 240, 210));

        Fondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_indices.add(Fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        Menu.add(pn_indices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pn_campos.setBackground(new java.awt.Color(51, 51, 51));
        pn_campos.setForeground(new java.awt.Color(255, 255, 255));
        pn_campos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_listarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_listarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_campos.add(bt_listarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 220, 210));

        bt_crearC.setBackground(new java.awt.Color(17, 30, 58));
        bt_crearC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_campos.add(bt_crearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 220, 210));

        bt_modificarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_modificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_campos.add(bt_modificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 220, 210));

        bt_borrarC.setBackground(new java.awt.Color(17, 30, 58));
        bt_borrarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        pn_campos.add(bt_borrarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 220, 210));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        pn_campos.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        Menu.add(pn_campos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Menu.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1314, -1));

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botón.png"))); // NOI18N
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        Inicio.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1280, 120));

        pb.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 640, 40));

        Titulo.setFont(new java.awt.Font("Coolvetica Rg", 0, 80)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("STANDARD FILE MANAGER");
        Inicio.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1280, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Inicio.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 812));

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
        pn_registros.setVisible(false);
        pn_indices.setVisible(false);
        pn_estandarizacion.setVisible(false);

        if (pn_archivos.isVisible()) {
            pn_archivos.setVisible(false);
        } else {
            pn_archivos.setVisible(true);
        }
    }//GEN-LAST:event_ArchivosButtonMouseClicked

    private void CamposButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CamposButtonMouseClicked
        if (file == null) {
            JOptionPane.showMessageDialog(this, "¡No tiene ningun archivo abierto!", "Warning", WARNING_MESSAGE);
        } else if (file.getCountRegis() > 0) {
            JOptionPane.showMessageDialog(this, "¡No puede modificar campos porque ya tiene registros añadidos!", "Warning", WARNING_MESSAGE);
        } else {
            pn_archivos.setVisible(false);
            pn_registros.setVisible(false);
            pn_indices.setVisible(false);
            pn_estandarizacion.setVisible(false);

            if (pn_campos.isVisible()) {
                pn_campos.setVisible(false);
            } else {
                pn_campos.setVisible(true);
            }
        }
    }//GEN-LAST:event_CamposButtonMouseClicked

    private void bt_nuevoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nuevoAMouseClicked
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            folder = fileChooser.getSelectedFile();
            AbrirJD(jd_nuevoA);
        }
    }//GEN-LAST:event_bt_nuevoAMouseClicked

    private void bt_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_salirMouseClicked

    private void bt_abrirAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_abrirAMouseClicked
        AbrirJD(jd_abrirA);
    }//GEN-LAST:event_bt_abrirAMouseClicked

    private void bt_listarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarCMouseClicked
        if (file != null) {
            if (file.getMetadata() != null && !"".equals(file.getMetadata())) {
                ListarTablaC(jt_listarC);
                AbrirJD(jd_listarC);
            } else {
                JOptionPane.showMessageDialog(this, "¡No hay datos encontrados en la metadata!", "Warning", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bt_listarCMouseClicked

    private void bt_modificarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarCMouseClicked
        if (file != null) {
            if (file.getMetadata() != null && !"".equals(file.getMetadata())) {
                ListarTablaC(jt_modificarC);
                AbrirJD(jd_modificarC);
            } else {
                JOptionPane.showMessageDialog(this, "¡No hay datos encontrados en la metadata!", "Warning", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_modificarCMouseClicked

    private void bt_borrarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_borrarCMouseClicked
        if (file != null) {
            if (file.getMetadata() != null && !"".equals(file.getMetadata())) {
                ListarTablaC(jt_borrarC);
                AbrirJD(jd_borrarC);
            } else {
                JOptionPane.showMessageDialog(this, "¡No hay datos encontrados en la metadata!", "Warning", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_borrarCMouseClicked

    private void bt_crearCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearCMouseClicked
        if (file != null) {
            Panel = 1;
            EdicionPanel("Crear", -1);
            AbrirJD(jd_crearC);
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_crearCMouseClicked

    private void bt_crearAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearAMouseClicked
        file = new File(folder.getPath() + "/" + tf_nuevoA.getText() + ".txt");
        file.createFile();

        jd_nuevoA.dispose();
        JOptionPane.showMessageDialog(this, "¡Archivo creado con éxito!");
        ActualizarLabel();
    }//GEN-LAST:event_bt_crearAMouseClicked

    private void bt_salvarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarAMouseClicked
        if (file != null) {
            file.saveFile(file);
            System.out.println("Cantidad de nodos: ");
            //tree.print(tree.getRoot());
            ab.escribirArchivo();
            System.out.println("********");
            ab.getTree().print(ab.getTree().getRoot());
            System.out.println("********");

            if (ab.getTree() == null) {
                System.out.println("es culpa de tatiana");//Mal educada y chistosa esta wirra
            }
            JOptionPane.showMessageDialog(null, "¡Archivo guardado con éxito!", "Archivo Guardado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_salvarAMouseClicked

    private void bt_cerrarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarAMouseClicked
        if (file != null) {
            int opcion = JOptionPane.showConfirmDialog(null, "Si cierra el archivo no se guardarán los cambios. ¿Está seguro que quiere cerrar el archivo?", "Cerrar Archivo", JOptionPane.YES_NO_CANCEL_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                file = null;
                metadata = "";
                ab.setBtree(null);
                JOptionPane.showMessageDialog(this, "¡Se cerró el archivo!");
                ActualizarLabel();
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_cerrarAMouseClicked

    private void bt_createCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_createCMouseClicked
        try {
            if (!"".equals(tf_nameA.getText()) && !"".equals(ff_longitudA.getText()) && (si.isSelected() || no.isSelected())) {

                String nombre_campo = tf_nameA.getText();
                int longitud = Integer.parseInt(ff_longitudA.getText());
                String type = cb_dataType.getSelectedItem().toString();
                boolean isKey = (si.isSelected());

                Campo nuevo_campo = new Campo(longitud, nombre_campo, isKey, type, isKey, false);

                metadata = file.getMetadata();
                if (Panel == 1) {
//                    if (CampoValido(nuevo_campo, MetaData, -1)) {
                    if (ValidarCampo(nuevo_campo, jt_modificarC.getSelectedRow())) {
                        if (metadata == null || "".equals(metadata)) {
                            metadata = "";
                            metadata += nuevo_campo.toString();
                        } else {
                            metadata += "," + nuevo_campo.toString();
                        }

                        file.setMetadata(metadata);
                        file.getFields().add(nuevo_campo);

                        JOptionPane.showMessageDialog(null, "¡Se ha creado el campo con éxito! Recuerde guardar cambios", "Task Successfully not Failed", INFORMATION_MESSAGE);
                        EdicionPanel("Crear", -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo que quiere crear ya existe, ingrese un nombre de campo distinto", "Warning", WARNING_MESSAGE);
                    }

                } else {
                    //if (CampoValido(nuevo_campo, MetaData, pos_ModCampo)) {
                    if (ValidarCampo(nuevo_campo, jt_modificarC.getSelectedRow())) {
                        metadata = ModMetada((nuevo_campo.toString()), pos_ModCampo);
                        file.setMetadata(metadata);
                        file.getFields().set(jt_modificarC.getSelectedRow(), nuevo_campo);
                        //file.modifyFields(pos_ModCampo, nuevo_campo);

                        ListarTablaC(jt_modificarC);
                        jd_crearC.dispose();
                        JOptionPane.showMessageDialog(null, "¡Se ha modificado el campo con éxito! Recuerde guardar cambios.", "Task Successfully not Failed", INFORMATION_MESSAGE);
                        AbrirJD(jd_modificarC);
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo que quiere crear ya existe, ingrese un nombre de campo distinto", "Warning", WARNING_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron agregar los datos correctamente", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_createCMouseClicked

    private void bt_modifyCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifyCMouseClicked
        if (jt_modificarC.getSelectedRow() >= 0) {
//            int r = JOptionPane.showConfirmDialog(jt_modificarC, ("Desea modificar el campo?"), "Modificar Campo", YES_NO_OPTION);
//            if (r == 0) {
            Panel = 2;
            pos_ModCampo = jt_modificarC.getSelectedRow();
            EdicionPanel("Modificar", pos_ModCampo);
            AbrirJD(jd_crearC);
//            }
        } else {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un campo de la tabla", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_modifyCMouseClicked

    private void bt_deleteCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_deleteCMouseClicked
        if (jt_borrarC.getSelectedRow() >= 0) {
            int r = JOptionPane.showConfirmDialog(jt_borrarC, "Desea eliminar el campo?", "Eliminar Campo", YES_NO_OPTION);
            if (r == 0) {
                file.setMetadata(ModMetada("", jt_borrarC.getSelectedRow()));
                file.getFields().remove(jt_borrarC.getSelectedRow());
                ListarTablaC(jt_borrarC);
                JOptionPane.showMessageDialog(this, "¡Campo Eliminado! Recuerde guardar los cambios del archivo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar un campo de la tabla", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_deleteCMouseClicked

    private void bt_modificarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarRMouseClicked
        ListarLlaves(cb_llavesM);
        AbrirJD(jd_modificarR);
    }//GEN-LAST:event_bt_modificarRMouseClicked

    private void bt_introducirRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_introducirRMouseClicked
        if (file.getCountRegis() == 0) {
            file.saveFile(file);
        }

        pos_campo = 0;
        temp_record = new Registro();
//            for (int i = 0; i < file.getFields().size(); i++) {
//                Campo temp = file.getFields().get(i);
//                jta_campos.setText(jta_campos.getText()+"\n"+temp.getName()+" - "+temp.getType());
//                
//            }

        try {
            jt_campos.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"Campo", "Tipo"}));

            for (Campo c : file.getFields()) {
                Object[] row = {((Campo) c).getName(), ((Campo) c).getType(), c.getSize(), c.isKey()};
                DefaultTableModel modelo = (DefaultTableModel) jt_campos.getModel();
                modelo.addRow(row);
                jt_campos.setModel(modelo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Campo temp = file.getFields().get(pos_campo);
        String nombre = temp.getName();
        jl_campos.setText("Ingrese " + nombre + " :");
        int size = file.getFields().size() - 1;

        if (pos_campo == size) {
            bt_createR.setText("Crear");
        } else {
            bt_createR.setText("Siguiente");
        }
        AbrirJD(jd_crearR);

//        } else {
//            JOptionPane.showMessageDialog(this, "¡No tiene ningún archivo abierto!", "Warning", WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_bt_introducirRMouseClicked

    private void bt_buscarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarRMouseClicked
        ListarLlaves(cb_llaves);
        AbrirJD(jd_buscarR);
    }//GEN-LAST:event_bt_buscarRMouseClicked

    private void bt_borrarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_borrarRMouseClicked
        ListarLlaves(cb_llaves2);
        AbrirJD(jd_borrarR);
    }//GEN-LAST:event_bt_borrarRMouseClicked

    private void bt_listarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarRMouseClicked
//metodo de tatiana
//        Registro record = new Registro();
        //        try {
        //            rf = new RandomAccessFile(file, "rws");
        //            String cont = String.valueOf(file.getCountRegis());
        //
        //            DefaultTableModel modelo = (DefaultTableModel) jt_listarR.getModel();
        //
        //            modelo.setRowCount(0);
        //            modelo.setColumnCount(0);
        //
        //            for (Campo field : file.getFields()) {
        //                modelo.addColumn(field.getName());
        //            }
        //
        //            Object[] row = new Object[modelo.getColumnCount()];
        //
        //            for (int i = 0; i < 10; i++) {
        //                if (i < file.getCountRegis()) {
        //                    try {
        //                        record = file.LeerDatos(i);
        //
        //                        for (int j = 0; j < record.getAll_fields().size(); j++) {
        //                            row[j] = String.valueOf(record.getAll_fields().get(j));
        //                        }
        //                        modelo.addRow(row);
        //                    } catch (IOException ex) {
        //                        Logger.getLogger(Main_Screen.class.getName()).log(Level.SEVERE, null, ex);
        //                    }
        //                }
        //            }
        //            jt_listarR.setModel(modelo);
        //        } catch (FileNotFoundException ex) {
        //            Logger.getLogger(Main_Screen.class.getName()).log(Level.SEVERE, null, ex);
        //        }

        try {
//            Admin_BTree cbt;
            BTree bTreeIndex = ab.getTree();

            if (bTreeIndex != null) {
                DefaultTableModel modelo = (DefaultTableModel) jt_listarR.getModel();
                modelo.setRowCount(0);
                modelo.setColumnCount(0);

                for (Campo field : file.getFields()) {
                    modelo.addColumn(field.getName());
                }

                Object[] row = new Object[modelo.getColumnCount()];

                // Obtén todos los nodos desde la raíz del árbol B
                ArrayList<Node> nodes = getAllNodes(bTreeIndex.getRoot());

                // Recorre los nodos y extrae los registros asociados
                for (Node node : nodes) {
                    for (SearchEngine key : node.getKeys()) {
                        int rrn = key.getRRN();
                        try {
                            Registro record = file.LeerDatos(rrn);

                            for (int j = 0; j < record.getAll_fields().size(); j++) {
                                row[j] = String.valueOf(record.getAll_fields().get(j));
                            }
                            modelo.addRow(row);
                        } catch (IOException ex) {
                            Logger.getLogger(Main_Screen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }

                jt_listarR.setModel(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al listar registros!");
        }

        AbrirJD(jd_listarR);
    }//GEN-LAST:event_bt_listarRMouseClicked

    private void RegistrosButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosButtonMouseClicked
        if (file != null) {
            pn_archivos.setVisible(false);
            pn_campos.setVisible(false);
            pn_indices.setVisible(false);
            pn_estandarizacion.setVisible(false);

            if (pn_registros.isVisible()) {
                pn_registros.setVisible(false);
            } else {
                pn_registros.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningun archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_RegistrosButtonMouseClicked

    private void bt_crearIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_crearIMouseClicked

    private void bt_reIndexarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reIndexarAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_reIndexarAMouseClicked

    private void IndicesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndicesButtonMouseClicked
        if (file != null) {
            pn_archivos.setVisible(false);
            pn_campos.setVisible(false);
            pn_registros.setVisible(false);
            pn_estandarizacion.setVisible(false);

            if (pn_indices.isVisible()) {
                pn_indices.setVisible(false);
            } else {
                pn_indices.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningun archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_IndicesButtonMouseClicked

    private void bt_exportarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exportarEMouseClicked
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        //fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            folder = fileChooser.getSelectedFile();
            System.out.println("folder" + folder);
            System.out.println("->" + folder.getName());
            Export_Excel excel = new Export_Excel(folder.getPath());
            excel.Create_Excel(file.getFields(), file, file.getName());
            //excel.Create_Excel(file.getFields(), file.getRecords(), file.getName());
        }
    }//GEN-LAST:event_bt_exportarEMouseClicked

    private void bt_exportarXMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exportarXMLMouseClicked
        /* METHOD 1 FALLIDO
        //Export_XML xml = new Export_XML();
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        //fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            folder = fileChooser.getSelectedFile();
            System.out.println("folder"+ folder);
            System.out.println("->"+folder.getName());
            //folder->C:\Users\tatig\Desktop\so
            //nombre->so
            
            //xml.CreateXML(folder.getPath(), folder.getName(), key, value);
            //file = new File(folder.getPath() + ".txt");
            //file.createFile();

            
            JOptionPane.showMessageDialog(this, "¡XML creado con éxito!");
        }

        METHOD 2 FALLIDO
        try {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                java.io.File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                String XMLName = JOptionPane.showInputDialog("Ingrese el Nombre del archivo");

                Export_XML xml = new Export_XML();
                xml.CreateXML(filePath, XMLName, file.getFields(), file.getRecords());
            } else {
                JOptionPane.showMessageDialog(this, "No se seleccionó ningún archivo.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido algo inesperado.");
        }*/

        JFileChooser create = new JFileChooser("./");
        int result = create.showSaveDialog(null);
        java.io.File archivo = new java.io.File(create.getSelectedFile() + ".xml");

        if (result == JFileChooser.APPROVE_OPTION) {
            String nameFile = archivo.getName();
            String dir = archivo.toString();

            if (nameFile == null || "".equals(nameFile)) {
                JOptionPane.showMessageDialog(null, "El nombre del archivo no es valido.");
            } else {
                try {
                    String salvar = "";
                    salvar += "<archivo>\n";

                    for (int i = 1; i < file.getCountRegis() + 1; i++) {

                        rf = new RandomAccessFile(file, "rws");
                        String cont = String.valueOf(file.getCountRegis());

                        try {
                            int x = (file.getTamMetadata() + 1) + (cont.length()) + (file.getTamMetadata() * i) + 1;
                            rf.seek(x);

                            String[] registrosCampos = rf.readLine().split(",");

                            if (registrosCampos.length == 1 && isNumeric(registrosCampos[0])) {
                            } else {
                                salvar += "     <registro>\n";
                                for (int j = 0; j < file.getFields().size(); j++) {
                                    salvar += "         <" + file.getFields().get(j) + "/>" + file.getFields().get(j).getType() + "=" + registrosCampos[j] + "</" + file.getFields().get(j) + ">\n";
                                }
                                salvar += "     </registro>\n";

                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Main_Screen.class
                                    .getName()).log(Level.SEVERE, null, ex);
                        }

//                            String[] registrosCampos = file.getRecords().get(i)
                    }
                    salvar += "</archivo>";
                    BufferedWriter writer = new BufferedWriter(new FileWriter(new java.io.File(dir)));
                    writer.write(salvar);
                    //writer.write(salvar.getBytes());
                    writer.flush();
                    writer.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "Archivo exportado exitosamente");
            }
        }
    }//GEN-LAST:event_bt_exportarXMLMouseClicked

    private void EstandarizacionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstandarizacionButtonMouseClicked
        if (file != null) {
            pn_archivos.setVisible(false);
            pn_campos.setVisible(false);
            pn_registros.setVisible(false);
            pn_indices.setVisible(false);

            if (pn_estandarizacion.isVisible()) {
                pn_estandarizacion.setVisible(false);
            } else {
                pn_estandarizacion.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡No tiene ningun archivo abierto!", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EstandarizacionButtonMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void Search_File1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_File1ActionPerformed
        try {
            DefaultListModel model = new DefaultListModel();;
            JFileChooser path = new JFileChooser();
            path.showOpenDialog(this);
            File archivo1 = new File(path.getSelectedFile().getPath());
            System.out.println(archivo1.toString());

            model.clear();
            jl_Enlazar1.getModel();
            for (int i = 0; i < archivo1.getFields().size(); i++) {
                model.addElement(archivo1.getFields().get(i));
            }
            jl_Enlazar1.setModel(model);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_Search_File1ActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        jd_enlazar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RestartActionPerformed

    private void Save_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_FileActionPerformed

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
//        Salir.setBackground(Color.red);
//        Salir.setForeground(Color.white);
    }//GEN-LAST:event_SalirMouseEntered

    private void Search_File2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_File2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_File2ActionPerformed

    private void FlechaEnlazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlechaEnlazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlechaEnlazadoActionPerformed

    private void FlechaEnlazadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaEnlazadoMouseClicked
        try {
            boolean Yes_A = true;
            boolean Yes_B = true;
            DefaultListModel model_1 = (DefaultListModel) jl_Enlazar1.getModel();
            DefaultListModel model_2 = (DefaultListModel) jl_Enlazar2.getModel();
            DefaultListModel model_3 = (DefaultListModel) jl_Enlazados.getModel();
            try {
                if (jl_Enlazar1.getSelectedIndex() >= 0) {
                    for (int i = 0; i < model_3.getSize(); i++) {
                        if (model_3.getElementAt(i) == model_1.getElementAt(jl_Enlazar1.getSelectedIndex())) {
                            Yes_A = false;
                        }
                    }
                    if (Yes_A) {
                        model_3.addElement(model_1.getElementAt(jl_Enlazar1.getSelectedIndex()));
                    }
                }
            } catch (Exception e) {

            }
            try {
                if (jl_Enlazar2.getSelectedIndex() >= 0) {
                    for (int i = 0; i < model_3.getSize(); i++) {
                        if (model_3.getElementAt(i) == model_2.getElementAt(jl_Enlazar2.getSelectedIndex())) {
                            Yes_B = false;
                        }
                    }
                    if (Yes_B) {
                        model_3.addElement(model_2.getElementAt(jl_Enlazar2.getSelectedIndex()));
                    }
                }
            } catch (Exception e) {

            }
            jl_Enlazados.setModel(model_3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error 404 \n"
                    + "Intentelo de Nuevo!");
        }
    }//GEN-LAST:event_FlechaEnlazadoMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        jd_enlazar.dispose();
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
//        Salir.setBackground(Color.white);
//        Salir.setForeground(Color.black);
    }//GEN-LAST:event_SalirMouseExited

    private void bt_cruzarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cruzarAMouseClicked
        AbrirJD(jd_enlazar);
    }//GEN-LAST:event_bt_cruzarAMouseClicked

    private void bt_createRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_createRMouseClicked
        if (!"".equals(tf_campo.getText())) {
            Campo temp = file.getFields().get(pos_campo);
            if (ValidField(temp, tf_campo.getText())) {
                temp_record.getAll_fields().add(tf_campo.getText());
                if ("Crear".equals(bt_createR.getText())) {
                    Registro record = temp_record;
                    record.Size();
                    try {
                        AddRecord(record);//3 Metodos

                    } catch (IOException ex) {
                        Logger.getLogger(Main_Screen.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                    pos_campo = 0;
                    jd_crearR.dispose();
                    JOptionPane.showMessageDialog(null, "¡Registro creado con exito!", "Records", INFORMATION_MESSAGE);
                    tf_campo.setText("");

                } else {
                    pos_campo++;
                    temp = file.getFields().get(pos_campo);
                    int size = file.getFields().size() - 1;
                    if (pos_campo == size) {
                        bt_createR.setText("Crear");
                    }
                    String nombre = temp.getName();
                    jl_campos.setText("Ingrese " + nombre + " :");
                    tf_campo.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El tipo de dato ingresado no es el correcto", "Warning", WARNING_MESSAGE);

            }
            //AbrirJD(jd_crearR);
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_createRMouseClicked

    private void bt_searchRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_searchRMouseClicked
        if (!"".equals(tf_keyB.getText())) {
            Buscar(cb_llaves, tf_keyB, jt_buscarR);
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_searchRMouseClicked

    private void Search_File2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_File2MouseClicked
        try {
            DefaultListModel model = new DefaultListModel();;
            JFileChooser path = new JFileChooser();
            path.showOpenDialog(this);
            File archivo2 = new File(path.getSelectedFile().getPath());
            System.out.println(archivo2.toString());

            model.clear();
            jl_Enlazar2.getModel();
            for (int i = 0; i < archivo2.getFields().size(); i++) {
                model.addElement(archivo2.getFields().get(i));
            }
            jl_Enlazar2.setModel(model);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_Search_File2MouseClicked

    private void Save_FileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_FileMouseClicked
        try {
            DefaultListModel modelo3 = (DefaultListModel) jl_Enlazados.getModel();
            JFileChooser path = new JFileChooser();
            path.showOpenDialog(this);

            ArrayList<Campo> campos = new ArrayList();
            File archivo3 = new File(path.getSelectedFile().getPath());

            for (int i = 0; i < modelo3.size(); i++) {
                campos.add((Campo) modelo3.getElementAt(i));
            }
            path.showOpenDialog(this);
            archivo3.setFields(campos);
            if (!archivo3.getFields().isEmpty()) {
                String metaData = "";//registros = ""
                int recordSize = 0;//recNum = 0;
                for (int i = 0; i < archivo3.getFields().size(); i++) {
                    if (i == 0) {
                        metaData += '{';
                    }
                    metaData += archivo3.getFields().get(i).toString();
                    if (i == archivo3.getFields().size() - 1) {
                        metaData += '}';
                    } else {
                        metaData += ", ";
                    }
                    recordSize += archivo3.getFields().get(i).getSize() + 1;
                }
                metaData += "\n" + Integer.toString(recordSize);
                metaData += "\n" + archivo3.getCountRegis() + "\n";

                try {
                    System.out.println(path.getSelectedFile().getPath());
                    fw = new FileWriter(path.getSelectedFile().getPath() + ".txt");
                    bw = new BufferedWriter(fw);
                    bw.append(metaData);
//                    for (int i = 0; i < archivo3.getRecords().size(); i++) {
//                        bw.append(archivo3.getRecords().get(i).toString() + "\n");
//                    }
                    bw.flush();
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(this, "El Enlazado de Archivos \n"
                            + "Ha sido EXITOSO!");
                } catch (IOException ex) {
                    System.out.println("Uuupppsssss... Algo Sucedió");
                }

//                if (!archivo3.getRecords().isEmpty()) {
//                    FileOutputStream fw = null;
//                    ObjectOutputStream bw = null;
//                    try {
//                        fw = new FileOutputStream(archivo);
//                        bw = new ObjectOutputStream(fw);
//                        bw.writeObject(this.tree);
//                        bw.flush();
//                    } catch (Exception ex) {
//                    } finally {
//                        try {
//                            bw.close();
//                            fw.close();
//                        } catch (Exception ex) {
//                        }
//                    }
//                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ha ocurrido algo inesperado");
        }
    }//GEN-LAST:event_Save_FileMouseClicked

    private void tf_FilepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_FilepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_FilepathActionPerformed

    private void bt_openFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_openFMouseClicked
        if (!tf_Filepath.getText().isEmpty() && cb_archivosdeprueba.getSelectedIndex() != 0) {
            JOptionPane.showMessageDialog(this, "¡Solo elija un archivo!", "Warning", WARNING_MESSAGE);
        } else {
            if (cb_archivosdeprueba.getSelectedIndex() != 0) {
                int index = cb_archivosdeprueba.getSelectedIndex();
//                ab.setTree(new BTree(3));

                if (index == 1) {
                    archivo = new File("./PersonFile.txt");
                    ab = new Admin_BTree("./PersonFile-Btree.tva");
                } else {
                    archivo = new File("./CityFile.txt");
                    ab = new Admin_BTree("./CityFile-Btree.tva");
                }
            }

            file = new File(archivo.getPath());
            file.openFile(file);

            if (!tf_Filepath.getText().isEmpty()) {
//                String name = file.getName().substring(0, file.getName().length() - 4);
                ab = new Admin_BTree("./" + tf_Filepath.getText() + "-Btree.tva");
            }

            ab.cargarArchivo();
            ab.setBtree(ab.getTree());
//            System.out.println("Cantidad de nodos: ");
//            System.out.println("^^^^^^^^");
//            ab.getTree().print(ab.getTree().getRoot());
            //tree.print(tree.getRoot());
//            System.out.println("^^^^^^^^");
//            CargarArbol();

            if (ab.getTree() == null) {
                System.out.println("todos me caen mal");
            }

            jd_abrirA.dispose();

            JOptionPane.showMessageDialog(this, "¡Archivo abierto con éxito!", "Notification", INFORMATION_MESSAGE);
            ActualizarLabel();
        }
    }//GEN-LAST:event_bt_openFMouseClicked

    private void bt_buscarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_buscarAMouseClicked
        try {
            JFileChooser jfc = new JFileChooser();
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
                tf_Filepath.setText(archivo.getName());

            } else {
                JOptionPane.showMessageDialog(this, "¡Archivo no soportado!", "Warning", WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_buscarAMouseClicked

    private void bt_listarBRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarBRMouseClicked
        if (!"".equals(tf_campo2.getText())) {
            Buscar(cb_llaves2, tf_campo2, jt_borrarR);
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_listarBRMouseClicked

    private void bt_removeRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removeRMouseClicked
        if (!"".equals(tf_campo2.getText())) {
            int pos_campo2 = PosCampo(cb_llaves2);
            Campo temp = file.getFields().get(pos_campo2);
            if (ValidField(temp, tf_campo2.getText())) {
                try {
                    SearchEngine temp_o = new SearchEngine();
                    temp_o.setKey(tf_campo2.getText());
                    Node tempNode = ab.getTree().search(ab.getTree().getRoot(), temp_o);
                    int rrn = tempNode.getKeys().get(tempNode.getKey_pos()).getRRN();
                    if (!file.getSlot().isEmpty()) {
                        file.getSlot().set(0, rrn);
                    } else {
                        file.getSlot().add(rrn);
                    }
                    System.out.println("Java");
                    if (ab.getTree() == null) {
                        System.out.println("esta nulo :D");
                    } else {
                        System.out.println("no lo esta");
                    }
                    ab.getTree().print(ab.getTree().getRoot());
                    ab.getTree().delete(tempNode, temp_o);
                    ab.getTree().print(ab.getTree().getRoot());

                    file.BorrarDatos(rrn);

                } catch (IOException ex) {
                    Logger.getLogger(Main_Screen.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                jd_borrarR.dispose();
                JOptionPane.showMessageDialog(null, "El registro se borró correctamente", "Info", INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "El tipo de dato ingresado no es el correcto", "Warning", WARNING_MESSAGE);

            }
            //AbrirJD(jd_crearR);
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_removeRMouseClicked

    private void bt_listarRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarRMMouseClicked
        if (!"".equals(tf_campo3.getText())) {
            Buscar(cb_llavesM, tf_campo3, jt_modificarR);
        } else {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_listarRMMouseClicked

    private void bt_modifyRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modifyRMouseClicked
        if (!"".equals(tf_campo3.getText())) {
            if (search != null) {
                boolean flag = true;
                for (int i = 0; i < file.getFields().size(); i++) {
                    if (!ValidField(file.getFields().get(i), (String) jt_modificarR.getValueAt(i, 1))) {
                        flag = false;
                        break;
                    }
                }

                //si los tipos de datos son validos
                if (flag) {
                    int RRN = search.getKeys().get(search.getKey_pos()).getRRN();

                    String linea = "";
                    for (int i = 0; i < file.getFields().size(); i++) {
                        linea += (String) jt_modificarR.getValueAt(i, 1) + "|";
                    }

                    while (linea.length() < file.getTamRecord()) {
                        linea += "$";
                    }
                    
                    System.out.println("linea: " + linea);
                    Registro record = new Registro(linea, file.getTamRecord(), RRN);
                    try {
                        InsertRecord(record, RRN);
                    } catch (IOException ex) {
                        Logger.getLogger(Main_Screen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "El registro se modificó correctamente", "Info", INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "El tipo de dato ingresado no es el correcto", "Warning", WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Warning", WARNING_MESSAGE);
            }

//            int pos_campo2 = PosCampo(cb_llaves2);
//            Campo temp = file.getFields().get(pos_campo2);
//            if (ValidField(temp, tf_campo2.getText())) {
//                SearchEngine temp_o = new SearchEngine();
//                temp_o.setKey(tf_campo2.getText());
//                Node tempNode = ab.getTree().search(ab.getTree().getRoot(), temp_o);
//                int rrn = tempNode.getKeys().get(tempNode.getKey_pos()).getRRN();
//
//                Registro rec = new Registro();
//                try {
//                    rec = file.LeerDatos(rrn);
//
//                } catch (IOException ex) {
//                    Logger.getLogger(Main_Screen.class
//                            .getName()).log(Level.SEVERE, null, ex);
//                }
            //abriria el mismo jd de crear solo q con datos para el modificar
//                file.getRecords().set(rrn, rec);
//                jd_modificarR.dispose();
        }


    }//GEN-LAST:event_bt_modifyRMouseClicked

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
            java.util.logging.Logger.getLogger(Main_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Screen().setVisible(true);
            }
        });
    }

    public boolean ValidField(Campo campo, String tx) {
        if (campo.getType().equals(TextType(tx))) {
            return true;
        }
        if (campo.isKey()) {
            //if search(tx) en el arbol, si es true, returna falso ; 
        }
        return false;
    }

    public String TextType(String txt) {
        if (txt.matches("\\d+")) {
            return "int";
        }
        try {
            Float.valueOf(txt);
            return "float";
        } catch (NumberFormatException e) {
            return "char";
        }
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

    private void ListarTablaC(JTable tabla) {
        try {
            tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{
                "Nombre de Campo", "Tipo de Dato", "Longitud", "Key"}));

            for (Campo c : file.getFields()) {
                Object[] row = {((Campo) c).getName(), ((Campo) c).getType(), c.getSize(), c.isKey()};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(row);
                tabla.setModel(modelo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void ListarTablaR(JTable tabla, int pos) {
        try {
            tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"Campo", "Data"}));

            Registro record = file.LeerDatos(pos);

            for (int i = 0; i < record.getAll_fields().size(); i++) {
                Object[] row = {file.getFields().get(i).getName(), record.getAll_fields().get(i)};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(row);
                tabla.setModel(modelo);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void ListarLlaves(JComboBox cb) {
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb.getModel();

        for (Campo field : file.getFields()) {
            if (field.isKey() || field.isIsKeyT1() || field.isIsKeyT2()) {
                modelo.addElement(field.getName());
            }
        }

        cb.setModel(modelo);
    }

//    private void ListarTablaR(JTable tabla) {
//        try {
//            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
//
//            modelo.setRowCount(0);
//            modelo.setColumnCount(0);
//
//            for (Campo field : file.getFields()) {
//                modelo.addColumn(field.getName());
//            }
//
//            Object[] row = new Object[modelo.getColumnCount()];
//            for (Registro record : file.getRecords()) {
//                for (int i = 0; i < file.getFields().size(); i++) {
//                    row[i] = String.valueOf(record.getAll_fields().get(i));
//                }
//
//                modelo.addRow(row);
//            }
//
//            tabla.setModel(modelo);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    public void EdicionPanel(String task, int pos) {
        TitleCampo.setText(task + " Campos");
        bt_createC.setText(task);

        if (pos >= 0) {
            Campo campo_temp = file.getFields().get(pos);
            boolean isKey = campo_temp.isKey();
            tf_nameA.setText(campo_temp.getName());
            ff_longitudA.setText(Integer.toString(campo_temp.getSize()));

            char character = campo_temp.getType().charAt(0);

            if (character == 'i') {
                cb_dataType.setSelectedIndex(0);
            } else if (character == 'c') {
                cb_dataType.setSelectedIndex(1);
            } else {
                cb_dataType.setSelectedIndex(2);
            }

            if (isKey) {
                si.setSelected(true);
                no.setSelected(false);
            } else {
                no.setSelected(true);
                si.setSelected(false);
            }

        } else {
            tf_nameA.setText("");
            ff_longitudA.setText("");
            bg_key.clearSelection();
        }

    }

    public String ModMetada(String campo, int pos) {
        String[] Campos = file.getMetadata().split(",");
        String new_metadata = "";
        for (int i = 0; i < Campos.length; i++) {
            if (i == pos) {
                if (i == 0) {
                    new_metadata += campo;
                } else {
                    new_metadata += "," + campo;
                }
            } else {
                if (i != 0) {
                    new_metadata += "," + Campos[i];
                } else {
                    new_metadata += Campos[i];
                }
            }
        }
        return new_metadata;
    }

    public boolean ValidarCampo(Campo campo, int pos) {
        for (int i = 0; i < file.getFields().size(); i++) {
            String campo_original = file.getFields().get(i).getName().toLowerCase();
            if (campo_original.equals(campo.getName().toLowerCase())) {
                if (i == pos) {
                    return true;
                }
                return false;
            }
        }

        return true;
    }

    public void AddRecord(Registro record) throws IOException {
        int pos = PrimaryKeyPos(file.getFields());
        int rrn;
        if (file.getSlot().isEmpty()) {
            rrn = file.getCountRegis();
            AddBTree(record, rrn, pos);
            file.EscribirDatos(rrn, record);
            file.setCountRegis(rrn + 1);

        } else {//usa el availist
            rrn = file.getSlot().get(0);
            AddBTree(record, rrn, pos);
            file.EscribirDatos(rrn, record);
            //file.getRecords().set(pos_record, record);
        }
    }

    public void InsertRecord(Registro record, int RRN) throws IOException {
        int pos = PrimaryKeyPos(file.getFields());
        AddBTree(record, RRN, pos);
        file.EscribirDatos(RRN, record);
    }

    public void AddBTree(Registro record, int RRN, int pos) {
//      System.out.println("Cont: " + file);
        if (file.getCountRegis() <= 0) {
            System.out.println("empty");
//            ab.setTree(new BTree(3));
            //String name = file.getName().substring(0, file.getName().length() - 4);
            //System.out.println("nombre" + name);
            ab = new Admin_BTree("./" + file.getName() + "-Btree.tva");
        }

        System.out.println("primera linea");
        SearchEngine obj = new SearchEngine();
        obj.setRRN(RRN);
        obj.setKey(record.getAll_fields().get(pos));
        System.out.println("antes de insertar");
        ab.getTree().insert(obj);
//        tree.insert(obj);
//        ab.setBtree(tree);
        System.out.println("antes de escribir");
        ab.escribirArchivo();
//        ab.getTree().print(ab.getTree().getRoot());
        //tree.print(tree.getRoot());
    }

    public int PrimaryKeyPos(ArrayList<Campo> campos) {
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).isKey()) {
                return i;
            }
        }
        return -1;
    }

    public int PosCampo(JComboBox combo) {
        for (int i = 0; i < file.getFields().size(); i++) {
            if (combo.getSelectedItem() == file.getFields().get(i).getName()) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void CargarArbol() {
        Scanner sc = null;
        if (file.exists()) {
            try {
                sc = new Scanner(file);
                sc.nextLine();//metadata
                int cont = Integer.parseInt(sc.nextLine());
                file.setCountRegis(cont);//count de los registros

//                System.out.println("a: " + a);
                System.out.println("count: " + cont);

                int RNN = 0;
                while (sc.hasNext()) {
                    String f = sc.nextLine();
                    System.out.println(f);
                    Registro record = new Registro(f, file.getTamRecord(), RNN);

                    int pos = PrimaryKeyPos(file.getFields());
                    System.out.println("antes");
                    AddBTree(record, RNN, pos);
                    System.out.println("despues");

                    RNN++;
                }
            } catch (Exception ex) {
                sc.close();
            }
        }
    }

    public void Buscar(JComboBox cb, JTextField llave, JTable tabla) {
        String campo = cb.getSelectedItem().toString();
        String key = llave.getText();

        SearchEngine temp = new SearchEngine();
        temp.setKey(key);

        search = ab.getTree().search(ab.getTree().getRoot(), temp);

        if (search != null) {
            int rrn = search.getKeys().get(search.getKey_pos()).getRRN();
            ListarTablaR(tabla, rrn);
//                temp = search.getKeys().get(search.getKeys().indexOf(key));
//                ListarTablaR(jt_buscarR, temp.getRRN());
        } else {
            JOptionPane.showMessageDialog(null, "No existe este registro!", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Method para obtener los nodes
    private ArrayList<Node> getAllNodes(Node root) {
        ArrayList<Node> nodes = new ArrayList<>();
        if (root != null) {
            nodes.add(root);
            for (Node child : root.getChildren()) {
                nodes.addAll(getAllNodes(child));
            }
        }
        return nodes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ArchivosButton;
    private javax.swing.JPanel CamposButton;
    private javax.swing.JPanel EstandarizacionButton;
    private javax.swing.JButton FlechaEnlazado;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JLabel Fondo5;
    private javax.swing.JLabel Fondo6;
    private javax.swing.JLabel FondoJD;
    private javax.swing.JLabel FondoJD1;
    private javax.swing.JLabel FondoJD2;
    private javax.swing.JLabel FondoJD3;
    private javax.swing.JLabel FondoJD4;
    private javax.swing.JLabel FondoJD5;
    private javax.swing.JLabel FondoJD6;
    private javax.swing.JLabel FondoJD7;
    private javax.swing.JLabel FondoJD8;
    private javax.swing.JLabel Fotito;
    private javax.swing.JLabel Fotito1;
    private javax.swing.JLabel Fotito2;
    private javax.swing.JPanel IndicesButton;
    private javax.swing.JPanel Inicio;
    private javax.swing.JScrollPane Lista1;
    private javax.swing.JScrollPane Lista2;
    private javax.swing.JScrollPane Lista3;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel RegistrosButton;
    private javax.swing.JButton Restart;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Save_File;
    private javax.swing.JButton Search_File1;
    private javax.swing.JButton Search_File2;
    private javax.swing.JLabel TitleCampo;
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup bg_key;
    private javax.swing.JPanel bt_abrirA;
    private javax.swing.JPanel bt_borrarC;
    private javax.swing.JPanel bt_borrarR;
    private javax.swing.JButton bt_buscarA;
    private javax.swing.JPanel bt_buscarR;
    private javax.swing.JPanel bt_cerrarA;
    private javax.swing.JButton bt_crearA;
    private javax.swing.JPanel bt_crearC;
    private javax.swing.JPanel bt_crearI;
    private javax.swing.JButton bt_createC;
    private javax.swing.JButton bt_createR;
    private javax.swing.JPanel bt_cruzarA;
    private javax.swing.JButton bt_deleteC;
    private javax.swing.JPanel bt_exportarE;
    private javax.swing.JPanel bt_exportarXML;
    private javax.swing.JPanel bt_introducirR;
    private javax.swing.JButton bt_listarBR;
    private javax.swing.JPanel bt_listarC;
    private javax.swing.JPanel bt_listarR;
    private javax.swing.JButton bt_listarRM;
    private javax.swing.JPanel bt_modificarC;
    private javax.swing.JPanel bt_modificarR;
    private javax.swing.JButton bt_modifyC;
    private javax.swing.JButton bt_modifyR;
    private javax.swing.JPanel bt_nuevoA;
    private javax.swing.JButton bt_openF;
    private javax.swing.JPanel bt_reIndexarA;
    private javax.swing.JButton bt_removeR;
    private javax.swing.JPanel bt_salir;
    private javax.swing.JPanel bt_salvarA;
    private javax.swing.JButton bt_searchR;
    private javax.swing.JComboBox<String> cb_archivosdeprueba;
    private javax.swing.JComboBox<String> cb_dataType;
    private javax.swing.JComboBox<String> cb_llaves;
    private javax.swing.JComboBox<String> cb_llaves2;
    private javax.swing.JComboBox<String> cb_llavesM;
    private javax.swing.JFormattedTextField ff_longitudA;
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
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDialog jd_abrirA;
    private javax.swing.JDialog jd_borrarC;
    private javax.swing.JDialog jd_borrarR;
    private javax.swing.JDialog jd_buscarR;
    private javax.swing.JDialog jd_crearC;
    private javax.swing.JDialog jd_crearR;
    private javax.swing.JDialog jd_enlazar;
    private javax.swing.JDialog jd_listarC;
    private javax.swing.JDialog jd_listarR;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JDialog jd_modificarR;
    private javax.swing.JDialog jd_nuevoA;
    private javax.swing.JList<String> jl_Enlazados;
    private javax.swing.JList<String> jl_Enlazar1;
    private javax.swing.JList<String> jl_Enlazar2;
    private javax.swing.JLabel jl_archivo;
    private javax.swing.JLabel jl_campos;
    private javax.swing.JLabel jl_campos1;
    private javax.swing.JLabel jl_campos2;
    private javax.swing.JLabel jl_campos3;
    private javax.swing.JLabel jl_campos4;
    private javax.swing.JLabel jl_campos5;
    private javax.swing.JLabel jl_campos6;
    private javax.swing.JLabel jl_crear;
    private javax.swing.JTable jt_borrarC;
    private javax.swing.JTable jt_borrarR;
    private javax.swing.JTable jt_buscarR;
    private javax.swing.JTable jt_campos;
    private javax.swing.JTable jt_listarC;
    private javax.swing.JTable jt_listarR;
    private javax.swing.JTable jt_modificarC;
    private javax.swing.JTable jt_modificarR;
    private javax.swing.JRadioButton no;
    private javax.swing.JProgressBar pb;
    private javax.swing.JPanel pn_BorrarC;
    private javax.swing.JPanel pn_abrirA;
    private javax.swing.JPanel pn_archivos;
    private javax.swing.JPanel pn_campos;
    private javax.swing.JPanel pn_crearC;
    private javax.swing.JPanel pn_estandarizacion;
    private javax.swing.JPanel pn_indices;
    private javax.swing.JPanel pn_listarC;
    private javax.swing.JPanel pn_listarC1;
    private javax.swing.JPanel pn_listarC2;
    private javax.swing.JPanel pn_listarC3;
    private javax.swing.JPanel pn_modificarC;
    private javax.swing.JPanel pn_nuevoA;
    private javax.swing.JPanel pn_registros;
    private javax.swing.JRadioButton si;
    private javax.swing.JLabel start;
    private javax.swing.JTextField tf_Filepath;
    private javax.swing.JTextField tf_campo;
    private javax.swing.JTextField tf_campo2;
    private javax.swing.JTextField tf_campo3;
    private javax.swing.JTextField tf_keyB;
    private javax.swing.JTextField tf_nameA;
    private javax.swing.JTextField tf_nuevoA;
    // End of variables declaration//GEN-END:variables
}
