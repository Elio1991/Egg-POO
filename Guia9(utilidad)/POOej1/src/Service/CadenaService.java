/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. 
El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
y devuelve verdadero si la contiene y falso si no.

 */
package Service;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {
        Cadena frase = new Cadena();
        System.out.println("Digite la frase ->");
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());

        return frase;
    }

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena frase) {
        int contvocales = 0;

        for (int i = 0; i < frase.getFrase().length(); i++) {
            String buscarvocal = frase.getFrase().substring(i, i + 1).toLowerCase();
            switch (buscarvocal) {
                case "a":
                    contvocales++;
                    break;
                case "e":
                    contvocales++;
                    break;
                case "i":
                    contvocales++;
                    break;
                case "o":
                    contvocales++;
                    break;
                case "u":
                    contvocales++;
                    break;
            }

        }
        System.out.println("La cantidad de vocales es : " + contvocales);

    }

    /*
    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", 
Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena frase) {
        String cadenaInvertida = "";

        for (int i = frase.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida += frase.getFrase().charAt(i);
        }

        System.out.println("La cadena invertida es  " + cadenaInvertida);
    }

    /*
        Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el
carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(Cadena frase) {
        System.out.println("Ingrese el caracter a contabilizar->");
        char letra = leer.next().toLowerCase().charAt(0);
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().toLowerCase().charAt(i) == letra) {
                cont++;
            }

        }
        System.out.println("El caracter " + letra + " aparece " + cont + " veces");

    }

    /*
      Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva
frase ingresada por el usuario.
     */
    public void comparaLongitud(Cadena frase) {
        System.out.println("Digite una frase ");
        String frase2 = leer.next();
        int longitudFrase2 = frase2.length();
        if (frase.getLongitud() == longitudFrase2) {
            System.out.println("La longitud de ambas frases son iguales ");

        } else {
            System.out.println("Las longitudes de ambas frases son diferentes ");
        }

    }

    /*
        Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el 
usuario y mostrar la frase resultante.
     */
    public void unirFrase(Cadena frase) {
        System.out.println("Ingrese una frase ->");
        String frase1 = leer.next();
        String fraseUnida = frase.getFrase().concat(frase1);
        System.out.println("La nueva frase es " + fraseUnida);

    }

    /*
        Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
     */
    public void remplazarLetra(Cadena frase) {
        System.out.println("Ingrese una letra para remplazar la letra a");
        char letra = leer.next().toLowerCase().charAt(0);

        String replace_frase = frase.getFrase().replace('a', letra);

        System.out.println("La frase remplazada es " + replace_frase);
    }

    /*
        Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero 
si la contiene y falso si no.
     */
    public boolean contieneLetra(Cadena frase) {
        System.out.println("Ingrese la letra a buscar dentro de la frase ");
        String letra = leer.next().toLowerCase();
        boolean contiene = false;
        if (frase.getFrase().contains(letra)) {
            contiene = true;

        }

        return contiene;
    }
}
