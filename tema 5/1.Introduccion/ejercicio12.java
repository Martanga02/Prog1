/*Dado dos arreglos de números enteros: un arreglo A de tamaño MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A). */
public class ejercicio12 {
    public static final int MAXA = 4;
    public static final int MAXB = 2;

    public static void main(String[] args) {
        int[] arregloA = {3, 6, 31, 9};
        int[] arregloB = {0, 2};

        int suma = calcularSuma(arregloA, arregloB);
        System.out.println("La suma de los elementos de A indicados por B es: " + suma);
    }

    public static int calcularSuma(int[] arregloA, int[] arregloB) {
        int suma = 0;
        for (int i = 0; i < MAXB; i++) {
            int posicion = arregloB[i];
            if (posicion >= 0 && posicion < MAXA) {
                suma += arregloA[posicion];
            } else {
                System.out.println("Error: La posición " + posicion + " está fuera de rango.");
            }
        }
        return suma;
    }
}

/*Explicacion:
-calcularSuma es un método estático que devuelve un entero (int), que representa la suma de los elementos de arregloA indicados por arregloB.
-suma es una variable entera que se inicializa en 0 para almacenar la suma total.
-Se recorre el arreglo arregloB usando un bucle for. En cada iteración, i representa el índice actual de arregloB.
-Se obtiene el valor de arregloB[i] y se guarda en la variable posicion.
-Se verifica si posicion está dentro de los límites válidos de arregloA (es decir, si es una posición válida dentro de arregloA).
-Si es válida, se suma arregloA[posicion] a la variable suma.
-Si no es válida (es decir, si posicion está fuera de los límites de arregloA), se imprime un mensaje de error en la consola usando System.err.println.
-Finalmente, se devuelve el valor de suma. */
