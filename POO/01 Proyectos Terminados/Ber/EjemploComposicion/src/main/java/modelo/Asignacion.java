package modelo;

import java.util.Scanner;

public class Asignacion {

    Scanner sc = new Scanner(System.in);

    private int idAsignacion;
    private String fechaInicio;
    private String fechaFin;
    Curso curso;
    Profesor profesor;

    public Asignacion(){

    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void crearAsignacion(){

        System.out.println("Ingrese el id de la asignacion: ");
        idAsignacion = sc.nextInt();
        sc.skip("\n");
        System.out.println("Fecha Inicio: ");
        fechaInicio = sc.nextLine();
        System.out.println("Fecha Fin: ");
        fechaFin = sc.nextLine();
    }

    public void verAsignacion(){
        System.out.println("Id de la asignacion: " + idAsignacion + "\n" +
                "Fecha de Inicio: " + fechaInicio + "\n" +
                "Fecha Fin: " + fechaFin + "\n" +
                "Nombre del curso: " + curso.getNombreCurso() + "\n" +
                "Nombre del Profesor: " + profesor.nombre + "\n" +
                "Apellido del Profesor:" + profesor.apellido);
    }

}
