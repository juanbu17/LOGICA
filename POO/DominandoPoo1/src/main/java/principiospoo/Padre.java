package principiospoo;

public class Padre {
Scanner sc= new Scanner(System.in);
private int idpadre;
protected String nombrePadre;// si se coloca private no sera accesible a las otras clases, solo para esta clase
int edadPadre;

//getter and setter:

    public  void setNombrepadre(String nombrePadre){
        this.nombrePadre = nombrePadre;
    }

//METODO:

    public void crearPadre(){
        System.out.println("De un nombre al padre: ");
        nombrePadre=sc.nextline();




    }





}
