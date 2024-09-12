/*19. Construir un programa que solicite desde teclado un número de
mes válido y posteriormente notifique por pantalla la cantidad de
días de ese mes. En el caso de que ingrese 2 como número de
mes (febrero) deberá además solicitar ingresar un número de año
entre 2000 y 2024 inclusive (no debe seguir si no está en ese
rango), y dependiendo de si es bisiesto o no imprimir la cantidad
de días correspondiente. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio19{
    final static int MAX = 12;
    final static int MIN = 1;
    public static void main (String [] args){
        int numero = 0;
        int anio = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
try{
    while((numero<=MAX)&&(numero>=MIN)){
        System.out.println("Ingrese un numero de mes valido (entre el 1 y el 12, o 0 para salir)");
        numero = Integer.valueOf(entrada.readLine());
        switch (numero){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("El mes tiene 31 dias"); break;
            case 4: case 6: case 9: case 11:
            System.out.println("El mes tiene 30 dias"); break;
            case 2:
            System.out.println("Febrero tiene 28 o 29 dias"); 
                while((anio>=2000)&&(anio<=2024)){
                    System.out.println("Ingrese un numero de año entre los 2000 y 2024: ");
                    anio = Integer.valueOf(entrada.readLine());
					if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
						System.out.println("Febrero 29 dias");
					}
					else{
						System.out.println("Febrero 28 dias");
					}
        }
        break;
    }
}
}
catch (Exception exc ) {
    System.out.println( exc );
    } 
}
}
