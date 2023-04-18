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
package Service;

import java.util.Arrays;

/**
 *
 * @author Elio
 */
public class ArregloService {
      public void inicializarA(double vectorA[]){
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random()*100);
        }
 
//    Arrays.fill(vectorA, Math.random()*100);

    }
    
    public void mostrar(double vectorA[]){
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println();
//      
    }
    
    public void ordenar(double vectorA[]){
    Arrays.sort(vectorA);
    double[] vectorX = new double[50];
    
//        for (int i = vectorA.length-1; i >= 0; i--) {
//            vectorX[i] = vectorA[i];
//            System.out.print("[" + vectorA[i] + "]");
//        }
        for (int i = 0; i < vectorA.length/2; i++) {
            double aux = vectorA[i];
            vectorA[i] = vectorA[vectorA.length-1-i];
            vectorA[vectorA.length-1-i] = aux;
        }
    }
    
    public void inicializarB(double vectorB[], double vectorA[]){
    System.arraycopy(vectorA, 0, vectorB, 0, 9);
    Arrays.fill(vectorB, 10 , vectorB.length , 0.5);
    }
}
