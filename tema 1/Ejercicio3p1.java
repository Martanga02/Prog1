/*3. Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema? */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio3p1{
    public static void main (String [] args) {
       int variable = 0;
       try { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Ingrese un valor entero: ");
        variable = Integer.valueOf(entrada.readLine());
        System.out.println("Entero ingresado : " + variable);
        }
        catch (Exception exc ) {
        System.out.println( exc );
        } 
    }
}