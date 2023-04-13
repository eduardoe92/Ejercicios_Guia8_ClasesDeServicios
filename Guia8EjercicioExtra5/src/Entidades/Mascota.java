/**
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y
 * "tipo" (perro, gato, etc.).
 * Crea un constructor para inicializar los valores de las propiedades y un
 * método para mostrar por pantalla la información de la mascota.
 * Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */

package Entidades;

public class Mascota {
    
    private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + ", tipo=" + tipo + '}';
    }
}
