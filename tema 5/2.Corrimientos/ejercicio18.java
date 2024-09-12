/*18. Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio18{
    final static int MAX = 10;

    public static void main(String[] args){
        int arreglo[] = {1,2,4,6,7,4,8,0,4,9};
        ImprimirArreglo(arreglo);
        int num = obtener_entero();
        int pos = BuscarElemento(arreglo, num);
        corrimientoIzquierda(arreglo, pos);
        ImprimirArreglo(arreglo);
        
    }
    public static void corrimientoIzquierda(int[]arr, int pos){
        while (pos < MAX - 1){
            arr [pos] = arr [pos + 1];
            pos++;
        }
    }

    public static int BuscarElemento(int[]arr,int num){
        int pos = 0;
        while((pos<MAX)&&( arr[pos] != num)){
			pos++;
		}
		return pos;
    }

    public static int obtener_entero(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;

        try{
            System.out.println("ingrese numero entero: ");
            numero = Integer.valueOf(entrada.readLine());
        }catch (Exception exc){
            System.out.println(exc);
        }
        return numero;
    }
    private static void ImprimirArreglo(int[]arr){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println("");
    }
}