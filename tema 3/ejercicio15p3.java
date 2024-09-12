/*Escribir un programa que mientras que el usuario ingrese un
número entero natural, llame a un método que calcule la
sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
1+2+3+4+5=15) y retorne el resultado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio15p3{
    public static void main (String[]args){
        int num =ObtenerNumero();
        while(num>0){
            int sumatoria = CalcularSumatoria(num);
            imprimir(sumatoria);
            num=ObtenerNumero();
        }
    }

    public static int ObtenerNumero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 1;
        try{
            System.out.println("Ingrese u numero natural(mayor a cero)");
            numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }

    public static int CalcularSumatoria(int numero){
        int suma = 0;
        for(int i=1;i<=numero;i++){
        suma+=i;
}
return suma;
    }

    private static void imprimir (int numero){
        System.out.println("El total de la sumatoria es: " + numero);
    }
}