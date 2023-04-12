/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los
 * valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
 * como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
 * para construir el objeto a través de un método constructor. Luego, en
 * RaicesServicio las operaciones que se podrán realizar son las siguientes:
 * a) Método getDiscriminante(): devuelve el valor del discriminante
 * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
 * b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
 * soluciones, para que esto ocurra, el discriminante debe ser mayor o
 * igual que 0.
 * c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
 * única solución, para que esto ocurra, el discriminante debe ser igual
 * que 0.
 * d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
 * imprime las 2 posibles soluciones.
 * e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
 * una única raíz. Es en el caso en que se tenga una única solución
 * posible.
 * f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
 * y mostrará por pantalla las posibles soluciones que tiene nuestra
 * ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
 * que devuelvan nuestros métodos y en caso de no existir solución, se
 * mostrará un mensaje.
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
 * el signo delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    private final Raices r = new Raices();

    public void inicializarRaiz() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar A");
        r.setA(leer.nextDouble());
        System.out.println("Ingresar B");
        r.setB(leer.nextDouble());
        System.out.println("Ingresar C");
        r.setC(leer.nextDouble());
    }

    public double getDiscriminante() {
        //(b^2)-4*a*c
        return (r.getB() * r.getB()) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaiz() {
        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        System.out.println(a + b + c);
        double pot = Math.pow(r.getB(), 2);
        System.out.println("pot:" + pot);
        double sqr = Math.sqrt(pot - 4 * r.getA() * r.getC());
        System.out.println("sqr:" + sqr);
        double z = (-r.getB() + sqr) / 2 * r.getA();

        //double z=(-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/2*a;
        System.out.println("raiz:" + z);
    }

    public void obtenerRaices() {
        System.out.println((-r.getB() + (Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()))) / (2 * r.getA()));
        System.out.println((-r.getB() - (Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()))) / (2 * r.getA()));

    }

    public void calcular() {
        if (tieneRaices()) {
            System.out.println("Se han obtenido las raices: ");
            obtenerRaices();
        } else if (tieneRaiz()) {
            System.out.println("Se ha obtenido la raiz: ");
            obtenerRaiz();
        } else {
            System.out.println("Los valores ingresados nunca tocan el Eje X");
        }
    }

}
