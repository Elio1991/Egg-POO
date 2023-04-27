/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos
y saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante,
sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante,
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package Service;

import Entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EstudianteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante crearAlumno() {
        Estudiante E1 = new Estudiante();
        System.out.println("Ingrese el nombre del alumno");
        E1.setNombre(leer.next());
        
        System.out.println("Ingrese la nota del alumno");
        E1.setNota(leer.nextFloat());

        return E1;
    }

    public Estudiante[] crearEstudiantes() {
        System.out.println("Ingrese la cantidad de alumnos");
        int CantAlum = leer.nextInt();
        Estudiante[] estudiantes = new Estudiante[CantAlum];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = crearAlumno();
        }
        return estudiantes;
    }

    public float notaPromedioCurso(Estudiante[] E1) {

        float notas = 0;
        for (int i = 0; i < E1.length; i++) {
           
            notas += E1[i].getNota();
            
        }
        return (notas / E1.length);
    }

    public String[] mayorPromedio(Estudiante[] E1) {
        int cont = 0;
        String nombres[] = new String[E1.length];
        for (int i = 0; i < E1.length; i++) {
            if (E1[i].getNota() >= notaPromedioCurso(E1)) {
                nombres[cont] = E1[i].getNombre();
                cont++;
            }
        }
        String[] mayorPromedio = new String[cont];
        System.arraycopy(nombres, 0, mayorPromedio, 0, cont);
        
        return mayorPromedio;
        
         }
     public void mostrarMayorPromedio(Estudiante[] E1){
         System.out.println("Estudiantes con una nota mayor al promedio: ");   
         System.out.println(Arrays.toString(mayorPromedio(E1)));
    }
}
