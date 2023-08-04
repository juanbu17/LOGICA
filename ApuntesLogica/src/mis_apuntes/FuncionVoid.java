/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.Scanner;

/**
 *
 * @author 505
 */

public class FuncionVoid {

    static int opc;

    public static void main(String[] args) {
        //printSwitch();
        menuPpal();
        /*printDesayunos();
        printAlmuerzo();
        printCena();
        printBebidas();
        menuSnacks();
        menuComidaRapida();*/
    }
  

    
    //funcion que sirve para imprimir un switch
    // no retorna ningun dato primitivo
    //va por fuera del metodo main----------------------------------------------------------------
    /*
    public static void printSwitch(){
Scanner scn = new Scanner(System.in);

        System.out.println("SELECCIONE UNA OPCION:");
        System.out.println(
                "1. coca cola  " + "2. manzana  " + "3. Jugos  ");
        opc = scn.nextInt();
     
        switch(opc ){
         
            case 1:
               System.out.println("Se entrega coca cola");
               break;
               case 2:
               System.out.println("Se entrega Manzana");
               break;
               case 3:
               System.out.println("Se entrega Jugo");
               break;
               default:
               System.out.println("Ingrese un pedido valido");
               break; 
        }
        
        
    }
     */
    //menu almuerzos
    
    public static void menuPpal(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu Principal");
        System.out.println("Que quieres Elegir?");
        
        System.out.println("1. Desayunos ");
        System.out.println("2. Almuerzos");
        System.out.println("3. Cenas");
        System.out.println("4. Bebidas");
        System.out.println("5. Snacks");
        System.out.println("6. Fast Food");
        
        opc =scn.nextInt();
        
        switch(opc){
            case 1:
                printDesayunos();
                break;
             case 2:
                printAlmuerzo();
                break; 
             case 3:
                 printCena();
                break;
              case 4:
                printBebidas();
                break;
              case 5:
                 menuSnacks();
                break;
              case 6:
                  menuComidaRapida();
                  break;
              default:
                  System.out.println("Revise su opcionn");
                  
        }
        
    } 
    // menu desayunos
    public static void printDesayunos() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu Desayunos: ");
        System.out.println("Seleccione la opcion: ");

        System.out.println("1. Jugo + croissant");
        System.out.println("2. Arepa con Queso + chocolate");
        System.out.println("3. Cereal +yogurt ");
        System.out.println("4. Calentao  ");
        System.out.println("5. Desayuno Saludable");
        
        opc = scn.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Se despacha Jugo + croissant ");
                break;
            case 2:
                System.out.println("Se despacha Arepa con Queso + chocolate ");
                break;
            case 3:
                System.out.println("Se despacha Cereal +yogurt ");
                break;
            case 4:
                System.out.println("Se despacha Calentao ");
                break;
            case 5:
                System.out.println("Se despacha Desayuno Saludable ");
                break;
            default:
                System.out.println("Revise su opcion");

        }
    }

    //menu almuerzos
    
    public static void printAlmuerzo(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu almuerzos");
        System.out.println("Que quieres Almorzar?");
        
        System.out.println("1. Sancocho ");
        System.out.println("2. Frijoles");
        System.out.println("3. Bandeja Paisa");
        System.out.println("4. Tamal");
        System.out.println("5. Ajiaco");
        
        opc =scn.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Selecciono Sancocho");
                break;
             case 2:
                System.out.println("Selecciono Frijoles");
                break; 
             case 3:
                System.out.println("Selecciono Bandeja Paisa");
                break;
              case 4:
                System.out.println("Selecciono Tamal");
                break;
              case 5:
                System.out.println("Selecciono Ajiaco");
                break;
              default:
                  System.out.println("Revise su opcionn");
        }
        
    } 
    
     //menu CENA
    
    public static void printCena(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu Cena");
        System.out.println("Que quieres Cenar?");
        
        System.out.println("1. ARROZ AL GUSTO ");
        System.out.println("2. QUICHÉ DE VERDURITAS");
        System.out.println("3. POKE HAWAIANO ");
        System.out.println("4. TARTA DE HOJALDRE DE JAMÓN");
        System.out.println("5. ENSALADA CÉSAR");
        
        opc = scn.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Selecciono ARROZ AL GUSTO");
                break;
             case 2:
                System.out.println("Selecciono QUICHÉ DE VERDURITAS");
                break; 
             case 3:
                System.out.println("Selecciono POKE HAWAIANO");
                break;
              case 4:
                System.out.println("Selecciono TARTA DE HOJALDRE DE JAMÓN");
                break;
              case 5:
                System.out.println("Selecciono ENSALADA CESAR");
                break;
              default:
                  System.out.println("Revise su opcionn");
        }
        
    } 
    
     //menu BEBIDAS
    
    public static void printBebidas(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu Bebidas");
        System.out.println("Que deseas Tomar?");
        
        System.out.println("1. JUGO ");
        System.out.println("2. GASEOSA");
        System.out.println("3. CERVEZA ");
        System.out.println("4. AGUA");
        System.out.println("5. LECHE");
        
        opc = scn.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Selecciono JUGO");
                break;
             case 2:
                System.out.println("Selecciono GASEOSA");
                break; 
             case 3:
                System.out.println("SeleccIono: CERVEZA");
                break;
              case 4:
                System.out.println("Selecciono: AGUA");
                break;
              case 5:
                System.out.println("Selecciono: LECHE");
                break;
              default:
                  System.out.println("Revise su opcionn");
        }
        
    } 
    // menu sanacks
    
    public static void menuSnacks(){
        System.out.println("Snacks Disponibles");
        Scanner scn = new Scanner(System.in);
        System.out.println("1. Empanadas");
        System.out.println("2. Deditos");
        System.out.println("3. alitas");
        System.out.println("4. chicharrones");
        System.out.println("5. crispetas");
        
        opc = scn.nextInt();
        
          
        switch(opc){
            case 1:
                System.out.println("Eligio Empanadas");
             break;   
               case 2:
                System.out.println("Eligio Deditos");
             break;   
               case 3:
                System.out.println("Eligio alitas");
             break;   
               case 4:
                System.out.println("Eligio chicharrones");
             break;   
               case 5:
                System.out.println("Eligio crispetas");
             break; 
             default:
                 System.out.println("Verifica tu opción");
                
            
        }
        
        
    }
    
    // menu sanacks
    
    public static void menuComidaRapida(){
        System.out.println("Fast Disponibles");
        Scanner scn = new Scanner(System.in);
        System.out.println("1. Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Arepa Rellena");
        System.out.println("4. Papas francesa");
        System.out.println("5. Perro Caliente");
        
        opc = scn.nextInt();
        
          
        switch(opc){
            case 1:
                System.out.println("Eligio Hamburguesa");
             break;   
               case 2:
                System.out.println("Eligio Pizza");
             break;   
               case 3:
                System.out.println("Eligio Arepa Rellena");
             break;   
               case 4:
                System.out.println("Eligio Papas francesa");
             break;   
               case 5:
                System.out.println("Eligio Perro Caliente");
             break; 
             default:
                 System.out.println("Verifica tu opción");
                
            
        }
        
        
    }
   
}
