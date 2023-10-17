package principiospoo;

import java.util.Scanner;

public abstract class Familia implements Util {

    Scanner sc = new Scanner(System.in);

    protected int id;
    protected String nombrePadre;
    protected String apellidoPadre;
    protected int edad;


    // No requieren un constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void crearPadre(){

        System.out.println("Dé un nombre al padre: ");
        nombrePadre = sc.nextLine();
        System.out.println( "escriba la edad del padre: ");
        edad = sc.nextInt();

    }

    public abstract void verPadre();
}
