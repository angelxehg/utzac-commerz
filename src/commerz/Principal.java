/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerz;

import core.MySQLServer;
import forms.VIClientes;
import forms.VIProductos;
import forms.VIVentas;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInterno = new javax.swing.JDesktopPane();
        BarraMenus = new javax.swing.JMenuBar();
        MenClientes = new javax.swing.JMenu();
        MenProductos = new javax.swing.JMenu();
        MenVentas = new javax.swing.JMenu();
        MenConnect = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Commerz: Sistema de administración de ventas, clientes y productos de Angel Hurtado");

        javax.swing.GroupLayout PanelInternoLayout = new javax.swing.GroupLayout(PanelInterno);
        PanelInterno.setLayout(PanelInternoLayout);
        PanelInternoLayout.setHorizontalGroup(
            PanelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PanelInternoLayout.setVerticalGroup(
            PanelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getContentPane().add(PanelInterno, java.awt.BorderLayout.CENTER);

        MenClientes.setText("Clientes");
        MenClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenClientesMouseClicked(evt);
            }
        });
        BarraMenus.add(MenClientes);

        MenProductos.setText("Productos");
        MenProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenProductosMouseClicked(evt);
            }
        });
        BarraMenus.add(MenProductos);

        MenVentas.setText("Ventas");
        MenVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenVentasMouseClicked(evt);
            }
        });
        BarraMenus.add(MenVentas);

        MenConnect.setText("Cambiar conexión...");
        MenConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenConnectMouseClicked(evt);
            }
        });
        BarraMenus.add(MenConnect);

        setJMenuBar(BarraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenClientesMouseClicked
        VIClientes VI = new VIClientes();
        VI.setResizable(true);
        VI.setMaximizable(true);
        VI.setIconifiable(true);
        VI.setClosable(true);
        PanelInterno.add(VI);
        VI.setTitle("Clientes");
        VI.setVisible(true);
    }//GEN-LAST:event_MenClientesMouseClicked

    private void MenProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenProductosMouseClicked
        VIProductos VI = new VIProductos();
        VI.setResizable(true);
        VI.setMaximizable(true);
        VI.setIconifiable(true);
        VI.setClosable(true);
        PanelInterno.add(VI);
        VI.setTitle("Productos");
        VI.setVisible(true);
    }//GEN-LAST:event_MenProductosMouseClicked

    private void MenVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenVentasMouseClicked
        VIVentas VI = new VIVentas();
        VI.setResizable(true);
        VI.setMaximizable(true);
        VI.setIconifiable(true);
        VI.setClosable(true);
        PanelInterno.add(VI);
        VI.setTitle("Ventas");
        VI.setVisible(true);
    }//GEN-LAST:event_MenVentasMouseClicked

    private void MenConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenConnectMouseClicked
        // Cambiar propiedades de conexión
        EditarConexion Editar = new EditarConexion();
        Editar.setVisible(true);
    }//GEN-LAST:event_MenConnectMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenus;
    private javax.swing.JMenu MenClientes;
    private javax.swing.JMenu MenConnect;
    private javax.swing.JMenu MenProductos;
    private javax.swing.JMenu MenVentas;
    private javax.swing.JDesktopPane PanelInterno;
    // End of variables declaration//GEN-END:variables
}