import java.util.*;
/**
 *
 * @author Gema
 */
public class parimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduzca un número: ");
            int x=sc.nextInt();

            System.out.print("Introduzca un número: ");
            int y=sc.nextInt();


            if(y%x==0) {
                    System.out.print("El número es múltiplo.");
            } else {
                    System.out.print("El número no es múltiplo.");
            }
            //fin del programa
            System.out.print("\nFin del programa");
            System.out.print("\nHasta la proxima :)");
            System.out.print("\nAñado una nueva línea para hacer la comparación");
            
    }
    
}