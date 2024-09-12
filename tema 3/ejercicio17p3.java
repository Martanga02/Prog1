import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio17p3 {
	public static final int MAX =5,MIN =1;
	
	public static void main(String[]args){
		int us_num;
		char us_char = obtener_char();
		
		while(Character.isLowerCase(us_char)){
			
			us_num =obtener_num();
			
			if((us_num<=MAX)&&(us_num>=MIN)){
				imprimir_tabla(us_num);
			}
			else{
				System.out.println("Error!, el numero tiene que estar entre "+MAX+" y "+MIN+" inclusive y se entero.");
			}
			
			us_char =obtener_char();
		}
	}
	
	public static char obtener_char(){
		char us_char = ' ';
		BufferedReader entrada= new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter letra minuscula (cuaquier otra para salir): ");
			us_char = entrada.readLine().charAt(0);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return us_char;
	}
	
	public static int obtener_num(){
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int num =1;
		
		try{
			System.out.println("Ingrese un numero entre 1 y 5 inclusive: ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
		return num;
	}
	
	private static void imprimir_tabla(int num){
		for(int i = 1; i<=10; i++ ){
			System.out.println("|"+i+"*"+num+"|="+(i*num));
		}
	}

}