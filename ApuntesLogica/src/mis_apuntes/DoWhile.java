
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class DoWhile {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opc=0;
        do{
            System.out.println("El area es: "+calcularArea());
            //opc++;
            System.out.println("veces calculadas: "+opc++);
        }while(opc!=5);
        
    }
    public static int calcularArea(){
        
        
            System.out.println("Ingrese lado 1: ");
            int lado1 = sc.nextInt();
            
            System.out.println("Ingrese lado 2: ");
            int lado2 = sc.nextInt();
            int area = lado1*lado2;
       return area;
        
    
        
        
    
}
}
