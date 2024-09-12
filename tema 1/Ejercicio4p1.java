/*4. Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio4p1{
    public static void main (String [] args){
    int var1;
    int var2;
    int var3;
    int var4;
    int var5;
    try { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Ingrese 5 valores enteros: ");
        var1 = Integer.valueOf(entrada.readLine());
        var2 = Integer.valueOf(entrada.readLine());
        var3 = Integer.valueOf(entrada.readLine());
        var4 = Integer.valueOf(entrada.readLine());
        var5 = Integer.valueOf(entrada.readLine());
        System.out.println("Los enteros ingresados son : " + var5 + var4 + var3 + var2 + var1);
        }
        catch (Exception exc ) {
        System.out.println( exc );
        } 
    }
}