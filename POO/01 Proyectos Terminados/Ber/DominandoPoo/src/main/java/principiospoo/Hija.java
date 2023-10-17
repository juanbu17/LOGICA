package principiospoo;

public class Hija extends Padre{

    private String apellidoMadre;

    public Hija(String apellidoPadre, String apellidoMadre) {
        super(apellidoPadre);
        this.apellidoMadre = apellidoMadre;
    }

    // Getter y Setter


    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    // Metodos


    @Override
    public void crearPadre() {
        super.crearPadre();
        apellidoMadre = sc.nextLine();
    }

    @Override
    public void verPadre() {
        super.verPadre();
        apellidoMadre = sc.nextLine();
    }
}
