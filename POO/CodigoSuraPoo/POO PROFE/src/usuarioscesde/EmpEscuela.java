package usuarioscesde;

public class EmpEscuela extends Academico {
    private double salario;
    private String rol;

    public EmpEscuela() {

    }

    public EmpEscuela(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String escuela, double salario, String rol) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono, escuela);
        this.salario = salario;
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Agregue la Escuela: ");
        escuela = sc .next();
        System.out.println("Agregue el salario: ");
        salario = sc .nextDouble();
        System.out.println("Agregue el rol: ");
        rol = sc .next();

    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
        System.out.println("Escuela: "+escuela+"\n"+ " Salario: "+salario+"\n"+" Rol : "+rol);
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();


    }
}
