/*14. Escribir un programa que mientras el usuario ingresa un
carácter distinto del carácter ‘*’, invoque a un método que imprima
si es carácter dígito o carácter letra minúscula, y si es letra
minúscula imprimir si es vocal o consonante. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio14p3{
    public static final char asterisco='*';
    public static void main (String []args){
        char carac=ObtenerCaracter();
            while (carac!=asterisco){
                if ((carac>=1)&&(carac<=9)){
                    System.out.println("Es caracter digito");}
                else if ((carac>='a')&&(carac<='z')){
                    switch (carac) {
                        case 'a': case 'e': case 'i': case 'o': case 'u': System.out.println("Vocal");
                    break;
                        default:System.out.println("Es una consonante");
                    break;
                }
            }
        carac=ObtenerCaracter();
        }
            }

    public static char ObtenerCaracter(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter = 'a';
        try{
            System.out.println("Ingrese un caracter (* para salir)");
            caracter = entrada.readLine().charAt(0);
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        
        return caracter;
    }
}
