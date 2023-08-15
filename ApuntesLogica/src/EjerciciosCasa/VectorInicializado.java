/*
Contar la cantidad de elementos pares en un vector.
 */
package main;

/**
 *
 * @author Krausser
 */
public class VectorInicializado {
    public static void main(String[] args) {
        int vector[] = {2,3,6,3,87,2,7,2,23,6,72,32,67,82,3,723,72,1,4,9,2};
        int contadorPar = 0, contadorInpar = 0;
        
        for(int i=0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                contadorPar++;
            } else{
                contadorInpar++;
            }
        }
        
        System.out.println("La cantidad de pares es: " + contadorPar);
        System.out.println("La cantidad de inpares es: " + contadorInpar);
    }
    
}
