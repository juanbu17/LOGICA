package usuarioscesde;

public class Estudiante extends Usuario{

    private String carrera;

    //constructores

    public  Estudiante(){
        super();

    }


    public Estudiante(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.carrera = carrera;
    }

    //getter and setter  alt+insert

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Metodos


    @Override// esto significa sobreescritura de metodos
    public void registrarUsuario() {
        System.out.println("Soy el metodo de registrar de la clase Estudiante");
        //super.registrarUsuario();

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

        System.out.println("Ingrese el programa de su interes: " );
        this.telefono = sc.nextLine();


    }
//con alt+insert seleccionar override y escoger el metodo que se necesite
    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void iniciarsesion() {
        super.iniciarsesion();
    }
}

