package principiospoo;

public class TesterHija {


    public static void main(String[] args) {


        Hija hijaMayor = new Hija("Solito", "Acompañado");

        hijaMayor.setNombrePadre("Juanita");

        String nombreHijaMayor = hijaMayor.getNombrePadre();
        String apellidoPadreHijaMayor = hijaMayor.getApellidoPadre();
        String apellidoMadreHijaMayor = hijaMayor.getApellidoMadre();

        System.out.println(nombreHijaMayor+ " " + apellidoPadreHijaMayor + " " + apellidoMadreHijaMayor);



    }
}
