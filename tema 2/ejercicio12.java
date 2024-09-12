/*Escribir un programa que mientras el usuario ingrese un
carácter letra minúscula, se quede con la menor y la mayor letra
ingresada. Finalmente muestre por pantalla dichas letras. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12 {
	public static void main(String []args){
		
		char caracter = 1, maxchar= 'a', minchar='z';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			while(true){
				System.out.println("Ingrese un caracter letra minuscula (0 para salir):");
				caracter = entrada.readLine().charAt(0);
				
				if(caracter == '0'){
					break;
				}
				
				if(caracter<='z'&& caracter>='a'){
					if(caracter < minchar){
						minchar = caracter;
					}
					if(caracter > maxchar){
						maxchar= caracter;
					}
				}
				else{
					System.out.println("El numero ingresado no es una minuscula");
				}
			}
			System.out.println("El maximo caracter ingresado es: "+ maxchar);
			System.out.println("El minimo caracter ingresado es: "+ minchar);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}