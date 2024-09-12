/*2. Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días de
ese mes. En el caso de que ingrese 2 como número de mes
(febrero) deberá además solicitar ingresar un número de año y,
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de días correspondiente. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio2p2{
    public static void main (String [] args){
        int numero = 0; int anio = 0;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese un numero del 1 al 12(numero del mes) ");
            numero = Integer.valueOf(entrada.readLine());
            switch(numero){
            case 1 : System.out.println("Enero 31 dias"); break;
            case 2 : System.out.println("Febrero 28 o 29 dias");
            System.out.println ("Ingrese el año de nacimiento ");
			    anio = Integer.valueOf(entrada.readLine());
					if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
						
						System.out.println("Febrero 29 dias");
					}
						
					else{
						System.out.println("Febrero 28 dias");
					}break;
            case 3 : System.out.println("Marzo 31 dias"); break;
            case 4 : System.out.println("Abril 30 dias"); break;
            case 5 : System.out.println("Mayo 31 dias"); break;
            case 6 : System.out.println("Junio 30 dias"); break;
            case 7 : System.out.println("Julio 31 dias"); break;
            case 8 : System.out.println("Agosto 31 dias"); break;
            case 9 : System.out.println("Septiembre 30 dias"); break;
            case 10 : System.out.println("Octubre 31 dias"); break;
            case 11: System.out.println("Noviembre 30 dias"); break;
            case 12 : System.out.println("Diciembre 31 dias"); break;
            default: System.out.println("No es un mes del año");
           }
        }
        catch (Exception exc ) {
            System.out.println( exc );
            } 

    }

}