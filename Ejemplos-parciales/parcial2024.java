public class parcial2024 {
    final static int MAXM = 20;
    final static int MAXA = 3;
    final static int SEPARADOR = 0;
    public static void main(String[] args) {
    int[] materias = {0,0,34,2,12,25,0,32,55,12,3,88,14,0,0,17,36,19,0,0};
    int[] aulas = {2,3,6};
    int ini = 0;
    int fin = -1;
    int cantidadInscriptos = 0;
    int aula = -1;
    int contMaterias = 0;
    int contMateriasAsignadas = 0;
    mostrar(aulas, MAXA);
    mostrar(materias, MAXM);
    while (ini < MAXM && contMateriasAsignadas < MAXA) {
    ini = buscarInicio(materias, fin + 1);
    if (ini < MAXM) {
    fin = buscarFin(materias, ini);
    contMaterias++;
    cantidadInscriptos = fin - ini + 1;
    aula = obtenerAulaConCapacidad(aulas, cantidadInscriptos);
    if (aula != -1) {
    aulas[aula] = -aulas[aula];
    System.out.println("La materia " + contMaterias + " se asigno al aula " + aula);
    
    contMateriasAsignadas++;
    eliminarSecuencia(materias, ini, fin);
    fin = ini;
    }
    else {
    System.out.println("La materia " + contMaterias + " no se puede asignar.");
    }
    }
    }
    if (ini < MAXM) {
    System.out.println("No quedan más aulas donde asignar materias.");
    }
    mostrar(aulas, MAXA);
    mostrar(materias, MAXM);
    }
    
    public static void eliminarSecuencia(int[] materias, int ini, int fin) {
    for (int i = ini; i <= fin; i++)
    correrAIzquierda(materias, ini);
    }
    public static void correrAIzquierda(int[] arr, int pos) {
    for (int i = pos; i < MAXM - 1; i++)
    arr[i] = arr[i + 1];
    }
    public static int obtenerAulaConCapacidad(int[] aulas, int cantidad) {
    int i = 0;
    while (i < MAXA && aulas[i] < cantidad)
    i++;
    if (i < MAXA) {
    return i;
    }
    else
    return -1;
    }
    public static int buscarInicio(int[] arreglo, int pos) {
    while (pos < MAXM && arreglo[pos] == SEPARADOR) {
    pos++;
    }
    return pos;
    }
    public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAXM && arreglo[pos] != SEPARADOR) {
    pos++;
    }
    return pos - 1;
    }
    public static void mostrar(int[] arr, int max) {
    for (int i = 0; i < max; i++)
    System.out.print(arr[i] + " | ");
    System.out.println();
    }
    }