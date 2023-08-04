/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadoresDeComparacion {
    public static void main (String[]args){
            
            int num1 =15;
            int num2 =7;
            boolean resultado = num1 >= num2;
                    System.out.println(resultado);  
                    
                    String nombre1 = "Maria";
                    String nombre2 = "Maria";
                    boolean nombreigual = nombre1==nombre2;
                    System.out.println("Es igual el nombre: " +nombreigual);
                    double salario1 = 1160000;
                    double salario2 = 1200000;
                    boolean comparacionsalario = salario1!=salario2;
                    boolean comparacionsalario2 = salario1==salario2;
                    System.out.println("los salarios son diferentes? "+comparacionsalario);
                    System.out.println("los salarios son iguales? "+comparacionsalario2);
                    
                    
 // Vamos a incluir validaciones
                    
                    int edad = 13;
                    if(edad <=10){
                   System.out.println("El niño puede ingresar");
                    }
                    if(edad <=12){
                        System.out.println("El niño puede ingresar");
                  
                    }
                    else{
                        System.out.println("El niño mayor de 12 años no puede ingresar");
                    }
                           
                    
    //si pepito tiene menos de 2800en la civica 
                                      
                    double pasaje = 2900;
                    if(pasaje<=2800){
                        System.out.println("SALDO INSUFICIENTE");
                    }
                    else{
                        double saldo = pasaje -2800;
                        System.out.println("Su nuevo saldo es: " + saldo);
                    }
                    
     //si Juan saco 2.9 en el examen de logica

float nota = 3.0f;
if(nota<= 2.9){
    System.out.println("No pasa la materia");
}
else{
    System.out.println("Pasas la materia con un puntaje de: "  +nota);
}

// Si Andres es 3 cm mas alto que Juan


int talla = 178;
int talla2 = 175;
int menor = talla - talla2;

if(talla>=talla2){
    System.out.println("Su talla es menor en: "+ menor +"cm");
}
        
 //Si tengo el fin de semana libre
 
 boolean findelibre = true;
 if(findelibre =true){
     System.out.println("comparto con mi familia");
 }
 else {
     System.out.println("debo trabajar");
 }
 
 boolean finsi = true;


 if(finsi==true){
     System.out.println("Si tengo el fin de semana Libre");
 }
 else{
     System.out.println("No estoy libre");
 }
         
         
     //Si me invitan a una fiesta 
     
     boolean invitadoFiesta = false;
     if(invitadoFiesta==true){
         System.out.println("Me voy de fiesta");
     }
     else{
         System.out.println("Hoy no salgo");
         
         
     }
     
     //Si quiero helado  o quiero pizza
     
     boolean helado = false;
     boolean pizza =true;
    
             
             if( helado == true){
                 if(pizza==true){
                     System.out.println("quiere los dos");
                 } else {
                     System.out.println("solo quiere helado");
                 }
                 System.out.println("Quiero helado");
             }
             else{
                 if(pizza == true){
                     System.out.println("solo quiere pizza");
                 } else{
                     System.out.println("no quiere ninguno de los dos");
                 }
             }
             
             if(helado == true || pizza == false){
                 System.out.println("quiere helado o pizza");
             }
}
         //SI QUIERO HELADO PROFE
    
    
    
   
}
    
    
                    
                    
                       

