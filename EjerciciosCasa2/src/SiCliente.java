
import java.util.Scanner;

/*Realizar el ejercicio que muestre el nombre del cliente y la cantidad de
artículos comprados, si la cantidad es menor de 5 pagara en efectivo,
si es mayor de 5 y menor de 12 pagara con tarjeta,  si es mayor de 13 
pagara con cheque.
Realizar el ejercicio que pida dos valores numéricos y mostrar cual
es el mayor, cual es el menor  o si son iguales.*/

/**@author Juan Buitrago*/
public class SiCliente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la cantidad de productos a llevar");
        int cant= leer.nextInt();
        if(cant<5){
            System.out.println("El cliente: "+nombre+" lleva "+cant+" productos");
            System.out.println(nombre+" Debe de pagar en efectivo");
        }if(cant<12&&cant>5){
             System.out.println("El cliente: "+nombre+" lleva "+cant+" productos");
            System.out.println(nombre+" Debe de pagar con tarjeta");
        }if(cant>12){
            System.out.println("El cliente: "+nombre+" lleva "+cant+" productos");
            System.out.println(nombre+" Debe de pagar con cheque");
        }
        
            //segunda parte del ejercicio
        
        int num1;
        int num2;
        
        System.out.println("Ingrese  primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese  segundo numero");
        num2=leer.nextInt();
        
        if(num1>num2){
            System.out.println(num1+" es mayor que: "+num2);
        }if(num2>num1){
                      System.out.println(num2+" es mayor que: "+num1);
  
        }if(num1==num2){
            System.out.println("El numero 1: "+num1+" y el numero 2: "+ num2+" son iguales");
        }
        
    }
    
    
}
