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
}
