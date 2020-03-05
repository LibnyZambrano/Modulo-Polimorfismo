/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Libny Zambrano
 */
public class Formas {
    
    private String color;
    private String dibujar;
    public String calcularradio;
    public String calculararea;
    
    
    public Formas(){
        
    }
 
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return this.color;
    }
      public void setDibujar(String dibujar){
        this.dibujar=dibujar;
    }
    
    public String getDibujar(){
        return this.dibujar;
    }
    
    public void setCalcularRadio(String calcularradio){
        this.calcularradio=calcularradio;
    }
    
    public String getCalcularRadio(){
        return this.calcularradio;
    }
    
    public void setCalcularArea(String calculararea){
        this.calculararea=calculararea;
    }
    
    public String getCalcularArea(){
        return this.calculararea;
    }
    
    public void ImprimirFormas(){
        System.out.println(dibujar);
        
    }
    
}
