/*
Implemente la clase Persona en el paquete entidades. 
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package DatePersona;

import Entidades.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        PersonaService pServ = new PersonaService();
        Persona per = pServ.crearPersona();
        System.out.println("Su edad es "+ pServ.calcularEdad(per));
        System.out.println("Ingrese una edad");
        System.out.println(pServ.menorQue(per, Leer.nextInt()));
        pServ.mostrarPersona(per);
    }
    
}
