/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades
con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package CafeNespresso;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CafeNespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la capacidad máxima de la cafetera en ml.");
        c1.setCapacidadMaxima(leer.nextInt());

        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("Opcion1: Llenar cafetera.");
            System.out.println("Opcion2: Servir taza.");
            System.out.println("Opcion3: Vaciar cafetera.");
            System.out.println("Opcion4: Agregar cafe.");
            System.out.println("Opcion5: Salir");
            System.out.println("-----------------------");
            cs.verCantidad(c1);
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (c1.getCantidadActual() == c1.getCapacidadMaxima()) {
                        System.out.println("La cafetera esta llena");
                        System.out.println("##############################");
                    } else {
                        cs.llenarCafetera(c1);
                        System.out.println("La cafetera se ha llenado");
                        System.out.println("##############################");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de cafe a llenar en la taza");
                    int taza = leer.nextInt();
                    if (c1.getCantidadActual() == 0) {
                        System.out.println("La cafetera esta vacia");
                        System.out.println("##############################");
                    } else if (cs.servirTaza(c1, taza) == true) {
                        System.out.println("Se ha llenado su taza");
                        System.out.println("##############################");
                    } else {
                        System.out.println("No habia suficiente cafe");
                        System.out.println("Su taza quedo en " + c1.getCantidadActual() + "ml.");
                        System.out.println("##############################");
                        c1.setCantidadActual(0);
                    }
                    break;

                case 3:
                    cs.vaciarCafetera(c1);
                    System.out.println("Se ha vaciado la cafetera");
                    System.out.println("##################################");
                    break;
                case 4:
                    boolean bandera;
                    do {
                        System.out.println("Ingrese la cantidad de cafe en ml :");

                        int cafe = leer.nextInt();
                        if (cs.agregarCafe(c1, cafe) == true) {
                            System.out.println("Se agregó el café correctamente!");
                            System.out.println("################################");
                            bandera = true;
                        } else {
                            System.out.println("Esta superando la cantidad máxima de la cafetera");
                            bandera = false;
                        }
                    } while (bandera == false);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    System.out.println("####################################");
                    break;
            }

        } while (opcion
                != 5);
        System.out.println("Gracias!");
    }

}
