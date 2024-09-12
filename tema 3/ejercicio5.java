/*5. Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina, imprimir por pantalla “terminó”. */

public class ejercicio5 {
	
	public static final int MAX = 4;
	
	public static void main(String [] args){
		//Toma valor 1 por teclado y lo envia al metodo "ciclo incremento"
		// los valores van hasta imprimir hasta que el numero sea 4 y el metodo imprime "Termino".
		
	}
	public static void ciclo_incremento(){
		
		for(int i=1; i<=MAX; i++){
			
			imprimir(i);
		}
	}
	
	private static void imprimir(int numero){
		System.out.println(numero);
		if (numero == 4){
		System.out.println("Termino.");
		}
	}
}