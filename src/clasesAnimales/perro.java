package clasesAnimales;


/**
 *
 * @author monica
 */
public class perro extends Animal{
    

    public perro(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.especie = raza;
    }
    
    public void ladrar(){
        
        this.hacerRuido("/sounds/dog-bark.wav");
        
    }
    
        public void correr(){
        
            this.hacerRuido("/sounds/dog-run.wav");        
    }
        
        
    
}
