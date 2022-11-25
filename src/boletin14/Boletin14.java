/**
 * Boletín14
 * @author CristianMA
 * @version 1.1
 */
package boletin14;

import com.cristian.partes.CPU;
import com.cristian.partes.Monitor;
import com.cristian.partes.Teclado;

public class Boletin14 {

    /*
    
        amosar: todos os datos, precio, marca, velocidade.
    
    */
    
    public static void main(String[] args) {
        CPU obj1 = new CPU(4750);
    
            //ver todos los datos
        Ordenador obj = new Ordenador(1500, new Monitor(24f), new Teclado("Razer"), obj1);
    
        System.out.println(obj.toString());
        
            //ahora ver solo 
            
        System.out.println("\n");
        System.out.println("Datos separados:");
        System.out.println("\n");
        System.out.println(obj1);
        System.out.println("\n");
        System.out.println(obj.getMo());
        System.out.println("\n");
        System.out.println(obj.getTe());
        System.out.println("\n");
        System.out.println("Precio= "+obj.getPrecio());
        System.out.println("\n");
    }
    
    
}
