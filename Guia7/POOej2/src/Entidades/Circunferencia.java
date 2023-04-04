/*
Declarar una clase llamada Circunferencia que tenga como atributo privado
el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Circunferencia {
    public double Radio;

    public Circunferencia() {
    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        Radio = leer.nextDouble();
    }
    
    public double area(){
        double Area;
        Area=(Math.PI * Math.pow(Radio, 2));
        return Area;
    }
   
   public double perimetro(){
       double Perimetro;
       Perimetro=2 * Math.PI * Radio;
       return Perimetro;
   }
   
   
}
