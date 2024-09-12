/*17. Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio17 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int arreglo[] = { 1, 2, 5, 7, 23, 4, 7, 8, 5, 3 };
        int num = ObtenerNumero();
        int pos = 0;
        ImprimirArreglo(arreglo);
        CorrimientoDerecha(arreglo, num, pos);
        InsertarNumero(arreglo, num, pos);
        ImprimirArreglo(arreglo);

    }

    public static void CorrimientoDerecha(int[] arr, int num, int pos) {
        int i = MAX - 1;
        while (i > pos) {
            arr[i] = arr[i - 1];
            i--;
        }
    }

    public static void InsertarNumero(int[] arr, int num, int pos) {
        arr[pos] = num;
    }

    public static int ObtenerNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            System.out.println("Ingrese un numero enteroculo: ");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println("");
    }
}