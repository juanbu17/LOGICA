package co.com.consultas;

public class Medico extends  Usuario{

    private int idMedico;
    private String especialidad;


    public Medico(){
        super();
    }

    public Medico(int idUsuario, String nombre, String apellido, String correo, String telefono, String direccion, int idMedico, String especialidad) {
        super(idUsuario, nombre, apellido, correo, telefono, direccion);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
    }


    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //metodos Propios


    @Override
    public void verUsuario() {
        super.verUsuario();
    }

    @Override
    public void verUsuario(Paciente paciente) {
        super.verUsuario(paciente);
    }


}
