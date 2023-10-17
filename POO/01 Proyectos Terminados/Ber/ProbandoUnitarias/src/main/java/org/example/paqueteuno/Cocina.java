package org.example.paqueteuno;

import org.example.paquetedos.Cadena;

public class Cocina {
    private String nombre;
    private Integer costoPromedioCena;
    private Boolean aceptaDomicilio;

    private Cadena cadena;

    public Cocina() {
        this.cadena=new Cadena();
    }

    public Cocina(String nombre, Integer costoPromedioCena, Boolean aceptaDomicilio) {
        this.nombre = nombre;
        this.costoPromedioCena = costoPromedioCena;
        this.aceptaDomicilio = aceptaDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCostoPromedioCena() {
        return costoPromedioCena;
    }

    public void setCostoPromedioCena(Integer costoPromedioCena) {
        this.costoPromedioCena = costoPromedioCena;
    }

    public Boolean getAceptaDomicilio() {
        return aceptaDomicilio;
    }

    public void setAceptaDomicilio(Boolean aceptaDomicilio) {
        this.aceptaDomicilio = aceptaDomicilio;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "nombre='" + nombre + '\'' +
                ", costoPromedioCena=" + costoPromedioCena +
                ", aceptaDomicilio=" + aceptaDomicilio +
                '}';
    }
}
