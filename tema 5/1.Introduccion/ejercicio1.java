/*1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado. */

public class ejercicio1 {
    final static int MAXFILA = 5, MAXCOLUMNA = 10;
    public static void main(String[] args){
        int [][] matriz = {{1,3,4,5,6,3,2,7,5},{1,3,4,5,6,3,2,7,5},{1,3,4,5,6,3,2,7,5},{1,3,4,5,6,3,2,7,5},{1,3,4,5,6,3,2,7,5}};
    }

    public static void imprimirmatriz(int [][] mat){
        for(int i = 0; i < MAXFILA; i ++){
            for(int j = 0; j < MAXCOLUMNA; j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println("");
        }
    }
}