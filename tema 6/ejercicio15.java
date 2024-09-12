/*Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada elimine todas las secuencias que
tienen orden descendente entre sus elementos. */
public class ejercicio15 {

    public static final int FILAS = 3;
    public static final int COLUMNAS = 8;
    public static final char DELIMITADOR = ' ';

    public static void main(String[] args) {
        char[][] matriz = {
                {' ', 'a', 'b', 'c', 'd', 'e', ' ', ' '},
                {' ', 'f', 'e', 'd', 'c', 'b', 'a', ' '},
                {' ', 'a', 'z', 'y', 'x', 'w', ' ', ' '}
        };

        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);

        eliminarSecuenciasDescendentes(matriz);

        System.out.println("Matriz con secuencias descendentes eliminadas:");
        imprimirMatriz(matriz);
    }

    public static void eliminarSecuenciasDescendentes(char[][] matriz) {
        for (int fila = 0; fila < FILAS; fila++) {
            int inicio = obtenerInicioSecuencia(matriz[fila], 0);

            while (inicio < COLUMNAS - 1) {
                int fin = obtenerFinSecuencia(matriz[fila], inicio);

                if (esDescendente(matriz[fila], inicio, fin)) {
                    eliminarSecuencia(matriz[fila], inicio, fin);
                    inicio = obtenerInicioSecuencia(matriz[fila], inicio); // Revisar desde el inicio después de eliminar
                } else {
                    inicio = obtenerInicioSecuencia(matriz[fila], fin + 1);
                }
            }
        }
    }

    public static boolean esDescendente(char[] fila, int inicio, int fin) {
        for (int i = inicio; i < fin; i++) {
            if (fila[i] <= fila[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void eliminarSecuencia(char[] fila, int inicio, int fin) {
        // Corrimiento a la izquierda para eliminar la secuencia descendente
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
