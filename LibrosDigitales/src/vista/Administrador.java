
package vista;

import controlador.LibroController;
import entidades.Libro;
import modelo.MetodosModeloDeLibro;


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
        jLabel4 = new javax.swing.JLabel();
        MenuDeBarra = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        mitLibro = new javax.swing.JMenuItem();
        mitConsultaLibros = new javax.swing.JMenuItem();
        version = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 242, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apoyo (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 260, 250));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("BIENVENIDo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Menu administrador");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        MenuDeBarra.setBackground(new java.awt.Color(255, 51, 0));
        MenuDeBarra.setForeground(new java.awt.Color(0, 0, 51));

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
            
        Libro lib = new Libro();
        MetodosModeloDeLibro MetodoModelo = new MetodosModeloDeLibro();
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem mitConsultaLibros;
    private javax.swing.JMenuItem mitLibro;
    private javax.swing.JMenu version;
    // End of variables declaration//GEN-END:variables
}
