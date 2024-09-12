/*12. Escribir un programa que simule 1000 lanzamientos de un dado y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario. Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero: dado = (int) (6*Math.random() + 1) */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio12p3{
    public static final int MAXL=1000, MAX=6, MIN=1;
    public static void main (String [] args){
        
        int num=IngresarNumero();
        int contador = 0;
        int dado=0;
        while ((num>=MIN)&&(num<=MAX)){
            contador=0;
            for(int i=0; i<MAXL; i++){
				dado = (int) (6*Math.random() + 1);
				if(dado == num){
					contador++;
				}
            }
            Imprimir(contador, num);
			    num =IngresarNumero();
        }
    }

    public static int IngresarNumero(){
        int numero = 1;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un numero del 1 al 6 (valores de un dado)");
            numero = Integer.valueOf(entrada.readLine());
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    private static void Imprimir (int numero, int num){
        System.out.println("El numero " + num + "salio " + numero + "veces en " + MAXL + "tiradas "  );
    }
}