/*
Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo.
El segundo jugador tiene un número limitado de intentos
y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número
y el número de veces que cada jugador ha ganado.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Juego {

    public int jugador1;
    public int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public void Iniciar_Juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivinanza de números");
        System.out.println("#####################");

        int cont1 = 0;
        int cont2 = 0;
        boolean continuar = true;
        do {
            int cont = 3;
            int intentos = 3;
            do {
                if (cont == 3) {
                    System.out.println("Jugador número 1, ingrese un número");
                    jugador1 = leer.nextInt();
                    System.out.println("###################################");
                    System.out.println("Jugador numero 2, intenta adivinar el número");
                    jugador2 = leer.nextInt();
                }

                if (jugador2 < jugador1) {
                    cont--;
                    intentos--;
                    System.out.println("Inconrrecto. Te quedan: " + cont + " intentos! ");

                    System.out.println("Ingresa un número mas alto");
                    jugador2 = leer.nextInt();
                }
                if (jugador2 > jugador1) {
                    cont--;
                    intentos--;
                    System.out.println("Incorrecto. Te quedan: " + cont + " intentos!");

                    System.out.println("Ingresa un número mas bajo");
                    jugador2 = leer.nextInt();
                }
                if (jugador2 == jugador1) {
                    System.out.println("Correcto!! Adivinaste el número!!");
                    cont2++;
                    break;
                }

            } while (cont > 1);
            intentos--;
            if (intentos == 0 && jugador1 != jugador2) {
                System.out.println("Lo siento, no adivinaste");
                cont1++;
            }
            System.out.println("Los Resultados hasta ahora son: ");
            System.out.println("Jugador 1 " + cont1 + " victorias");
            System.out.println("Jugador 2 " + cont2 + " victorias");
            System.out.println("#################################");
            System.out.println("Desean seguir jugando? SI/NO");
            leer.nextLine();
            String resp = leer.nextLine();
            if (resp.equalsIgnoreCase("Si")) {
                continuar = true;
            } else if (resp.equalsIgnoreCase("NO")) {
                continuar = false;
            }
        } while (continuar);
        // System.out.println("Gracias por jugar!");
    }

}
