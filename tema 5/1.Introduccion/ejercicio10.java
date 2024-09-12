/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio10 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ImprimirArreglo(arreglo);
        int N = ObtenerNumero();
        if (TieneAlMenosNPrimos(arreglo, N)) {
            System.out.println("El arreglo tiene al menos " + N + " números primos.");
        } else {
            System.out.println("El arreglo no tiene al menos " + N + " números primos.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean TieneAlMenosNPrimos(int[] arr, int N) {
        int contadorPrimos = 0;
        for (int num : arr) {
            if (esPrimo(num)) {
                contadorPrimos++;
            }
        }
        return contadorPrimos >= N;
    }

    public static int ObtenerNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        try {
            System.out.println("Ingrese un número: ");
            numero = Integer.parseInt(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
