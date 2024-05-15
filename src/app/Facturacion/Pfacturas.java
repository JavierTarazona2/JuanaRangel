/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.Facturacion;

import app.Balances.Balance;
import app.Inicio.Pinicio;
import app.Inventario.Inventarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class Pfacturas extends javax.swing.JPanel {

    private  Inventarios inventarios;
    private Facturas f;
    private final DefaultTableModel modelo;
    private Balance balance;
    private Pinicio inicio;
    public Pfacturas(Inventarios inventarios ,Facturas f, Pinicio inicio,Balance bal) {
        this.inventarios = inventarios;
        this.f = f;
        this.inicio = inicio;
        this.balance = bal;
        initComponents();
        modelo = (DefaultTableModel) listaContenido.getModel();
        setVisible(true);
        refrescarTabla();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        agregarnuevafactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaContenido = new javax.swing.JTable();
        txtValor = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        agregarnuevafactura.setBackground(new java.awt.Color(182, 11, 11));
        agregarnuevafactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarnuevafactura.setForeground(new java.awt.Color(255, 255, 255));
        agregarnuevafactura.setText("Agregar Factura");
        agregarnuevafactura.setBorder(null);
        agregarnuevafactura.setBorderPainted(false);
        agregarnuevafactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarnuevafacturaActionPerformed(evt);
            }
        });

        listaContenido.setAutoCreateRowSorter(true);
        listaContenido.setBackground(new java.awt.Color(255, 255, 255));
        listaContenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaContenido.setForeground(new java.awt.Color(0, 0, 0));
        listaContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "cliente", "Dinero a pagar", "Dinero dado", "Vueltas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaContenido);

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));
        txtValor.setText("Buscar por id o nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(250, 250, 250)
                    .addComponent(agregarnuevafactura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(agregarnuevafactura, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 24, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(200, 200, 200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String valor = txtValor.getText();
            String i = null;
            // Limpiar tabla
            modelo.setRowCount(0);
            for (Factura plt : f.getProductos()) {
                if(valor.equals(Integer.toString(plt.getId()))||valor.equals(plt.getCliente())){
                    Object[] p = {
                        plt.getId(),
                        plt.getCliente(),
                        plt.getDineroPagar(),
                        plt.getDinerodado() };
                    modelo.addRow(p);
                    i="s";
                    break;
                }
                else{
                    i =null;
                }}
                validar(i);
            }catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarnuevafacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarnuevafacturaActionPerformed
        inicio.mostrar(new AgregarFactura(this, inventarios, f,inicio,balance));
    }//GEN-LAST:event_agregarnuevafacturaActionPerformed
    public void validar(String i) {
           if (i == null){ 
            throw new IllegalArgumentException("No se encontro el producto.");
            
        }
       }
    public void refrescarTabla() {
        modelo.setRowCount(0); // Limpia la tabla antes de actualizarla
        for (Factura plt : f.getProductos()) {
            Object[] p = {
                    plt.getId(),
                    plt.getCliente(),
                    plt.getDineroPagar(),
                    plt.getDinerodado(),
                    plt.getDineroDevolver()
            };
            modelo.addRow(p);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarnuevafactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaContenido;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
