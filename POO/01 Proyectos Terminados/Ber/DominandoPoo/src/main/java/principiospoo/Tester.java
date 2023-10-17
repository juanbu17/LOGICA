package principiospoo;

public class Tester {


    public static void main(String[] args) {

        Padre padre = new Padre("Solito");//Santiago

        Padre carlos = new Padre("Acompañado");

        String nombrePadreQueMandaDato  = "Juan";//Alexandra

        padre.setNombrePadre(nombrePadreQueMandaDato);//Valentina

        System.out.println(padre.getNombrePadre() +" " + padre.getApellidoPadre() );//Erika

        carlos.setNombrePadre(nombrePadreQueMandaDato);
        System.out.println(carlos.getNombrePadre() + " "+ carlos.getApellidoPadre());

        padre.verPadre();
        carlos.verPadre();

        padre.crearPadre();

        padre.verPadre();


    }
}
