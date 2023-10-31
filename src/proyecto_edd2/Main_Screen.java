package proyecto_edd2;

public class Main_Screen extends javax.swing.JFrame {

    public Main_Screen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();

        Inicio.setVisible(true);
        //Titulo.setVisible(true);

        AdmBarra h = new AdmBarra(pb);
        Thread hilo = new Thread(h);
        hilo.start();
        
        if (!h.isAlive()) {
            pb.setVisible(false);
            start.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inicio = new javax.swing.JPanel();
        start = new javax.swing.JLabel();
        pb = new javax.swing.JProgressBar();
        Titulo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Start Button.png"))); // NOI18N
        Inicio.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1350, 130));

        pb.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.add(pb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 640, 40));

        Titulo.setFont(new java.awt.Font("Dialog", 3, 70)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("STANDARD FILE MANAGER");
        Inicio.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1360, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        Inicio.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JProgressBar pb;
    private javax.swing.JLabel start;
    // End of variables declaration//GEN-END:variables
}
