package empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Empleado empleado1 = new Empleado();
       Empleado empleado2 = new Empleado();

        System.out.println("Introduzca el nombre del primer empleado");
        empleado1.name = leer.nextLine();
        System.out.println("Ingrese el salario: ");
        empleado1.salary = leer.nextDouble();
        leer.skip("\n");
        System.out.println("Introduzca su cargo");
        empleado1.position = leer.nextLine();
        System.out.println("");



        System.out.println("Introduzca el nombre del segundo empleado");
        empleado2.name = leer.nextLine();
        System.out.println("Ingrese el salario: ");
        empleado2.salary = leer.nextDouble();
        leer.skip("\n");
        System.out.println("Introduzca su cargo");
        empleado2.position = leer.nextLine();


        System.out.println("El empleado: "+empleado1.name);
        System.out.println("Obtuvo un salario anual de: "+ empleado1.salarioAnual());
        System.out.println("El empleado 1 tiene un cargo de : "+empleado1.position);


        System.out.println("El empleado: "+empleado2.name);
        System.out.println("Obtuvo un salario anual de: "+ empleado2.salarioAnual());
        System.out.println("El empleado 2 tiene un cargo de : "+empleado2.position);
    }
}
