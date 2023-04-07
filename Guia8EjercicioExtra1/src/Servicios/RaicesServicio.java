
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

package Servicios;

import Entidades.Raices;


public class RaicesServicio {
    
    public RaicesServicio() {
    }

    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raices e) {

        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC();
    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices e) {
        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC() > 0;
    }

    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices e) {
        return (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC() == 0;
    }

    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(boolean val, Raices e) {
        double res;
        if (val == true) {
            System.out.println("las dos posibles soluciones son :");
            res = -e.getB() + Math.sqrt(getDiscriminante(e)) / 2 * e.getA();
            System.out.println("soluvion 1 = " + res);

            res = -e.getB() - Math.sqrt(getDiscriminante(e)) / 2 * e.getA();
            System.out.println("solucion 2 = " + res);
        } else {
            System.out.println("no tiene dos resultados");
        }
    }

    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void ObtenerRaiz(boolean val, Raices e) {
        double res;
        if (val == true) {
            res = -e.getB() / (2 * e.getA());
            System.out.println("La unica solucion es " + res);
        } else {
            System.out.println("no hay una unica solucion");
        }
    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones
            que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que 
            devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.*/
    public void calcular(Raices e) {
        if (tieneRaices(e) == true && tieneRaiz(e) == true) {
            System.out.println("Raices =");
            obtenerRaices(true, e);
            System.out.println("Raiz =");
            ObtenerRaiz(true, e);

        }else {System.out.println("No se cumplen las condiciones");}
    }
}

