public class Prefinal {

    final static int MAXF = 4;
    final static int MAXC = 15;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int [][] ventas = {{0, 625, 815, 900, 0, 562, 952, 300, 0, 365, 169, 254, 0, 0, 0},
                           {0, 958, 62, 57, 221, 0, 596, 623, 600, 0, 587, 889, 984, 0, 0},
                           {0, 0, 700, 257, 0, 0, 0, 854, 958, 388, 0, 954, 842, 925, 0},
                           {0, 988, 899, 874, 0, 254, 258, 652, 200, 0, 568, 958, 210, 0, 0}};
        int diasConsecutivosQueDebenCumplir = 2;

        procesarVentas(ventas, diasConsecutivosQueDebenCumplir);
    }

    public static void procesarVentas(int[][] ventas, int diasConsecutivosQueDebenCumplir) {
        int diasConsecutivosQueCumplen = 0;
        int i = 0;
        while (i < MAXF && diasConsecutivosQueCumplen < diasConsecutivosQueDebenCumplir) {
            if (hayPromedioDeVentasAscendente(ventas[i]))
                diasConsecutivosQueCumplen++;
            else
                diasConsecutivosQueCumplen = 0;
            i++;
        }

        if (diasConsecutivosQueCumplen < diasConsecutivosQueDebenCumplir)
            System.out.println("No hubo " + diasConsecutivosQueDebenCumplir + " días consecutivos cuyas ventas promedio por hora crecieron ascendentemente.");
        else
            System.out.println("Hubo al menos " + diasConsecutivosQueDebenCumplir + " días consecutivos cuyas ventas promedio por hora crecieron ascendentemente.");

    }

    public static boolean hayPromedioDeVentasAscendente(int[] ventaDiaria) {
        int ini = 0;
        int fin = -1;
        double promedio;
        double promedioAnterior = -1;
        boolean esAscendente = true;

        while (ini < MAXC && esAscendente) {
            ini = buscarInicio(ventaDiaria, fin + 1);
            if (ini < MAXC) {
                fin = buscarFin(ventaDiaria, ini);
                // Calcula el promedio de ventas en la hora 
                promedio = calcularPromedioDeVentas(ventaDiaria, ini, fin);
                esAscendente = promedioAnterior <= promedio;
                promedioAnterior = promedio;
            }
        }

        return esAscendente;
    }

    public static double calcularPromedioDeVentas(int[] ventaDiaria, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++)
            suma += ventaDiaria[i];
        
        return (double) suma / (fin - ini + 1);
    }

    public static int buscarInicio(int[] arreglo, int pos) {
        while (pos < MAXC && arreglo[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arreglo, int pos) {
        while (pos < MAXC && arreglo[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }

}