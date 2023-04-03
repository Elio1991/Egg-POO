/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcularDistancia;

import Entidades.Puntos;

/**
 *
 * @author Elio
 */
public class CalcularDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos dispuntos = new Puntos();
        
        dispuntos.CrearPuntos();
        System.out.println("La distancia entre los puntos es de: ");
        System.out.println(dispuntos.CalcularDist());
        
    }
    
}
