
import java.util.Scanner;

/**
 *Imprimir números impares del 1 al 50.
 * @author SERVER
 */
public class NumImpar {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
         num = leer.nextInt();
       
        while(num<=50 ){
            System.out.println(num);
           num++;
               if(num%2!=0){
                   System.out.println(num);
         }else{
                 num++;
               }
        }
    }
    
}
