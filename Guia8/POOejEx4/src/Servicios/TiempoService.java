/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????

 */
package Servicios;

import Entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class TiempoService {

    Scanner leer = new Scanner(System.in);

    public Tiempo ingresarHora() {
        Tiempo hora = new Tiempo();
        int h, m, s;
        boolean bandera = true;
        do {
            System.out.println("Ingrese la hora en  formato 24 hs ->");
            h = leer.nextInt();

            if (h >= 0 && h < 24) {
                hora.setHora(h);
                bandera = false;

            } else {
                System.out.println("El valor ingresado es incorrecto ");
            }

        } while (bandera);
        bandera = true;
        do {
            System.out.println("Ingrese los minutos  ->");
            m = leer.nextInt();

            if (m >= 0 && m < 60) {
                hora.setMinutos(m);
                bandera = false;

            } else {
                System.out.println("El valor ingresado es incorrecto ");
            }

        } while (bandera);
        bandera = true;
        do {
            System.out.println("Ingrese los segundos ->");
            s = leer.nextInt();

            if (s >= 0 && s < 60) {
                hora.setSegundos(s);
                bandera = false;

            } else {
                System.out.println("El valor ingresado es incorrecto ");
            }

        } while (bandera);

        return hora;

    }

    public void imprimirHoraCompleta(Tiempo hora) {
        System.out.printf("La hora es  %02d   los minutos son  : es %02d     Los segundos son:  %02d ", hora.getHora(), hora.getMinutos(), hora.getSegundos());

    }
}
