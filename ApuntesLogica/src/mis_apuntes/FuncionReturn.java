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
public class FuncionReturn {
    
    public static void main(String[]args){
        double area = calcularArea();
        calcularArea();
        System.out.println(area);
        System.out.println("El area es: "+ calcularArea() );
    }
    
    /*las funciones no se crean en el metodo main
    public double area(){
    argumentos
    return______;
    }
    */
    public static double calcularArea(){
        
        
        double ladoA = 30;
        double ladoB = 30;
        double areaTotal = ladoA*ladoB;
        return areaTotal;
    }
    
   
}
