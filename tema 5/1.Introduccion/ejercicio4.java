/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4{
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arreglo={1,2,3,4,5,6,7,8,9,10};
        ImprimirArreglo(arreglo);
        int num = ObtenerNumero();
        buscarPosicion(arreglo, num);
    }

    public static int ObtenerNumero(){
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        try{
            System.out.println("Ingrese un numero: ");
            numero=Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }


    public static void buscarPosicion(int[]arr,int num){
        for(int i=0;i<MAX;i++){
            if(arr[i]==num){
                System.out.println("El elemento existe y esta en la posicion:" + i);
            }
        }
    }
    public static void ImprimirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}