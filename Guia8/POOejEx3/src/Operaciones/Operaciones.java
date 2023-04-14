/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Operaciones;

import Entidades.Fraccion;
import Service.FraccionService;

/**
 *
 * @author Elio
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FraccionService fraccionS = new FraccionService();
        Fraccion f1 = new Fraccion();
        f1 = fraccionS.CrearFracciones();
        fraccionS.sumar(f1);
        fraccionS.restar(f1);
        fraccionS.multiplicacion(f1);
        fraccionS.division(f1);
    }
    
}
