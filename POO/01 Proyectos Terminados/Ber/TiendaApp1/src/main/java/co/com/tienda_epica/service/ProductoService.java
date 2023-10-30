package co.com.tienda_epica.service;

import co.com.tienda_epica.dao.ProductoDao;
import co.com.tienda_epica.model.Producto;

import java.util.Scanner;

public class ProductoService {
    static Scanner sc = new Scanner(System.in);

    public static void crearProducto(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion del producto: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el costo del producto:");
        double costo = sc.nextDouble();
        System.out.println("Ingrese la cantidad de producto: ");
        double cantidad = sc.nextDouble();


        Producto registro = new Producto();

        registro.setNombreProducto(nombre);
        registro.setDescripcionProducto(descripcion);
        registro.setPrecio(precio);
        registro.setCosto(costo);
        registro.setCantidad(cantidad);


        ProductoDao.crearProductoDB(registro);



    }

    public static void listarProductos(){

        ProductoDao.listarProductosDB();


    }


    public static void modificarProducto(){

        System.out.println("Indique  para modificar 1: nombre 2: descripcion 3: Precio 4: costo 5: cantidad");
        int opc = sc.nextInt();
        sc.skip("\n");

        int id;
        Producto update = new Producto();

        switch (opc){

            case 1:
                System.out.println("Modificar nombre:");
                System.out.println("Ingrese el nuevo valor");
                String nombre = sc.nextLine();
                System.out.println("Indique el id del producto a Actualizar");
                id = sc.nextInt();
                opc = 1;
                update.setOpc(opc);
                update.setNombreProducto(nombre);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);

                break;
            case 2:

                System.out.println("Modificar descripcion:");
                System.out.println("Ingrese el nuevo valor");
                String descripcion = sc.nextLine();
                System.out.println("Indique el id del producto a Actualizar");
                id = sc.nextInt();
                opc = 2;
                update.setOpc(opc);
                update.setDescripcionProducto(descripcion);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;
            case 3:
                System.out.println("Modificar ¨Precio:");
                System.out.println("Ingrese el nuevo valor");
                Double precio = sc.nextDouble();
                System.out.println("Indique el id del producto a Actualizar");
                id = sc.nextInt();
                opc = 3;
                update.setOpc(opc);
                update.setPrecio(precio);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;
            case 4:
                System.out.println("Modificar costo:");
                System.out.println("Ingrese el nuevo valor");
                Double costo = sc.nextDouble();
                System.out.println("Indique el id del producto a Actualizar");
                id = sc.nextInt();
                opc = 4;
                update.setOpc(opc);
                update.setCosto(costo);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;
            case 5:
                System.out.println("Modificar cantidad:");
                System.out.println("Ingrese el nuevo valor");
                Double cantidad = sc.nextDouble();
                System.out.println("Indique el id del producto a Actualizar");
                id = sc.nextInt();
                opc = 5;
                update.setOpc(opc);
                update.setCantidad(cantidad);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;
            default:
                System.out.println("Seleccione una opcion correcta");

        }


    }


    public static void eliminarProducto(){

        System.out.println("Indique el id del producto a borrar: ");
        int idProducto = sc.nextInt();
        ProductoDao.eliminarProductoDB(idProducto);

    }









}
