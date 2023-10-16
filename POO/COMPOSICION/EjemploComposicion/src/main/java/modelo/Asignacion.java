package modelo;

import java.util.Scanner;

public class Asignacion {
    Scanner sc= new Scanner(System.in);
    private int idAsignacion;
    private String fechaInicio;

    private String fechaFin;
   // bjetos que funcionan como atributos
    Curso curso;
    Profesor profesor;


    public Asignacion() {

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
        System.out.println("Ingrese la id de la Asignacion ");
        idAsignacion = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese la fecha de inicio de la Asignacion ");
        fechaInicio = sc.nextLine();
        System.out.println("Ingrese la fecha de fin de la Asignacion ");
        fechaFin = sc.nextLine();


    }

    public void verAsignacion(){
        System.out.println(
                "id: "+idAsignacion+ "\n"+
                "Fecha de inicio: "+fechaInicio+ "\n"+
                "Fecha de fin: "+fechaFin+ "\n"+
                        "nombre del curso: "+curso.getNombreCurso()+"\n"+
                        "Nombre del profesor: "+profesor.getNombre()+"\n"+
                        "Apellido del profesor: "+profesor.getApellido()+"\n"

        );

    }





}
