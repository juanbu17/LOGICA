/*
 The difference between a built-in array and an ArrayList in Java, 
is that the size of an array cannot be modified (if you want to add 
or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever 
you want. The syntax is also slightly different:

arrayList
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juan Buitrago
 */
public class ArrayDinamico {
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
       ArrayList<String>names= new ArrayList<String>();
       
        System.out.println("Ingrese nombre 1: " );
        String name1=leer.nextLine();
      names.add(name1);
      
      System.out.println("Ingrese nombre 2: " );
        String name2=leer.nextLine();
      names.add(name2);
      
      System.out.println("Ingrese nombre 3: " );
        String name3=leer.nextLine();
      names.add(name3);
       
        System.out.println("Nombres: "+ names.toString());
       
       for(int i=0; i<names.size();i++){
           System.out.println("Nombres "+ names.get(i));      
       }
       
       
       
       //trabajo final logica:
       /*crear una funcionalidad que agregue nombre a un arraylist de manera
       dinamica preguntando si desea agregar un nuevo nombre ademas debe imprimir
       el listado de nombres indicando nombre # y debe permitir salir de la 
       funcionalidad
       do whilw  funcion para imprimir iterando con for pero tod 
       dentro de un while
       switc para menu  28 ago
       investigar metodo size y metodo get  
       
       https://www.w3schools.com/java/java_arraylist.asp
       */
       
       
       
       
       
       
       
    }
}
