/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la tabal de multiplicar de dicho numero*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio13 {
	final int MAX=5, MIN=1;
	public static void main(String[] args){
		char us_char = 'i';
		int us_num, tabla;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			
			while(Character.isLowerCase(us_char)){
				
				System.out.println("Ingrese un caracter letra minuscula (cualquier otro para salir): ");
				us_char = entrada.readLine().charAt(0);
				
				 if(Character.isLowerCase(us_char)){
					 System.out.println("Ingrese un numero entre el rango de 1 y 5: ");
					 us_num = Integer.valueOf(entrada.readLine());
					 
					 	if(us_num<=5 && us_num>=1){
					 		
					 		for(int i = 1; i<= 10; i++){
					 			tabla = i*us_num;
					 			
					 			System.out.println("|"+i+"*"+us_num+"|= "+ tabla);
					 		}
					 	}
					 	else{
					 			System.out.println("Valor no valido");
					 	}
				 }
			}
			
		}
		catch(Exception exc){
			
			System.out.println(exc);
		}
	}
}