package servicios;

import dominio.ServicioMensaje;

public class ServicioEmail implements ServicioMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando email: "+mensaje);

    }
}
