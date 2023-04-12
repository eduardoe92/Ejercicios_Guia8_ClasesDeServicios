/**
Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual"
* si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual"
* si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea
* ir y que modifique la propiedad "pisoActual" *para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el
* comportamiento del ascensor *moviéndolo hacia arriba y hacia abajo, yendo a un piso 
* específico, y mostrando en pantalla el piso actual después de cada movimiento.
 */

package guia8ejercicioextra6;

import java.util.Scanner;
import Servicios.AscensorServicio;

public class Guia8EjercicioExtra6 {

    public static void main(String[] args) {
        AscensorServicio ax = new AscensorServicio();
        Scanner leer = new Scanner(System.in);
        ax.creaAscensor();
        boolean salir = false;
        while (!salir) {
            int menu;
            System.out.println("Bienvenido!");
            System.out.println("=============================================");
            System.out.println("1. Escriba el número de piso al que quiere ir 0-10");
            System.out.println("2. Presione para subir un piso");
            System.out.println("3. Presione para bajar un piso");
            System.out.println("4. Salir");
            System.out.println("=============================================");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introduzca el piso al que quiere ir");
                    int piso = leer.nextInt();
                    
                    if (piso <= 10 && piso >= 0) {
                        ax.irA(piso);
                    }else {
                        System.out.println("Piso inválido");
                    }
                    break;
                case 2:
                    ax.subir();
                    break;
                case 3:
                    ax.bajar();
                    break;
                case 4:
                    System.out.println("Hasta Luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}