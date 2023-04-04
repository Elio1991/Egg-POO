/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6
y imprime el área del rectángulo.

 */
package Entidades;

/**
 *
 * @author Elio
 */
public class Rectangulo {
    private int Lado1;
    private int Lado2;

    public Rectangulo() {
    }

    public Rectangulo(int Lado1, int Lado2) {
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
    }

    public int getLado1() {
        return Lado1;
    }

    public void setLado1(int Lado1) {
        this.Lado1 = Lado1;
    }

    public int getLado2() {
        return Lado2;
    }

    public void setLado2(int Lado2) {
        this.Lado2 = Lado2;
    }
    
    public int calcular_area(){
    int area;    
    area = Lado1 * Lado2;
    return area;
    }
    
}
