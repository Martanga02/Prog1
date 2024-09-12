//Declaracion de constantes
public class EjercicioTipoParcial1 {
    final static int MAX_P = 25;
    final static int MAX_T = 2;
    final static int C = 2;
    final static int R = 22;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arregloP = {0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0};
        int[] arregloT = {8, 9};
        System.out.println("El arreglo original es: ");
        ImprimirArreglo(arregloP);
        int contar = InsertarNumeroArreglo(arregloP, arregloT);
        System.out.println("En total sobraron " + contar + " productos");
        System.out.println("El arreglo modificado es: ");
        ImprimirArreglo(arregloP);
    }

    public static void ImprimirArreglo(int[] P) {
        for (int i = 0; i < MAX_P; i++) {
            System.out.print("|" + P[i] + "|");
        }
        System.out.println();
    }

    public static int BuscarIni(int[] P, int pos) {
        while (pos < MAX_P && P[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[] P, int pos) {
        while (pos < MAX_P && P[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

    public static void CorrimientoDerecha(int[] P, int pos) {
        for (int i = MAX_P - 1; i > pos; i--) {
            P[i] = P[i - 1];
        }
    }

    public static int InsertarNumeroArreglo(int[] P, int[] T) {
        int contador = C;
        int fin = -1;
        int inicio = BuscarIni(P, fin + 1);
        while (inicio < MAX_P && contador > 0) {
            fin = BuscarFin(P, inicio);
            if (Comparar(P, T, inicio, fin)) {
                if (contador > 0) {
                    CorrimientoDerecha(P, fin + 1);//agregue + 1 en fin
                    P[fin + 1] = R; // Insertar 22 en la posición correcta
                    contador--;
                }
            }
            inicio = BuscarIni(P, fin + 1);
        }
        return contador;
    }
    public static boolean Comparar(int[]P,int[]T,int inicio,int fin){
        int contador=0;
        for(int i =inicio;i<=fin;i++){
            for(int j = 0; j<MAX_T;j++){
                if(P[i]==T[j]){
                    contador++;
                }
            }
        }
        return contador>0;
    }
}