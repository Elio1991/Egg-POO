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
package DateFecha;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author Elio
 */
public class FechaDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fec = new FechaService();
        Date fecha1 = fec.fechaNacimiento();
        Date fecha2 = fec.fechaActual();
        System.out.println(fecha1);
        System.out.println(fecha2);
        fec.diferencia(fecha1, fecha2);

    }
}
