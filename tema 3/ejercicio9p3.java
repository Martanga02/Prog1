/*9. Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:

a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9p3{
    public static void main (String []args){
        int num = ObtenerNumero();
        char carac;

        while((num<=10)&&(num>=1)){
        carac= ObtenerCaracter();

            if ((carac<='z')&&(carac>='a')){
            System.out.println("letra minuscula");
            }
            else if ((carac>='A')&& (carac<='Z')){
                System.out.println("letra mayuscula");
            }
            else if ((carac<=9) && (carac>=1)){
                System.out.println("Es un caracter numero");
            }
            else {
                System.out.println("Es otro tipo de caracter");
            }
            num = ObtenerNumero();
            }
        }

    public static int ObtenerNumero(){
        int numero = 0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero entero entre 1 y 10");
            numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    public static char ObtenerCaracter(){
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
}