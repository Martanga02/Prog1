/*Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente. */
public class ejercicio8 {
    public static final int MAX=10;
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Arreglo:");
        ImprimirArreglo(arreglo);
        boolean enOrdenAscendente = Determinar(arreglo);
        if (enOrdenAscendente) {
            System.out.println("Los elementos están en orden ascendente.");
        } else {
            System.out.println("Los elementos no están en orden ascendente.");
        }
    }

    public static boolean Determinar(int[] arr) {
        for (int i = 1; i < MAX; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void ImprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
