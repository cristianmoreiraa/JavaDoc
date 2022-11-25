
package com.cristian.partes;


public class CPU {
    
        //atributo
    
    private int velocidade;
    
        //constructor
    /**
     * 
     * @param velocidade 
     */
    public CPU(int velocidade) {
        this.velocidade = velocidade;
    }
    
    /**
     * 
     * @return velocidade
     */
        //getters & setters
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * 
     * @param velocidade 
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

        //toString
    /**
     * 
     * @return toString
     */
    @Override
    public String toString() {
        return "CPU " + "velocidade= " + velocidade;
    }
    
    
}
