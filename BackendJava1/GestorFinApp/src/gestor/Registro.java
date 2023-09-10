package gestor;

import java.util.Scanner;

public class Registro {

    Usuario usuario = new Usuario();
    Scanner leer = new Scanner(System.in);

    double salary;
    double incomings;
    double bills ;
    double saves;
    double totalingreso = 0;
    double disponible =0;

    Usuario perfil;//crea variable que conecta los otros clases //variable que se convierte en objeto de tipo Usuario

    public void registerData(){

        System.out.println("Ingrese su Nombre");
        perfil.name = leer.next();

        System.out.println("Ingrese su Apellido");
        perfil.lastname = leer.next();

        System.out.println("Ingrese su Email");
        perfil.email = leer.next();

        System.out.println();
    }
    public double registerValores(){

        double resultado = 0;
        System.out.println("Ingrese el Salario");
        salary = leer.nextDouble();
        System.out.println("Ingrese sus Entradas Extras");
        incomings = leer.nextDouble();

        System.out.println("Ingrese sus Gastos");
        bills = leer.nextDouble();

        System.out.println("");
        System.out.println("Total Salario es: "+salary);
        System.out.println("Total Entradas extras es: "+incomings);
        System.out.println("Total Gastos es: "+bills);
        System.out.println("");









        return resultado;
    }

public double calcularValores(){
     totalingreso = salary+incomings-bills;

    System.out.println("El saldo disponible es de: "+totalingreso);
    System.out.println("");

    System.out.println("Ingrese cantidad que desea Ahorrar: ");
    saves = leer.nextDouble();

    System.out.println("Total Ahorros definido es: "+saves);

    disponible = totalingreso - saves;

    System.out.println("El nuevo saldo disponible es de: "+disponible);
    return disponible;
}


}
