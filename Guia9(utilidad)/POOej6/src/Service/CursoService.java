/*
Uso de vectores como atributos de clase
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa
para organizar la información de cada curso. 
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos.
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, 
la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package Service;

import Entidad.Curso;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CursoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno: " + (i + 1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        Curso curso1 = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno,(mañana o tarde)");
        curso1.setTurnoMañanaOTarde(leer.next());
        System.out.println("Ingrese el precio por hora:");
        curso1.setPrecioPorHora(leer.nextInt());
        curso1.setAlumnos(cargarAlumnos());
        return curso1;
    }
    
    public int calcularGananciaSemanal(Curso Curso1){
    return Curso1.getCantidadHorasPorDia()*Curso1.getPrecioPorHora()*Curso1.getCantidadDiasPorSemana()*5;
    }
    
    
}
