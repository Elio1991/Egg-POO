/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaices() y si devolvió true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
Método calcular(): este método llamara tieneRaices() y a tieneRaiz(), y mostrara por pantalla
las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        Raices raiz = new Raices();
        System.out.println("Ingrese el valor de A");
        raiz.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de B");
        raiz.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de C");
        raiz.setC(leer.nextDouble());
        return raiz;
    }

    public double getDiscriminante(Raices raiz) {
        double discriminante = Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        if (discriminante > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices raiz) {
        double discriminante = getDiscriminante(raiz);
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raices raiz) {

        double discriminante = getDiscriminante(raiz);
        double raiz1 = (-raiz.getB() + Math.sqrt(discriminante)) / (2 * raiz.getA());
        double raiz2 = (-raiz.getB() - Math.sqrt(discriminante)) / (2 * raiz.getA());
        if (tieneRaices(raiz)) {
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("No tiene raices.");
        }
    }

    public void obtenerRaiz(Raices raiz) {
        double x = -raiz.getB() / (2 * raiz.getA());
        if (tieneRaiz(raiz)) {
            System.out.println("La unica solucion es: " + x);
        } else {
            System.out.println("No existe una unica solucion.");
        }
    }

    public void calcular(Raices raiz) {

        if (tieneRaices(raiz)) {
            System.out.println("Tiene dos Soluciones: ");
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        } else {
            System.out.println("No existen soluciones reales.");
        }
        System.out.println("================================================");
    }

}
