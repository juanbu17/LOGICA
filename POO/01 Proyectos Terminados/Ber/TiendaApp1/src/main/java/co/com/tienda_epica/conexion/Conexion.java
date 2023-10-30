package co.com.tienda_epica.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection connect;

    private Conexion(){
        try{

            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_epica","root","");
            if(connect!= null){
                System.out.println("La conexión ha sido exitosa");
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }


    public static Connection get_connection(){

        System.out.println("Antes de pedir: " + connect);
        if (connect == null){
            new Conexion();
        }
        System.out.println("Cuando la llamo: " + connect);
        return connect;
    }


    public static void close_connection(){
        try{
            System.out.println("Antes de cerrar: " + connect);
            if(connect != null){
                connect.close();
                connect = null;
            }
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Después de cerrar: " + connect);
    }


}
