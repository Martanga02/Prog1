/*11. Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio11p1{
    public static void main (String [] args){
        int num1;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println( "¿ " + num1 + " es multiplo de 6 y 7? " +(num1%6 ==0 && num1%7==0));
			
			System.out.println("¿ "+ num1 + " es mayor a 30 y múltiplo de 2,"
											+ " o es menor igual a 30? " +
											((num1>30 && num1%2 ==0)||(num1<=30)));
			System.out.println( "¿el cociente de la división de "+ num1 + " por 5 es mayor que 10 " +(num1/5 > 10));
            }
            catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}