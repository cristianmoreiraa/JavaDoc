
package boletin14;

import com.cristian.partes.CPU;
import com.cristian.partes.Monitor;
import com.cristian.partes.Teclado;


public class Ordenador {
    
            //atributo
    
    
       private float precio;
       private Monitor mo;
       private Teclado te;
       private CPU Pro;

/**
 * 
 * @param precio
 * @param mo
 * @param te
 * @param Pro 
 */
       //constructor
    public Ordenador(float precio, Monitor mo, Teclado te, CPU Pro) {
        this.precio = precio;
        this.mo = mo;
        this.te = te;
        this.Pro = Pro;
    }
    
    
        //setter & getters
    
    /**
     * 
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * 
     * @return mo
     */
    public Monitor getMo() {
        return mo;
    }

    /**
     * 
     * @return te
     */
    public Teclado getTe() {
        return te;
    }
    
    /** 
     * 
     * @return Pro
     */
    public CPU getPro() {
        return Pro;
    }

    /**
     * 
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * 
     * @param mo 
     */
    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    /**
     * 
     * @param te 
     */
    public void setTe(Teclado te) {
        this.te = te;
    }

    /**
     * 
     * @param Pro 
     */
    public void setPro(CPU Pro) {
        this.Pro = Pro;
    }

    
        //toString
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Ordenador " + " precio= " + precio + mo + te + Pro;
    }
    
    
    
       
       
    
    
}
