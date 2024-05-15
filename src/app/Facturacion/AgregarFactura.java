/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.Facturacion;

import app.Balances.Balance;
import app.Inicio.Pinicio;
import app.Inventario.Inventarios;
import app.Inventario.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class AgregarFactura extends javax.swing.JPanel {
    private  DefaultTableModel modelo = null;
    private Pinicio inicio;
    private final  Inventarios inventarios;
    private final Facturas f;
    private final Pfacturas lista;
    public Balance balance;
    Factura fq = new Factura();
    public AgregarFactura(Pfacturas lista,Inventarios inventarios,Facturas f,Pinicio inicio , Balance balance) {
        this.inicio = inicio;
        this.balance = balance;
        initComponents();
        this.inventarios = inventarios;
        this.f=f;
        this.lista= lista;
//    this.balance = bal;
        modelo = (DefaultTableModel) listapro.getModel();   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pagar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapro = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        btnCancelarFactura = new javax.swing.JButton();
        btnAgregarFactura = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPaga = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Factura");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre Cliente");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Producto(id o nombre)");

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad que desea");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total a pagar");

        pagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pagar.setForeground(new java.awt.Color(0, 0, 0));
        pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagar.setText("pagar");

        listapro.setBackground(new java.awt.Color(255, 255, 255));
        listapro.setForeground(new java.awt.Color(0, 0, 0));
        listapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Precio unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listapro);

        btnbuscar.setBackground(new java.awt.Color(182, 11, 11));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Añadir");
        btnbuscar.setBorder(null);
        btnbuscar.setBorderPainted(false);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnCancelarFactura.setBackground(new java.awt.Color(182, 11, 11));
        btnCancelarFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarFactura.setText("Cancelar");
        btnCancelarFactura.setBorder(null);
        btnCancelarFactura.setBorderPainted(false);
        btnCancelarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFacturaActionPerformed(evt);
            }
        });

        btnAgregarFactura.setBackground(new java.awt.Color(182, 11, 11));
        btnAgregarFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFactura.setText("Agregar");
        btnAgregarFactura.setBorder(null);
        btnAgregarFactura.setBorderPainted(false);
        btnAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFacturaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dinero Pagado");

        txtPaga.setBackground(new java.awt.Color(255, 255, 255));
        txtPaga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaga.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCantidad)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPaga, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try{
            String valor = txtValor.getText();
            String i = null;
            // Limpiar tabla
            modelo.setRowCount(0);
            Integer cantidad = Integer.valueOf(txtCantidad.getText());
            for(Producto plt : inventarios.getProductos()){
                if(valor.equals(Integer.toString(plt.getId()))||valor.equals(plt.getNombre())){
                    fq.agregarlista(plt, cantidad);
                    refrescarTabla();
                    i=" ";
                    break;
                }
                else{
                    i =null;
                }}
                validar(i);
                 refrescarTabla();
            }catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnCancelarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFacturaActionPerformed
        inicio.mostrar(lista);
    }//GEN-LAST:event_btnCancelarFacturaActionPerformed

    private void btnAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacturaActionPerformed
        fq.setCliente(txtNombre.getText());
        fq.setId(f.facturas.size()+1);
        fq.setDinerodado(Double.valueOf(txtPaga.getText()));
        f.facturas.add(fq);
        lista.refrescarTabla();
        actualizarinventario();
        balance.agregarganancia(fq.dineroPagar,fq.cliente,fq.cantidades.size());
        inicio.mostrar(lista);
   
    }//GEN-LAST:event_btnAgregarFacturaActionPerformed
       public void validar(String i) {
           if (i == null){ 
            throw new IllegalArgumentException("No se encontro el producto.");
            
        }
       }
    public void refrescarTabla() {
        Integer i= 0;
        modelo.setRowCount(0); // Limpia la tabla antes de actualizarla
        for (Producto plt : fq.getProductos()) {
            Integer s = fq.getCantidades().get(i);
            i= +1;
            Object[] p = {
                    plt.getId(),
                    plt.getNombre(),
                    s,
                    plt.getPrecio(),
                    s*plt.getPrecio()
            };
            modelo.addRow(p);
        }
        pagar.setText(Double.toString(fq.getDineroPagar()));
    }
    public void actualizarinventario(){
        Integer i= 0;
        for (Producto plt : fq.getProductos()) {
            Integer s = fq.getCantidades().get(i);
            i= +1;
            for(Producto psa: inventarios.getProductos()){
                if(plt.getNombre().equals(psa.getNombre())){
                 psa.modificarCantidad(s);
                } 
            }}
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarFactura;
    private javax.swing.JButton btnCancelarFactura;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listapro;
    private javax.swing.JLabel pagar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaga;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
