/*5. Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio5p1{
    public static void main (String [] args){
    String nombre;
    int edad;
    double altura;
    String ocupacion;
    try { 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Ingrese su  Nombre: ");
        nombre = entrada.readLine();
        System.out.println ("Ingrese su edad: ");
        edad = Integer.valueOf(entrada.readLine());
        System.out.println ("Ingrese su altura: ");
        altura = Double.valueOf(entrada.readLine());
        System.out.println ("Ingrese su ocupacion: ");
        ocupacion = entrada.readLine();
        System.out.println("Los datos ingresados son : " );
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Altura : " + altura);
        System.out.println("Ocupacion : " + ocupacion);
        }
        catch (Exception exc ) {
        System.out.println( exc );
        } 
    }
}