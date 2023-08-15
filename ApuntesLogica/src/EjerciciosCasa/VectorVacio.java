/*
Contar la cantidad de elementos pares en un vector.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class VectorVacio {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int vector[] = new int[10];  

        //for para llenar el vector
        //for ( variable que va aumentar; 
        //condición hasta donde va aumentar; 
        //el aumento)
        
        ///////////
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese número: ");

            //lo mismo que: vector[i] = read.nextInt();
            int num = read.nextInt();
            vector[i] = num;
        }

        int contadorPar = 0, contadorInpar = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorInpar++;
            }
        }
        
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

        System.out.println("La cantidad de pares es: " + contadorPar);
        System.out.println("La cantidad de inpares es: " + contadorInpar);
    }

}
