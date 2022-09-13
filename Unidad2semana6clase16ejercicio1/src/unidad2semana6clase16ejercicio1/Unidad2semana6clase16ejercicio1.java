
package unidad2semana6clase16ejercicio1;

import java.util.Scanner;

public class Unidad2semana6clase16ejercicio1 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int fact=1;
      int num=0;
      System.out.println ("introduce el número");
      num = teclado.nextInt();
      for(int ind=1;ind<=num;ind++) {
          fact*=ind; 
      }
      System.out.println("El factorial es "+fact);
      
    }
    
}
