
package herencia01;


public class Estudiante extends Persona{
    
    String carrera;
    
    public Estudiante(String nombre, String apellido, String carrera) {
        super(nombre, apellido);
        this.carrera = carrera;
    }
    
    
    //To String

    @Override
    public String toString() {
        
        return apellido+" "+nombre;
    }
    
    
    
}
