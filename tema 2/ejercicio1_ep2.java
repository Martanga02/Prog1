/*e. solicite 3 números e imprima “creciente” si los tres números
están en orden creciente, “decreciente” si están en orden
decreciente o “error” si no cumplen ningún orden */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_ep2{
    public static void main (String [] args){
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese tres numero ");
            numero1 = Integer.valueOf(entrada.readLine());
            numero2 = Integer.valueOf(entrada.readLine());
            numero3 = Integer.valueOf(entrada.readLine());
            if((numero1<numero2)&&(numero2<numero3)){
            System.out.println("Creciente");
            }
            else if((numero1>numero2)&&(numero2>numero3)){
                    System.out.println("Decreciente");
                }
            else{
                System.out.println("erorr");
            }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}