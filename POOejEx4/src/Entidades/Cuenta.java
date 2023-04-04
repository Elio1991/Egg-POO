/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Cuenta {
    String Titular;
    int Saldo;

    public Cuenta() {
    }

    public Cuenta(String Titular, int Saldo) {
        this.Titular = Titular;
        this.Saldo = Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
    public void Retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        int RetirarSaldo;
        System.out.println("Ingrese su nombre y apellido");
            Titular = leer.nextLine();
            System.out.println("#############################");
            System.out.println("Bienvenido/a señor/a " + Titular);
            
            Saldo =(int) (Math.random()*100000);
            System.out.println("Su saldo es : " + Saldo);
        do {
            
            System.out.println("#############################");
            System.out.println("Cuanto desea retirar?");
            RetirarSaldo = leer.nextInt();
            if(RetirarSaldo>Saldo){
                System.out.println("Fondos Insuficientes, ingrese un importe menor");           
            }else{
                Saldo = Saldo - RetirarSaldo;
                System.out.println("Retiro Exitoso. Su saldo restante es: " + Saldo);
                System.out.println("Gracias por utilizar este cajero!");
                break;
            }
            
        } while (RetirarSaldo>Saldo);
        
    
    
    }
    
    
    
    
    
    
    
    
}
