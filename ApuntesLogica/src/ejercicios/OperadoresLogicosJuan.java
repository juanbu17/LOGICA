/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author JuanC Lenovo
 */
public class OperadoresLogicosJuan {
 
    
     public static void main (String[]args){
        // a. sacar el promedio de puntos
        //b. por sancion perdio 50 puntos los dias martes y miercoles
        //c. le van a pagar por cada 50 puntos una bonificacion de 10000los dias lunes martes y miercoles y de 15.000 los jueves y viernes
        //d. cuanto dinero recibe por bonificacion en total y cuanto dejo de ganar por la sancion
        //e. deben imprimir un informe
        
        int plu = 500;
        int pma = 400;
        int pmi = 390;
        int pju = 510;
        int pvi = 300;
        int suma;
        suma = plu+pma+pmi+pju+pvi; 
        System.out.println(" Suma total de puntos: " + suma);
//resultados para promedio        
        int promedio= suma /5;

System.out.println(" El promedio del Sr X fue de: " + promedio);


//resultados para sanciones     
     int sancion1 = 50;
     int sancion2 = 50;
     int sanciontot = sancion1+sancion2;
     
System.out.println(" Total puntos restados por sanciones: " + sanciontot);


//resultados para total relativo acumulado
     int totalrelativo  = suma-sanciontot;
     
System.out.println(" Total relativo acumulado: " + totalrelativo);
          
//resultados para bonoficacion por cada 50 puntos          
          
     int bonificacion= 10000;
     int bonificacion2 = 15000;
     
// cantidad de bonificaciones para el dia lunes
     int cantbonlun = plu/50;
     
     System.out.println(" Total cantidad de bonificaciones dia lunes: " + cantbonlun);
     
     int totallun = cantbonlun*bonificacion;
          System.out.println(" Total dinero por bonificacion del dia lunes $: " + totallun );
          
          
 // cantidad de bonificaciones para el dia martes
     int cantbonmar = pma/50;
     
     System.out.println(" Total cantidad de bonificaciones dia martes: " + cantbonmar);
     
     int totalmar = cantbonmar*bonificacion;
          System.out.println(" Total dinero por bonificacion del dia martes $: " + totalmar );

     
  // cantidad de bonificaciones para el dia miercoles
     int cantbonmi = pmi/50;
     
     System.out.println(" Total cantidad de bonificaciones dia miercoles: " + cantbonmi);
     
     int totalmi = cantbonmi*bonificacion;
          System.out.println(" Total dinero por bonificacion del dia miercoles $: " + totalmi );
     
    
    // cantidad de bonificaciones para el dia jueves
     int cantbonju = pju/50;
     
     System.out.println(" Total cantidad de bonificaciones dia jueves: " + cantbonju);
     
     int totalju = cantbonju*bonificacion2;
          System.out.println(" Total dinero por bonificacion del dia jueves $: " + totalju );
          
          
    // cantidad de bonificaciones para el dia viernes
     int cantbonvi = pvi/50;
     
     System.out.println(" Total cantidad de bonificaciones dia viernes: " + cantbonvi);
     
     int totalvi = cantbonvi*bonificacion2;
          System.out.println(" Total dinero por bonificacion del dia viernes $: " + totalvi ); 
          
         
          
     int totalbonif = totallun+totalmar+totalmi+totalju+totalvi;
     
               System.out.println(" Total puntos por bonificaciones: " + totalbonif ); 
               
             
               

 }    
   
}
