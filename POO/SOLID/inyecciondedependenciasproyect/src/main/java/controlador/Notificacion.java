package controlador;

import dominio.ServicioMensaje;

public class Notificacion {

    private ServicioMensaje servicio;

    //inyeccion de dependencias(es una regla de negocios)
    public Notificacion(ServicioMensaje servicio){
      this.servicio = servicio;


    }

    public void notificar(String mensaje){

        servicio.enviarMensaje(mensaje);
    }



}
