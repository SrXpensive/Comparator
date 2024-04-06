import java.util.Comparator;
/**
 * Clase especial que implementa la interfaz Comparator para ordenar facturas por importe,
 * y en caso de ser del mismo importe, ordenar por fecha
 */
public class CompararImporte implements Comparator<Facturas> {
    /**
     * Método que implementa la comparación entre facturas
     * @param f1 primera factura en ser comparada
     * @param f2 segunda factura en ser comparada
     * @return entero negativo si el importe de la primera factura es menor que la segunda
     *         cero si las facturas son del mismo importe, entonces compara por fecha
     *         entero positivo si el importe de la primera factura es mayor que la segunda
     */
    @Override
    public int compare(Facturas f1, Facturas f2) {
        if(f1.getImporte() == f2.getImporte()){
            return f1.getFecha().compareTo(f2.getFecha());
        }
        return (int)(f1.getImporte()-f2.getImporte());
    }
}
