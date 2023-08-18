package EjerciciosCasa;

import java.util.Scanner;

public class BancoChat {

    static class Banco {

        private double saldo;
        private String clave;

        public Banco(double saldoInicial, String claveInicial) {
            saldo = saldoInicial;
            clave = claveInicial;
        }

        public double consultarSaldo() {
            return saldo;
        }

        public String realizarTransferencia(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
                return "Transferencia realizada con éxito";
            } else {
                return "Saldo insuficiente para realizar la transferencia";
            }
        }

        public void cambiarClave(String nuevaClave) {
            clave = nuevaClave;
            System.out.println("Clave cambiada exitosamente");
        }

        public void bloquearProducto(String producto) {
            System.out.println("Producto " + producto + " bloqueado");
        }

        public String realizarDonacion(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
                return "Donación de " + monto + " realizada. Gracias por su contribución.";
            } else {
                return "Saldo insuficiente para realizar la donación";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco(1000, "1234");

        while (true) {
            System.out.println("Bienvenido al Banco XYZ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Bloquear producto");
            System.out.println("5. Realizar donación");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + banco.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferencia = scanner.nextDouble();
                    System.out.println(banco.realizarTransferencia(montoTransferencia));
                    break;
                case 3:
                    System.out.print("Ingrese la nueva clave: ");
                    String nuevaClave = scanner.next();
                    banco.cambiarClave(nuevaClave);
                    break;
                case 4:
                    System.out.print("Ingrese el producto a bloquear: ");
                    String producto = scanner.next();
                    banco.bloquearProducto(producto);
                    break;
                case 5:
                    System.out.print("Ingrese el monto a donar: ");
                    double montoDonacion = scanner.nextDouble();
                    System.out.println(banco.realizarDonacion(montoDonacion));
                    break;
                case 6:
                    System.out.println("¡Gracias por utilizar nuestros servicios!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}
