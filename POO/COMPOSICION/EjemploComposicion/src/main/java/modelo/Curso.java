package modelo;

import java.util.Scanner;

public class Curso {
    Scanner sc = new Scanner(System.in);
    private int idCurso;
    private String nombreCurso;
    private int duracion;

    private String programa;

//----------------------------------crear constructor vacio:
    public Curso(){

    }

public Curso(String porgrama){
        this.programa=programa;
}
//-----------------------------------------agregar getters y setters
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

//---------------------------------------METODOS:
    public void crearCurso(){
        System.out.println("Ingrese  el id del curso:");
        idCurso = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese  el nombre del curso:");
        nombreCurso = sc.nextLine();
        System.out.println("Ingrese  la duracion del profesor:");
        duracion = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese  el programa del profesor:");
        programa = sc.nextLine();

    }

    public void verCurso(){
        System.out.println(
                "Id del Curso: "+idCurso+ "\n"+
                "Nombre: "+nombreCurso+ "\n"+
                "Programa: "+duracion+ "\n"+
                "Duración: "+programa+ "\n"
        );

    }

    public void verCursotoString(){
        this.toString();
    }

}
