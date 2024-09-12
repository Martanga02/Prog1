//a. solicite un número e indique si es positivo o negativo.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_ap2{
    public static void main (String [] args){
        int numero = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero>0){
            System.out.println("El numero ingresado es positivo");
            }
            else{
                    System.out.println("El numero ingresado es negativo");
                }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}