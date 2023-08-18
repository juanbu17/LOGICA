
import java.util.Scanner;


/**
 *8.Imprimir los primeros n términos de la secuencia 3, 6, 9, 12, ...
 * @author SERVER
 */
public class SecuenciaImpar {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese cantidad de terminos");
        int n = leer.nextInt();
       
         int num=0;
         int cont= 1;
        while(cont<=n){
            cont++;          
            num = num+3;
            System.out.println(num);
            
        }
    }
    
}
