
/**
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */

package guia8ejercicio1;

import Entidades.CuentaBancariaServicio;
import java.util.Scanner;

public class Guia8Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio ctaS = new CuentaBancariaServicio();
        boolean menu;
        menu = true;

        int seleccion;
        do {
            System.out.println("=====================================");
            System.out.println("Bienvenido al Banco República Argentina");
            System.out.println("1. Complete sus datos");
            System.out.println("2. Depositar");
            System.out.println("3. Extraer");
            System.out.println("4. Retiro Express");
            System.out.println("5. Vea sus datos");
            System.out.println("6. Salir");
            System.out.println("=====================================");
            seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    ctaS.crearCuenta();
                    break;
                case 2:
                    ctaS.ingresar();
                    break;
                case 3:
                    ctaS.retirar();
                    break;
                case 4:
                    ctaS.extraccionRapida();
                    break;
                case 5:
                    ctaS.consultarDatos();
                    break;
                case 6:
                    System.out.println("Desea realmente salir ? S/N");
                    String sale = leer.next().toLowerCase();
                    if ("s".equals(sale)) {
                        System.out.println("Hasta luego!");
                        menu = false;
                    }
                    break;
                default:
                    System.out.println("Opción inválida, ponele onda hermano");
            }
        } while (menu);
    }
}
