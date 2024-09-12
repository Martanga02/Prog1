/*12. Hacer un programa que dada la matriz de secuencias de
caracteres definida y precargada, permita encontrar por cada fila
la posición de inicio y fin de la anteúltima secuencia (considerar
comenzar a buscarla a partir de la última posición de la fila). */
public class ejercicio12 {
    public static final int FILAS = 3;
    public static final int COLUMNAS = 8; // Ajustado para ejemplo, puedes adaptar según tu necesidad

    public static void main(String[] args) {
        char[][] matriz = {
                {' ', 'a', 'b', ' ', 'c', 'd', 'e', ' '},
                {' ', 'f', ' ', 'g', 'h', 'i', ' ', 'j'},
                {' ', 'k', 'l', 'm', ' ', 'n', 'o', ' '}
        };

        ImprimirMatriz(matriz);
        BuscarAnteultimaSecuencia(matriz);
    }

    public static void BuscarAnteultimaSecuencia(char[][] matriz) {
        int[] inicio = new int[FILAS];
        int[] fin = new int[FILAS];

        for (int fila = 0; fila < FILAS; fila++) {
            // Encontrar el fin de la última secuencia (partiendo desde el final de la fila)
            fin[fila] = BuscarFin(matriz[fila], COLUMNAS - 1);
            // Encontrar el inicio de la última secuencia (partiendo desde fin)
            inicio[fila] = BuscarInicio(matriz[fila], fin[fila]);
            // Encontrar el fin de la anteúltima secuencia (partiendo desde inicio)
            fin[fila] = BuscarFin(matriz[fila], inicio[fila] - 1);
            // Encontrar el inicio de la anteúltima secuencia (partiendo desde fin de la anteúltima secuencia)
            inicio[fila] = BuscarInicio(matriz[fila], fin[fila] - 1);
        }

        for (int fila = 0; fila < FILAS; fila++) {
            System.out.println("En la fila " + fila + ", la anteúltima secuencia comienza en la posición: " + inicio[fila] + " y finaliza en la posición " + fin[fila]);
        }
    }

    public static int BuscarFin(char[] arr, int fin) {
        // Mover hacia atrás hasta encontrar un carácter diferente de ' '
        while (fin >= 0 && arr[fin] == ' ') {
            fin--;
        }
        // Si se encuentra un carácter distinto de ' ', retornar la posición actual de fin
        return fin;
    }

    public static int BuscarInicio(char[] arr, int ini) {
        // Mover hacia atrás hasta encontrar un ' ' o llegar al inicio del arreglo
        while (ini >= 0 && arr[ini] != ' ') {
            ini--;
        }
        // Si se encuentra un ' ', retornar la posición actual de ini
        return ini + 1;
    }

    public static void ImprimirMatriz(char[][] matriz) {
        // Imprimir la matriz con separadores para visualización
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
