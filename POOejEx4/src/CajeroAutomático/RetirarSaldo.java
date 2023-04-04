/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package CajeroAutomático;

import Entidades.Cuenta;

/**
 *
 * @author Elio
 */
public class RetirarSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta Extraccion = new Cuenta();
        
        Extraccion.Retirar_dinero();
    }
    
}
