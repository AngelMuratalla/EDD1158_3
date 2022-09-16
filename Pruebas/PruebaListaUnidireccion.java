/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos.Pruebas;

import codigos.ADTS.ListaUnidireccion;
import codigos.ADTS.Prueba;

/**
 *
 * @author rodol
 */
public class PruebaListaUnidireccion {
  
    public static void main(String[] args) {
        System.out.println("Probando impl de Lista Ligada");
//        Prueba p = new Prueba();
//        p.add(1);
//        System.out.println(p);
//        p.add(2);
//        p.add(3);
//        p.add(4);
//        System.out.println(p);
        
        ListaUnidireccion<Integer> lista = new ListaUnidireccion();
        lista.agregarAlFinal(10);
        lista.transversal();
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(40);
        lista.transversal();
        lista.agregarAlInicio(100);
        lista.transversal();
        lista.agregarDespuesDe(42, 3);
        lista.transversal();
        lista.eliminar(2);
        lista.transversal();
        lista.eliminarPrimero();
        lista.transversal();
        lista.eliminarFinal();
        lista.transversal();
        System.out.println(lista.buscar(42));
        System.out.println(lista.getTamanio());
    }
}
