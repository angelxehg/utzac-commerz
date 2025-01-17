/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import core.ConvertirFecha;
import core.MySQLConexion;
import core.Ventas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class VIVentas extends javax.swing.JInternalFrame {

    String Busqueda = "";
    String Desde = "1900-01-01";
    String Hasta = "2100-01-01";
    int IDSeleccionado;
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    /**
     * Creates new form VIVentas
     */
    public VIVentas() {
        initComponents();
        ModeloTabla.addColumn("ID");
        ModeloTabla.addColumn("Cliente");
        ModeloTabla.addColumn("Producto");
        ModeloTabla.addColumn("Cantidad");
        ModeloTabla.addColumn("Fecha");
        ModeloTabla.addColumn("Subtotal");
        ModeloTabla.addColumn("IVA");
        ModeloTabla.addColumn("Total");
        ModeloTabla.addColumn("Estado");
        TablaPrincipal.setDefaultEditor(Object.class, null);
        TablaPrincipal.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if ( TablaPrincipal.getSelectedRow() >= 0 ) {
                    IDSeleccionado = (int) TablaPrincipal.getValueAt(TablaPrincipal.getSelectedRow(), 0);
                } else {
                    IDSeleccionado = 0;
                }
            }
        });
        BusquedaDatos();
    }
    private void BusquedaDatos() {
        List<Object[]> R = Ventas.Buscar(Busqueda, Desde, Hasta);
        if (R != null) {
            TablaPrincipal.clearSelection();
            ModeloTabla.setRowCount(0);
            IDSeleccionado = 0;
            for (Object[] FilaActual : R) {
                ModeloTabla.addRow(FilaActual);
            }
            TablaPrincipal.setModel(ModeloTabla);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron Ventas");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtDesde = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtHasta = new javax.swing.JFormattedTextField();
        BtnBuscar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrincipal = new javax.swing.JTable();

        TxtBuscar.setToolTipText("Buscar...");

        jLabel1.setText("de");

        TxtDesde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TxtDesde.setText("1/1/1900");

        jLabel2.setText("a");

        TxtHasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TxtHasta.setText("31/12/2100");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCancelar)
                        .addComponent(BtnAgregar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnBuscar)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        Busqueda = TxtBuscar.getText();
        Desde = ConvertirFecha.NormalASQL(TxtDesde.getText());
        Hasta = ConvertirFecha.NormalASQL(TxtHasta.getText());
        // Hacer la busqueda
        BusquedaDatos();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        VentasAgregar Agregar = new VentasAgregar();
        Agregar.setVisible(true);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if (IDSeleccionado > 0) {
            Ventas.Cancelar(IDSeleccionado);
        } else {
            JOptionPane.showMessageDialog(null, "Primero seleccione un producto a eliminar");
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JTable TablaPrincipal;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JFormattedTextField TxtDesde;
    private javax.swing.JFormattedTextField TxtHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
