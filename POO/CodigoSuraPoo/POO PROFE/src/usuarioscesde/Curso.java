package usuarioscesde;

public class Curso {

    private int idCurso;
    private String nombre;
        private String horario;
        private Profesor profesor= new Profesor();//composicion de clase  ( es como la llave foranea de BD), se hereda por atributos de la clase(por las variables)
        private Programa programa =new Programa();


    public Curso(){

    }

    public Curso(int idCurso, String nombre, String horario, Profesor profesor, Programa programa) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.programa = programa;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
}
