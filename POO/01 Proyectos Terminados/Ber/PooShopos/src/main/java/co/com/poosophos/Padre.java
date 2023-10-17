package co.com.poosophos;

import java.util.Scanner;

public class Padre {

    Scanner sc = new Scanner(System.in);


    //Atributos de la clase
    protected int idPadre;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String ocupacion;

    // Constructor
    public Padre(){
    }

    public Padre(String apellido){
        this.apellido = apellido;
    }

    public Padre(int idPadre, String nombre, String apellido, int edad, String ocupacion) {
        this.idPadre = idPadre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    // Getter and Setter : Son metodos para acceder a las variables privados
    // Sin comprometer directamente el atributo
    // A esto se le llama encapsulamiento.

    public void setIdPadre(int idPadre){
        this.idPadre = idPadre;
    }
    public int getIdPadre(){
        return this.idPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    // metodos propios

    public void crearPadre(){
        System.out.println("INgrese el id del padre:");
        idPadre = sc.nextInt();
        sc.skip("\n");
        System.out.println("INgrese el nombre del padre");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido:");
        apellido = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese la ocupación: ");
        ocupacion = sc.nextLine();
    }

    public void verPadre(){
        System.out.println("id: " + idPadre + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido);
    }

}
