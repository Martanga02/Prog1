/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B. */
public class ejercicio11 {
    public static final int MAX=10;
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {1, 2, 3, 4, 5, 11, 23, 45, 67, 89};
        imprimirArreglos(A);
        imprimirArreglos(B);
        if (estanPresentes(A, B)) {
            System.out.println("Todos los números existen");
        } else {
            System.out.println("No todos los números existen");
        }
    }

    public static boolean estanPresentes(int[] A, int[] B) {
        for (int i = 0; i < MAX; i++) {
            boolean encontrado = false;
            for (int j = 0; j < MAX; j++) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break; // Salir del segundo bucle ya que el número fue encontrado
                }
            }
            if (!encontrado) {
                return false; // Si algún número no se encontró, retornar falso
            }
        }
        return true; // Todos los números de A están en B
    }

    public static void imprimirArreglos(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(); // Imprimir un salto de línea después del arreglo
    }
}
