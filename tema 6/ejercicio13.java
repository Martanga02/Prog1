/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, y un número entero ingresado por
el usuario, elimine de cada fila las secuencias de tamaño igual al
número ingresado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio13 {
    public static final int FILAS = 3;
    public static final int COLUMNAS = 8;

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 3, 5, 0, 6, 7, 0},
                {3, 45, 5, 0, 6, 7, 0, 0},
                {1, 2, 0, 4, 0, 6, 7, 8}
        };

        int entero = ObtenerNumero();
        ImprimirMatriz(matriz);
        EliminarSecuencias(matriz, entero);
        System.out.println("Matriz después de eliminar secuencias de tamaño " + entero + ":");
        ImprimirMatriz(matriz);
    }

    public static void EliminarSecuencias(int[][] matriz, int entero) {
        for (int fila = 0; fila < FILAS; fila++) {
            int contador = 0; // Variable para contar la longitud de la secuencia actual en la fila

            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (matriz[fila][columna] != 0) {
                    contador++;
                    if (contador == entero) { // Si se encuentra una secuencia del tamaño especificado
                        for (int k = columna - entero + 1; k <= columna; k++) {
                            matriz[fila][k] = 0; // Establece los elementos de la secuencia como cero
                        }
                        contador = 0; // Reinicia el contador
                    }
                } else {
                    contador = 0; // Reinicia el contador si se encuentra un cero
                }
            }
        }
    }

    public static int ObtenerNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            System.out.println("Ingrese un número entero: ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirMatriz(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
