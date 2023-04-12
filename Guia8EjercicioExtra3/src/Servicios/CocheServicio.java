/**
 Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */

package Servicios;

import Entidades.Coche;
import java.util.Scanner;

public class CocheServicio {
    
    Scanner leer = new Scanner(System.in);
    Coche car = new Coche();
    
    public void crearCoche(){
        
        System.out.println("=====================================");
        System.out.print("Ingresa la marca del coche: ");
        car.setMarca(leer.nextLine());
        
        System.out.print("Ingresa el modelo del coche: ");
        car.setModelo(leer.nextLine());
        
        System.out.print("Ingresa el precio del coche: ");
        car.setPrecio(leer.nextFloat());
        leer.nextLine();
    }
    
    public void mostrarCoche(){
        System.out.println("=====================================");
        System.out.println("La marca del coche es: " + car.getMarca());
        System.out.println("El modelo es: " +car.getModelo());
        System.out.println("Tiene un precio de: $" +car.getPrecio());
    }
}
