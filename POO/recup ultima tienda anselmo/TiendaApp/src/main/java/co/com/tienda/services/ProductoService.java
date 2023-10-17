package co.com.tienda.services;

import co.com.tienda.dao.ProductoDao;
import co.com.tienda.models.Producto;

import java.util.Scanner;

public class ProductoService {
    private static final Scanner read = new Scanner(System.in);
    public static void crearProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = read.nextLine();
        System.out.println("Ingrese la descripción del producto");
        String descripcion = read.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = read.nextDouble();
        System.out.println("Ingrese el costo del producto");
        double costo = read.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        double cantidad = read.nextDouble();

        Producto producto = new Producto(nombre,descripcion,precio,costo,cantidad);

        ProductoDao.crearProductoDB(producto);
    }

    public static  void listarProductos(){

        ProductoDao.listarProductosDB();

    }

    public static  void modificarProducto(){

        System.out.println("Indique para modificar 1: Nombre 2: Descripcion 3: Precio 4: Costo 5: Cantidad");
        int opc = read.nextInt();
        read.skip("\n");
        Producto update = new Producto();
        int id;




        switch (opc){


            case 1:
                System.out.println("Modificar nombre:");
                System.out.println("Ingrese el nuevo nombre");
                String nombre = read.nextLine();
                System.out.println("Ingrese el id del producto");
                id = read.nextInt();


                update.setNombreProducto(nombre);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);


                break;


            case 2:
                System.out.println("Modificar descripcion:");
                System.out.println("Ingrese el nuevo valor a actualizar");
                String descripcion = read.nextLine();

                System.out.println("Ingrese el id del producto");
                id = read.nextInt();
                opc=2;
                update.setOpc(opc);


                update.setDescripcionProducto(descripcion);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 3:
                System.out.println("Modificar precio:");
                System.out.println("Ingrese el nuevo precio");
                double precio = read.nextDouble();
                System.out.println("Ingrese el id del producto");
                id = read.nextInt();
                opc=3;
                update.setOpc(opc);

                update.setPrecio(precio);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 4:
                System.out.println("Modificar costo:");
                System.out.println("Ingrese el nuevo valor de costo");
                double costo = read.nextDouble();

                System.out.println("Ingrese el id del producto");
                id = read.nextInt();
                opc=4;
                update.setOpc(opc);

                update.setCosto(costo);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 5:
                System.out.println("Modificar cantidad:");
                System.out.println("Ingrese el nuevo valor a actualizar");
                double cantidad = read.nextDouble();

                System.out.println("Ingrese el id del producto");
                id = read.nextInt();
                opc=5;
                update.setOpc(opc);
                update.setCantidad(cantidad);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;

            default:
                System.out.println("seleccione una opcion valida");



        }

    }

    public static void eliminarProducto(){
        System.out.println("Indique el id del producto a eliminar: ");
        int idProducto = read.nextInt();
        ProductoDao.eliminarProductoDB(idProducto);

    }
}
