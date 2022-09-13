package unidad1semana6clase17ejercicio1;
import java.util.Scanner;
public class Unidad1semana6Clase17ejercicio1 {
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese Clave de usuario: ");
        clave = entrada.nextLine();
        if(nombre.equals("Maye") && clave.equals("123456")){
            System.out.println("Bienvenido al sistema");
            }
        else {
            System.out.println("Nombre de usuario o contraseña Incorrecto");
           } 
    }
    
}
