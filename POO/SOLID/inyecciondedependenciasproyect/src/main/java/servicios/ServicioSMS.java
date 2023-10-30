package servicios;

import dominio.ServicioMensaje;

public class ServicioSMS implements ServicioMensaje {


    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: "+mensaje);
    }
}
