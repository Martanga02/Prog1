/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10 {
	public static void main(String []args){
	final int MAX =10;
    final int MIN =1;
	int numero = MIN, suma = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			while((numero>=MIN)&&(numero<=MAX)){
				System.out.println("Ingrese un numero entre 1 y 10 (fuera de rango para salir): ");
				numero = Integer.valueOf(entrada.readLine());
				
				if((numero>=MIN)&&(numero<=MAX)){
					suma += numero;
				}
			}
			System.out.println("La suma de todos los numeros ingresados es: " + suma);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}