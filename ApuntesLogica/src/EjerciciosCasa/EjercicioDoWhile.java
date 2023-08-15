/*
 Quiero sumar números 
ingresados por teclado, mientras la suma no pase de 100
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioDoWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int suma = 0;
        int num;
        
        do{
            System.out.println("Ingrese número: ");
            num = read.nextInt();
            suma = suma + num;
            System.out.println("La suma es: " + suma);
        }while(suma<100);
        
        System.out.println("****** FIN PROGRAMA ******");
        
    }
    
}
