/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
A continuación, declara una variable mesSecreto de tipo String,
y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]). 
El programa debe pedir al usuario que adivine el mes secreto. 
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. 
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package MesesDelAño;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class AdivinaElMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        //int aux =(int) Math.round(Math.random()*11);
        String MesSecreto = Meses[(int) Math.round(Math.random()*11)];
        
        System.out.println("mesSecreto: " + MesSecreto);
        boolean bandera = true;
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        do {
         
            String respuesta = leer.next();
            if (MesSecreto.equals(respuesta.toLowerCase())) {
                bandera = true;
                System.out.println(" ¡Ha acertado! ");
            }else
           
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            bandera = false;
           
           
        } while (bandera == false);
        
    }
    
}
