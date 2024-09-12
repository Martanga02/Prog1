/*Pedir por consola un número entero e informar si es un número
primo. Un número es primo si solo es divisible por 1 y por sí
mismo. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio21{
    public static void main (String [] args){
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(numero>0){
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            if((numero/1==numero)&&(numero/numero==1)){
                System.out.println("El numero es primo");
            }
            else{
                System.out.println("El numero no es primo");
            }
        }
    }
        catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}