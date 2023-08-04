/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
/*clase main*/
public class Casos {
    
    public static void main(String[]args){
       
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("1. calcular area");
        System.out.println("2. calcular perimetro");
        System.out.println("3. salir");
        int opc = scn.nextInt();
        
        switch(opc){
        case 1:
        System.out.println("Calcular area: ");
        
            System.out.println("ingrse lado 1");
            double a=scn.nextDouble();
            System.out.println("ingrse lado 2");
            double b=scn.nextDouble();
            
            calcularArea(a,b);
            System.out.println("El area total es: "+calcularArea(a,b));
        break;
  
        case 2:
            
        System.out.println("calcular perimetro");
            System.out.println("ingrse lado 1");
                double a1=scn.nextDouble();
            System.out.println("ingrse lado 2");
            double b2=scn.nextDouble();
            System.out.println("ingrse lado 3");
            double c3=scn.nextDouble();
            System.out.println("ingrse lado 4");
            double d4=scn.nextDouble();
        calcularPerimetroCuadrado(a1,b2,c3,d4);
        
        break;
              
        case 3:
            System.out.println("salir");
        default:
        System.out.println("seleccione opcion valida");
    }
    }
    /*funcion 1*/
    public static double calcularArea(double ladoA, double ladoB){
        
        double areaTotal = ladoA*ladoB;
        return areaTotal;
        
       /*funcion 2*/  
    }
    public static double calcularPerimetroCuadrado(double lado1, double lado2, double lado3, double lado4){
        double perimetroCuadradoTotal = lado1+lado2+lado3+lado4;
        return perimetroCuadradoTotal;
    }
    
}
 //operacion de suma
    /*public static double sumar(double num1, double num2){
                System.out.println("Ha seleccionado realizar una Suma "); 
                System.out.println(" ");
                System.out.println("Ingrese primer numero ");
                    num1 = leernum.nextDouble();
                System.out.println("Ingrese segundo numero ");                     
                    num2 = leernum.nextDouble();
                System.out.println("");
                  double  resultado = num1+num2;
                  
                       System.out.println("El resultado es: "+resultado);
                System.out.println(""); 
                
                
        return sumar;*/