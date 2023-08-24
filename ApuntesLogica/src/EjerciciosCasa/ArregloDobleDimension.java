/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosCasa;

/**
@author Juan Buitrago
 */
public class ArregloDobleDimension {
    public static void main(String[] args) {
        
        String [] [] Nombres= {{"FLIA 1 ","MARIA","JUAN","MIGUE"},{"FLIA 2 ","MONICA","JUAN","ANGELA"},{"FLIA 3 ","LIBIA","LIGIA","LILIAN"},{"FLIA 4 ","ALEX","JORGE","GIOVANY"}};
        System.out.println("El arreglo tiene : "+Nombres.length+" columnas");
        for(int i=0;i<Nombres.length;i++){
            for(int j=0;j<Nombres[i].length;j++){
                System.out.print("\t"+Nombres[i][j]+"\t");//sin ln en el print para que lo haga lado a lado
            }
              System.out.println();  
             
        }
         System.out.println(Nombres[2][3]);
        
        
        
    }
}
