/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio18{
    public static void main (String[]args){
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int division = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero");
            numero1 = Integer.valueOf(entrada.readLine());
            while(numero1!=0){
                System.out.println("Ingrese dos numeros");
                numero2 = Integer.valueOf(entrada.readLine());
                numero3= Integer.valueOf(entrada.readLine());
                division= (numero2/numero3);
                System.out.println("El resultado de la division es :" + division);
            }
        }
        catch(Exception exc){
            System.out.println(exc);
        }
    }
}