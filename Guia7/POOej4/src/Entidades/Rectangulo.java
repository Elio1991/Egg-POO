/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base
y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo
dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo
y un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos
usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void CrearRec() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base del rectágulo");
        base = leer.nextInt();
        System.out.println("Ingrese el valor de la altura del rectángulo");
        altura = leer.nextInt();
    }

    public int Superficie() {
        int superficie;
        superficie = base * altura;
        return superficie;
    }

    public int Perimetro() {
        int perimetro;
        perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void DibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || j == (base - 1) || i == 0 || i == (altura - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");

        }

    }

}
