
package unidad1semana5clase15ejercicio1;

import java.util.Scanner;

public class Unidad1semana5clase15ejercicio1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ongrese la base: ");
        double base = Entrada.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double exponente = Entrada.nextDouble();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: " + resultado);
    }
    
}
