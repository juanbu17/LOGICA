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
public class Calculadora {
    static int opc;
    static double num1;
    static double num2;
    static double resultado;
    

    public static void main(String[]args){
        System.out.println("Bienvenido");
        boolean isLogged = loguin();
        if (isLogged){
            Calcular();
        }
       
    }
    
    /* seccion de loguin*/
    
     public static boolean loguin(){
             Scanner sc = new Scanner(System.in);
      
            String user = "Admin";
            int pass=123456;
       
        System.out.println("Ingrese el Usuario");
        String usuario = sc.nextLine();
        
        System.out.println("Ingrese la contrasena");
        int contraseña = sc.nextInt();
        
        if(user.equals(usuario) & pass==contraseña){
            System.out.println("Bienvenido a Calcular");
            System.out.println("");
            return true;
        }else{
            System.out.println("Usuario o contrasena incorrectas "); 
            return loguin();
        }
        }
    
    
    
    
    
    
    /* seccion de calculadora*/
    public static void Calcular(){
     Scanner scn = new Scanner(System.in);
     Scanner leernum = new Scanner (System.in);
     
      
      /*Menud opciones*/
        System.out.println("");
        System.out.println("SELECCIONE LA OPERACION A REALIZAR: ");
        System.out.println("");    
        System.out.println("1. SUMA ");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION"); 
        System.out.println("5. SALIR");
        System.out.println("");
      
     
        
        /*operaciones*/
         
          opc = scn.nextInt();  

        switch (opc) {
            case 1:
                //operacion de suma
                System.out.println("Ha seleccionado realizar una Suma "); 
                System.out.println(" ");
                System.out.println("Ingrese primer numero ");
                    num1 = leernum.nextDouble();
                System.out.println("Ingrese segundo numero ");                     
                    num2 = leernum.nextDouble();
                System.out.println("");
                
                    resultado = num1+num2;
                  
                       System.out.println("El resultado es: "+resultado);
                System.out.println(""); 
               Calcular();
                   
                break;
            case 2:
                 //operacion restar
               System.out.println("Ha seleccionado realizar una resta "); 
                System.out.println(" ");
                System.out.println("Ingrese primer numero ");
                    num1 = leernum.nextDouble();
               System.out.println("Ingrese segundo numero ");                     
                    num2 = leernum.nextDouble();
               System.out.println("");
                    resultado = num1-num2;
                  
                       System.out.println("El resultado es: "+resultado);
               System.out.println("");   
                Calcular();
                break;
            case 3:
                   //operacion de suma
               System.out.println("Ha seleccionado realizar una multiplicacion "); 
                System.out.println(" ");
                System.out.println("Ingrese primer numero ");
                    num1 = leernum.nextDouble();
               System.out.println("Ingrese segundo numero ");                     
                    num2 = leernum.nextDouble();
               System.out.println("");
                    resultado = num1*num2;
                  
                       System.out.println("El resultado es: "+resultado);
               System.out.println(""); 
               Calcular();
                break;
            case 4:
                 //operacion de division
               System.out.println("Ha seleccionado realizar una Division "); 
                System.out.println(" ");
                System.out.println("Ingrese primer numero ");
                    num1 = leernum.nextDouble();
               System.out.println("Ingrese segundo numero ");                     
                    num2 = leernum.nextDouble();
               System.out.println("");
                    resultado = num1/num2;
                  
                       System.out.println("El resultado es: "+resultado);
               System.out.println("");  
               Calcular();
                break;
            case 5:
                /*Salir*/
                break;
            default:
              
                System.out.println("La opcion no existe, volveremos a iniciar");
                
                  System.out.println("");
                System.out.println("");
   Calcular();
    }
         
   
}
    
    
    
    
    
    
    }
    


 
        
        
      
    