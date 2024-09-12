/*Hacer un programa que dado un arreglo de caracteres de tamaño
MAX que se encuentra cargado, invierta el orden del contenido. */
public class ejercicio5{
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arreglo={1,2,3,4,5,6,7,8,9,10};
        ImprimirArreglo(arreglo);
        System.out.println(" ");
        InvertirOrden(arreglo);

    }
    public static void InvertirOrden(int[]arr){
        for(int i=MAX-1;i>=0;i--){
            System.out.print("|" + arr[i] + "|");
        }
    }

    public static void ImprimirArreglo(int []arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}