/*Pedir números enteros positivos por teclado. En cada iteración
el usuario puede ingresar 0 para salir del programa. Si ingresa un
número distinto de 0 se debe pedir el ingreso de un carácter.
a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
imprimirlo por pantalla.
b. Si es ‘b’ se deben pedir 5 números positivos e informar si
fueron ingresados en orden ascendente.
c. Si es ‘c’ se deben pedir dos números enteros negativos e
imprimir la raíz cuadrada de su multiplicación. La raíz
cuadrada de un número se calcula con la sentencia:
Math.sqrt(numero).
d. Ante cualquier otro carácter ingresado se debe informar un
error y pedir nuevamente el carácter. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio20{
    public static void main (String [] args){
        int numero = 0;
        char caracter = 'a';
        String texto = "a";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int entero1 = 0;
        int entero2 = 0;
        int raiz = 0;
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    try{
        while(numero!=0){
        System.out.println("Ingrese un numero(0 para salir)");
        numero = Integer.valueOf(entrada.readLine());
        if(numero!=0){
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            switch(caracter){
                case 'a':
                    System.out.println("Ingrese un texto: ");
                    texto = entrada.readLine();
                    System.out.println(texto); break;
                case 'b':
                    System.out.println("Ingrese 5 numeros positivos:");
                    num1 = Integer.valueOf(entrada.readLine());
                    num2 = Integer.valueOf(entrada.readLine());
                    num3 = Integer.valueOf(entrada.readLine());
                    num4 = Integer.valueOf(entrada.readLine());
                    num5 = Integer.valueOf(entrada.readLine());
                    if((num1<num2)&&(num2<num3)&&(num3<num4)&&(num4<num5)){
                        System.out.println("Los numeros fueron ingresados en orden ascendente");
                    }
                    else{
                        System.out.println("Los numeros no fueron ingresados en orden ascendente");
                    }
                    break;
                case 'c':
                System.out.println("Ingrese dos numeros negaivos");
                entero1 = Integer.valueOf(entrada.readLine());
                entero2 = Integer.valueOf(entrada.readLine());
                if(entero1<0&&entero2<0){
                    raiz =entero1*entero2;
                    Math.sqrt(raiz);
                    System.out.println("La raiz de: |" + entero1 +"*" + entero2 +"| es:"+ raiz);
                    
                }else{
                    System.out.println("Los valores no son validos");
                }
            break;
            default:
            System.out.println("Valor no permitido");

            }
        }
        else{
            System.out.println("El programa termino");
        }

        }
    }
    catch (Exception exc ) {
        System.out.println( exc );
        } 

    }
}