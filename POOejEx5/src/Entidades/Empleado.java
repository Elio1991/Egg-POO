/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años
o del 5% si tiene menos de 30 años.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Empleado {
    String Nombre;
    int Edad;
    float Salario;

    public Empleado() {
    }

    public Empleado(String Nombre, int Edad, float Salario) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
    public void Calcular_aumento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su Nombre y Apellido");
        Nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        Edad = leer.nextInt();
        
        if(Edad<30){
            Salario = (float)(Math.random()*10000);
            System.out.println("Su salario actual es de: " + Salario);
            System.out.println("El aumento es de: " + Salario * 0.05);
            System.out.println("Su salario con aumento es de: " + Salario * 1.05);
        }else {
            Salario = (float)(Math.random()*10000);
            System.out.println("Su salario actual es de: " + Salario);
            System.out.println("El aumento es de: " + Salario * 0.1);
            System.out.println("Su salario con aumento es de: " + Salario * 1.10);
        
        }
    
    }
}
