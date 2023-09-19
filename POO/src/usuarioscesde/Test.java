package usuarioscesde;

public class Test {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();     //hemos creado una instancia de la clase Usuario

        Usuario usuarioPepito = new Usuario();

        Usuario nicolas = new Usuario();


        /*String nombre = "Nicolas";
        nicolas.setNombre(nombre);

        System.out.println(nicolas.getNombre());


        //nicolas.nombre = "Nicolás" ;
        //usuarioPepito.nombre = "pepito";
        //usuario.nombre = "maria";
        nicolas.toString();    // con to String () me daria todos los datos que se hayan ya ingresado toString es un metodo con retorno



        String correo = "pirata@mail.com";
        nicolas.setCorreo(correo);
*/

                                                                           // System.out.println(nicolas.nombre);
                                                                            //System.out.println(usuarioPepito.nombre);
            /*nicolas.registrarUsuario();                                                                 //System.out.println(usuario.nombre);
            System.out.println(nicolas.toString());
            nicolas.iniciarsesion();*/

            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("Pepito");// va a estudiante y asigna nombre y manda a traves de nombre a private string nombre
            System.out.println(estudiante.getNombre());


            Empleado empleado=new Empleado();
            empleado.setNombre("Maria");
            System.out.println(empleado.getNombre());

            Usuario estSoftware= new Estudiante();

            Usuario empProfesor = new Empleado();

            estudiante.registrarUsuario();
            estudiante.toString();
            estudiante.iniciarsesion();

    }




}
