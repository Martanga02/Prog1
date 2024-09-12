/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio. */
public class ejercicio1{
    public static final int MAXFILA=5, MAXCOLUMNA=10;
    public static void main (String[]args){
        int [][] matriz={{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        System.out.println("Matriz orginal: ");
        ImprimirMatriz(matriz);
        System.out.println("Matriz invertida: ");
        InvertirOrden(matriz);
    }

    public static void InvertirOrden(int[][]mat){
        for(int i=MAXFILA -1; i>=0;i--){
            for(int j=MAXCOLUMNA -1; j>=0;j--){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println("");
        }
    }
    public static void ImprimirMatriz(int[][]mat){
        for(int i =0;i<MAXFILA;i++){
            for(int j=0;j<MAXCOLUMNA;j++){
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println("");
        }
    }
}