/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario. 
Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario
y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas
y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará
cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 */
package Service;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego(Ahorcado juego) {

        System.out.println("Ingrese la cantidad de intentos");
        juego.setCantJM(leer.nextInt());
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        String[] vecAuxP = new String[palabra.length()];
        String[] vecAux = new String[palabra.length()];

        for (int i = 0; i < vecAuxP.length; i++) {
            vecAuxP[i] = palabra.substring(i, i + 1);
            vecAux[i] = "_";
        }
        juego.setPalabra(vecAuxP);
        juego.setVecAux(vecAux);
        return juego;
    }

    public void longitud(Ahorcado juego) {
        System.out.println("La longitud de la palabra es: " + juego.getPalabra().length);
        // System.out.println(juego.toString());
        verAhorcado(juego);
    }

    public void juego(Ahorcado juego) {
        // puedo crear el objeto aca mismo y trabajarlo desde aca, sin pasarlo en los parametros.
        // Ahorcado juego = new Ahorcado();
        crearJuego(juego);
        longitud(juego);

        String letra;

        do {
            System.out.println("Ingrese una letra");
            letra = leer.next();
            buscarLetra(juego, letra);
            encontradasLetra(juego, letra);
            intentos(juego);
            verAhorcado(juego);

        } while (juego.getCantJM() != 0 && juego.getCantL() != juego.getPalabra().length);
        if (juego.getCantL() == juego.getPalabra().length) {
            System.out.println("Has Ganado!");
        } else {
            System.out.println("Lo sentimos, no hay mas oportunidades. No encontraste la palabra");
        }
    }

    public void buscarLetra(Ahorcado juego, String letra) {
        int cont = 0;
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equals(letra)) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("La letra no pertenece a la palabra");
        } else {
            System.out.println("La letra se encuentra " + cont + " vez/veces");
        }
    }

    public void encontradasLetra(Ahorcado juego, String letra) {
        int cont1 = 0;
        int contRepe = 0;
        boolean bandera = false;
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equalsIgnoreCase(letra)) {
                if (!letra.equalsIgnoreCase(juego.getVecAux()[i])) {
                    juego.getVecAux()[i] = letra;
                    cont1++;
                    bandera = true;
                } else if (letra.equalsIgnoreCase(juego.getVecAux()[i])) {
                    contRepe++;
                }
            }

        }
        if (contRepe > 0) {
            System.out.println("La letra ya se encuentra en el ahorcado");
            bandera = false;
        }
        if (bandera == false) {
            juego.setCantJM(juego.getCantJM() - 1);
        }
        juego.setCantL(juego.getCantL() + cont1);
        System.out.println("Encontradas: " + juego.getCantL());
        System.out.println("Faltantes: " + (juego.getPalabra().length - juego.getCantL()));
        // System.out.println(juego.toString());
    }

    public void intentos(Ahorcado juego) {
        System.out.println("Intentos restantes: " + juego.getCantJM());
    }

    private void verAhorcado(Ahorcado juego) {

        for (int i = 0; i < juego.getVecAux().length; i++) {
            System.out.print(juego.getVecAux()[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
