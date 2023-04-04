/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos
los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Libro1 {
    // Atributos
  private int ISBN;
  private String Titulo;
  private String Autor;
  private int NumPag;
    // Constructor vacio

    
    public Libro1() {
    }
    // Constructor con atributos pasados por parámetros

    /**
     *
     * @param ISBN
     * @param Titulo
     * @param Autor
     * @param NumPag
     */
    public Libro1(int ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }
    // Metodo(Comportamiento)
   
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
         ISBN =(int)(Math.random()*9999);
         System.out.println("Ingrese el Titulo del libro");
         Titulo = leer.nextLine();
         System.out.println("Ingrese el Autor");
         Autor = leer.nextLine();
         System.out.println("Ingrese el número de páginas");
         NumPag = leer.nextInt();
    }

    /**
     *
     */
    public void mostrarLibro(){
        System.out.println("El ISBN es: " + ISBN);
        System.out.println("###################################");
        System.out.println("El Titulo del libro es: " + Titulo);
        System.out.println("###################################");
        System.out.println("El autor es: " + Autor); 
        System.out.println("###################################");
        System.out.println("El número de páginas es: " + NumPag);
     }
     
    // Los Getter son métodos que se utlizan para obtener el valor de un atributo privado 
    // Los Setter son métodos que se utlizan para modificar el valor de un atributo privado 
    // desde fuera de la misma
 /* public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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

    public int getNumPag() {
        return NumPag;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }
 */   
    
   
    // El método toString es útil para depurar el código y para mostrar información
    // relevante de los objetos en la interfaz del usuario.

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Libro{" + "ISBN: " + ISBN + ", Titulo: " + Titulo + ", Autor: " + Autor + ", NumPag: " + NumPag + '}';
    }
    
}


