/**
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
 * con su correspondiente letra (NIF). Los atributos serán el número de DNI
 * (entero largo) y la letra (String o char) que le corresponde. En NIFService
 * se dispondrá de los siguientes métodos:
 * a) Métodos getters y setters para el número de DNI y la letra.
 * b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
 * letra que le corresponderá. Una vez calculado, le asigna la letra que
 * le corresponde según
 * c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
 * guion y la letra en mayúscula; por ejemplo: 00395469-F).
 * La letra correspondiente al dígito verificador se calculará a traves de un
 * método que funciona de la siguiente manera: Para calcular la letra se
 * toma el resto de dividir el número de DNI por 23 (el resultado debe ser
 * un número entre 0 y 22). El método debe buscar en un array (vector) de
 * caracteres la posición que corresponda al resto de la división para
 * obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 * POSICIÓN LETRA
 * 0 T
 * 1 R
 * 2 W
 * 3 A
 * 4 G
 * 5 M
 * 6 Y
 * 7 F
 * 8 P
 * 9 D
 * 10 X
 * 11 B
 * 12 N
 * 13 J
 * 14 Z
 * 15 S
 * 16 Q
 * 17 V
 * 18 H
 * 19 L
 * 20 C
 * 21 K
 * 22 E
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {

    Scanner leer = new Scanner(System.in);
    NIF dato = new NIF();

    public void crearNIF() {
        System.out.print("Ingrese el número de tu DNI: ");
        dato.setNumDNI(leer.nextLong());

        long x = dato.getNumDNI();
        int numNIF = (int) (x % 23);

        //System.out.println(numNIF);
        switch (numNIF) {
            case 0:
                dato.setLetra("T");
                break;
            case 1:
                dato.setLetra("R");
                break;
            case 2:
                dato.setLetra("W");
                break;
            case 3:
                dato.setLetra("A");
                break;
            case 4:
                dato.setLetra("G");
                break;
            case 5:
                dato.setLetra("M");
                break;
            case 6:
                dato.setLetra("Y");
                break;
            case 7:
                dato.setLetra("F");
                break;
            case 8:
                dato.setLetra("P");
                break;
            case 9:
                dato.setLetra("D");
                break;
            case 10:
                dato.setLetra("X");
                break;
            case 11:
                dato.setLetra("B");
                break;
            case 12:
                dato.setLetra("N");
                break;
            case 13:
                dato.setLetra("J");
                break;
            case 14:
                dato.setLetra("Z");
                break;
            case 15:
                dato.setLetra("S");
                break;
            case 16:
                dato.setLetra("Q");
                break;
            case 17:
                dato.setLetra("V");
                break;
            case 18:
                dato.setLetra("H");
                break;
            case 19:
                dato.setLetra("L");
                break;
            case 20:
                dato.setLetra("C");
                break;
            case 21:
                dato.setLetra("K");
                break;
            case 22:
                dato.setLetra("E");
                break;
            default:
                System.out.println("El dato ingresado no es válido");
        }
    }
    
    public void mostrar(){
        
        System.out.println("Su número de DNI con NIF es: "  + dato.getNumDNI() + "-" + dato.getLetra());
        
    }

}
