/**
* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
* Crea un método para calcular la nota media de un grupo de estudiantes y otro para
* mostrar por pantalla los estudiantes que tienen una nota media superior.
 */

package Entidades;

public class Estudiante {
    
   public String nombre;
    public int edad;
    public int notaMedia;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }
    
}
