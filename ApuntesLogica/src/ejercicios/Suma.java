/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author SERVER
 */
public class Suma {
    
    
    static double num1;
    static double num2;
    static double suma;
   
    
    
    public static void main(String[]args){
        
      Scanner leer = new Scanner (System.in);
      
          //operacion de suma
                System.out.println("Ingrese un numero");
                    num1 = leer.nextDouble();
                System.out.println("Ingrese otro numero");    
                    num2 = leer.nextDouble();
                   
                    suma = num1+num2;
                    System.out.println("La suma es igual a: "+ suma);  
        
    }
    
}
