
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author juanbu
 */
public class Cajero {
    public static void main(String[] args) {
        int saldo =300000;
         Scanner leaopc = new Scanner(System.in);
         Scanner leerconsi = new Scanner(System.in);
         Scanner leerreti = new Scanner(System.in);
         
         
        /*opciones switch*/
        System.out.println("Bienvenido A Cajero");
        System.out.println("Seleccione la operacion");
        System.out.println("1. Consignacion");
        System.out.println("2. Retiro");
        System.out.println("3. Salir");
        int opc;
        opc= leaopc.nextInt();

                boolean cierre=true;
         
         switch(opc){
                    case 1: 
                        /*consignar*/ 
                        System.out.println("Ingrese  Valor a consignar");
                        int consigna;
                         consigna = leerconsi.nextInt();

                         System.out.println("Saldo anterior: "+saldo);
                         System.out.println("El valor a consignar es: "+consigna);
                         System.out.println("Saldo a la fecha: " + consignar( saldo ,  consigna));
            
                        consignar(saldo , consigna);
                break;
                
                    case 2:
                         /*retirar*/
                        System.out.println("Ingrese  Valor a retirar");
                        int retiro;
                          retiro = leerreti.nextInt();  

                       System.out.println("Saldo Anterior: "+ saldo);
                       System.out.println("El valor a retirar es: "+retiro); 
                       System.out.println("Saldo a la fecha: " + retirar(saldo,retiro)); 
                       retirar(saldo,retiro);
                       break;
 
                       
                    default :
                        System.out.println("Seleccione un valor correcto");
                }
    }
                  
    
            public static int consignar(int saldo , int consigna){
             saldo= saldo+consigna;
        return saldo;   
        }
            
            public static int retirar(int saldo , int retiro){
             saldo= saldo-retiro;
        return saldo;   
        }
        

      
       
      
       
       
    }
   
 
    
    
   
    
}
