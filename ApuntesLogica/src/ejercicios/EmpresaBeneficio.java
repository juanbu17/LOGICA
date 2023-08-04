/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author 505
 * 7. Escriba el código correspondiente:
 * Una empresa ha creado un plan de beneficios. 
 * Si el empleado tiene entre 6 y 12 meses recibe un bono de $200.000.
 * Si tiene entre 13 y 24 meses recibe un bono de 500.000.
 * si su antigüedad es mayor a 25 meses recibe medio  el 60% de su salario.

 */
public class EmpresaBeneficio {
    public static void main(String[] args){
       int bono1= 200000;
       int bono2= 500000;
       int salario= 1600000;
       int bono3= salario*60/100;
       int beneficio = salario+bono3;
     
        Scanner leer = new Scanner(System.in);
          
          int meses;
          System.out.println("ingrese la cantidad de meses");
          meses = leer.nextInt();
          /*System.out.println("su nonbre es: " + meses);*/
          
          
          
       if (meses>=6 && meses<=12){
           System.out.println("recibe un bono de $200.000");
       }
    else if(meses>= 12 && meses<=24) {  
          System.out.println("recibe un bono de $500.000");
       }
       else{
               System.out.println("recibe un bono por: "+bono3);
               System.out.println("Su pago total es de: " +beneficio);
               }
}
}
