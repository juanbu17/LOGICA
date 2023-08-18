/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosCasa;

import java.util.Scanner;

class Banco {
    private double saldo;
    private String clave;
    private boolean productoBloqueado;

    public Banco() {
        saldo = 1000;
        clave = "1234";
        productoBloqueado = false;
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    public void cambiarClave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nueva clave: ");
        String nuevaClave = scanner.nextLine();
        clave = nuevaClave;
        System.out.println("Clave cambiada exitosamente.");
    }

    public void bloquearProducto() {
        productoBloqueado = true;
        System.out.println("Producto bloqueado.");
    }

    public void realizarDonacion() {
        if (saldo >= 100) {
            saldo -= 100;
            System.out.println("Donación realizada. Gracias por su contribución.");
        } else {
            System.out.println("Saldo insuficiente para realizar la donación.");
        }
    }
}

public class BancoDAv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("Bienvenido al banco. Seleccione una opción:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Cambiar clave");
            System.out.println("3. Bloquear producto");
            System.out.println("4. Realizar donación");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    banco.consultarSaldo();
                    break;
                case 2:
                    banco.cambiarClave();
                    break;
                case 3:
                    banco.bloquearProducto();
                    break;
                case 4:
                    banco.realizarDonacion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestros servicios. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
