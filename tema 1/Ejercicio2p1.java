/*2. Escribir un programa que declare una variable de tipo double y una
constante de tipo double con valor 1.0. Luego, deberá asignar el
doble del valor de la constante a la variable y mostrar ambos por
pantalla. */
public class Ejercicio2p1 {
    public static void main(String[] args) { 
        double var_doble;
        final double var2 = 1.0;
        var_doble = (var2 * 2);
        System.out.println("El valor de la variable doble es:" + var_doble);
        System.out.println("El valor de la variable constante es:" + var2);
     } 
 }


