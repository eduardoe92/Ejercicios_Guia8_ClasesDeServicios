/**
* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
* Crea un método para calcular la nota media de un grupo de estudiantes y otro para
* mostrar por pantalla los estudiantes que tienen una nota media superior.
 */

package guia8ejercicioextra4;

import Entidades.Estudiante;
import Servicios.EstudianteServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia8EjercicioExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        EstudianteServicio registro = new EstudianteServicio();
        Estudiante estudiante;
        ArrayList lista = new ArrayList();
        String resp = " ";
        
        System.out.print("Ingrese la cantidad de estudiantes que desea agregar: ");
        int cantidad = (int)leer.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("============================================");
            System.out.println("Ingrese los datos del estudiante");
            estudiante = registro.crearEstudiantes();
            lista.add(estudiante);
        }
        System.out.println("============================================");
        System.out.print("La nota promedio del curso es: ");
        System.out.println(registro.promedio(lista));
        System.out.println("============================================");
        System.out.print("El estudiante con la mayor nota es: ");
        registro.notaMediaMayor(lista, registro.promedio(lista));
    }

}