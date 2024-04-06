import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    static ArrayList<Facturas> facturas = new ArrayList<>();
    public static void main(String[] args) {
        Facturas f1 = new Facturas(1,new Date(124, 6,17), (float)32.3);
        Facturas f2 = new Facturas(2,new Date(123,3,21),(float)32.3);
        Facturas f3 = new Facturas(3,new Date(122,2,19),(float)42.7);
        Facturas f4 = new Facturas(4,new Date(122,8,7),(float)35.9);
        Facturas f5 = new Facturas(5,new Date(123,4,21),(float)75.4);
        facturas.add(f1);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);
        facturas.add(f5);
        System.out.println("1. Mayor factura según importe, y en su defecto según fecha");
        if(new CompararImporte().compare(f1,f2)<0){
            System.out.println(f2);
        }else System.out.println(f1);
        System.out.println("2. Lista ordenada según número de factura: ");
        Collections.sort(facturas,new CompararNumero());
        for(Facturas f:facturas){
            System.out.println(f);
        }
        System.out.println("----------");
        System.out.println("3. Lista ordenada según Fecha: ");
        Collections.sort(facturas,new CompararFecha());
        for(Facturas f:facturas){
            System.out.println(f);
        }
        System.out.println("----------");
        System.out.println("4. Lista ordenada según importe: ");
        Collections.sort(facturas,new CompararImporte());
        for(Facturas f:facturas){
            System.out.println(f);
        }

    }
}
