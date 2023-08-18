
import java.util.Scanner;



/**
 *  .Imprimir la tabla de multiplicar de un número ingresado por el usuario.
 * @author SERVER
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        int num;
        int num1=1;
        int resultado;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        num = leer.nextInt();
        
      
       
       while(num1<=20){
          
         resultado = num1 * num;
            num1++;
           System.out.println("resultado: "+ resultado); 
       }
       
       
             
       
        }
         
                
        
    }


