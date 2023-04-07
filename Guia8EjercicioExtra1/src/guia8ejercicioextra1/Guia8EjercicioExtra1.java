
/**
 Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor. Luego, en
RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */

package guia8ejercicioextra1;

import Entidades.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

public class Guia8EjercicioExtra1 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
        Raices e = new Raices();
        RaicesServicio es = new RaicesServicio();
        boolean vali = false;

        System.out.println("ingrese los datos de la ecuacion");
        System.out.println("A");
        e.setA(leer.nextDouble());
        System.out.println("B");
        e.setB(leer.nextDouble());
        System.out.println("C");
        e.setC(leer.nextDouble());

        while (!vali) {
            System.out.println("        Menu       ");
            System.out.println(" _________________ ");
            System.out.println("|1. Discriminante |");
            System.out.println("|2. Tiene Raices  |");
            System.out.println("|3. Tiene Raiz    |");
            System.out.println("|4. Obtener Raices|");
            System.out.println("|5. Obtener Raiz  |");
            System.out.println("|6. Calcular      |");
            System.out.println("|7. Salir         |");
            System.out.println("|_________________|");

            int op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Discriminante =" + es.getDiscriminante(e));
                    break;
                case 2:
                    System.out.println(es.tieneRaices(e));
                    break;
                case 3:
                    System.out.println(es.tieneRaiz(e));
                    break;
                case 4:
                    es.obtenerRaices(es.tieneRaices(e), e);
                    break;
                case 5:
                    es.ObtenerRaiz(es.tieneRaiz(e), e);
                    break;
                case 6:
                    es.calcular(e);
                    break;
                case 7:
                    vali = true;
                    System.out.println("END");
                    break;
                default:
                    System.out.println("opcion incorrecta op (1 - 7)");

            }

        }

    }

}