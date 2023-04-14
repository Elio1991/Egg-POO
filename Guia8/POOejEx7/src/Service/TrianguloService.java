/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Service;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class TrianguloService {

    public Triangulo CargarTriangulo() {
        Scanner leer = new Scanner(System.in);
        Triangulo Tr1 = new Triangulo();
        System.out.println("Ingrese la base:");
        Tr1.setBase(leer.nextDouble());
        System.out.println("Ingrese el valor de un lado:");
        Tr1.setLado(leer.nextDouble());

        return Tr1;
    }

    public double CalcularArea(Triangulo Tr1) {
        double area;
        double H = Math.sqrt(Math.pow(Tr1.getLado(), 2) - Math.pow(Tr1.getBase() / 2, 2));
        area = (Tr1.getBase() * H) / 2;
        Tr1.setArea(area);
        System.out.println("Area: " + area);
        return area;
    }

    public double CalcularPerimetro(Triangulo Tr1) {
        double perimetro;
        perimetro = Tr1.getBase() + 2 * Tr1.getLado();
        Tr1.setPerimetro(perimetro);
        System.out.println("Perimetro: " + perimetro);
        return perimetro;
    }

    public void MostrarTrianguloMayor(Triangulo Tr1[] ) {
        double area = 0;
        double perimetro = 0;
        double base = 0;
        double lado = 0;        
        int cont = 0;
        for (int i = 0; i < Tr1.length; i++) {
            if (Tr1[i].getArea() > area) {
                area = Tr1[i].getArea();
                perimetro = Tr1[i].getPerimetro();
                base = Tr1[i].getBase();
                lado = Tr1[i].getLado();
                cont = i;
            }
            Tr1[cont].setBase(base);
            Tr1[cont].setLado(lado);
            Tr1[cont].setArea(area);
            Tr1[cont].setPerimetro(perimetro); 
        }
  
        System.out.println("El triangulo con mayor area es el: " + (cont+1));
        System.out.println("Base: " + Tr1[cont].getBase());
        System.out.println("Lado: " + Tr1[cont].getLado());
        System.out.println("Area: " + Tr1[cont].getArea());
        System.out.println("Perimetro: " + Tr1[cont].getPerimetro());
        
    }
}
