/*11. Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio11p3 {
	
	public static double numMayor(double num1,double num2) {
		if (num1>num2)
		return num1;
		else if (num1==num2)
			return num1;
		else return num2;
	}
	
	public static void main (String [] args) {
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		double num2,maximoNumero;
		final int max=20;
		try {
			System.out.println("ingrese un numero");
			maximoNumero= new Float(entrada.readLine());
			
				for (int i = 1; i <= max; i++) {
					System.out.println("ingrese un numero");
					num2 = new Float(entrada.readLine());
				maximoNumero= numMayor(maximoNumero,num2);
				}
			
		} 
		catch(Exception exc){
            System.out.println(exc);
		}
	}
}