/**
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y
 * "tipo" (perro, gato, etc.).
 * Crea un constructor para inicializar los valores de las propiedades y un
 * método para mostrar por pantalla la información de la mascota.
 * Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */

package Servicios;

import Entidades.Mascota;
import java.util.Scanner;

public class MascotaServicio {

    Scanner leer = new Scanner(System.in);
    Mascota masc;

    public MascotaServicio() {
        masc = new Mascota();
    }

    public void crearMascota() {
        System.out.print("Nombre: ");
        masc.setNombre(leer.nextLine());
        System.out.print("Edad: ");
        masc.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.print("Raza: ");
        masc.setRaza(leer.nextLine());
        System.out.print("Tipo: ");
        masc.setTipo(leer.nextLine());
    }

    public void cumplirAnios() {
        masc.cumplirAnios();
    }

    public void mostrarMascota() {
        System.out.println("=============================");
        System.out.println("Los datos de la mascota son");
        cumplirAnios(); // Se actualiza la edad
        int edad = masc.getEdad();
        System.out.println("Nombre: " + masc.getNombre());
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + masc.getRaza());
        System.out.println("Tipo: " + masc.getTipo());
    }

}
