/*
Imprimir números pares del 1 al 20.
*/
import java.util.Scanner;



/**
 *
 * @author SERVER
 */
public class NumPar {
        public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
         num = leer.nextInt();
       
        while(num<=20 ){
            System.out.println(num);
           num++;
               if(num%2==0){
                   System.out.println(num);
         }else{
                 num++;
               }
        }
    }
    
}
