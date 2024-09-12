/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio14{
    final static int MAX=10;
    public static void main (String[] args){
        int numero=0;
        int contador=0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            for(int i=0; i< MAX; i++){
                System.out.println("Ingrese un numero entero positivo:");
                numero = Integer.valueOf(entrada.readLine());
                if(numero%2==0){
                contador++;
                }
                else{
                    System.out.println("El numero ingresado no es valido");
                }
                System.out.println("La cantidad de numeros pares ingresados es:" + contador);
            }
        }
        catch(Exception exc){
			
			System.out.println(exc);
		}
    }
}