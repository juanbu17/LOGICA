package main;

import java.util.Scanner;

public class PruebaExamen {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.marca = "Mazda";
        carro1.color= "Gris";
        carro1.kms = 100;

        carro2.marca = "Nissan";
        carro2.color = "Blanco";
        carro2.kms = 35;

        System.out.println("El carro 1 que se vendio fue: "+carro1.marca);
        System.out.println("El carro 2 que fue vendido fue un: "+carro2.marca);
        System.out.println("\n---------------------------------");

        System.out.println("Ingrese la marca del nuevo carro: ");
        carro3.marca= sc.nextLine();
        System.out.println("Ingrese el color del nuevo carro: ");
        carro3.color = sc.nextLine();
        System.out.println("Ingrese el kilometraje del nuevo carro: ");
        carro3.kms=sc.nextInt();
        System.out.println("El carro 3 que se vendio fue: "+carro3.marca);
        System.out.println("El color del carro 3 que se vendio fue: "+carro3.color);
        System.out.println("El kilometraje del carro 3 que se vendio fue: "+carro3.kms);
        System.out.println("Asi si lo coges!!!! juan");
    }
}
