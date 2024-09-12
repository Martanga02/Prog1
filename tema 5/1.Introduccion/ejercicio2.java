/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola. */
public class ejercicio2{
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arreglo={1,2,3,4,5,6,7,8,9,10};
        ImprmirArreglo(arreglo);
        double promedio= CalcularPromedio(arreglo);
        System.out.println("El promedio del arreglo es : " + promedio);
    }

    public static double CalcularPromedio(int[]arr){
        double suma=0;
        for(int i=0;i<MAX;i++){
            suma+=arr[i];
        }
        return suma/MAX;
    }
    public static void ImprmirArreglo(int[]arr){
        for(int i =0; i<MAX;i++){
            System.out.println("|" + arr[i] + "|");
        }
    }
}