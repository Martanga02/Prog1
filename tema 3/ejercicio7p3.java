/*7. Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio7p3{
    public static void main (String []args){
        int numero = obtenerNumero();
        while(numero!=0){
        ImprimirSuma();
        numero = obtenerNumero();

        }
    }
    public static int obtenerNumero (){
        int numero = 0;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
        System.out.println("Ingrese un numero distinto de 0");
        numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }

    private static void ImprimirSuma(){
        int suma = 0;
        for(int i=1; i<=200; i++){
            suma += i;
            System.out.println("La suma es : " + suma );
        }
    }

}