package usuarioscesde;

public class Curso {

    private int idCurso;
    private String nombre;
        private String horario;
        private Profesor profesor= new Profesor();//composicion de clase  ( es como la llave foranea de BD), se hereda por atributos de la clase(por las variables)
        private Programa programa =new Programa();



}
