/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades
con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera)
y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con lo siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author Elio
 */
public class CafeteraServicio {

    public void llenarCafetera(Cafetera c1) {

        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public boolean servirTaza(Cafetera c1, int taza) {
       if(taza <= c1.getCantidadActual() ){
           c1.setCantidadActual(c1.getCantidadActual() - taza);
         return true;
        }else {
        return false;
       }
        
        
        
        
    }
    
    public void vaciarCafetera(Cafetera c1) { c1.setCantidadActual(0); }
    
    public boolean agregarCafe(Cafetera c1, int cafe){
    if(c1.getCantidadActual() + cafe <= c1.getCapacidadMaxima()){
       c1.setCantidadActual(c1.getCantidadActual() + cafe);
        return true;
    }else{
        return false;
    }
    }
    
    public void verCantidad(Cafetera c1){
        System.out.println("    " + c1.getCantidadActual() + "/" + c1.getCapacidadMaxima());
    }
    
    
    
}
