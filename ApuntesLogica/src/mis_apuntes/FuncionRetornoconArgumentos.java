/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.Scanner;
/**
 *
 * @author juan buitrago
 */
public class FuncionRetornoconArgumentos {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        double a = 30;
        double b = 30;
        System.out.println("Ingrse lado a. ");
        double c = scn.nextDouble();     
        System.out.println("Ingrse lado b. ");
        double d = scn.nextDouble();
        System.out.println("capturando datos con teclado: "+ calcularArea(c,d));
        System.out.println("Pasando parametros" +calcularArea(a,b));
        
        System.out.println("El valor del area es: "+ calcularArea(25,10));
        
    }
    
    public static double calcularArea(double ladoA, double ladoB){
    
    
    double areaTotal = ladoA*ladoB;
    return areaTotal;
}
    
}
