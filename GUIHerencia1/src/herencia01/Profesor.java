
package herencia01;


public class Profesor extends Persona{
    String facultad;
    private String materia;

    public Profesor(String nombre, String apellido, String facultad, String materia) {
        super(nombre, apellido);
        this.facultad = facultad;
        this.materia = materia;
    }

    //Getters y Setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    //To String

    @Override
    public String toString() {
        return materia;
    }
    
    
    
}
