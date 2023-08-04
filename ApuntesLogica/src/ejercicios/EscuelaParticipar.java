/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class EscuelaParticipar {
      static Scanner read  = new Scanner(System.in);
       
  
  
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);  
    
        System.out.println("Fiets de graods");
        System.out.println("Ingrese su codigo");
       String codigo = read.nextLine();
       String codenum = "123789";
       
        
          if(codigo.equals(codenum))
          {
               System.out.println("Usted ingreso: "+codigo);
               System.out.println("Bienvenido, puede ingresar");
           
          }else{
            
         
             System.out.println("Su codigo de ingreso no es valido");
        }
        
    }
     
     
   
        
}

  
    