/*6. Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6p3{
    public static void main (String [] args){
        char caracter = obtener_caracter();
        while((caracter >='a')&&(caracter <='z')){
            imprimirTablaDel9() ;
        }
    }
    public static char obtener_caracter(){
        char caracter = 'a';
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
        System.out.println("Ingrese un caracter");
        caracter = entrada.readLine().charAt(0);
    }
    catch(Exception exc){
        System.out.println(exc);
    }
    return caracter;
    }
    private static void imprimirTablaDel9(){
        for(int i=1;i<=10; i++){
           System.out.println(i + "* 9 " + "=" + (i*9));
        }
    }
   
}