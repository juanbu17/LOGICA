/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariables {
  public static void main (String[]args){  
int a,b;
a = 4;
b = 10;
int suma;
int resta;
int multi;
int div;

suma = a + b;
resta = b-a;
multi = a * b;
div = b/a;


System.out.println("El resultado de la suma es:" + suma);
System.out.println("El resultado de la resta es:" + resta);
System.out.println("El resultado de la multi es:" + multi);
System.out.println("El resultado de la div es:" + div);

/* para evitar que se pierda informacion en
la div b/a  QUE ME ESTA DANDO 2.0 Y SE ESTA
PERDIENDO EL.5 realizo un casting de variables
ESTO EVITARA PERDIDA DE DATOS*/
float divfloat = (float)  b/a;
System.out.println("El valor exacto de la div es:" + divfloat);

  }         
}
