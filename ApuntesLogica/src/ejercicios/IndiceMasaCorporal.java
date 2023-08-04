/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
import java.util.Scanner;
public class IndiceMasaCorporal {
        static Scanner sc = new Scanner(System.in);
     public static void main (String[]args){
         
         System.out.println("Ingrese la altura");
         double altu = sc.nextDouble();
         System.out.println("ingrese su peso");
         double peso = sc.nextDouble();
         double imc = peso/(altu*altu);
         System.out.println("Su indice de masa corporal es: "+imc);
         if(imc<18.5){
             System.out.println("Usted tiene bajo peso  " );
}  else if(imc>=18.5&&imc<=24.99){
             System.out.println("Usted tiene peso normal  ");
}else if(imc>=25 && imc<=29.9){
             System.out.println("Usted tiene sobrepeso  ");
}else if(imc>30){
             System.out.println("Usted tiene obesidad ");

}
}
}

