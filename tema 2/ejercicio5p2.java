import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5p2 {

	public static void main(String[]args){
		
		final int veinte =20, veinticinco = 25, clave = 328;
		int hora, temperatura, us_clave;
		char letra;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
		
			
			System.out.println("Ingrese la Hora (solo de 0-23) del dia: ");
			hora = Integer.valueOf(entrada.readLine());
			
			if((hora>=0)&&(hora<=5)){
				
				System.out.println("Ingrese temperatura: ");
				temperatura = Integer.valueOf(entrada.readLine());
				
					if(temperatura<veinte){
						System.out.println("Encender la Calefaccion!");
					}
					else if((temperatura>veinte)&&(temperatura<veinticinco)){
						System.out.println("Calefaccion encendida, No abra las ventanas!!");
					}
					else if(temperatura>veinticinco){
						System.out.println("Apagar la Calefacion!");
					}
			}
			else if((hora>=6)&&(hora<=11)){
				System.out.println("Ingrese una letra minuscula: ");
				letra = entrada.readLine().charAt(0);
				
				switch(letra){
					case 'a': case 'e': case 'i': case 'o': case 'u':
							switch(hora){
								case 6:
									System.out.println("La hora 6 tiene 2 vocales");
									break;
								case 7:
									System.out.println("La hora 7 tiene 3 vocales");
									break;
								case 8:
									System.out.println("La hora 8 tiene 2 vocales");
									break;
								case 9:
									System.out.println("La hora 9 tiene 3 vocales");
									break;
								case 10:
									System.out.println("La hora 10 tiene 2 vocales");
									break;
								case 11:
									System.out.println("La hora 11 tiene 2 vocales");
									break;
							}
							break;
						
					default:
						switch(hora){
						
						case 6:
							System.out.println("La hora 6 tiene 2 consonantes");
							break;
						case 7:
							System.out.println("La hora 7 tiene 2 consonantes");
							break;
						case 8:
							System.out.println("La hora 8 tiene 2 consonantes");
							break;
						case 9:
							System.out.println("La hora 9 tiene 2 consonantes");
							break;
						case 10:
							System.out.println("La hora 10 tiene 2 consonantes");
							break;
						case 11:
							System.out.println("La hora 11 tiene 2 consonantes");
						break;
						
					}
				}
			}
			else if((hora>=12)&&(hora<=17)){
				
				int prom=0;
				
				if(hora % 2 == 0){
					prom = (hora + 12)/2;
					System.out.println("El promedio entre "+hora+" y " + 12 + " es: " +prom);
				}
				
				else if(hora % 2 != 0){
					prom = (hora + 17)/2;
					System.out.println("El promedio entre "+hora+" y " + 17 + " es: " +prom);
				}
			}
			else if((hora>=18)&&(hora<=23)){
				System.out.println("Ingrese la clave: ");
				us_clave = Integer.valueOf(entrada.readLine());
					if(us_clave == clave){
						System.out.println("Ingrese segunda clave numerica entre 100 y 999: ");
						us_clave = Integer.valueOf(entrada.readLine());
							
							if((us_clave>=100)&&(us_clave<=999)){
								
							 int clavealmacenada = clave/100;
							 int claveingresada = us_clave/100;
							 
							 	if(clavealmacenada % claveingresada == 0){
							 		
							 		System.out.println("Clave correcta");
							 	}
							 	else{
									System.out.println("Clave incorrecta");
								}
							}
							else{
								System.out.println("Numero no valido!!");
							}
					}
					else{
						System.out.println("Clave incorrecta!");
					}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}