/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
A continuación, se deben crear los siguientes métodos:
 a) Método constructor con todos los atributos pasados por parámetro.  
 b) Método constructor sin los atributos pasados por parámetro.
 c) Métodos get y set.
 d) Método para crearOperacion(): que le pide al usuario los dos números
    y los guarda en los atributos del objeto.
 e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 f) Método restar(): calcular la resta de los números y devolver el resultado al main
 g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
    si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
    Si no, se hace la multiplicación y se devuelve el resultado al main
 h) Método dividir(): primero valida que no se haga una división por cero, 
    si fuera a pasar una división por cero, el método devuelve 0 
    y se le informa al usuario el error. 
    Si no, se hace la división y se devuelve el resultado al main.
 */
package RealizarOperaciones;

import Entidades.Operaciones;

/**
 *
 * @author Elio
 */
public class RealizarOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operaciones ops = new Operaciones();
       
       ops.crearOperacion();
       System.out.println("#############################");
        System.out.println("El resultado de la suma es: ");
        System.out.println(ops.sumar());
       System.out.println("#############################");
        System.out.println("El resultado de la resta es: ");
        System.out.println(ops.restar());
       System.out.println("#############################");
        System.out.println("El resultado de la multiplicación es: ");
        System.out.println(ops.multiplicar());
       System.out.println("#############################");
        System.out.println("El resultado de la división es: ");
        System.out.println(ops.dividir());
       
    }
    
}
