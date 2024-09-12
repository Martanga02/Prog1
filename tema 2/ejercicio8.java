/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio8{
    public static final int fijo = 0;
    public static void main (String[] args){
int entero = 0;
int numero = 0;
BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
try{
    while (entero!=fijo){
        System.out.println("Ingrese un numero distinto a cero");
        entero = Integer.valueOf(entrada.readLine());
        if(entero!=0){
            System.out.println("ingrese otro numero entero");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("El numero ingresado es :" + numero);
        }
        else{
            System.out.println("El numero ingresado fue cero, termino la secuencia");
        }
    }
}
catch(Exception exc){
    System.out.println(exc);
    }
 }
}