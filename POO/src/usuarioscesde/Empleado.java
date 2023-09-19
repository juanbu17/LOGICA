package usuarioscesde;

public class Empleado extends Usuario {
    private double salario;
    private String area;

    public  Empleado(){
        super();

    }

    public Empleado(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, double salario, String area) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.salario = salario;
        this.area = area;
    }
//metodos:

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Ingrese el salario base");
        salario= sc.nextDouble();
        System.out.println("Ingrese el Area");
        area=sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void iniciarsesion() {
        super.iniciarsesion();
    }

    /*public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }*/
}
