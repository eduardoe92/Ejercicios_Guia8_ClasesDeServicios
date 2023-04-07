
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

package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Cafetera cant = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(){
        cant.setCapacidadMaxima(100);
        int llena = cant.getCapacidadMaxima();
        cant.setCantidadActual(llena);
        System.out.println("Su cafetera ahora se encuentra llena!\n\n-------------------------");
    }
    
    public void servirTaza(){
        System.out.println("Por favor introduzca el tamaño de su taza vacia \n\n ({C}hica - {M}ediana - {G}rande");
        String taza = leer.next().toUpperCase();
        int estado = cant.getCantidadActual();
        int restar = 0;
        
        switch (taza) {
            case "C":
                if (cant.getCantidadActual()<10){
                    System.out.println("Actualmente la cafetera no dispone de suficiente café");
                    break;
                }else{
                    restar = 10;
                    cant.setCantidadActual(estado - restar);
                    System.out.println("Su taza está siendo servida, a la máquina le queda " + cant.getCantidadActual() + "%");
                    break;
                }
            case "M":
                if (cant.getCantidadActual()<20){
                    System.out.println("Actualmente la cafetera no dispone de suficiente café");
                    break;
                }else{
                restar = 20;
                cant.setCantidadActual(estado - restar);
                System.out.println("Su taza está siendo servida, a la máquina le queda " + cant.getCantidadActual() + "%");
                break;
                }
            case "G":
                if (cant.getCantidadActual()<30){
                    System.out.println("Actualmente la cafetera no dispone de suficiente café");
                    break;
                }else{
                restar = 30;
                cant.setCantidadActual(estado - restar);
                System.out.println("Su taza está siendo servida, a la máquina le queda " + cant.getCantidadActual() + "%");
                break;
                }                
            default:
                System.out.println("Opción inválida");
        }
    }
    
    public void vaciarCafetera(){
        cant.setCantidadActual(0);
        System.out.println("\n\nSu Cafetera Ahora está vacía\nProceda con el mantenimiento\n\n------------------------");
    }
    
    public int agregarCafe(int cuantoCafe){
        System.out.println("Por favor introduzca el porcentaje de café que va a introducir a la cafetera (0-100)%");
        int porcentaje = leer.nextInt();
        int cantact = cant.getCantidadActual();
        if (porcentaje > 99 || porcentaje < 0) {
            System.out.println("No se puede introducir esa cantidad");
        } else {
            if ((porcentaje + cantact) > 100 ) {
                System.out.println("Se te va a desbordar");
            }else {
                cant.setCantidadActual(porcentaje + cantact);
                System.out.println("Gracias! La cantidad de café actual es de: " + cant.getCantidadActual() + "%");
            }
        }
        return cuantoCafe;
    }
    
}