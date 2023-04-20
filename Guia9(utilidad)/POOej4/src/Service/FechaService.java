/*
Vamos a usar la clase Date que ya existe en Java. 
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. 
Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package Service;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class FechaService {
    Scanner sc = new Scanner(System.in);
    public Date fechaNacimiento(){
        System.out.println("Ingrese dia, mes y año de su nacimiento");
       
        int dia = sc.nextInt();
        int mes = sc.nextInt() - 1;
        int anio = sc.nextInt() - 1900;
        
       return new Date(anio,mes,dia); 
        
    }
    
    /*b) Método fechaActual que cree un objeto fecha con el día actual.
    Para esto usaremos el constructor vacío de la clase Date.
    Ejemplo: Date fechaActual = new Date();*/
    
    public Date fechaActual(){
        
        return new Date();
    }
    
    /*c) Método diferencia que reciba las dos fechas por parámetro
    y retorna la diferencia de años entre una y otra
    (edad del usuario).*/
    
    public int diferencia(Date fech1,Date fech2){
        //Agregar un if para comprobar si paso la fecha de cumpleaños
        //fech2.setYear(fech2.getYear()+1900);
        int dif = fech1.compareTo(fech2);
        
        if (dif > 0) {
            dif = fech1.getYear()-fech2.getYear();
            }else if (dif == 0) {
            dif = 0;
        }else{
                dif = fech2.getYear()-fech1.getYear();
            }
        System.out.println("Su edad es "+dif);
        
        return dif;
    }
}
