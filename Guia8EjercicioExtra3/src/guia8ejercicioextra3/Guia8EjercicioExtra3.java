/**
 Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */


package guia8ejercicioextra3;

import Servicios.CocheServicio;
import java.util.Scanner;

public class Guia8EjercicioExtra3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CocheServicio cars = new CocheServicio();
                
        System.out.print("Ingresa la cantidad de coches que deseas ingresar: ");
        int cantidad = (int) leer.nextInt();
        leer.nextLine();
        
        for (int i = 1; i <= cantidad; i++) {
            cars.crearCoche();
            cars.mostrarCoche();
        }
        
    }

}