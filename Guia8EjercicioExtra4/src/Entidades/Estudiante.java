/**
* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
* Crea un método para calcular la nota media de un grupo de estudiantes y otro para
* mostrar por pantalla los estudiantes que tienen una nota media superior.
 */

package Entidades;

public class Estudiante {
    
    private String nombre;
    private int edad;
    private float notaMedia;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, float notaMedia) {
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

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
}
