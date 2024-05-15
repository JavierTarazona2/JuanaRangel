/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.Inventario;

import app.Balances.Balance;
import app.Inicio.Pinicio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class pInventario extends javax.swing.JPanel {
    public Pinicio inicio;
    private  Inventarios inventarios ;
    private final DefaultTableModel modelo;
    private Balance bal;
    public pInventario(Inventarios inventarios,Pinicio inicio,Balance balance) {
        this.bal = balance;
        this.inicio = inicio;
        this.inventarios = inventarios;
        initComponents();
       modelo = (DefaultTableModel) listaContenido.getModel();
       refrescarTabla();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaContenido = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValor.setText("Buscar por id o nombre");

        jButton1.setBackground(new java.awt.Color(182, 11, 11));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaContenido.setAutoCreateRowSorter(true);
        listaContenido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Valor", "Precio", "Fecha Vencimiento", "Fecha Ingreso", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaContenido.setGridColor(new java.awt.Color(255, 255, 255));
        listaContenido.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(listaContenido);

        jButton2.setBackground(new java.awt.Color(182, 11, 11));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar ");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String valor = txtValor.getText();
            String i = "s";
            // Limpiar tabla
            modelo.setRowCount(0);
            for(Producto plt :inventarios.productos){
                if(valor.equals(Integer.toString(plt.getId()))||valor.equals(plt.getNombre())){
                    Object[] py = {
                        plt.getId(),
                        plt.getNombre(),
                        plt.getCosto(),
                        plt.getPrecio(),
                        plt.getFechaVencimiento(),
                        plt.getFechaIngreso(),
                        plt.getCantidad()   
                    };
                    modelo.addRow(py);
                    
                    i =null;
                    break;
                }
                else{
                    i ="ew";
                }}
                validar(i);
            }catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
                refrescarTabla();
            }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        inicio.mostrar(new AgregarProducto(inventarios,this,inicio,bal));
    }//GEN-LAST:event_jButton2ActionPerformed

   public void validar(String i) {
           if (i != null){ 
            throw new IllegalArgumentException("No se encontro el producto.");
            
        }
       }
    public void refrescarTabla() {
        modelo.setRowCount(0); // Limpia la tabla antes de actualizarla
        for (Producto plt : inventarios.getProductos()) {
            Object[] p = {
                    plt.getId(),
                    plt.getNombre(),
                    plt.getCosto(),
                    plt.getPrecio(),
                    plt.getFechaVencimiento(),
                    plt.getFechaIngreso(),
                    plt.getCantidad()
            };
            modelo.addRow(p);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaContenido;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
