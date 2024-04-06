import java.util.Comparator;

/**
 * Clase especial que implementa la interfaz Comparator para ordenar facturas por número
 */
public class CompararNumero implements Comparator<Facturas> {
    /**
     * Método que implementa la comparación entre facturas
     * @param f1 primera factura en ser comparada
     * @param f2 segunda factura en ser comparada
     * @return entero negativo si la primera factura es menor que la segunda
     *         cero si las facturas son iguales
     *         entero positivo si la segunda factura es mayor que la primera
     */
    @Override
    public int compare(Facturas f1, Facturas f2) {
        return f1.getNumero()-f2.getNumero();
    }
}
