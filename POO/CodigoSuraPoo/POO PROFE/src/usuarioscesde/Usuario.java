package usuarioscesde;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);

    //Primero creamos los atributos encapsulados con private

    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;
    protected String direccion;
    protected String telefono;

    // Vamos a crear nuestro método constructor vacio

    public Usuario(){


    }

    //Vamos a crear un constructor con parametros

    public Usuario(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Construimos los Getter and Setter para permitir el acceso desde los metodos
    // a las variables privadas.

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public String getNombre(){

        return this.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // métodos

    public void registrarUsuario(){

        System.out.println("Soy el de usuario");

        System.out.println("Ingrese su id: ");
        this.id = sc.nextInt(); // This es un operador que hace refencia a una atributo de la clase
        sc.skip("\n");
        System.out.println("Ingrese su nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        this.apellido = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        this.correo = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        this.contrasena = sc.nextLine();
        System.out.println("Ingrese su telefono: ");
        this.telefono = sc.nextLine();
        System.out.println("Ingrese su dirección: ");
        this.direccion = sc.nextLine();

    }


    public void imprimirUsuario() {
        System.out.println(

                ", id=" + id +
                ", nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", correo='" + correo + '\n' +
                ", contrasena='" + contrasena + '\n' +
                ", direccion='" + direccion + '\n' +
                ", telefono='" + telefono + '\n' +
                '}');
    }


    public void iniciarSesion(){

        System.out.println("Ingrese el correo registrado");
        String correoRegistrado = sc.next();
        System.out.println("Ingrese la contraseña registrada:");
        String contrasenaReg = sc.next();

        if(contrasena.equals(contrasenaReg)&& correo.equals(correoRegistrado)){

            System.out.println("Bienvenido " + nombre);
        }else{
            System.out.println("Credenciales no validas");
        }

    }
}
