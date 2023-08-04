/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 507
 */
public class Operaciones1 {
  static  Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       //Aca se llama el menu// 
        menuCalc(1);
        
        
        
        
    }
    //menu inicial//
    
    public static void menuCalc(int isOn){
       /* System.out.println("----------------------");  
        System.out.println("Calculadora Personal");
        System.out.println("----------------------");  
        System.out.println("1. Sumar \n2. Restar \n3. Multiplicar\n4. Dividir\n6. Salir");
        System.out.println("");*/
        
        while(isOn!=0){
            
              System.out.println("----------------------");  
        System.out.println("Calculadora Personal");
        System.out.println("----------------------");  
        System.out.println("1. Sumar \n2. Restar \n3. Multiplicar\n4. Dividir\n6. Salir");
        System.out.println("");
                System.out.println("Ingrese una opcion");
                int opc= sc.nextInt();
                
           switch(opc) {
               
               case 1:
                   System.out.println("1. suma");
                   System.out.println("Ingrese  el numero 1");
                   double num1 = sc.nextDouble();
                   System.out.println("Ingrese  el numero 2");
                   //crear una variable donde se guarde la captura del teclado://
                   double num2 = sc.nextDouble();
                   //aca  se agrego la funcion sumar://
               sumar(num1, num2);
               break;
               
               case 2:
                        System.out.println("1. resta");
                   System.out.println("Ingrese  el numero 1");
                   double num3 = sc.nextDouble();
                   System.out.println("Ingrese  el numero 2");
                   //crear una variable donde se guarde la captura del teclado://
                   double num4 = sc.nextDouble();
                   //aca  se agrego la funcion sumar://
               restar (num3, num4);
               break;
               
                   case 3:
                   System.out.println("3. Multiplicar");
                   System.out.println("Ingrese  el numero 1");
                   double num5 = sc.nextDouble();
                   System.out.println("Ingrese  el numero 2");
                   //crear una variable donde se guarde la captura del teclado://
                   double num6 = sc.nextDouble();
                   //aca  se agrego la funcion sumar://
               restar (num5, num6);
               break;
           }
            
            
        }
    }
    //funciones de las operaciones//
    
    public static double sumar(double num1, double num2){
        double suma = num1+ num2;
        return suma;
    }
    
    public static double restar(double num1, double num2){
        double resta = num1- num2;
        return resta;
    }
        
    public static double multiplicar(double num1, double num2){
        double multiplica = num1* num2;
        return multiplica;
    }
            
    public static double dividir(double num1, double num2) {
        double divide = num1 /num2;
        return divide;
    }  
    
     public static double modulo(double num1, double num2) {
        double mod = num1%num2;
        return mod;
    }  
    
    public static double capturarDatos(String cadena){
        System.out.println(cadena);
        double num = sc.nextDouble();
        System.out.println("ingrese el numero2: ");
        double num2 = sc.nextDouble();
        return num;
        
    }
}
