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

package Entidades;

public class Ascensor {
    
    private int pisoActual;
    private int maximoPisos;

    public Ascensor() {
    }

    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "pisoActual=" + pisoActual + ", maximoPisos=" + maximoPisos + '}';
    }
        
}
