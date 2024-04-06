import java.util.Date;

/**
 * Clase Facturas, de la cual vamos a comparar instancias
 */
public class Facturas {
    private int numero;
    private Date fecha;
    private float importe;

    /**
     * Método constructor para la clase Facturas
     * @param numero el número de la factura
     * @param fecha la fecha de la factura
     * @param importe el importe de la factura
     */
    public Facturas(int numero, Date fecha, float importe){
        this.numero = numero;
        this.importe = importe;
        this.fecha = fecha;
    }

    /**
     * Método para acceder al número de la factura
     * @return el número de la factura, tipo entero
     */
    public int getNumero(){
        return numero;
    }

    /**
     * Método para acceder a la fecha de la factura
     * @return la fecha de la factura, de tipo Date
     */
    public Date getFecha(){
        return fecha;
    }

    /**
     * Método para acceder al importe de la factura
     * @return el importe de la factura, de tipo float
     */
    public float getImporte(){
        return importe;
    }
    public String toString(){
        return "Factura nº: "+getNumero()+", Fecha: "+getFecha()+", Importe: "+getImporte();
    }
}

