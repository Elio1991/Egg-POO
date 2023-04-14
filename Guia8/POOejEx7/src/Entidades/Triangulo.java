/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Entidades;

/**
 *
 * @author Elio
 */
public class Triangulo {
    private double lado;
    private double base;
    private double area;
    private double perimetro;
    public Triangulo() {
    }

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    
    
    
    
}
