/*
Clase Arrays
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package ClaseArrays;

import Service.ArregloService;

/**
 *
 * @author Elio
 */
public class ArraysApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        ArregloService v = new ArregloService();
        System.out.println("Inicializando..");
        v.inicializarA(vectorA);
        System.out.println("Mostrar");
        v.mostrar(vectorA);
        System.out.println("Ordenando..");
        v.ordenar(vectorA);
        System.out.println("Mostrar");
        v.mostrar(vectorA);
        System.out.println("Inicializando vectorB");
        v.inicializarB(vectorB, vectorA);
        System.out.println("Mostrar vectorA");
        v.mostrar(vectorA);
        System.out.println("Mostrar vectorB");
        v.mostrar(vectorB);
    }
}
