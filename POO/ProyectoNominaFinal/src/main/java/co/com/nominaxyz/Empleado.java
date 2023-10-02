package co.com.nominaxyz;

public class Empleado extends Usuario{

    protected String area;
    protected String cargoNombre;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargoNombre() {
        return cargoNombre;
    }

    public void setCargoNombre(String cargoNombre) {
        this.cargoNombre = cargoNombre;
    }
}
