/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class NominaPepito {
    public static void main (String[]args){
    
    // pepito trabaja en la empresa xyz y hoy recibio su pago
// le descontaron 160000 ademas de salud y pension que son el 4% de salario base
//ademas le pagaron el aux transporte  por 140600
//pepito quiere ver desglosados los descuentos y el pago en una planilla
//imprima los detalles teniendo en cuenta que pepito gana 1250000 de salario base
    
int salario = 1250000;
int auxtrans = 140600;
int prestamo =160000;
float pens = 0.04f;
float sal = 0.04f;
System.out.println("Su salario base es de:" + salario);


float salfloat = (float) salario*sal;
float pensfloat = (float) salario*pens;



System.out.println("El descuento por salud es de: $" + salfloat);
System.out.println("El descuento por pension es de: $" + pensfloat);

int auxtran = 140600;

int salaux = salario+auxtran;
System.out.println("Valor Salario mas Auxilio de  transporte: $" +salaux);

System.out.println("Valor descuento por prestamo: $" +prestamo);

 int salarioparcial = salaux-prestamo;
 System.out.println("Salario parcial: $ " +salarioparcial);
 
 float salariofinal = (float)salarioparcial-salfloat-pensfloat;
 System.out.println("Total a pagar: $ " +salariofinal);
     
 
 
    } 
  
}
