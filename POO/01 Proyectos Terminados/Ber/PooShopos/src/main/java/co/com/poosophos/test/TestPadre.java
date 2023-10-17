package co.com.poosophos.test;

import co.com.poosophos.Padre;

public class TestPadre {



    public static void main(String[] args) {

        String apellido1 = "Perez";
        Padre papa1 = new Padre(apellido1);
        Padre papa2 = new Padre();
        //papa1.nombre = "Pedro";
        //System.out.println(papa1.nombre); // protected

        //papa1.ocupacion = "Independiente"; // Public
        /*
        System.out.println("--------------Instancia u objeto papa1 ---------------");
        papa1.crearPadre();
        papa1.verPadre();
        System.out.println("---------------Instancia u objeto papa2--------------");
        papa2.crearPadre();
        papa2.verPadre();

         */


        System.out.println(papa1);
        System.out.println(papa2);

       papa1.setIdPadre(123);

       System.out.println(papa1.getIdPadre());

        System.out.println(papa1.getApellido());



    }



}
