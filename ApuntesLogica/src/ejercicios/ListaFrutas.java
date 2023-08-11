/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author desarrollo
 */
public class ListaFrutas {
    public static void main(String[] args) {
                // ARRAY frutas
         System.out.println("ejemplo de frutas");                                   

        String[]frutas = {"Pera","manzana","Mango","Sandia","Uvas","Melocoton",};
        
                int size = frutas.length;
                System.out.println("El tamaño de frutas  es: "+size);

                System.out.println("El elemento en la posicion 2 es: "+frutas[2]);
                
                for(int i =0; i<frutas.length; i++){
                            System.out.println("El elemento en le posicion "+i+" es "+frutas[i]);
                }
                                        System.out.println("------------------------------------");

                
          //ARRAY REDES SOCIALES
                   System.out.println("ejemplo de redes sociales");                                   

          String[]redes = {"Instagram","twiter","Facebook","whatsapp","Reddit"};
          
          int red= redes.length;
               System.out.println("El tamaño de frutas  es: "+red);

                    for(int j =0; j<redes.length; j++){
                        System.out.println("El elemento en la pocision "+j+" es "+redes[j]);
                                
        
          }
                                            System.out.println("------------------------------------");

                                      //ARRAY NOTAS
      
         System.out.println("ejemplo de notas");                                   
        float[]notas={3.5f,4f,2.8f,4.7f,3.9f};
        
          float nota=notas.length;
        
            for(int g=0;g<notas.length;g++){
                                        System.out.println("El elemento en la pocision "+g+" es "+notas[g]);

            }
                                    System.out.println("------------------------------------");
//ARRAY SALARIO MINIMO
         System.out.println("ejemplo de SALARIO MINIMO");
         
         double[]salmin={1160000,1000000,908526,877803,828116};
         
         double salmi=salmin.length;
         for(int n=0; n<salmin.length;n++){
                                                     System.out.println("El elemento en la pocision "+n+" es "+salmin[n]);

         }



                
    }
}
s