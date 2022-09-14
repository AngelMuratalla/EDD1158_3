
package codigos.JuegoVida;

import codigos.edd1158.Arreglo2DADT;

/**
 *
 * @author rodol
 */
public final class Tablero {

    Arreglo2DADT<Celula> tablero;

    public Tablero() {
        this.tablero = new Arreglo2DADT(10, 10);
        limpiarTablero();
    }

    public int[] buscarVecinos(int fila, int columna) {
        int[] vivos_muertos = {0, 0};
        int numVecinos = 0;
        if (comprobarRango(fila - 1, columna - 1)) { //1
            vivos_muertos[0] += comprobarEstado(fila - 1, columna - 1);
            numVecinos++;
        }
        if (comprobarRango(fila - 1, columna)) { //2
            vivos_muertos[0] += comprobarEstado(fila - 1, columna);
            numVecinos++;
        }
        if (comprobarRango(fila - 1, columna + 1)) { //3
            vivos_muertos[0] += comprobarEstado(fila - 1, columna + 1);
            numVecinos++;
        }
        if (comprobarRango(fila, columna + 1)) { //4
            vivos_muertos[0] += comprobarEstado(fila, columna + 1);
            numVecinos++;
        }
        if (comprobarRango(fila + 1, columna + 1)) { //5
            vivos_muertos[0] += comprobarEstado(fila + 1, columna + 1);
            numVecinos++;
        }
        if (comprobarRango(fila + 1, columna)) { //6
            vivos_muertos[0] += comprobarEstado(fila + 1, columna);
            numVecinos++;
        }
        if (comprobarRango(fila + 1, columna - 1)) { //7
            vivos_muertos[0] += comprobarEstado(fila + 1, columna - 1);
            numVecinos++;
        }
        if (comprobarRango(fila, columna - 1)) { //8
            vivos_muertos[0] += comprobarEstado(fila, columna - 1);
            numVecinos++;
        }
        vivos_muertos[1] = numVecinos - vivos_muertos[0];
        return vivos_muertos;
    }

    private boolean comprobarRango(int fila, int columna) {
        return (fila >= 0 && fila < 10 && columna >= 0 && columna < 10);
    }

    private int comprobarEstado(int fila, int columna) {
        if (tablero.getElemento(fila, columna).isEstado()) {
            return 1;
        }
        return 0;
    }
    
    public Celula getCelula(int fila, int columna){
        return tablero.getElemento(fila, columna);
    }

    public void cambiarEstado(int fila, int columna, boolean vivo) {
        tablero.getElemento(fila, columna).setEstado(vivo);
    }
    
    public void limpiarTablero(){
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                tablero.setElemento(filas, columnas, new Celula(false));
            }
        }
    }

    @Override
    public String toString() {
        return tablero.toString();
    }
    
}
