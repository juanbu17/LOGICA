package co.com.tienda_epica.test;

import co.com.tienda_epica.conexion.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {

    public static void main(String[] args) {



        try(Connection connect = Conexion.get_connection()){


        }catch (Exception e){
            System.out.println(e);
        }finally {
            Conexion.close_connection();
        }

    }





}
