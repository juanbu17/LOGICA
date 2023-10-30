import controlador.Notificacion;
import dominio.ServicioMensaje;
import servicios.ServicioEmail;
import servicios.ServicioSMS;
import servicios.ServicioWhatsApp;

public class main {
    public static void main(String[] args) {

        ServicioMensaje servicioEmail = new ServicioEmail();
        ServicioSMS servicioSMS = new ServicioSMS();


        Notificacion notificacionEmail = new Notificacion(servicioEmail);
        notificacionEmail.notificar("Esto es un email");

Notificacion notificacionSMS = new Notificacion(servicioSMS);
notificacionSMS.notificar("Esto es un SMS");

ServicioMensaje servicioWatsApp = new ServicioWhatsApp();
Notificacion notificacionWhatsapp = new Notificacion(servicioWatsApp);
        notificacionWhatsapp.notificar("Mensaje Whatsapp");


    }
}
