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


public class Condicional {
     static Scanner read  = new Scanner(System.in);
    public static void main(String[] args){
        
        //----------//
        
        
        //int num1 = 5;
        //int num2 = 5;
        //boolean isEqual = num1 ==num2;
        //String word1 = "Hola";
        //String word2 = "hola";
                //boolean result = word1.equals (word2);
        
        //System.out.println("Es igual a ??" + isEqual);
        //----------//
        
        
        //String email = "pepito@mail.com";
                //int password = 123456;
                //System.out.println("Ingrese la email");
                //String emailUser = scn.nextLine();
                              //System.out.println("Ingrese la contraseña");
                              //int passUser = scn.nextInt();
           String email = "pepito@mail.com";
        int password = 123456;

        System.out.println("Ingrese su email: ");
        String emailUser = read.nextLine();

        System.out.println("Ingrese su contraseña: ");
        int userPass = read.nextInt();
//solucion del profe
            if(email.equals(emailUser)&&password==userPass) {
             
                       System.out.println("Bienvenido");
                    
            }else{
                System.out.println("Valide sus credenciales");
            }      
                    
// de anselmo
        //if (mail.equals(emailUser) && password == passwordUser) {
            //System.out.println("Sesión iniciada. Bienvenido");
        //} else {
            //if (mail.equals(emailUser)) {
                //System.out.println("Contraseña incorrecta");
            //} else {
                //System.out.println("Correo ingresado incorrecto");
          
                
                
                
                
       
    }
}
               
    
    