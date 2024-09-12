/*3. Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado. */
public class ejercicio3{
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arreglo={1,2,3,4,5,6,7,8,9,10};
        ImprmirArreglo(arreglo);
        double promedio= CalcularPromedio(arreglo);
        System.out.println("El promedio del arreglo es : " + promedio);
        int mayor = Encima(arreglo, promedio);
        System.out.println("La cantidad de elementos encima del promedio son :" + mayor);
    }

    public static double CalcularPromedio(int[]arr){
        double suma=0;
        for(int i=0;i<MAX;i++){
            suma+=arr[i];
        }
        return suma/MAX;
    }
    public static int Encima(int[]arr,double promedio){
        int suma=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]>promedio){
                suma++;
            }
        }
        return suma;
    }
    public static void ImprmirArreglo(int[]arr){
        for(int i =0; i<MAX;i++){
            System.out.println("|" + arr[i] + "|");
        }
    }
}