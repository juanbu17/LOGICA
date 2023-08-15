/*
El estudiante pepito quiere saber 
cual es su calificación final en matemáticas.
El usuario debe ingresar por teclado cuantas notas desea guardar
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class EjercicioFor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Cuántas notas desea guardar?");
        int n = read.nextInt();

        float[] grades = new float[n];
        float suma = 0;
       

        // promedio = suma / n
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nota: ");
            float grade = read.nextFloat();             
            grades[i] = grade;
            suma = suma + grades[i];            
        }

        float avr = suma / n;

        for (int i = 0; i < n; i++) {
            System.out.print("[" + grades[i] + "] ");
        }
        
        System.out.println("El promedio de las notas es: " + avr);
    }

}
