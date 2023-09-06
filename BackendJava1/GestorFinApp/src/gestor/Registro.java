package gestor;

import java.util.Scanner;

public class Registro {

    Usuario usuario = new Usuario();
    Scanner leer = new Scanner(System.in);

    double salary;
    double incomings;
    double bills ;
    double saves;

    Usuario perfil;//crea variable que conecta los otros clases //variable que se convierte en objeto de tipo Usuario

    public void registerData(){



        System.out.println("Ingrese su Nombre");
        perfil.name = leer.next();

        System.out.println("Ingrese su Apellido");
        perfil.lastname = leer.next();

        System.out.println("Ingrese su Email");
        perfil.email = leer.next();


    }
    public void registerValores(){
        System.out.println("Ingrese el Salario");
        salary = leer.nextDouble();
        System.out.println("Ingrese sus Entradas");
        incomings = leer.nextDouble();

        System.out.println("Ingrese sus Gastos");
        bills = leer.nextDouble();

        System.out.println("Ingrese su Ahorro");
        saves = leer.nextDouble();

        System.out.println("");
        System.out.println();
    }




}
