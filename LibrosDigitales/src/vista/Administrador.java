
package vista;

import controlador.LibroController;
import entidades.Libro;
import modelo.MetodosModelo;


public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MenuDeBarra = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        mitLibro = new javax.swing.JMenuItem();
        mitConsultaLibros = new javax.swing.JMenuItem();
        version = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 242, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apoyo (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 140));

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("BIENVENIDO A MENU ADMINISTRADOr");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hola.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 60));

        btnMenu.setBackground(new java.awt.Color(255, 51, 0));
        btnMenu.setForeground(new java.awt.Color(0, 0, 51));
        btnMenu.setText("Menu");

        mitLibro.setBackground(new java.awt.Color(255, 51, 0));
        mitLibro.setForeground(new java.awt.Color(0, 0, 51));
        mitLibro.setText("Gestionar Libros");
        mitLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitLibroActionPerformed(evt);
            }
        });
        btnMenu.add(mitLibro);

        mitConsultaLibros.setBackground(new java.awt.Color(255, 51, 0));
        mitConsultaLibros.setForeground(new java.awt.Color(0, 0, 51));
        mitConsultaLibros.setText("ConsultarLibros");
        btnMenu.add(mitConsultaLibros);

        MenuDeBarra.add(btnMenu);

        version.setBackground(new java.awt.Color(255, 51, 0));
        version.setForeground(new java.awt.Color(0, 0, 51));
        version.setText("Version");
        MenuDeBarra.add(version);

        setJMenuBar(MenuDeBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitLibroActionPerformed
             /*GL.setVisible(true);
        GL.setLocationRelativeTo(null);*/   
        Libro lib = new Libro();
        MetodosModelo MetodoModelo = new MetodosModelo();
        GestionarLibro GL = new GestionarLibro();
        LibroController controlador = new LibroController(lib,MetodoModelo,GL);
       
        
        
    }//GEN-LAST:event_mitLibroActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuDeBarra;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem mitConsultaLibros;
    private javax.swing.JMenuItem mitLibro;
    private javax.swing.JMenu version;
    // End of variables declaration//GEN-END:variables
}
