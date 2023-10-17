package co.com.poosophos;

public class Hija extends Padre{

    //Atributos
    private String apellidoMadre;

    // Constructor
    public Hija(String apellido, String apellidoMadre){
        super(apellido);
        this.apellidoMadre = apellidoMadre;
    }



    // Getter an setter
    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    //Polimorfismo usando sobreescritura de metodos


    @Override
    public void crearPadre() {

        System.out.println("INgrese el id del padre:");
        idPadre = sc.nextInt();
        sc.skip("\n");
        System.out.println("INgrese el nombre del padre");
        nombre = sc.nextLine();
        /*
        System.out.println("Ingrese el apellido:");
        apellido = sc.nextLine();
        System.out.println("Ingrese el apellido de la madre:");
        apellidoMadre= sc.nextLine();

         */
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese la ocupación: ");
        ocupacion = sc.nextLine();

    }

    @Override
    public void verPadre() {
        super.verPadre();
        System.out.println("Segundo Apellido:" + apellidoMadre);
        System.out.println("Edad: " + edad);
        System.out.println("Ocupación" + ocupacion);
    }
}
