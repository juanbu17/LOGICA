package co.com.tienda_epica.view;

import co.com.tienda_epica.service.ProductoService;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    public void menuProducto(){

        System.out.println("Presione 1 para iniciar: ");
        int init = sc.nextInt();

        while (init!=0){

            System.out.println(
                    "1. Registrar Producto \n" +
                    "2. Listar productos \n" +
                    "3. Actualizar Productos \n" +
                    "4. Eliminar Producto \n" +
                    "5. Salir"
            );

            int opc = sc.nextInt();

            switch (opc){

                case 1:
                    System.out.println("Registre su producto");
                    ProductoService.crearProducto();
                    break;
                case 2:
                    System.out.println("Listar productos");
                    ProductoService.listarProductos();
                    break;
                case 3:
                    System.out.println("Actualizar Productos");
                    ProductoService.modificarProducto();
                    break;
                case 4:
                    System.out.println("Eliminar Producto");
                    ProductoService.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }

        }

    }
}
