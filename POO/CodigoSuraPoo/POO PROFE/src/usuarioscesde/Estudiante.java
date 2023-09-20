package usuarioscesde;

public class Estudiante extends Academico{


    //Atributos
    private String programa;


    // Constructores
    public Estudiante(){

    }

    public Estudiante(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String escuela, String carrera) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono, escuela);
        this.programa = carrera;
    }

//Getter and Setter


    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    // Metodos


    @Override
    public void registrarUsuario() {
        System.out.println("Soy el de estudiante");
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
        System.out.println("Indique el programa de su interés");
        this.programa = sc.nextLine();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
