/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores:
uno vacío que inicializa el título y el autor a cadenas vacías 
y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Cancion {
    
    public String Titulo;
    public String Autor;

    public Cancion() {
    }

    public Cancion(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public void Canciones(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Titulo de la canción");
        Titulo = leer.nextLine();
        System.out.println("Ingrese el Autor");
        Autor = leer.nextLine();

}
    
    public void MostrarCancion(){
        System.out.println("El título de la canción es: ");
        System.out.println(Titulo);
        System.out.println("#######################################");
        System.out.println("El autor de la canción es: ");
        System.out.println(Autor);
    }
}
