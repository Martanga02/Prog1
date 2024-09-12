
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio16p3 {
	public static final int MAX=12, MIN=1;
	public static void main(String[]args){
		int us_num =obtener_num();
		
		while((us_num<=MAX)&&(us_num>=MIN)){
			
			switch(us_num){
			
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				int num = 31;
				imprimir(num);
				break;
				
			case 4:case 6:case 9:case 11:
				num = 30;
				imprimir(num);
				break;
				
			case 2:
				num = 28;
				imprimir(num);
				break;
			}
			us_num = obtener_num();
		}
	}
	
	public static int obtener_num(){
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int num =1;
		
		try{
			System.out.println("Ingrese un numero: ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
		return num;
	}
	
	private static void imprimir(int num){
		
		System.out.println("La catidad de dias que tiene el mes de " +num+" dias.");
	}
}