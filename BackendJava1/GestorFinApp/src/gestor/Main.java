package gestor;

public class Main {
    public static void main(String[] args) {

      Usuario usuario = new Usuario();

      String name;
      Registro registro =  new Registro();
      registro.perfil = new Usuario();


      registro.salary = 256;


//usuario.printData();




      registro.registerData();
        registro.perfil.printData();

            registro.registerValores();

        registro.calcularValores();


    }
}
