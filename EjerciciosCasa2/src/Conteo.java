/*
 Imprimir números del 1 al 10.
 */
import java.util.Scanner;



/**
 *
 * @author SERVER
 */
public class Conteo {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
         num = leer.nextInt();
         
        while(num<=10){
            System.out.println(num);
            num++;
            
        }
    }
}
