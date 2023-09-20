package usuarioscesde;

import java.util.Scanner;

public class Programa {
    Scanner sc = new Scanner(System.in);

    private int idPrograma;
    private String nombrePrograma;
    private int duracionPrograma;
    private String registroGov;
    private String escuela;

    public Programa(){

    }

    public Programa(int idPrograma, String nombrePrograma, int duracionPrograma, String registroGov, String escuela) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.duracionPrograma = duracionPrograma;
        this.registroGov = registroGov;
        this.escuela = escuela;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public int getDuracionPrograma() {
        return duracionPrograma;
    }

    public void setDuracionPrograma(int duracionPrograma) {
        this.duracionPrograma = duracionPrograma;
    }

    public String getRegistroGov() {
        return registroGov;
    }

    public void setRegistroGov(String registroGov) {
        this.registroGov = registroGov;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    //METODOS:

    public void crearPrograma(){
        System.out.println("Ingrese el id del programa: ");
        idPrograma  = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el nombre del programa: ");
        nombrePrograma  = sc.nextLine();
        System.out.println("Ingrese la duración del programa: ");
        duracionPrograma  = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese el registro de secretaria de educación del programa: ");
        registroGov  = sc.nextLine();
        System.out.println("Ingrese la escuela del programa: ");
        escuela  = sc.nextLine();
    }

public void imprimirPrograma(){
    System.out.println(
            "Id: "+idPrograma+"\n"+
            "Nombre: "+nombrePrograma+"\n"+
            "Duracion del programa: "+duracionPrograma+"\n"+
            "Registro d secretaria de educacion: "+registroGov+"\n"+
            "Escuela: "+escuela+"\n");
}



}
