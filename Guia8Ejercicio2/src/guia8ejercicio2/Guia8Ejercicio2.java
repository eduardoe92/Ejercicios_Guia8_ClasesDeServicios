
/**
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */

package guia8ejercicio2;

import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Guia8Ejercicio2 {

    public static void main(String[] args) {
        boolean menu = true;
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cafecin = new CafeteraServicio();
        do {
            System.out.println("Bienvenido a su cafetera Nespresso");
            System.out.println("Introduzca la opción:");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Café");
            System.out.println("5. Salir");

            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    cafecin.llenarCafetera();
                    break;
                case 2:
                    cafecin.servirTaza();
                    break;
                case 3:
                    cafecin.vaciarCafetera();
                    break;
                case 4:
                    cafecin.agregarCafe(0);
                    break;
                case 5:
                    System.out.println("\nMuchas gracias! \nQue disfrute su café\n------------------");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        } while (menu);

    }

}