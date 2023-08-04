/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Repaso {
   public static void main (String[]args){
    
 //variables: espaio reservado de memoria que alojara un dato
 byte num1 = 127;
 short num2 = 32767;
 int num3 = 2147483647;
 long num4 = 9223372036854775807l;
 float num6 = 4.556842f;
 double num7 = 5.458754;
 char caracter =64;
 boolean isON;
 isON= true;
         System.out.println("Float : "+num6);
         System.out.println("Double : "+num6);
         System.out.println(caracter);
         System.out.println(isON);

    /****Operadores aritmeticos****/
    //+,-,/,*%
    
    int a;
    int b;
    int c;
    //para declarar en la misma linea varias variables
    int d,e;
    // a = 500, b = 400,  c = 390, d = 510 , e = 300 (datos a ingresar)
        a = 500;
        b = 400;
        c = 390;
        d = 510;
        e = 300;
        // Suma
        int puntosTotales = a+b+c+d+e;
        System.out.println(" El total de los puntos obtenidos por Pepito es: " + puntosTotales);
        
//variable tipo string
String name= "Pepito";
String name2="pepito";
boolean compare= name.equals (name2);
System.out.println("Es igual????:" +compare);
    
}
}
   
