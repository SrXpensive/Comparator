import java.util.Comparator;
/**
 * Clase especial que implementa la interfaz Comparator para ordenar facturas por fecha,
 * y en caso de igualdad entre fechas, ordenar por importe
 */
public class CompararFecha implements Comparator<Facturas> {
    /**
     * Método que implementa la comparación entre facturas
     * @param f1 primera factura en ser comparada
     * @param f2 segunda factura en ser comparada
     * @return entero negativo si la primera factura es anterior a la segunda
     *         cero si las facturas son iguales, entonces compara los importes
     *         entero positivo si la segunda factura es anterior a la primera
     */
    @Override
    public int compare(Facturas f1, Facturas f2) {
        if(f1.getFecha().compareTo(f2.getFecha()) == 0) {
            return (int)(f1.getImporte()-f2.getImporte());
        }
        return f1.getFecha().compareTo(f2.getFecha());
    }
}
