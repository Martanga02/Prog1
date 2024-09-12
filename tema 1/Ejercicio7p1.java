/*7. Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio7p1{
    public static void main (String [] args){
        int num1;
        int num2;
        int num3;
        int resultado;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese un numero: ");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println ("Ingrese un numero: ");
            num3 = Integer.valueOf(entrada.readLine());
            resultado = ((num1/num2) - num3);
            System.out.println ("El resultado es : " + resultado);
            }
            catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}