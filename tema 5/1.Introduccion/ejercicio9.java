/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida. */
public class ejercicio9 {
    public static final int MAX=10;
    public static void main(String[] args) {
        char[] arreglo = {'a', 'b', 'c', 'a', 't', 'r', 'u', 'p', 'a', 'q', 'm'};
        System.out.println("Arreglo:");
        ImprimirArreglo(arreglo);
        if (SeRepite(arreglo)) {
            System.out.println("Existen letras repetidas en el arreglo.");
        } else {
            System.out.println("No existen letras repetidas en el arreglo.");
        }
    }

    public static boolean SeRepite(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            for (int j = i + 1; j < MAX; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void ImprimirArreglo(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
