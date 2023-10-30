package recomendaciones;

import java.util.ArrayList;
import java.util.List;

public class Recomendacion {

    private String nombre;
    private String autor;
    private String sinopsis;
    private int likes;
    private List<String> comentarios;

    public Recomendacion(String nombre, String autor, String sinopsis) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.likes = 0;
        this.comentarios = new ArrayList<>();
    }

    public Recomendacion() {

    }

    public void darLike() {
        likes++;
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }
}

