/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6
y imprime el área del rectángulo.
 */
package CalcularRectangulo;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CalcularArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo Rectangulo1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        int Lado1;
        int Lado2;
        System.out.println("Para calcular el Area ingrese el valor del Lado1");
        Lado1 = leer.nextInt();
        System.out.println("Ahora ingrese el valor del Lado2");
        Lado2 = leer.nextInt();
        //Al tener atributos privados, les asigno el valor mediante el "set"
        Rectangulo1.setLado1(Lado1);
        Rectangulo1.setLado2(Lado2);
        
        System.out.println("El area es: ");
        System.out.println(Rectangulo1.calcular_area());
    }
    
}
