/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio11{
    public static void main (String [] args){
        char caracter='i';
        int contador= 0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            while((caracter>='a')&&(caracter<='z')){
                System.out.println("Ingrese un caracter letra minuscula");
				caracter = entrada.readLine().charAt(0);
                if(caracter<='z'){
                    switch(caracter){
                        case 'a' : case 'e': case 'i': case 'o': case 'u': 
                        contador++;
                        break;
                       }
                }
                System.out.println("La cantidad de vocales sumadas es:"+ contador);
				
            }
        }
        catch(Exception exc){
			System.out.println(exc);
		}
    }
}