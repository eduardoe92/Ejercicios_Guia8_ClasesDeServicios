/**
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y
 * "tipo" (perro, gato, etc.).
 * Crea un constructor para inicializar los valores de las propiedades y un
 * método para mostrar por pantalla la información de la mascota.
 * Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
package guia8ejercicioextra5;

import Servicios.MascotaServicio;
import java.util.Scanner;

public class Guia8EjercicioExtra5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        MascotaServicio mascota = new MascotaServicio();

        System.out.print("Ingrese la cantidad de mascotas a ingresar: ");
        int cantidad = (int) leer.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("=============================");
            System.out.println("Ingrese los datos de la mascota " + i);
            mascota.crearMascota();
            mascota.mostrarMascota();
        }
    }

}
