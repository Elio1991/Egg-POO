/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria CrearCuenta() {
        CuentaBancaria cb = new CuentaBancaria();
        System.out.println("Ingrese su número de cuenta");
        int numCuenta = leer.nextInt();
        cb.setNumeroCuenta(numCuenta);
        System.out.println("Ingrese su D.N.I");
        long dni = leer.nextLong();
        cb.setDni(dni);
        float saldo = (float) (Math.random()*10000);
        System.out.println("Su Saldo Actual es de: " + saldo);
        cb.setSaldoActual(saldo);
        
        return cb;
    }

    public void Ingresar(CuentaBancaria cb, float cash) {
        float suma = cb.getSaldoActual() + cash;
        cb.setSaldoActual(suma);
    }

    public boolean Retirar(CuentaBancaria cb, float cash) {
        float saldo = cb.getSaldoActual();
        if (saldo >= cash) {
            saldo -= cash;
            cb.setSaldoActual(saldo);
            return true;
        } else {
            saldo = 0;
            cb.setSaldoActual(saldo);
            return false;
        }
    }

    public float ConsultarSaldo(CuentaBancaria cb) {
        return cb.getSaldoActual();
    }

    public void ConsultarDatos(CuentaBancaria cb) {
        System.out.println("El D.N.I es: " + cb.getDni());
        System.out.println("El número de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("El saldo disponible es: " + cb.getSaldoActual());
    }

    public boolean ExtraccionRapida(CuentaBancaria cb, float cash) {
       float saldo = cb.getSaldoActual();
        if (cash > saldo * 0.2) {
            return false;
        } else {
            saldo -= cash;
            cb.setSaldoActual(saldo);
            return true;
        }
    }
}
