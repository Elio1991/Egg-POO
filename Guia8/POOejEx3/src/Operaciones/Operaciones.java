/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Operaciones;

import Entidades.Fraccion;
import Service.FraccionService;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FraccionService fraccionS = new FraccionService();
        Fraccion f1 = new Fraccion();
        int menu;
        System.out.println("Operaciones con fracciones");
        f1 = fraccionS.CrearFracciones();
        do{
        System.out.println("Menu de opciones");
        System.out.println("##################");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        menu = leer.nextInt();

        switch (menu) {
            case 1:
                fraccionS.sumar(f1);
                break;
            case 2:
                fraccionS.restar(f1);
                break;
            case 3:
                fraccionS.multiplicacion(f1);
                break;
            case 4:
                fraccionS.division(f1);
                break;
            case 5:
                System.out.println("Gracias!");
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
        }while(menu != 5 );
    }

}
