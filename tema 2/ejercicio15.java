/*Pedir por consola el ingreso de números enteros. Cuando se
ingrese un 0 se debe terminar el programa informando el
promedio de los números ingresados, cuál fue el mayor número y
cuál fue el menor número. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio15 {
	final static int  cero = 0;
	public static void main(String []args){
		int numero = 1, promedio = 0, suma = 0, mayor = 0, menor = 999;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			while(numero != cero){
				
				System.out.println("Ingrese un numero por favor (0 para salir): ");
				numero = Integer.valueOf(entrada.readLine());
				
				 if(numero != cero){
					 promedio++;
					 suma += numero;
					 
					 if(numero > mayor){
						 mayor = numero;
					 }
					 if(numero < menor){
						 menor = numero;
					 }
				 }
			}
			if(promedio != 0){
				
				promedio = suma/promedio;
				System.out.println("El promedio de los numero ingresados es: " +promedio);
				System.out.println("El mayor numero ingresado fue (0 no hubo ninguno): " + mayor);
				System.out.println("El menor numero ingresado fue(999 no hubo numero menor): "+ menor);
			}
			else{
				System.out.println("No se ingresaron numeros");
			}
	
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}