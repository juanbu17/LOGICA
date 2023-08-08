/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class FharenheitCelsius {
    
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int opc=0;
        do{
            System.out.println("A grados celsuis equivalen a: "+convertir());
            //opc++;
            System.out.println("veces calculadas: "+opc++);
        }while(opc!=3);
        
    }
    public static int convertir(){
        
        
            System.out.println("Ingrese los grados fharenheit: ");
            int fhare = sc.nextInt();
            
           
            int grados = (fhare-32)*5/9;
            
       return grados;
    } 
    
}

