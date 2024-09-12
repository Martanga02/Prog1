/*3. Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3p2{
    public static void main (String [] args){
        int numero = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero ");
            numero = Integer.valueOf(entrada.readLine());
            if(numero>50){
             if((numero%2==0)&&(numero%3==0)){
             System.out.println(numero + "es multiplo de 2 y de 3");
            }
             else System.out.println("El numero no es multiplo de 2 y 3");
          }
          else System.out.println("el numero no es mayor a 50");
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}
