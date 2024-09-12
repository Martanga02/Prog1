/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, elimine de cada fila todas las
ocurrencias de una secuencia patrón dada por un arreglo de
caracteres de tamaño igual al tamaño de columnas de la matriz
(sólo tiene esa secuencia con separadores al inicio y al final). Al
eliminar en cada fila se pierden los valores haciendo los
corrimientos. */

public class ejercicio14 {
    public static final int FILAS = 5;
    public static final int COLUMNAS = 8;
    public static final char DELIMITADOR = ' ';
    public static final int TAMANIO_PATRON = COLUMNAS; // Tamaño del patrón igual al número de columnas

    public static void main(String[] args) {
        char[][] matriz = {
            {' ', 'a', 'e', 'b', 'r', 'z', ' ', ' '},
            {' ', 'c', 'h', 'z', 'r', 'z', ' ', ' '},
            {' ', 'a', 'e', 'b', 'r', 'z', ' ', ' '},
            {' ', 'a', 'w', 'b', 'r', 'z', ' ', ' '},
            {' ', 'a', 'e', 'b', 'r', 'z', ' ', ' '}
        };

        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);
        
        char[] patron = {' ', 'a', 'e', 'b', 'r', 'z', ' '}; // Patrón a eliminar de cada fila
        eliminarSecuenciasPatron(matriz, patron);
        
        System.out.println("Matriz después de eliminar secuencias patrón:");
        imprimirMatriz(matriz);
    }

    public static void eliminarSecuenciasPatron(char[][] matriz, char[] patron) {
        for (int fila = 0; fila < FILAS; fila++) {
            int inicio = obtenerInicioSecuencia(matriz[fila], 0);
            
            while (inicio <= COLUMNAS - TAMANIO_PATRON) {
                int fin = obtenerFinSecuencia(matriz[fila], inicio);

                if (sonIguales(matriz[fila], patron, inicio, fin)) {
                    eliminarSecuencia(matriz[fila], inicio, fin);
                    inicio = obtenerInicioSecuencia(matriz[fila], inicio); // Revisar desde el inicio después de eliminar
                } else {
                    inicio = obtenerInicioSecuencia(matriz[fila], fin + 1);
                }
            }
        }
    }

    public static boolean sonIguales(char[] fila, char[] patron, int inicio, int fin) {
        int longitudPatron = patron.length;
        int tamanoSecuencia = fin - inicio + 1;

        if (tamanoSecuencia != longitudPatron) {
            return false;
        }

        for (int i = inicio, j = 0; i <= fin; i++, j++) {
            if (fila[i] != patron[j]) {
                return false;
            }
        }
        return true;
    }

    public static void eliminarSecuencia(char[] fila, int inicio, int fin) {
        // Corrimiento a la izquierda para eliminar la secuencia patrón
        for (int i = inicio; i <= fin; i++) {
            for (int j = i; j < fila.length - 1; j++) {
                fila[j] = fila[j + 1];
            }
            fila[fila.length - 1] = DELIMITADOR; // Establecer el último como delimitador
        }
    }

    public static int obtenerInicioSecuencia(char[] fila, int pos) {
        while (pos < COLUMNAS && fila[pos] == DELIMITADOR) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFinSecuencia(char[] fila, int pos) {
        while (pos < COLUMNAS && fila[pos] != DELIMITADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                System.out.print("|" + matriz[fila][columna] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }
}
