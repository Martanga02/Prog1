public class ejercicicioTipoParcial {
	
	public static final int MAX =20, DELIMITADOR=255, X=3;
	public static void main(String[]args){
		int[] arrp = 
			{255,67,67,67,67,67,67,67,67,255,14,255,33,33,33,33,255,5,98,255};
		int ini=0,fin=-1, contador=0;
		
		imprimir_arr(arrp);
		
		while(ini<MAX){
		ini = buscar_ini(arrp, fin+1);
			if(ini<MAX){
				fin= buscar_fin(arrp, ini);
				contador = fin-ini+1;
				if(contador>X && SeRepite(arrp,ini,fin)){
					System.out.println("aca");
					comprimir(arrp,ini,fin,contador);
					fin=ini+2;
				}
			}

			//ini=fin;
			System.out.println("aca");
		}
		System.out.println("arr con comprimido:");
		imprimir_arr(arrp);
	}
	
	public static void corrimiento_izq(int[] arr, int pos){
		for(int i=pos; i<MAX-1; i++)
			arr[i] = arr[i+1];
	}
	
	public static boolean SeRepite(int[] arr, int ini, int fin){
		
		while(ini<fin && arr[ini]==arr[ini+1]){
			ini++;
			

		}
		
		return ini==fin;
	}
	
	public static int buscar_ini(int[] arr, int pos){
		while(pos<MAX && arr[pos] == DELIMITADOR)
			pos++;
		return pos;
	}
	
	public static int buscar_fin(int[] arr, int pos){
		while(pos<MAX && arr[pos] != DELIMITADOR)
			pos++;
		return pos-1;
	}
	
	public static void comprimir(int[] arr, int ini, int fin, int valor){
		for(int pos=fin; ini<pos-1; pos--){
			corrimiento_izq(arr,ini);
			//ini=pos;
		}
		valor *=-1;
		corrimiento_der(arr,ini);
		arr[ini+1] = valor;
	}
	public static void corrimiento_der(int[] arr, int pos){
		for(int i=MAX-1; i>=pos; i--)
			arr[i]=arr[i-1];
	}

	
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}

}