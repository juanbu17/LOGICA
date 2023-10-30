package servicios;

import dominio.ServicioMensaje;

public class ServicioWhatsApp implements ServicioMensaje {


    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando WhatsApp: "+mensaje);
    }
}
