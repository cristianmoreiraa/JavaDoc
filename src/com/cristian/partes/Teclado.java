
package com.cristian.partes;

/**
 *
 * @author dam1
 */
public class Teclado {
    
        //atributo
    private String marca;
    
        //constructor
    /**
     * 
     * @param marca 
     */
    public Teclado(String marca) {
        this.marca = marca;
    }
    
        //getter & setters
    /**
     * 
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

        //toString
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Teclado" + " marca= " + marca ;
    }


    
    
}
