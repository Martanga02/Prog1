/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, permita obtener a través de
métodos la posición de inicio y la posición de fin de la secuencia
ubicada a partir de una posición entera y una fila, ambas
ingresadas por el usuario. Finalmente, si existen imprima por
pantalla ambas posiciones obtenidas. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 12; // Ajustado a 12 para incluir el separador
    public static final int SEPARADOR = 0;

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0}
        };

        System.out.println("Ingrese una fila: ");
        int fila = ObtenerNumero();
        System.out.println("Ingrese un número entero: ");
        int num = ObtenerNumero();

        int inicio = 0;
        int fin = -1;

        while (inicio < MAXCOLUMNA) {
            inicio = BuscarIni(matriz[fila], fin + 1);
            if (inicio < MAXCOLUMNA) { // realmente encontré un inicio válido
                fin = BuscarFin(matriz[fila], inicio);
                // aca ya tenemos una secuencia valida de ini a fin
                System.out.println("Apartir del numero " + num + " El inicio de la secuencia es en : " + inicio + " y el fin de la secuencia: " + fin);
            }
        }
    }

    public static int BuscarIni(int[] fila, int ini) {
        while (ini < MAXCOLUMNA && fila[ini] == SEPARADOR) {
            ini++;
        }
        return ini;
    }

    public static int BuscarFin(int[] fila, int fin) {
        while (fin < MAXCOLUMNA && fila[fin] != SEPARADOR) {
            fin++;
        }
        return fin - 1;
    }

    public static int ObtenerNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }
}
