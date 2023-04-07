
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

package Entidades;

import java.util.Scanner;

public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cta = new CuentaBancaria();

    public void crearCuenta() {
        System.out.println("=====================================");
        System.out.println("Por favor introduzca su Número de cuenta: ");
        int nc = leer.nextInt();
        cta.setNumeroCuenta(nc);
        System.out.println("Por favor introduzca su DNI: ");
        long dni = leer.nextLong();
        cta.setDniCliente(dni);
        System.out.println("Por favor introduzca su Saldo Actual: ");
        double sa = leer.nextDouble();
        cta.setSaldoActual(sa);
    }

    public double ingresar() {
        System.out.println("=====================================");
        System.out.println("Por favor introduzca la cantidad a depositar");
        double ingreso = leer.nextDouble();
        double saldo = cta.getSaldoActual();
        return saldo += ingreso;
    }

    public double retirar() {
        System.out.println("=====================================");
        System.out.println("Por favor introduzca la cantidad a retirar");
        double egreso = leer.nextDouble();
        double saldo = cta.getSaldoActual();

        if (saldo > egreso) {
            cta.setSaldoActual(saldo - egreso);
            return saldo;
        } else {
            cta.setSaldoActual(0);
            System.out.println("Ustéd retiró:\n $" + saldo + " Dólares");
            return saldo;
        }
    }

    public void extraccionRapida() {
        double saldo = cta.getSaldoActual();
        System.out.println("=====================================");
        System.out.println("Introduzca un monto a retirar express.\nRecuerde que utilizando este método ustéd solo podrá extraer hasta un 20% de su saldo.\nActualmente su saldo es de: $" + saldo + " y lo máximo que puede retirar ahora mismo es: " + saldo * 0.2 + " Dólares");
        System.out.println("Introduzca el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > saldo * 0.2) {
            System.out.println("Su extracción excede el máximo permitido para este tipo de operación");
        } else {
            cta.setSaldoActual(saldo - retiro);
            System.out.println("Gracias! su saldo actual es de: " + cta.getSaldoActual());
        }
    }

    public void consultarSaldo() {
        System.out.println("=====================================");
        System.out.println("Su saldo actual es de: ");
        System.out.println(cta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("=====================================");
        System.out.println("Datos del Cliente");
        System.out.println(cta);
    }
   }

			
