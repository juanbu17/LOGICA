package registro_est;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=3;
        ArrayList<Double> notas = new ArrayList<Double>(n);

        Estudiante estudiante1 = new Estudiante();

        System.out.println("ingrese nombre");
        estudiante1.name = sc.nextLine();
        System.out.println("ingrese edad");
        estudiante1.age = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("ingrese nota " + (i+1));
            notas.add(sc.nextDouble());
        }

        estudiante1.qualifications = notas;


        System.out.println("El promedio es: " + estudiante1.promedio());
    }

}
