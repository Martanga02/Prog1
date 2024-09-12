/*6. Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio6{
    public static final int MAX = 100, MIN =1;
    public static void main(String [] args){
        int numero = 1;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entre el 1 y el 100 ");
                numero = Integer.valueOf(entrada.readLine());
            while((numero<100)&&(numero>1)){
            if ((numero%2==0)&&(numero%3==0))
            System.out.println("El numero es multiplo de 2 y de 3 simultaneamente");
            else{
            System.out.println("El nuero no es multiplo e 2 ni de 3 simultaneamente");
            }
            }
        }
        catch(Exception exc){
			System.out.println(exc);
		}
    }
}