/*12. Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio12p1{
    public static void main (String[] args){
        int num1;
        int num2;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese un numero: ");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println ("El numero original es: " + num1 + ("El numero incrementado es : " + (num1+ 1)));
            System.out.println ("El numero original es: " + num2 + ("El numero decrementado es : " + (num2-1)));
            
            }
            catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}