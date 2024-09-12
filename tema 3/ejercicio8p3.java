/*8. Realizar un programa que dado dos números enteros y un
carácter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operación matemática básica según el valor del
carácter ingresado. Si se ingresó el carácter ‘a’ debe realizar la
suma, para ‘b’ la resta, para ‘c’ la multiplicación y para ‘d’ la
división entre ambos números. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio8p3{
    public static void main (String []args){
        int num1;
        int num2;
        char carac;

        num1=ObtenerNumero();
        num2 = ObtenerNumero2();
        carac = ObtenerCaracter();
        
        switch(carac){
            case 'a':
            System.out.println("La suma es: " + (num1 + num2));
            break;
            case 'b':
            System.out.println("La resta es: " + (num1 - num2));
            break;
            case 'c':
            System.out.println("El producto es: " + (num1 * num2));
            break;
            case 'd':
            System.out.println("La division es: " + (num1 % num2));
            break;
            default:
            System.out.println("Ninguna operacion!");
            break;
        }
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

    public static int ObtenerNumero(){
        int numero1= 0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero");
            numero1 = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero1;
    }
    public static int ObtenerNumero2(){
        int numero2 = 0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero");
            numero2 = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero2;
    }

}