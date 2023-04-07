/**
 * Realizar una clase llamada Persona en el paquete de entidades que
 * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
 * para mujer), peso y altura. Si desea añadir algún otro
 * atributo, puede hacerlo. Agregar constructores, getters y setters.
 * En el paquete Servicios crear PersonaServicio con los siguientes 3
 * métodos:
 * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
 * función devuelve un booleano.
 * b) Metodo crearPersona(): el método crear persona, le pide los valores
 * de los atributos al usuario y después se le asignan a sus respectivos
 * atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H o M. Si no es correcto se
 * deberá mostrar un mensaje
 * Método calcularIMC(): calculara si la persona está en su peso ideal
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
 * valor menor que 20, significa que la persona está por debajo de su
 * peso ideal y la función devuelve un -1. Si la fórmula da por resultado
 * un número entre 20 y 25 (incluidos), significa que la persona está en
 * su peso ideal y la función devuelve un 0. Finalmente, si el resultado
 * de la fórmula es un valor mayor que 25 significa que la persona tiene
 * sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente:
 * ● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la
 * persona está en su peso ideal, tiene sobrepeso o está por debajo de su
 * peso ideal e indicar para cada objeto si la persona es mayor de edad.
 * ● Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables(arrays), para después calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso,
 * cuantas en su peso ideal y cuantos, por encima, y también calcularemos
 * un porcentaje de cuantos son mayores de edad y cuantos menores. Para
 * esto, podemos crear unos métodos adicionales.
 */
package guia8ejercicio3;

import Servicios.PersonaServicio;

public class Guia8Ejercicio3 {

    public static void main(String[] args) {
        PersonaServicio P1 = new PersonaServicio();
        PersonaServicio P2 = new PersonaServicio();
        PersonaServicio P3 = new PersonaServicio();
        PersonaServicio P4 = new PersonaServicio();

        P1.crearPersona();
        P2.crearPersona();
        P3.crearPersona();
        P4.crearPersona();

        float IMCP[] = new float[4];
        IMCP[0] = P1.calcularIMC();
        IMCP[1] = P2.calcularIMC();
        IMCP[2] = P3.calcularIMC();
        IMCP[3] = P4.calcularIMC();

        boolean mayorEdadP[] = new boolean[4];
        mayorEdadP[0] = P1.esMayorEdad();
        mayorEdadP[1] = P2.esMayorEdad();
        mayorEdadP[2] = P3.esMayorEdad();
        mayorEdadP[3] = P4.esMayorEdad();

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int altoPeso = 0;
        for (int i = 0; i < 4; i++) {
            if (IMCP[i] == -1) {
                bajoPeso++;
            }
            if (IMCP[i] == 0) {
                pesoIdeal++;
            }
            if (IMCP[i] == 1) {
                altoPeso++;
            }
        }
        int mayorEdadContador = 0;
        int menorEdadContador = 0;
        for (int i = 0; i < 4; i++) {
            if (mayorEdadP[i] == true) {
                mayorEdadContador++;
            } else {
                menorEdadContador++;
            }
        }
        if (mayorEdadContador < 1) {
            System.out.println("La cantidad de mayores de edad es de: " + mayorEdadContador + "\nY representan un: 0% del total");
        } else {
            System.out.println("La cantidad de mayores de edad es de: " + mayorEdadContador + "\nY representan un: " + (100 * mayorEdadContador) / 4 + "% del total");
        }
        if (menorEdadContador < 1) {
            System.out.println("La cantidad de menores de edad es de: " + menorEdadContador + "\nY representan un: 0% del total");
        } else {
            System.out.println("La cantidad de menores de edad es de: " + menorEdadContador + "\nY representan un: " + (100 * menorEdadContador) / 4 + "% del total");
        }

        System.out.println("------------------------------------------------------");

        if (bajoPeso < 1) {
            System.out.println("La cantidad de personas por debajo de su peso ideal es de: " + bajoPeso + "\nY representan un 0% del total");
        } else {
            System.out.println("La cantidad de personas por debajo de su peso ideal es de: " + bajoPeso + "\nY representan un " + (100 * bajoPeso) / 4 + "% del total");
        }

        if (pesoIdeal < 1) {
            System.out.println("La cantidad de personas en su peso ideal es de: " + pesoIdeal + "\nY representan un 0% del total");
        } else {
            System.out.println("La cantidad de personas en su peso ideal es de: " + pesoIdeal + "\nY representan un " + (100 * pesoIdeal) / 4 + "% del total");
        }
        if (altoPeso < 1) {
            System.out.println("La cantidad de personas por encima de su peso ideal es de: " + altoPeso + "\nY representan un 0% del total");
        } else {
            System.out.println("La cantidad de personas por encima de su peso ideal es de: " + altoPeso + "\nY representan un " + (100 * altoPeso) / 4 + "% del total");
        }
    }
}