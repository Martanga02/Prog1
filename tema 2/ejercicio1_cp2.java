/*c. solicite un número del 1 al 7 e imprima el día de la semana.  */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_cp2{
    public static void main (String [] args){
        int numero = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero del 1 al 7 ");
            numero = Integer.valueOf(entrada.readLine());
           switch(numero){
            case 1 : System.out.println("Es lunes"); break;
            case 2 : System.out.println("Es martes"); break;
            case 3 : System.out.println("Es miercoles"); break;
            case 4 : System.out.println("Es jueves"); break;
            case 5 : System.out.println("Es viernes"); break;
            case 6 : System.out.println("Es sabado"); break;
            case 7 : System.out.println("Es domingo"); break;
            default: System.out.println("No es un dia de la semana");
           }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}