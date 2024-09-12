/*10. Escribir un programa que mientras el usuario ingrese un
número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un
caracter y para el caracter ingresado imprima a qué tipo de
carácter está asociado:
i. “letra minúscula” si el carácter es una letra del
abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del
abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio10p3{
    public static void main (String[]args){
        int num = ObtenerNumero();
        int carac = ObtenerCaracter();
        while((num<=10)&&(num>=1)){
            if (num%3==0){
                carac=ObtenerCaracter();
                if ((carac<='z') && (carac>='a')){
                    System.out.println("letra minuscula");
                }
                else if ((carac<='Z')&&(carac>='A')){
                    System.out.println("letra mayuscula");
                }
                else if ((carac<=9) && (carac>=1)){
                    System.out.println("Es un caracter numero");
                }
                else{
                    System.out.println("No es un digito");
                }
            }
            else if (num%5==0){
                TablaDel5(num);
            }
            num = ObtenerNumero();
        }
    }

    public static int ObtenerCaracter(){
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
    int numero = 0;
    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    try{
    System.out.println("Ingrese un numero");
    numero = Integer.valueOf(entrada.readLine());
    }
    catch(Exception exc){
        System.out.println(exc);
    }
    return numero;
}

    private static void TablaDel5(int num){
        for (int i =1; i<=10; i++){
            System.out.println("La tabla del 5 es :" + (i * 5));
        }
}
}