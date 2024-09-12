
/*Ejercicio tipo parcial
Cuando se debe procesar texto expresado en lenguaje natural, una de las primeras tareas que se realiza es la
de eliminación de stopwords. Las stopwords son palabras muy comunes en un determinado lenguaje, por
ejemplo, artículos (el, la, las, los…), preposiciones (a, ante, con, por…), etc.
Dado un texto almacenado en un arreglo de caracteres de tamaño MAX_A, donde cada palabra está
delimitada por espacios, comas (,) o puntos (.) se pide eliminar todas las stopwords almacenadas en otro
arreglo de caracteres de tamaño MAX_S que se encuentra delimitado por espacios.
Por ejemplo, dado un texto almacenado en un arreglo A:
 */

public class EjercicioTipoParcial2{
    final static int MAX_A=41;
    final static int MAX_S=20;
    final static char SEPARADOR= ' ';

    public static void main (String[]args){
        char [] arreglo={' ','l', 'a',' ', 'c', 'a', 's', 'a',' ', 'r', 'o', 'j', 'a', ',',' ', 'a',' ', 'l', 'a',' ', 'v', 'u', 'e', 'l', 't', 'a',' ', 'd', 'e',' ', 'l', 'a',' ', 'e', 's', 'q', 'u', 'i', 'n', 'a', '.'};
        char [] stopwords={' ', 'a',' ', 'l', 'o',' ', 'l', 'o', 's',' ', 'd', 'e',' ', 'l', 'a',' ', 'l', 'a', 's',' '};
        System.out.println("El arreglo original es: "); ImprimirArreglo(arreglo);
        EliminarStopWords(arreglo, stopwords);
        System.out.println("El arreglo modificado es: "); ImprimirArreglo(arreglo);
    }


    public static int BuscarInicio(char[]arr,int pos){
        while(pos<MAX_A && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(char[]arr,int pos){
        while(pos<MAX_A && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos -1;
    }

    public static void CorrimientoIzquierda(char[] arr, int inicio,int fin) {
        for (int i = inicio; i <=fin - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
    

    public static void EliminarStopWords(char[]arr, char[]stop){
        int fin = -1;
        int inicio = BuscarInicio(arr, fin + 1);
        while(inicio < MAX_A){

            fin = BuscarFin (arr,inicio);
            if(Comparar(arr, stop, inicio, fin)){

                CorrimientoIzquierda(arr, inicio, fin);

            }

            inicio= BuscarInicio(arr, fin + 1);
        }
        
    }
    public static boolean Comparar(char[]arr, char[]stop, int inicio, int fin){
        int tamanio= fin - inicio +1;
        int finStop= -1;
        int inicioStop= BuscarInicio(stop, finStop + 1);
            while(inicioStop<MAX_S){

                finStop=BuscarFin(arr, inicioStop);
                int tamanioStop= finStop - inicioStop + 1;

                if(tamanio==tamanioStop){
                    while (arr[inicio]==stop[inicioStop] && inicioStop <= finStop){
                        inicio++;
                        inicioStop++;
                    }
                }
                inicioStop=BuscarInicio(stop, finStop + 1);
            }
            return true;
        }

    public static void ImprimirArreglo(char[]arr){
        for(int i =0;i<MAX_A;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}


