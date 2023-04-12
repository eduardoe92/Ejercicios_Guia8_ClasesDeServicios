/**
 * Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
 * Crea un constructor para inicializar los valores de las propiedades.
 * Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual"
 * si aún no se ha alcanzado el "maximoPisos".
 * Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual"
 * si no se ha alcanzado el piso "0".
 * Crea un método "irA" que reciba como parámetro el número de piso al que se desea
 * ir y que modifique la propiedad "pisoActual" *para que tenga ese valor.
 * Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el
 * comportamiento del ascensor *moviéndolo hacia arriba y hacia abajo, yendo a un piso
 * específico, y mostrando en pantalla el piso actual después de cada movimiento.
 */
package Servicios;

import Entidades.Ascensor;

public class AscensorServicio {

    public final Ascensor as = new Ascensor();

    public void creaAscensor() {
        as.setMaximoPisos(10);

        as.setPisoActual((int) (Math.random() * 10 + 1));
    }

    //* Crea un método "subir" que aumente en uno el valor de la
    //* propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos". 
    public void subir() {
        int act = as.getPisoActual();
        int max = as.getMaximoPisos();
        if (max > act) {
            act++;
            System.out.println("Usted se encuentra en el piso " + act);
        } else {
            System.out.println("Usted está en el último piso");
        }
        as.setPisoActual(act);
    }

    //* Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si
    //* no se ha alcanzado el piso "0". 
    public void bajar() {
        int act = as.getPisoActual();

        if (act >= 1) {
            act--;
            if (act == 0) {
                System.out.println("Usted se encuentra en Planta Baja");
            } else {
                System.out.println("Usted se encuentra en el piso " + act);
            }
        } else {
            System.out.println("Usted se encuentra en Planta Baja");
        }
        as.setPisoActual(act);
    }

    //* Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad
    //* "pisoActual" para que tenga ese valor.      
    public int irA(int pisoN) {
        int piso = pisoN;
        if (piso == as.getPisoActual()) {
            System.out.println("Ya te encuentras en el piso indicado");
        } else {
            if (piso <= 10 && piso >= 1) {
                as.setPisoActual(piso);
                System.out.println("Yendo...");
                System.out.println("Casi llegas...");
                System.out.println("Din Din Din!");
                System.out.println("Usted ahora se encuentra en el piso " + piso);
            } else {
                System.out.println("Piso inválido");
            }
        }
        return piso;
    }
}
