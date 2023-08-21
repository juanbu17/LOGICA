
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/** @author 507*/

public class LoguinconArraylist {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<String>usuario=new ArrayList<String>();
        //crear un registro:
        
        //Agregaria en el index cero el primer registro del array usuario
        System.out.println("Ingrese su nombre: ");
        String name=leer.nextLine();
        usuario.add(name);
        
        //Agregaria en el index uno el segundo registro del array usuario
        System.out.println("Ingrese su correo: ");
        String email=leer.nextLine();
        usuario.add(email);
        
        //Agregaria en el index dos el tercer registro del array usuario
         System.out.println("Ingrese su contrasena: ");
        String passw=leer.nextLine();
        usuario.add(passw);
        
        System.out.println("Iniciar sesion");
        
        /*aca toma los dtos de tclado para comparar y los gurda en
        emailUser y en passwUser*/
        System.out.println("ingrese el correo registrado");
        String emailUser= leer.next();
        System.out.println("ingrese la contraseña registrada");
        String passwUser= leer.next();
        
        
        /*Aca compara el index 1 (email) del primer array con el emailUser del segundo array y hace lo mismo con la passw y passwUser */
        if (usuario.get(1).equals(emailUser) && usuario.get(2).equals(passwUser)){
            System.out.println("Bienvenido"+usuario.get(0));//este solo es para mostar el nombre
            
        }else{
            System.out.println("valide sus credenciales");// en caso de que la comparacion no coincida
        }
        
    }
}
