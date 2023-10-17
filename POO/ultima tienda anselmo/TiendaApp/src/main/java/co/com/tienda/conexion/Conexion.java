package co.com.tienda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection connect;

    private Conexion() {

        try {
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tienda_epica",
                    "root",
                    "");
            if (connect != null) {
                System.out.println("La conexión ha sido exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Connection get_connection() {
        if (connect == null) {
            new Conexion();
        }

        try {
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tienda_epica",
                    "root",
                    "");
            if (connect != null) {
                System.out.println("La conexión ha sido exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connect;
    }

    ;

    public static void close_connection() {
        try {
            if (connect != null) {
                connect.close();
                connect = null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


