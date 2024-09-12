/*6. Escribir un programa que pida se ingresen datos necesarios para
emitir una factura por la compra de dos artículos de librería (tipo
factura, número, nombre cliente, producto 1, importe 1, producto 2,
importe 2, importe total). Como salida debe imprimir por pantalla la
factura en un formato similar al del siguiente ejemplo:
Factura C N 249
Nombre: Juan Perez
Producto Importe
Lápiz 15.5
Papel 20.6
Importe total 36.1 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio6p1{
    public static void main (String [] args){
        char factura;
        int numero;
        String nombre;
        String producto1;
        String producto2;
        double importe1;
        double importe2;
        try { 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Ingrese el tipo de factura: ");
            factura = entrada.readLine().charAt(0);
            System.out.println("Ingrese el numero de factura : ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su nombre : ");
            nombre = entrada.readLine();
            System.out.println("Ingrese su Producto : ");
            producto1 = entrada.readLine();
            System.out.println("Ingrese su Producto : ");
            producto2 = entrada.readLine();
            System.out.println("Ingrese el precio del primer producto : ");
            importe1 = Double.valueOf(entrada.readLine());
            System.out.println("Ingrese el precio del segundo producto : ");
            importe2 = Double.valueOf(entrada.readLine());
            System.out.println("Factura  " + factura + (" N ") + numero);
            System.out.println("Nombre : " + nombre);
            System.out.println("Producto  Importe ");
            System.out.println(producto1 + importe1);
            System.out.println(producto2 + importe2);
            }
            catch (Exception exc ) {
            System.out.println( exc );
            } 
    }
}