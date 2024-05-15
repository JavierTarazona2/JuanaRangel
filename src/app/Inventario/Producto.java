
package app.Inventario;


import java.time.LocalDate;

public class Producto {
    private Integer id;
    private String nombre;
    private Double costo;
    private Double precio;
    private LocalDate fechaIngreso;
    private LocalDate fechaVencimiento;
    private Integer  cantidad;

    public Producto(Integer id, String nombre, Double costo, Double precio, LocalDate fechaIngreso, LocalDate fechaVencimiento, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    public void modificarCantidad(Integer cant){
        cantidad = cantidad -cant;
    }
}
    
