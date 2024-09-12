/*Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9{
    public static void main (String[] args){
char caracter = 0;
BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
try{
    while((caracter>'a')&&(caracter< 9)){
        System.out.println("Ingrese un caracter digito o letra minuscula");
        caracter = entrada.readLine().charAt(0);
        if((caracter>='a')&&(caracter<='z')){
            System.out.println("Es caracter letra minuscula");
            switch(caracter){
                case 'a' : case 'e': case 'i': case 'o': case 'u': 
                System.out.println("Es una vocal"); break;
                default: System.out.println("Es una consonante");
               }
        }
        else{
            System.out.println("Es un caracter digito");
        }
    }
}
catch(Exception exc){
    System.out.println(exc);
    }
    }
}