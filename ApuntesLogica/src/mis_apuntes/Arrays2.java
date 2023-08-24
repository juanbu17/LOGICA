/*

 */
package mis_apuntes;

import java.util.Scanner;

/**
@author 507
 */
public class Arrays2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se crea el array todos del mismo tipo si son texto va entre comillas
        String flores[] = {"crisantemo", "loto", "girasoles", "margarita", "orquideas"};
        //imprimir la cantidad de espacios del array
        System.out.println("El tamaño  del array es: " + flores.length);
        
        // arrays multidimensional
        for(int j=0; j<flores.length;j++){
            System.out.println("La flor es: "+flores[j]);
        }

        //podemos acceder a la posicion indicando la misma
        System.out.println("la flor en la posicion 0 es: " + flores[0]);
        //podemos definir un array  y agregar elementos en las diferentes pocisiones
        //int tallas[]; // esto es definir un arrray
        
        
        
     /*Ejemplo tomando desde Scanner definiendo por teclado y de manera estática*/   
        
        

        int tallas[] = new int[7];// esto declara el array(define el tamaño)
      
        
    
        
        
        int n = 0;
        System.out.print("El numero de tallas hombre es: ");
        n = leer.nextInt();

        int tallasHombre[] = new int[n];//define y declara el array

        int tamano = tallasHombre.length;//variable donde guarde el tamaño del array(length me da el tamaño cuando no lo conozco
        System.out.println(tallasHombre.length);
        tallasHombre[0]=leer.nextInt(); //nos lee desde scaner
        tallasHombre[1]=leer.nextInt();
        tallasHombre[2]=leer.nextInt();
        tallasHombre[3]=leer.nextInt();
        tallasHombre[4]=leer.nextInt();
        
        for(int i=0;i<tallasHombre.length;i++){
              System.out.println("La talla "+i +" es : "+tallasHombre[i]);
    }
      
        
    }
}
