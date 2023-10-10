package co.com.tienda.View;

import co.com.tienda.services.ProductoService;

import java.util.Scanner;

public class MenuApp {
    Scanner sc = new Scanner(System.in);

    public void menuProducto( ){

        System.out.println("Presione 1 para iniciar");
        int init = sc.nextInt();

        while(init!=0){
            System.out.println("1. Registrar producto \n"+
                    "2. listar producto \n"+
                    "3. Actualizar producto \n"+
                    "4. eliminar producto \n"+
                    "5. salir \n");
            int opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println( "Registre su producto");
                    ProductoService.crearProducto();
                    break;

                case 2:
                    System.out.println( "listar  productos");
                    ProductoService.listarProductos();
                    break;

                case 3:
                    System.out.println( "Actualizar productos");
                    ProductoService.modificarProducto();
                    break;

                case 4:
                    System.out.println( "Eliminar productos");
                    ProductoService.eliminarProducto();
                    break;

                case 5:
                    init=0;
                    System.out.println("Hasta pronto");


                    break;

                default:

                    System.out.println("Ingrese una opción válida");



            }








        }
    }


}
