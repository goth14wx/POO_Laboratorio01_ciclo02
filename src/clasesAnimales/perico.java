/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAnimales;

/**
 *
 * @author monica
 */
public class perico extends Animal{
    
    public perico(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.especie = raza;
    }
    
    
    public void hacerRuido(){
    
        this.hacerRuido("/sounds/perico.wav");
        
    }
    
}
