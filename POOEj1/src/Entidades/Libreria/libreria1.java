/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Libreria;

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
    

