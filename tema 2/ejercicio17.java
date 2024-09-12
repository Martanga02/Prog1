/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio17{
    final static int MAX=10;
    final static int MIN = 1;
    public static void main(String [] args){
    int numero = 0;
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try{
        while((numero<MAX)&&(numero>MIN)){
            System.out.println("Ingres un numero menor a 10 y mayor a 1");
            numero = Integer.valueOf(entrada.readLine());
            for(int i = numero; i >=0; i--){
            System.out.println("La cuenta regresiva del numero es: " + i);
            }
        }
    }
    catch(Exception exc){
        System.out.println(exc);
    }
}
}