/*Pedir por consola 15 caracteres. Imprimir la mayor cantidad de
‘a’ seguidas que se ingresaron. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio16{
    final static int MAX = 15;
    public static void main (String[]args){
        char caracter = 0;
        int contador = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i = 0; i < MAX; i++){
                System.out.println("Ingrese 15 caracteres");
                caracter = entrada.readLine().charAt(0);
                if(caracter =='a'){
                    contador++;
                }
                else{
                    System.out.println("La letra ingresada no es una a");
                }
            }
            System.out.println("La cantidad final de letras 'a' acumuladas es : " + contador);
        }
        catch(Exception exc){
			System.out.println(exc);
		}
    }
}