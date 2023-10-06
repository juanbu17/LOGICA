package co.com.tienda.dao;

import co.com.tienda.conexion.Conexion;
import co.com.tienda.models.Producto;

import java.sql.*;

public class ProductoDao {

    public static void crearProductoDB(Producto producto){
        Conexion connect = new Conexion();
        try(Connection con = connect.get_connection()) {

            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO producto(nombre,descripcion,precio,costo,cantidad)" +
                        "VALUES (?,?,?,?,?)";

                ps = con.prepareStatement(query);

                ps.setString(1,producto.getNombreProducto());
                ps.setString(2, producto.getDescripcionProducto());
                ps.setDouble(3, producto.getPrecio());
                ps.setDouble(4,producto.getCosto());
                ps.setDouble(5, producto.getCantidad());

                int resultOperacion = ps.executeUpdate();

                if(resultOperacion == 0){
                    System.out.println("No fue posible guardar el producto");
                }else{
                    System.out.println("El producto se guardó con éxito");
                }

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static  void listarProductosDB()  {

        Conexion conexion = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connect = conexion.get_connection()){

        String query = "SELECT * FROM producto";
        ps =  connect.prepareStatement(query);
        rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("Id producto: "+rs.getInt("id"));
            System.out.println("Nombre del producto: "+rs.getString("nombre"));
            System.out.println("Descripcion del producto: "+rs.getString("descripcion"));
            System.out.println("Precio del producto: "+rs.getDouble("precio"));
            System.out.println("Costo del producto: "+rs.getDouble("costo"));
            System.out.println("Cantidad producto: "+rs.getDouble("cantidad"));
            System.out.println("__________________________");
        }

    }catch(SQLException e){
            System.out.println("No se recuperaron registros");
            System.out.println(e);
        }

        }

    public static  void modificarProductoDB(){

    }

    public static void eliminarProductoDB(int idProducto){
Conexion conexion = new Conexion();
try(Connection connect = conexion.get_connection()){
    PreparedStatement ps = null;
    try{
       String query = "DELETE FROM producto where producto.id = ?";
       ps = connect.prepareStatement(query);
       ps.setInt(1,idProducto);
       ps.executeUpdate();
        System.out.println("El registro ha sido eliminado correctamente");

    }catch(SQLException e){
        System.out.println(e);
    }

}catch(SQLException e){
    System.out.println(e);
}
    }
}
