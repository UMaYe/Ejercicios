
package unidad2semana2clase5ejercicio1;
public class Unidad2semana2clase5ejercicio1 {
    public static void main(String[] args) {
        String Branch = "CSE";
        int year = 2;
        
        switch(year)
             {
            case 1: 
                  System.out.println("Cursos electivos: Ingles, Calculo ");
                  break;
            case 2: 
                switch (Branch) // switch anidado
                 {   
                    case "CSE":
                    case "CCE":
                               System.out.println("Cusrsos electivos : Machine Learning, Big Data");
                    break;
                    
                    case "ECE":
                              System.out.println("Cursos electivos : Programación");
                    break;
                    
                    default:
                              System.out.println("Cursos electivos : Ingenieria de Sofware");
                            
             }              
                            
         }
    }
    
}
