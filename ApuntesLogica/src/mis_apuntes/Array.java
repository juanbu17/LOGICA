/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class Array {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
            String lea;
            String lea2;
            String lea3;
            String lea4;

                    System.out.println("ingrese nombre");
            lea=leer.nextLine();
             System.out.println("ingrese nombre");
            lea2=leer.nextLine();
             System.out.println("ingrese nombre");
            lea3=leer.nextLine();
             System.out.println("ingrese nombre");
            lea4=leer.nextLine();
            
            
        String names[] = new String[4];
        names[0]=lea;
        names[1]=lea2;
        names[2]=lea3;
        names[3]=lea4;

                    for(int i=0;i<names.length;i++){
        System.out.println("posicion :"+i+" es "+names[i]);
    }
    }
}
