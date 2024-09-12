/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor. */
public class ejercicio11 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 12; // Ajustado a 12 para incluir el separador
    public static final int SEPARADOR = 0;

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0}
        };

        int sumaMayor = Integer.MIN_VALUE;
        int inicioMayor = -1, finMayor = -1;

        for (int fila = 0; fila < MAXFILA; fila++) {
            int inicio = 0;
            int fin = -1;

            while (inicio < MAXCOLUMNA) {
                inicio = BuscarIni(matriz[fila], fin + 1);
                if (inicio < MAXCOLUMNA) { // realmente encontré un inicio válido
                    fin = BuscarFin(matriz[fila], inicio);
                    // aca ya tenemos una secuencia válida de ini a fin
                    int suma = Sumar(matriz[fila], inicio, fin);
                    if (suma > sumaMayor) {
                        sumaMayor = suma;
                        inicioMayor = inicio;
                        finMayor = fin;
                    }
                }
            }
        }

        System.out.println("La suma mayor es: " + sumaMayor);
        System.out.println("La secuencia con suma mayor está en (" + inicioMayor + ", " + finMayor + ")");
    }

    public static int Sumar(int[] fila, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += fila[i];
        }
        return suma;
    }

    public static int BuscarIni(int[] fila, int ini) {
        while (ini < MAXCOLUMNA && fila[ini] == SEPARADOR) {
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[] fila, int ini) {
        while (ini < MAXCOLUMNA && fila[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }
}
