/*7. Escribir un programa que mientras el usuario ingrese un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio7{
  public static final char fijo = '*';
public static void main(String [] args){
char caracter=0;
BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
try{
    
    while(caracter!=fijo){
        System.out.println("Ingrese un caracter distinto de '*' ");
    caracter = entrada.readLine().charAt(0);
    if (caracter>'z'){
    System.out.println("Es un caracter digito");
    }
    else if (caracter<='z'){
    System.out.println("Es un caracter vocal minuscula");
   }
 }
}
catch(Exception exc){
    System.out.println(exc);
   }
 }
}