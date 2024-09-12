/*b. solicite un número e imprima “grande” si es mayor a 100 y
“chico “ si es menor.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_bp2{
    public static void main (String [] args){
        int numero = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero>100){
            System.out.println("GRANDE");
            }
            else{
                    System.out.println("CHICO");
                }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}