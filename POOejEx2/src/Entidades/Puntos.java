/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos()
que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que existe
entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package Entidades;

import java.util.Scanner;

/**
 * @author Elio
 */
public class Puntos {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void CrearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto");
        x1 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del primer punto");
        y1 = leer.nextInt();
        System.out.println("Ingrese la coordenada x del segundo punto");
        x2 = leer.nextInt();
        System.out.println("Ingrese la coordenada y del segundo punto");
        y2 = leer.nextInt();
        
        
    }
    
    public double CalcularDist(){
         return Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1 ),2)));
    
    
    }
}
