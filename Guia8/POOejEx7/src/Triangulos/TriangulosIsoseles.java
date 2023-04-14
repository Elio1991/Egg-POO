/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Triangulos;

import Entidades.Triangulo;
import Service.TrianguloService;

/**
 *
 * @author Elio
 */
public class TriangulosIsoseles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrianguloService Trs = new TrianguloService();
        Triangulo[] Tr1 = new Triangulo[4];
        System.out.println("TRIANGULO ISÓSCELES");
        System.out.println("------------------");
        for (int i = 0; i < Tr1.length; i++) {

            System.out.println("Triangulo N°" + (i + 1));
            Tr1[i] = Trs.CargarTriangulo();
            Trs.CalcularArea(Tr1[i]);
            Trs.CalcularPerimetro(Tr1[i]);
            System.out.println("");
        }
        Trs.MostrarTrianguloMayor(Tr1);
    }
}
