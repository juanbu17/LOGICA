/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Anselmo
 */
public class PotenciaCulalquierExponente {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la base");
        int num1= leer.nextInt();
         System.out.println("Ingrese el exponente");
        int num2= leer.nextInt();
        
        
        int result = potencia(num1, num2);
            System.out.println("El resultado de " +num1 +" elevado a "+num2 +" es "  +result);
        
        
          
    }
    //funcion para potencia
    
    public static int potencia(int num1, int num2){
        int resultado = 1;
        int contador = 1;
        
            //Ejecucion while
    while(contador<=num2){
   resultado*=num1;  //resultado= resultado*num1
   contador++; // contador = contador+1
}
    
    //retorno de resultado
    return resultado;
    }
 
}
