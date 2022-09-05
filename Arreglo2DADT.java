package codigos.edd1158;

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
            matriz.setElemento(new ArregloADT(columnas), fila);
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
        if (fila >= 0 && fila < this.filas && columna >= 0 && columna < this.columnas) {
            return (T) (matriz.getElemento(fila).getElemento(columna));
        }
        return null;
    }

    public void setElemento(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < this.filas && columna >= 0 && columna < this.columnas) {
            matriz.getElemento(fila).setElemento(elemento, columna);
        }
    }

    public void clear(T elemento) {
        for (int fila = 0; fila < this.filas; fila++) {
            for (int columna = 0; columna < this.columnas; columna++) {
                matriz.getElemento(fila).setElemento(elemento, columna);
            }
        }
    }

    @Override
    public String toString() {
        return "[" + matriz.toString() + "]";
    }
    
    public static void main(String[] args) {
        Arreglo2DADT dd = new Arreglo2DADT(1, 2);
        System.out.println(dd.toString());
    }
}