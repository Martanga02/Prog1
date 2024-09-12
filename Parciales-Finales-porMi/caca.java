public class caca {
    final static int MAX_A = 41;
    final static int MAX_S = 20;
    final static char SEPARADOR = ' ';

    public static void main(String[] args) {
        char[] arreglo = {' ', 'l', 'a', ' ', 'c', 'a', 's', 'a', ' ', 'r', 'o', 'j', 'a', ',', ' ', 'a', ' ', 'l', 'a', ' ', 'v', 'u', 'e', 'l', 't', 'a', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'e', 's', 'q', 'u', 'i', 'n', 'a', '.'};
        char[] stopwords = {' ', 'a', ' ', 'l', 'a', ' ', 'l', 'o', 's', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'l', 'a', 's', ' '};
        System.out.println("El arreglo original es: ");
        ImprimirArreglo(arreglo);
        EliminarStopWords(arreglo, stopwords);
        System.out.println("El arreglo modificado es: ");
        ImprimirArreglo(arreglo);
    }

    public static int BuscarInicio(char[] arr, int pos) {
        while (pos < MAX_A && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(char[] arr, int pos) {
        while (pos < MAX_A && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void CorrimientoIzquierda(char[] arr, int inicio, int fin) {
        int k = inicio;
        for (int i = fin + 1; i < MAX_A; i++) {
            if (k < MAX_A) {
                arr[k++] = arr[i];
            }
        }
        // Rellenar el resto con SEPARADOR
        for (int i = k; i < MAX_A; i++) {
            arr[i] = SEPARADOR;
        }
    }

    public static void EliminarStopWords(char[] arr, char[] stop) {
        int inicio = BuscarInicio(arr, 0);
        while (inicio < MAX_A) {
            int fin = BuscarFin(arr, inicio);
            if (Comparar(arr, stop, inicio, fin)) {
                CorrimientoIzquierda(arr, inicio, fin);
                // Después de mover los elementos a la izquierda, continuar buscando desde el inicio
                inicio = BuscarInicio(arr, 0);
            } else {
                inicio = BuscarInicio(arr, fin + 1);
            }
        }
    }

    public static boolean Comparar(char[] arr, char[] stop, int inicio, int fin) {
        int longitudPalabra = fin - inicio + 1;
        int inicioStop = BuscarInicio(stop, 0);
        int finStop;
        while (inicioStop < MAX_S) {
            finStop = BuscarFin(stop, inicioStop);
            int longitudStop = finStop - inicioStop + 1;
            if (longitudPalabra == longitudStop) {
                boolean coincide = true;
                for (int i = 0; i < longitudPalabra; i++) {
                    // Verifica los límites de los arreglos para evitar errores de índice
                    if (inicio + i >= MAX_A || inicioStop + i >= MAX_S || arr[inicio + i] != stop[inicioStop + i]) {
                        coincide = false;
                        break;
                    }
                }
                if (coincide) {
                    return true;
                }
            }
            inicioStop = BuscarInicio(stop, finStop + 1);
        }
        return false;
    }

    public static void ImprimirArreglo(char[] arr) {
        for (int i = 0; i < MAX_A; i++) {
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }
}
