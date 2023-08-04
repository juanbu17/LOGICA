/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author SERVER
 */
public class CapturarDeTeclado {
      public static void main(String[]ârgs){
          Scanner leer = new Scanner(System.in);
          
          String nombre;
          System.out.println("ingrese su nombre");
          nombre = leer.next();
          System.out.println("su nonbre es: " + nombre);
      }
    /*resultado:
      ingrese su nombre
        juan
        su nonbre es: juan*/
}