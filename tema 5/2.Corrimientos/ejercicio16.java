/*16. Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int pos = obtener_posicion();
        imprimir_arreglo(arreglo);
        corrimiento_izquierda(arreglo, pos);
        imprimir_arreglo(arreglo);
    }

    public static void corrimiento_izquierda(int[] arr, int pos) {
        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;
        }
    }

    public static int obtener_posicion() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int posicion = 0;
        try {
            System.out.println("Ingrese una posicion entre 0 y 9");
            posicion = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return posicion;
    }

    private static void imprimir_arreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println("");
    }
}