package usuarioscesde;

import java.util.Scanner;

public class Usuario {
    Scanner sc = new Scanner(System.in);


    // Primero creamos los atributos encapsulados con private (si fuera public seria visible para todas las clases

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String direccion;
    private String telefono;

    //vamos a crear nuestro metodo constructor vacio (aunque java lo crea por defecto)

    public Usuario(){

    }

    //vamos a crear nuestro metodo constructor con parametros alt+insert (generate constructor)


    public Usuario(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }
        //construimos los getter y setter para permitir el acceso desde los metodos a las variables privadas

    public void setNombre(String nombre){//recibe un argumento
        this.nombre = nombre;

    }

    public int getId() {// para crearlos automaticamente se usa alt+insert getter and setter
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
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








    //  segundo creamos los METODOS:
    public void registrarUsuario(){
        System.out.println("Ingrese su id: " );
        this.id = sc.nextInt();
        sc.skip("\n");                            //This es un operador que hace referencia a un atributo de la clase

        System.out.println("Ingrese su nombre: " );
        this.nombre = sc.nextLine();

        System.out.println("Ingrese su apellido: " );
        this.apellido = sc.nextLine();

        System.out.println("Ingrese su correo: " );
        this.correo = sc.nextLine();

        System.out.println("Ingrese su contrasena: " );
        this.contrasena = sc.nextLine();

        System.out.println("Ingrese su direccion: " );
        this.direccion = sc.nextLine();

        System.out.println("Ingrese su telefono: " );
        this.telefono = sc.nextLine();

    }

    @Override
    public String toString() {                    //se genera presionando alt+insert y seleccionar toString metodo que imprime todooo
        return "Usuario{" +

                " id=" + id +
                " nombre='" + nombre + '\n' +
                " apellido='" + apellido + '\n' +
                " correo='" + correo + '\n' +
                " contrasena='" + contrasena + '\n' +
                " direccion='" + direccion + '\n' +
                " telefono='" + telefono + '\n' +'\n'+
                '}';
    }

    public void iniciarsesion(){
        System.out.println("Ingrese el correo registrado");
        String correoRegistrado = sc.nextLine();
        System.out.println("Ingrese la contrasena registrada");
        String contrasenaReg = sc.nextLine();

        if(contrasena.equals(contrasenaReg)&&correo.equals(correoRegistrado)){
            System.out.println("Bienvenido "+nombre);
        }else{
            System.out.println("credenciales no validas");
        }
    }

}
