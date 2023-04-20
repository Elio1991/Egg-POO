/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Service;

import Entidades.ParDeNumeros;

/**
 *
 * @author Elio
 */
public class ParDeNumerosService {
        public ParDeNumeros crearNumeros() {
        return new ParDeNumeros();
    }
    
    public void mostrarValores(ParDeNumeros num) {
        
        System.out.println("Numero 1: " + num.getNum1());
        System.out.println("Numero 2: " + num.getNum2());
    }
    
    public static double devolverMayor(ParDeNumeros num){
        double mayor = Math.max(num.getNum1(), num.getNum2());
        return mayor;
        
    }
    
    public void calcularPotencia(ParDeNumeros p) {
       double menor, mayor, potencia;
        
       mayor = Math.round(devolverMayor(p));
       menor = Math.round(Math.min(p.getNum1(), p.getNum2()));
       potencia = Math.pow((mayor), (menor));
       System.out.println(mayor + "^" + menor + ": " + potencia);
    }
    
    public void calculaRaiz(ParDeNumeros p) {
        double menor, raiz;
        
       //mayor = (Math.round(devolverMayor(p)));
       menor = Math.abs(Math.min(p.getNum1(), p.getNum2()));
       raiz = Math.sqrt(menor);
       System.out.println("La raiz del menor(" + menor + ") es: " + raiz);
    }
}
