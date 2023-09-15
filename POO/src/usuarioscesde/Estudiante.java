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


}
