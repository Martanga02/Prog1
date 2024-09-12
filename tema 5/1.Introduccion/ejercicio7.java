/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio7{
    public static final int MAX=10;
    public static void main (String[]args){
        int[]arreglo={1,2,3,4,5,6,7,8,9,10};
        System.out.println("El arreglo original es: ");
        ImprmirArreglo(arreglo);
        System.out.println("Ingrese un numero para buscarlo en el arreglo: ");
        int num= ObtenerNumero();
        System.out.println("Ingrese un numero para multiplicarlo por los del arreglo: ");
        int multiplo=ObtenerNumero();
        int posicion=BuscarPos(arreglo, num,multiplo);
        System.out.println("El numero " + num + " se encontro en el arreglo, y multiplicado por " + multiplo + " da como resultado: " + posicion);

    }

    public static int BuscarPos(int []arr,int num,int multiplo){
        int pos=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]==num){
                pos=arr[i];
            }
        }
        return (pos*multiplo);
    }
    public static int ObtenerNumero(){
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        try{
            numero= Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
            return numero;
    }

    public static void ImprmirArreglo(int[]arr){
        for(int i=0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
    }
}