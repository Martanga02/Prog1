/*15. Implementar un método que realice un corrimiento a derecha
en un arreglo */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio15 {
    public static final int MAX = 15;

    public static void main(String[] args) {
        int arreglo[] = { 1, 2, 5, 5, 1, 3, 5, 7, 7, 5, 3, 6, 5, 22, 4 };
        int pos = obtenerpos();
        if (pos < MAX && pos >= 0) {
            imprimir_arreglo(arreglo);
            corrimiento_derecha(arreglo, pos);
            imprimir_arreglo(arreglo);
        } else {
            System.out.println("La posicion no es valida");
        }
    }

    public static void corrimiento_derecha(int[] arr, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static int obtenerpos() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int posicion = 0;

        try {
            System.out.println("ingrese una posicion entre 1 y 15");
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