
package app.Facturacion;

import java.util.ArrayList;

public class Facturas {
     private static Facturas instancia = null;
    ArrayList<Factura> facturas = new ArrayList<>();

    public Facturas() {
    }
    public static Facturas obtenerInstancia() { // Método estático para obtener la instancia única
        if (instancia == null) {
            instancia = new Facturas(); // Si la instancia es null, crea una nueva
        }
        return instancia; // Retorna la instancia existente
    }
    public ArrayList<Factura> getProductos() {
        return facturas;
    }

}

