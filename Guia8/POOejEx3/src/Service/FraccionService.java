/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package Service;

import Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class FraccionService {

    Scanner leer = new Scanner(System.in);

    public Fraccion CrearFracciones() {
        Fraccion fraccion1 = new Fraccion();
        System.out.println("Ingrese la primer fraccion");
        System.out.println("numerador 1 : ");
        fraccion1.setNumerador1(leer.nextInt());
        System.out.println("Denominador 1 : ");
        fraccion1.setDenominador1(leer.nextInt());
        System.out.println("Ingrese la segunda fraccion");
        System.out.println("numerador 2 : ");
        fraccion1.setNumerador2(leer.nextInt());
        System.out.println("Denominador 2 : ");
        fraccion1.setDenominador2(leer.nextInt());

        return fraccion1;
    }

    public void sumar(Fraccion fraccion1) {
        int cd;
        int sumaNumerador1;
        if (fraccion1.getDenominador1() == fraccion1.getDenominador2()) {
            sumaNumerador1 = fraccion1.getNumerador1() + fraccion1.getNumerador2();
            cd = fraccion1.getDenominador1();

        } else {
            sumaNumerador1 = fraccion1.getNumerador1() * fraccion1.getDenominador2() + fraccion1.getNumerador2() * fraccion1.getDenominador1();
            cd = fraccion1.getDenominador1() * fraccion1.getDenominador2();
        }
        System.out.println("SUMA");
        System.out.println(sumaNumerador1 + "/" + cd);
        System.out.println("##############################");
    }

    public void restar(Fraccion fraccion1) {
        int cd;
        int sumaNumerador1;
        if (fraccion1.getDenominador1() == fraccion1.getDenominador2()) {
            sumaNumerador1 = fraccion1.getNumerador1() - fraccion1.getNumerador2();
            cd = fraccion1.getDenominador1();

        } else {
            sumaNumerador1 = fraccion1.getNumerador1() * fraccion1.getDenominador2() - fraccion1.getNumerador2() * fraccion1.getDenominador1();
            cd = fraccion1.getDenominador1() * fraccion1.getDenominador2();
        }
        System.out.println("RESTA");
        System.out.println(sumaNumerador1 + "/" + cd);
        System.out.println("###############################");
    }

    public void multiplicacion(Fraccion fraccion1) {
        int num1 = fraccion1.getNumerador1() * fraccion1.getNumerador2();
        int den1 = fraccion1.getDenominador1() * fraccion1.getDenominador2();
        System.out.println("MULTIPLICACION");
        System.out.println(num1 + "/" + den1);
        System.out.println("################################");
    }

    public void division(Fraccion fraccion1) {
        int num1 = fraccion1.getNumerador1() * fraccion1.getDenominador2();
        int den1 = fraccion1.getNumerador2() * fraccion1.getDenominador1();
        System.out.println("DIVISION");
        System.out.println(num1 + "/" + den1);
        System.out.println("###############################");
    }

}
