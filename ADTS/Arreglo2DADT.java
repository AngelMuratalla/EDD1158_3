package codigos.edd1158;

import codigos.JuegoVida.Celula;

/**
 * Esta clase tiene como proposito crear matrices que sean capaz de almacenar
 * cualquier cosa
 *
 * @author AngelMuratalla
 * @param <T>
 */
public class Arreglo2DADT<T> {

    int filas, columnas;
    ArregloADT<ArregloADT> matriz;

    public Arreglo2DADT(int filas, int columnas) {
        this.matriz = new ArregloADT(filas);
        for (int fila = 0; fila < matriz.getLenght(); fila++) {
            matriz.setElemento(fila, new ArregloADT(columnas));
        }
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public T getElemento(int fila, int columna) {
        if (fila >= 0 && fila < this.filas) {
            return (T) (matriz.getElemento(fila).getElemento(columna));
        }
        return null;
    }

    public void setElemento(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < this.filas) {
            matriz.getElemento(fila).setElemento(columna, elemento);
        }
    }

    public void limpiar(T elemento) {
        for (int fila = 0; fila < this.filas; fila++) {
            matriz.getElemento(fila).clear(elemento);
        }
    }

    @Override
    public String toString() {
        String salida = "";
        for (int fila = 0; fila < this.filas; fila++) {
            for (int columna = 0; columna < this.columnas; columna++) {
                salida += String.format("%-5s ", matriz.getElemento(fila).getElemento(columna));
            }
            salida += "\n";
        }
        return salida;
    }
    
    public static void main(String[] args) {
        Arreglo2DADT<Celula> dd = new Arreglo2DADT(10, 10);

        Celula c = new Celula(false);
        dd.setElemento(0, 0, c);
        dd.getElemento(0, 0);
       ((Celula)dd.getElemento(0, 0)).setEstado(true);
        System.out.println(dd);
        dd.limpiar(new Celula(false));
        System.out.println(dd);
        ((Celula)dd.getElemento(0, 0)).setEstado(true);
        System.out.println(dd);
    }
}