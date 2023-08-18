/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 507
 */
public class LoguinconArraylist {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<String>usuario=new ArrayList<String>();
        //crear un registro:
        System.out.println("Ingrese su nombre: ");
        String name=leer.nextLine();
        usuario.add(name);
        
        System.out.println("Ingrese su correo: ");
        String email=leer.nextLine();
        usuario.add(email);
        
         System.out.println("Ingrese su contrasena: ");
        String passw=leer.nextLine();
        usuario.add(passw);
        
        System.out.println("Iniciar sesion");
        
        System.out.println("ingrese el correo registrado");
        String emailUser= leer.next();
        System.out.println("ingrese la contraseña registrada");
        String passwUser= leer.next();
        
        if (usuario.get(1).equals(emailUser)&&usuario.get(2).equals(passwUser)){
            System.out.println("Bienvenido"+usuario.get(0));
            
        }else{
            System.out.println("valide sus credenciales");
        }
        
    }
}
