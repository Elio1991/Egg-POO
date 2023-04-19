/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
