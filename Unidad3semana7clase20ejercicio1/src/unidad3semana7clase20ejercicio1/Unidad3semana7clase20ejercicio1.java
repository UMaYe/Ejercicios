 
package unidad3semana7clase20ejercicio1;
 
import java.util.Scanner;

public class Unidad3semana7clase20ejercicio1 {
 
    public static void main(String[] args) {
        int a, b, respuesta; 
        String accion;
        Scanner objeto;

    do { 
        System.out.println(" Ingrese el primer número: ");
        objeto = new Scanner(System.in);
        a = Integer.valueOf(objeto.nextLine());
        System.out.println("Ingrese el segundo número: ");
        b = Integer.valueOf(objeto.nextLine());
        respuesta = a + b ;
        System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " + " + String.valueOf(a+b));

        System.out.println("¿Quieres calcular la suma de otros dos números? (S/N) ");
        Scanner teclado = new Scanner(System.in);
        accion = teclado.nextLine();
    } while (accion.equals("S") || accion.equals("s"));
   }
  }
    
