/*d. solicite una letra e imprima si es vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_dp2{
    public static void main (String [] args){
        char letra = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese una letra ");
            letra = entrada.readLine().charAt(0);
            switch(letra){
                case 'a' : System.out.println("Es vocal"); break;
                case 'e' : System.out.println("Es vocal"); break;
                case 'i' : System.out.println("Es vocal"); break;
                case 'o': System.out.println("Es vocal"); break;
                case 'u': System.out.println("Es vocal"); break;
                default: System.out.println("Es consonante");
               }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}