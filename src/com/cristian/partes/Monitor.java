
package com.cristian.partes;



public class Monitor {
    
        //atributo
    private float Pulgadas;
        
        //constructor
    /**
     * 
     * @param Pulgadas 
     */
    public Monitor(float Pulgadas) {
        this.Pulgadas = Pulgadas;
    }
    
        //setters & getters
    /**
     * 
     * @return 
     */
    public float getPulgadas() {
        return Pulgadas;
    }

    /**
     * 
     * @param Pulgadas 
     */
    public void setPulgadas(float Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

        //toString
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "Monitor " + "Pulgadas= " + Pulgadas;
    }
    
    
}
