
package herencia01;

public class Materias {
    
    private String nombre;

    //Metodo contructor
    public Materias(String nombre) {
        this.nombre = nombre;
    }
    

    //Metodos setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //To String

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
    
    
}
