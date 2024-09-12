public class parcial_TEMA3 {
final static int MAX=20,SEPARADOR=255,X=3;
public static void main (String[] args){
// PUNTO 1
int[] arreglo={255,67,67,67,67,67,67,67,67,255,14,255,33,33,33,33,255,5,98,255};
ImprimirArreglo(arreglo);
ProcesarArreglo(arreglo);
ImprimirArreglo(arreglo);
}
public static void ProcesarArreglo(int[] arreglo) {
    int inicio=0,fin=-1;
    while (inicio<MAX){
    inicio=BuscarIni(arreglo, fin+1);
    if (inicio<MAX){
    fin=BuscarFin(arreglo,inicio);
    if (fin-inicio+1>X && sonTodosIguales(arreglo,inicio,fin)){
    comprimir(arreglo, inicio,fin);
    fin=inicio+2;
    }
    }
    }
    }
public static void comprimir(int[] arreglo, int inicio, int fin) {
    int tamanio=fin-inicio+1;
    while (inicio<fin-1){
    CorrimientoIzquierda(arreglo,inicio);
    fin--;
    }
    arreglo[inicio]=-1*(tamanio);
    }

public static void CorrimientoIzquierda(int[] arr, int pos) {
    for (int i = pos; i < MAX - 1; i++){
    arr[i] = arr[i + 1];
    }
    }

public static boolean sonTodosIguales(int[] arreglo, int inicio, int fin) {
    while (inicio<fin && arreglo[inicio]==arreglo[inicio+1]){
    inicio++;
    }
    return (inicio==fin);
    }

public static int BuscarIni(int[] arr, int ini) {
while (ini<MAX && arr[ini]==SEPARADOR){
ini++;}
return ini;
}
public static int BuscarFin(int[] arr, int fin) {
while (fin<MAX && arr[fin]!=SEPARADOR){
fin++;
}
return fin-1;
}
public static void ImprimirArreglo(int[] arr){
for(int pos=0;pos<MAX;pos++)
    System.out.print(arr[pos] + "|");
    System.out.println("");
}
}