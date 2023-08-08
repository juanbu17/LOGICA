
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Anselmo
 */
public class RaizCuadrada {
   public static void main(String[]args){
       
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Ingrese el número al que le quiere sacar raiz cuadrada");
        int num = sc.nextInt();
        
        
       int raizC = raiz(num);
       
       if(raizC == -1){
           System.out.println("Raiz no encontrada o no existe en los numeros reales");
           
       }else{
          System.out.println("La raiz cuadrada de " + num + "es: "+ raizC +" o" +(-1*raizC));
       }
        
        
        
    }

    private static int raiz(int num) {
       int contador = 1;
       int resultado = 0;
       boolean salida = false;
       int raiz=0;
       
       while(contador <num && salida == false){
           resultado = (int) (num/contador);
           
           if (resultado==contador){
               raiz= resultado;
               salida = true;
           }else{
               raiz= -1; 
                   
               contador++;
               salida= false;
           }
       }
       
       if(raiz != -1 && num >= 0){
           System.out.println(raiz);
           return raiz;     
       }else{
           return -1;
       }
    }
   
   
       
       
   }    
   

