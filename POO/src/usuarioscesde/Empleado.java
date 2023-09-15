package usuarioscesde;

public class Empleado {
    private double salario;
    private String area;

    public  Empleado(){
        super();

    }

    public Empleado(double salario, String area) {
        this.salario = salario;
        this.area = area;
    }

    public double getSalario() {
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
    }
}
