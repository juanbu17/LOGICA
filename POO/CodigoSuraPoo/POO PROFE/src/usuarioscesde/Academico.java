package usuarioscesde;
/* Esta clase es una clase "ABSTRACTA"--------------------------------------------------------------------*/
public class Academico extends Usuario{
    protected String escuela;
    public Academico(){

    }

    public Academico(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String escuela) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }










}
