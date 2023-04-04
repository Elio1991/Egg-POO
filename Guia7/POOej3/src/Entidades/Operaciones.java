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
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Operaciones {
    float numero1;
    float numero2;
    
   // A)..
     public Operaciones(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // B)..
    public Operaciones() {
    }
    
    // C)..
    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    // D)..
    public void crearOperacion(){
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        numero1 = leer.nextFloat();
        numero2 = leer.nextFloat();
     }
    
    // E)..
    public float sumar(){
    float suma = numero1 + numero2;
    return suma;
    }

    // F)..
    public float restar(){
    float resta = numero1 - numero2;
    return resta;
    }
    
    // G)..
    public float multiplicar(){
    float multi;
    if (numero1 == 0 || numero2 == 0){
        System.out.println("ERROR!! Estas multiplicando un número por 0, por ende el resultado es: ");
        return 0;
    }else 
     multi = numero1 * numero2;   
        return multi;
    }

    // H)..
    public float dividir(){
    float division;
    if (numero1== 0 || numero2 == 0){
        System.out.println("ERROR!! Estas dividiendo un número por 0, por ende el resultado es: ");
        return 0;
    }else 
     division = numero1 / numero2;   
        return division;
    
    }
}
