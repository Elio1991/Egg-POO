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
package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class PersonaService {
    /*a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.*/
    Scanner Leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre y fecha de nacimiento");
        String nombre = Leer.nextLine();
        int dia = Leer.nextInt();
        int mes = Leer.nextInt() -1;
        int anio = Leer.nextInt() - 1900;
        Date fechaNaci = new Date(anio, mes, dia);
        
        return new Persona(nombre, fechaNaci);
    }
    
    
    
   /*Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.*/
    
    public int calcularEdad(Persona per){
        Date fechaActual = new Date();
    
    int dif = per.getFechaNaci().compareTo(fechaActual);
        
        if (dif > 0) {
            System.out.println("La persona no nacio");
            }else if (dif == 0) {
            dif = 0;
        }else{
                dif = fechaActual.getYear() - per.getFechaNaci().getYear();
                
            }
        return dif;
        }
    
    /*Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.*/
    
    public boolean menorQue(Persona per , int edad){
     int edadPersona = calcularEdad(per);
     
        if (edadPersona >= edad) {
            return false;
        }else{
            return true;
        }
      }

    /*Método mostrarPersona que muestra la información de la persona
deseada.*/
    
    public void mostrarPersona(Persona per){
        System.out.println(per.toString());
    }
}
