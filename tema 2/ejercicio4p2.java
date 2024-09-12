/*4. Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4p2{
    public static void main (String [] args){
        int numero = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero entre 0 y 999 ");
            numero = Integer.valueOf(entrada.readLine());
            if((numero>0)&&(numero<9)){
            System.out.println("1 digito");
            }
            else if((numero>9)&&(numero<99)){
                    System.out.println("2 digitos");
                }
            else{
                System.out.println("3 digitos, el numero es: " + numero);
            }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}