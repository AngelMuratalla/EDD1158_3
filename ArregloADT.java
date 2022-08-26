/** 
 Este programa fue creado para hacer una lista ADT que se capaz de almacenar cualquier tipo de dato
Fecha de creación: 25/'08/2022
 */
package codigos.edd1158;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Muratalla
 * @param <T>
 *
 */
public class ArregloADT<T> {
    
    public static void main(String[] args) {
        ArregloADT lista = new ArregloADT(12);
        System.out.println("Dato inicial: " + lista.getItem(0));
        lista.setItem("Soy un dato...", 0);
        System.out.println("Dato modificado: " + lista.getItem(0));
        System.out.println("Tamaño de la lista: " + lista.getLenght());
        Iterator a = lista.getIterator();
        while (a.hasNext()) {
            System.out.println("-" + a.next());
        }
    }

    private final ArrayList<T> datos;

    /**
     *Constructor: crea un ArrayList con el tamaño especificado y almacena null como valor de inicio en cada espacio
     * @param tamanio
     */
    public ArregloADT(int tamanio) {
        this.datos = new ArrayList<>(tamanio);
        for (int indice = 0; indice < tamanio; indice++) {
            datos.add(null);
        }
    }

    /**
     *
     * @param indice
     * @return Regresa el valor almacenado en el indice indicado, si el indice indicado esta fuera del rango del 
     * arreglo regresa null
     */
    public T getItem(int indice) {
        if (indice >= 0 && indice < 2) {
            return datos.get(indice);
        }
        return null;
    }

    /**
     *Remplaza el dato almacenado en el indice indicado por el nuevo tipo de dato que se indique
     * @param elemento
     * @param indice
     */
    public void setItem(T elemento, int indice) { //Setter
        if (indice >= 0 && indice < datos.size()) {
            datos.set(indice, elemento);
        }
    }

    /**
     *
     * @return Regresa el tamaño de la lista 
     */
    public int getLenght() {
        return datos.size();
    }

    /**
     *Remplaza todos los datos almacenados en la lista por un dato indicado
     * @param elemento
     */
    public void clear(T elemento) {
        for (int indice = 0; indice < datos.size(); indice++) {
            datos.set(indice, elemento);
        }
    }

    public Iterator getIterator() {
        return datos.listIterator();
    }

    public Iterator getIterator(int indice) {
        return datos.listIterator(indice);
    }
}
