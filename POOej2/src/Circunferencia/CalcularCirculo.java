/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Circunferencia;

import Entidades.Circunferencia;

/**
 *
 * @author Elio
 */
public class CalcularCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia cir = new Circunferencia();
 
        cir.crearCircunferencia();
        System.out.println("El Area de la circunferencia es: ");
        System.out.println(cir.area());
        System.out.println("#################################");
        System.out.println("El Perímetro de la circunferencia es: ");
        System.out.println(cir.perimetro());
    }
    
}
