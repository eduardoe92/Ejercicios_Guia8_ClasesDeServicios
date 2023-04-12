/**
* Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
* Crea un método para calcular la nota media de un grupo de estudiantes y otro para
* mostrar por pantalla los estudiantes que tienen una nota media superior.
 */

package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Estudiante alumno = new Estudiante();
    
    public void calcularNotaMedia(){
        
        
    }
    
    public void crearAlumno(){
        alumno.setNombre(leer.nextLine());
        alumno.setEdad(leer.nextInt());
        //alumno.setNotaMedia(set.NotaMedia());
    }
    
}
