
package app.Balances;

import java.util.ArrayList;

public class Balance {
    private ArrayList<Double> gasto = new ArrayList<> ();
    private ArrayList<Double> ganancia= new ArrayList<> ();
    private final ArrayList<String> detallesGasto = new ArrayList<>();
    private final ArrayList<String> detallesGanancia = new ArrayList<>();
    private Double utilidad;

    public Balance() {
    }

    public Balance(Double utilidad) {
        this.utilidad = utilidad;
    }
    public void agregargasto (Double gastos,String nombre , Integer cantidad ){
        gasto.add(gastos);
        String es = "Detalle "+ nombre + "Cantidad " + cantidad;
        detallesGasto.add(es);
    }
    public void agregarganancia (Double ganancias ,String nombre , Integer cantidad ){
        ganancia.add(ganancias);
        String es = "Detalle "+ nombre + "Cantidad " + cantidad;
        detallesGanancia.add(es);
    }
    public ArrayList<Double> getGasto() {
        return gasto;
    }

    public ArrayList<Double> getGanancia() {
        return ganancia;
    }

    public ArrayList<String> getDetallesGasto() {
        return detallesGasto;
    }

    public ArrayList<String> getDetallesGanancia() {
        return detallesGanancia;
    }

    public Double getUtilidad() {
        Double gastos = 0.0;
        Double ganancias = 0.0;
        for(Double f : gasto){
            gastos += f;
        }
        for(Double g: ganancia){
            ganancias += g;
        }
        this.utilidad = ganancias - gastos;
        return utilidad;
    }
    
    
 
}
