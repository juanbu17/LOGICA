
package examen2.pkg0;

    import java.util.Scanner;

public class Examen20 {

    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int nota1, nota2, nota3;
        double promedio;
        System.out.println("Ingrese la primera nota ;");
        nota1 = lea.nextInt();

        System.out.println("Ingrese la segunda nota ;");
        nota2 = lea.nextInt();

        System.out.println("Ingrese la tercera nota ;");
        nota3 = lea.nextInt();



        promedio = (nota1+nota2+nota3)/3;

        System.out.println("Su promedio de nota es: "+promedio);
 
 
        
    }
    
}
