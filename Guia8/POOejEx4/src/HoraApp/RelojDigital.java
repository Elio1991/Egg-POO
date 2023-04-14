/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????

 */
package HoraApp;

import Entidades.Tiempo;
import Servicios.TiempoService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Elio
 */
public class RelojDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        TiempoService ts = new TiempoService();
        Tiempo reloj = ts.ingresarHora();
        ts.imprimirHoraCompleta(reloj);
        while (true) {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            System.out.println("Hora actual: " + dateFormat.format(date));
            Thread.sleep(1000); // Espera un segundo para actualizar la hora

        }
    }
}