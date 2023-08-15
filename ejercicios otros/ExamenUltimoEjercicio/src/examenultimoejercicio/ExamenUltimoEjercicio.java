
package examenultimoejercicio;

    import java.util.Scanner;

public class ExamenUltimoEjercicio {

    
    public static void main(String[] args) 
    {
        Scanner lea = new Scanner(System.in);
        String nombre;
        int rpta;
        double pago,propina;
        System.out.println("El nombre del cliente es: ");
        nombre = lea.next();
        System.out.println("El pago del cliente es: ");
        pago = lea.nextDouble();
        propina = pago+(pago*10/100);
        System.out.println("Digite 1 si quiere pagar la propina de lo contrario digite 2");
        rpta = lea.nextInt();
        if(rpta == 1){
            System.out.println("El valor a pagar del cliente es: "+propina);
        }
        else if(rpta == 2 ){
            System.out.println("El usuario no paga propina: " + pago);
        }
        else{
            System.out.println("error");
        }
    }
    
}
