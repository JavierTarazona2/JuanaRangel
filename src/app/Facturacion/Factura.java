
package app.Facturacion;

import app.Inventario.*;
import java.util.ArrayList;

public class Factura {
    public Inventarios inventarios =  Inventarios.obtenerInstancia();
    String cliente;
    Integer id;
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Integer> cantidades= new ArrayList<>();// cantidad del producto que va llegar  //respecto a unidad de medida, va ser con un combox
    Double dineroPagar;
    Double dineroDevolver;
    Double dinerodado;

    public Factura() {
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDinerodado(Double dinerodado) {
        this.dinerodado = dinerodado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }
    
    public void agregarlista(Producto p, Integer c){
        productos.add(p);
        cantidades.add(c);
    }
    public String getCliente() {
        return cliente;
    }

    public Integer getId() {
        return id;
    }

    public Double getDineroDevolver() {
        this.dineroDevolver= dinerodado -dineroPagar;
        return dineroDevolver;
    }

    public Double getDinerodado() {
        return dinerodado;
    }
    public Double getDineroPagar(){
        Double pagar = 0.0;
        Integer cantidad= 0;
        for(Producto p: productos){
            pagar +=  p.getPrecio()* cantidades.get(cantidad);
            cantidad = + 1;}
        this.dineroPagar = pagar;
        return pagar;
    }
    public ArrayList<String> getNombres(){
        ArrayList<String> nombre = new ArrayList<>();
        for(Producto p : productos){
            nombre.add(p.getNombre());
        }
        return nombre;
    }
    
}