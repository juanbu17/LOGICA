
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class Calculadora3{
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String []args){
        
        menuCalc();
        
        
    }
    
    public static void menuCalc(){
        
            int  isOn;
            
        System.out.println("Oprima 1 para encender la calculadora");
        isOn = sc.nextInt();
        while (isOn!=0){
              
        System.out.println("---------------------------------");
        System.out.println("Calculadora Personal");
        System.out.println("---------------------------------");
        System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Módulo \n6. Salir");
        System.out.println("---------------------------------");      
            
            System.out.println("Ingrese una opción ");
            int opc = sc.nextInt();
        switch (opc){
            
            case 1:
                System.out.println("1. Suma");
                double num1 = capturarDatos("Ingrese número 1:");
                double num2 = capturarDatos("Ingrese número 2:");
                System.out.println("El resultado de la suma es:"+sumar (num1, num2));               
                break;
                
            case 2:
               System.out.println("2. Restar");
                double num3 = capturarDatos("Ingrese número 1:");
                double num4 = capturarDatos("Ingrese número 2:");
                System.out.println("El resultado de la resta es:"+restar (num3, num4));  
                break;
                
             case 3:
               System.out.println("3. Multiplicar");
                double num5 = capturarDatos("Ingrese número 1:");
                double num6 = capturarDatos("Ingrese número 2:");
                System.out.println("El resultado de la multiplicación es:"+multiplicar (num5, num6));  
                break;     
                
            case 4:
               System.out.println("4. División");
                double num7 = capturarDatos("Ingrese número 1:");
                double num8 = capturarDatos("Ingrese número 2:");
                System.out.println("El resultado de la división es:"+dividir (num7, num8));  
                break;    
                
            case 5:
               System.out.println("5. Modular");
                double num9 = capturarDatos("Ingrese número 1:");
                double num10 = capturarDatos("Ingrese número 2:");
                System.out.println("El resultado de la modulación es:"+modulo (num9, num10));  
                break;    
             
            case 6:
                
                System.out.println("6. Salir");
                isOn = 0;
                
                break;
                
            default:
                System.out.println("Ingrese una opcion valida");
        }                
            
        }
            
            
    }
    
    public static double capturarDatos(String cadena){
        System.out.println(cadena);
                double num= sc.nextDouble();
                /*
                System.out.println("Ingrese el número 2:");
                double num2=sc.nextDouble();*/
                return num;
             
    }  
    
    
    public static double sumar(double num1, double num2){
        
        double suma = num1 + num2;
        return suma;
    }
    
    public static double restar (double num1, double num2){
        
        double resta= num1 - num2;
        return resta;
    }
    
    public static double multiplicar (double num1, double num2){
        
        double multi= num1 * num2;
        return multi;
    }
    public static double dividir (double num1, double num2){
        
        double divi= num1 / num2;
        return divi;
    }
    
    public static double modulo (double num1, double num2){
        
        double mod= num1 % num2;
        return mod;
    }
    
    
}
