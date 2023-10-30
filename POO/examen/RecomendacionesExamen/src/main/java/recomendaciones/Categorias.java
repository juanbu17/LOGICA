package recomendaciones;

import java.util.ArrayList;
import java.util.List;

public class Categorias extends Recomendacion {
    private String nombre;
    private List<Recomendacion> recomendaciones;

    public Categorias(String nombre) {
        this.nombre = nombre;
        this.recomendaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Recomendacion> getRecomendaciones() {
        return recomendaciones;
    }

    public void agregarRecomendacion(Recomendacion recomendacion) {
        recomendaciones.add(recomendacion);
    }
}


