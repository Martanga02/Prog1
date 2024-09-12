/*Un dispositivo que lleva un animal bovino en su cuello recolecta datos de un acelerómetro en tres ejes: X Y Z.
Cada toma de datos se representa como una secuencia de valores enteros entre 0 y 1023 para cada eje, las
secuencias están separadas por -1 (valor no válido para esta lógica). El productor quiere conocer cómo se ha
comportado su animal en el transcurso del día y para ello ingresa un patrón de aceleración X Y Z y una cantidad
N de repeticiones. Un patrón que se repite una cierta cantidad de veces consecutivas significa que el animal
puede estar pastoreando, caminando, rumiando, etc. Dado un valor N y el patrón X Y Z en un arreglo inicializado
con -1 (de tamaño igual al arreglo que tiene los datos), hacer un programa en JAVA que:
- Compruebe si el patrón se repitió N o más veces y si es así que elimine del arreglo las secuencias que se
siguen repitiendo consecutivamente luego de la cantidad N. */

//declaracion de constantes
public class EjercicioTipoParcial3{
    final static int MAX= 21;
    final static int MAXP=3;
    final static int SEPARADOR=-1;
    final static int N=2;
    public static void main (String[]args){
        int [] arreglo ={-1, 12, 22, 44, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1};
        int[] arregloPatron={23, 34, 55};
        System.out.println("El arreglo original es: "); ImprimirArreglo(arreglo);
        EliminarPatron(arreglo,arregloPatron);
        System.out.println("El arreglo modificado es: ");ImprimirArreglo(arreglo);

    }
    public static int BuscarInicio(int[]arr,int pos){
        while(pos<MAX && arr[pos]==SEPARADOR){
            pos++;
        }
        return pos;
    }

    public static int BuscarFin(int[]arr,int pos){
        while(pos<MAX && arr[pos]!=SEPARADOR){
            pos++;
        }
        return pos -1;
    }

    public static void CorrimientoIzquierda(int[]arr,int pos){
        for(int i =pos;i<MAX -1;i++){
            arr[i] = arr[i+1];
        }

    }
    public static void EliminarPatron(int[]arr,int[]P){
        int contador = N;
        int fin= -1;
        int inicio = BuscarInicio(arr, fin +1);
        while(inicio < MAX && contador > 0){
            fin=BuscarFin(arr, inicio);
            if(Comparar(arr, P, inicio, fin)){
                contador--;
                if(contador <= 0){
                    CorrimientoIzquierda(arr,fin);
                }
            }
            inicio=BuscarInicio(arr, fin +1);
        }
    }
    public static boolean Comparar(int[]arr,int[]P,int inicio,int fin){
        for(int i =inicio;i<=fin;i++){
            for(int j =0;j<MAXP;j++){
                if(arr[i]==P[j] ){
                    return true;
                }
            }
        }
        return false;
    }

    public static void ImprimirArreglo(int[]arr){
        for(int i =0;i<MAX;i++){
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println(" ");
    }
}

