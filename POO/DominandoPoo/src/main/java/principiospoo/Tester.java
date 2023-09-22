package principiospoo;

public class Tester {
    public static void main(String[] args) {

        Padre padre = new Padre(); //recibe pór herencia lo de la clase Padre





       // padre.nombrePadre= "Juan";//desde aca asigno valor a la clase Padre
        String nombrePadreQueMandadato= "Juan";
        padre.setNombrepadre(nombrePadreQueMandadato);
        System.out.println(padre.nombrePadre);







    }

}
