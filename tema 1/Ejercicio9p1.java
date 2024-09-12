/*9. Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio9p1{
    public static void main (String [] args){
        int numero;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());
            double cociente2= (numero/2);
            double cociente3= (numero/3);
            double cociente4= (numero/4);
            System.out.println ("El cociente de la division del numero ingresado dividido 2 es: " + cociente2);
            System.out.println ("El cociente de la division del numero ingresado dividido 3 es: " + cociente3);
            System.out.println ("El cociente de la division del numero ingresado dividido 4 es: " + cociente4);
            }
            catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}