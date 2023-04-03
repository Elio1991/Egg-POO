/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos
los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.

 */
package Libreria;

import Entidades.Libro1;








/**
 *
 * @author Elio
 */
public class libreria1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Libro1 PrimerLibro = new Libro1();
       
        PrimerLibro.cargarLibro();
      
        PrimerLibro.mostrarLibro();
        
      //Invoca al toString de la Clase Libro
      System.out.println(PrimerLibro.toString());
    }
    }
    

