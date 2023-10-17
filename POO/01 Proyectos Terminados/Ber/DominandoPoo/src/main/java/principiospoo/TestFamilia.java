package principiospoo;

public class TestFamilia {



    public static void main(String[] args) {

        Familia familia = new Padre("Perez");

        Familia familia1 = new Hija("Perez","Castro");


        //DownCasting
        //Hija hijaMenor = (Hija) new Padre("Perez");

        //hijaMenor.setApellidoMadre("Castro");

        //System.out.println(hijaMenor.getApellidoPadre() + " " + hijaMenor.getApellidoMadre());

        //UpCasting
        Padre papa1 = new Hija("Perez", "Castro");

        Hija hijaMayor = new Hija("Perez", "Castro");


        //DownCasting
        //Composicion Clase
        Padre papa2 = hijaMayor;



    }



}
