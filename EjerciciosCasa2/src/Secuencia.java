
import java.util.Scanner;



/**
 *Imprimir los primeros n términos de la secuencia 2, 4, 6, 8, ...
 * @author SERVER
 */
public class Secuencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a mostrar: ");
        int n;
        int num=0;
        int cont= 1;
        n=leer.nextInt();
        
        while(cont<=n){
            cont++;
            num= num+2;
            System.out.println(num);
            
        }
    }
    
}
