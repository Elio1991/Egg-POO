/*
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
package BancoNacion;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class AppCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        System.out.println("Ingrese su número de cuenta");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su D.N.I");
        long dni = leer.nextLong();
        System.out.println("Ingrese su saldo Actual");
        double saldo = leer.nextDouble();

        CuentaBancaria cb = cbs.CrearCuenta(numCuenta, dni, saldo);

        leer.nextLine();
        int menu = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida (Max 20% del saldo)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("0. SALIR");

            menu = leer.nextInt();
            double cash;
            switch (menu) {
                case 1:
                    System.out.println("Ingrese la cantidad de dinero");
                    cash = leer.nextInt();
                    System.out.println("Ingreso exitoso!!");
                    cbs.Ingresar(cb, cash);
                    System.out.println("########################################");
                    break;
                case 2:
                    System.out.println("Ingrese el importe a retirar");
                    cash = leer.nextInt();
                    if (cbs.Retirar(cb, cash) == true) {
                        System.out.println("Retiro exitoso!!");
                    } else {
                        System.out.println("No tiene suficientes fondos, se retirara el máximo disponible");
                    }
                    System.out.println("########################################");
                    break;
                case 3:
                    boolean bandera;
                    do {
                        System.out.println("Ingrese el importe a retirar");
                        System.out.println("(Solo podrá retirar un 20% de su saldo)");
                        cash = leer.nextDouble();
                        cbs.ExtraccionRapida(cb, saldo);
                        if (cbs.ExtraccionRapida(cb, cash) == true) {
                            System.out.println("retiro exitoso!!");
                            bandera = true;
                        } else {
                            System.out.println("Ha excedido el límite de extracción rápida");
                            bandera = false;
                        }
                    } while (bandera == false);
                    System.out.println("########################################");
                    break;
                case 4:
                    System.out.println("Su saldo Actual es: " + cbs.ConsultarSaldo(cb));
                    System.out.println("########################################");
                    break;
                case 5:
                    System.out.println("Los datos de la cuenta son: ");
                    cbs.ConsultarDatos(cb);
                    System.out.println("########################################");
                    break;
                default:
            }
        } while (menu != 0);
        System.out.println("Gracias por operar con *AppCuenta*");
    }

}
