/**
* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
* Crea un método para calcular la nota media de un grupo de estudiantes y otro para
* mostrar por pantalla los estudiantes que tienen una nota media superior.
 */

package Servicios;

import Entidades.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Estudiante registro = new Estudiante();

    public Estudiante crearEstudiantes() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.print("Nota Media: ");
        int notaMedia = leer.nextInt();
        return new Estudiante(nombre, edad, notaMedia);
    }

    public double promedio(ArrayList<Estudiante> listado) {
        int cont = 0;
        for (Estudiante Estudiante : listado) {
            cont += Estudiante.getNotaMedia();
        }
        double promedio = cont / listado.size();
        return promedio;
    }
    
    public void notaMediaMayor(ArrayList<Estudiante> listado, double promedio){
    ArrayList<Estudiante> estudiantesDestacados = new ArrayList<>();
    for (Estudiante Estudiante : listado) {
        if (Estudiante.getNotaMedia() > promedio) {
            estudiantesDestacados.add(Estudiante);
        }
    }
    if(estudiantesDestacados.size() > 0){
        System.out.println("Los estudiantes con una nota media superior al promedio son:");
        for(Estudiante estudiante: estudiantesDestacados){
            System.out.println(estudiante.getNombre());
        }
    }else{
        System.out.println("No hay estudiantes con una nota media superior al promedio.");
    }
  }
}