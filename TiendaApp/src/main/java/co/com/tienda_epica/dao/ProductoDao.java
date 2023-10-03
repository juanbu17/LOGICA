package co.com.tienda_epica.dao;

import co.com.tienda_epica.conexion.Conexion;
import co.com.tienda_epica.model.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDao {


    public static void crearProductoDB(Producto registro){
Conexion connect = new Conexion();


try(Connection conexion = connect.get_connection()){

    PreparedStatement ps = null;

    try{
       String query = "INSERT INTO producto(nombre,descripcion,precio,costo,cantidad)VALUES(?,?,?,?,?)" ;
       ps = conexion.prepareStatement(query);

       ps.setString(1,registro.getnombreProducto());
        ps.setString(2,registro.getdescripcionProducto());
        ps.setDouble(3,registro.getprecio());
        ps.setDouble(4,registro.getcosto());
        ps.setDouble(5,registro.getcantidad());

        ps.excecuteUpdate();

        System.out.println("");

    }catch(SQLException e){
        System.out.println(e);
    }

}catch(SQLException e){
    System.out.println(e);
        }

    }

    public static void ListarProductosDB(){

    }

    public static void modificarProductosDB(){

    }

    public static void eliminarProductosDB(){

    }






}
