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

/*
crear un menu para selecciona platos en un restaurante
cree una opcion para desayunos almuerzo cena bebidas snakss y
comidad rapidas
*/
public class Switch2 {
    public static void main (String[]args){
        //comando para recoger los datos del teclado
         Scanner scn = new Scanner(System.in);
        
        //imprimir el menu de opciones:
        
        System.out.println("Restaurante  DON JUAN");
        System.out.println("Seleccione que la opcion que desea: ");
        System.out.println("- Desayuno: 1 ");
         System.out.println("- Almuerzo: 2 ");
         System.out.println("- Cena: 3 ");
         System.out.println("- Bebidas: 4 ");
         System.out.println("- Snacks: 5 ");
         System.out.println("- Comidas rapidas: 6 ");
         
         //declarar las variables:
         
         int opcion = scn.nextInt();
        
         
       //ejecutar el switch:
       
       switch(opcion){
           case 1:
               System.out.println("Se despacha Desayuno");
               break;
               case 2:
               System.out.println("Se despacha Almuerzo");
               break;
               case 3:
               System.out.println("Se despacha Cena");
               break;
               case 4:
               System.out.println("Se despacha Bebida");
               break;
               case 5:
               System.out.println("Se despacha Snack");
               break;
               case 6:
               System.out.println("Se despacha Comida rapida");
               default:
               System.out.println("Ingrese un pedido valido");
               break;        
                    }
            
}
}
