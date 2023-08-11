package ejercicios;

import java.util.Scanner;

/**
 *
 * @author juanbu
 */
public class Cajero {

    public static void main(String[] args) {
        int saldo = 300000;
        Scanner leaopc = new Scanner(System.in);
        Scanner leerconsi = new Scanner(System.in);
        Scanner leerreti = new Scanner(System.in);
        /* opcion while*/
        boolean cierre = true;
        while (cierre == true) {

            /*opciones switch*/
            System.out.println("********************");
            System.out.println("");
            System.out.println("Bienvenido A Cajero");
            System.out.println("Seleccione la operacion");
            System.out.println("");
            System.out.println("1. Consignacion");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            int opc;
            opc = leaopc.nextInt();

            switch (opc) {
                case 1:
                    /*consignar*/
                    System.out.println("Ingrese  Valor a consignar");
                    System.out.println("");
                    int consigna;
                    consigna = leerconsi.nextInt();

                    System.out.println("Saldo anterior: " + saldo);
                    System.out.println("El valor a consignar es: " + consigna);
                    System.out.println("");
                    System.out.println("Saldo a la fecha: " + consignar(saldo, consigna));
                    System.out.println("");

                    saldo = consignar(saldo, consigna);
                    break;

                case 2:
                    /*retirar*/
                    System.out.println("Ingrese  Valor a retirar");
                    int retiro;
                     retiro = leerreti.nextInt();
                
                    if (retiro <= 50000 && saldo>=retiro) {
                        System.out.println("Saldo Anterior: " + saldo);
                        System.out.println("El valor a retirar es: " + retiro);
                        System.out.println("");
                        System.out.println("Saldo a la fecha: " + retirar(saldo, retiro));
                        System.out.println("");
                        
                        saldo = retirar(saldo, retiro);
                        System.out.println("");
                    } else if(retiro>saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println("");
                        
                    } else{
                        System.out.println("Supera valor maximo de 50000");
                        System.out.println("");
                    }

                    break;

                case 3:
                    System.out.println("Hasta pronto");
                    System.out.println("");
                    cierre = false;
                    break;

                default:
                    System.out.println("Seleccione un valor correcto entre 1 o 2");
                    System.out.println("");
            }

        }

    }

    public static int retirar(int saldo, int retiro) {
        saldo = saldo - retiro;
        return saldo;
    }

    public static int consignar(int saldo, int consigna) {
        saldo = saldo + consigna;
        return saldo;
    }

}
