/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.Inventario;
import java.util.ArrayList;

public class Inventarios {
    private static Inventarios instancia = null;
    ArrayList<Producto> productos = new ArrayList<>();

    public Inventarios() {
    }
    public static Inventarios obtenerInstancia() { // Método estático para obtener la instancia única
        if (instancia == null) {
            instancia = new Inventarios(); // Si la instancia es null, crea una nueva
        }
        return instancia; // Retorna la instancia existente
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }

}
