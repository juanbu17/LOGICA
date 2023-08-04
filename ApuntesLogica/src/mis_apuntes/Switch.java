/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.Scanner;
/**
 *
 * @author 505
 */
public class Switch {
    public static void main (String[]args){
        //comando para recoger los datos del teclado
         Scanner scn = new Scanner(System.in);
     
               //pedir  entrada del teclado
         System.out.println("Si la nota es menor de 2.0 seleccione 1 ");
         System.out.println("Si la nota esta entre 2.0 y  2.99 cseleccione 2 ");
         System.out.println("Si la nota esta entre 3.0 y  3.99 cseleccione 3 ");
         System.out.println("Si la nota esta entre 4.0 y  4.99 cseleccione 4 ");
         System.out.println("Si la nota es igual a 5.0 seleccione 5 ");
        
         
          //declarar las variables
        int opc = scn.nextInt();
        //Aqui se hac las comparaciones:
        
        switch (opc) {
            case 1:
                System.out.println("Nota reprobada");
                        break;
                case 2:
                System.out.println("Nota regular");
                        break;
                case 3:
                System.out.println("Nota corresponde a basico");
                        break;                
                case 4:
                System.out.println("Nota superior");
               break;
                case 5:
                    System.out.println("Nota EXCELENTE");
                    break;
                     default:
                System.out.println("Ingrese una nota valida ");               
         
        }              
    }    
}
